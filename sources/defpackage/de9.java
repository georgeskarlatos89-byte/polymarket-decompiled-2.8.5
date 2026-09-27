package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.polymarket.clients.ClientVideoEmbedCommand;
import com.polymarket.clients.ClientVideoEmbedContent;
import io.ably.lib.rest.Auth;
import io.sentry.android.core.m0;
import java.net.URI;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class de9 implements y7k {
    public final kvd a = ikl.c(r98.Idle);
    public final kvd b = ikl.c(Boolean.FALSE);
    public final String c;
    public final boolean d;
    public final boolean e;
    public d98 f;
    public d98 g;
    public e98 h;
    public ClientVideoEmbedContent i;
    public URI j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public View o;
    public WebChromeClient.CustomViewCallback p;
    public final WebView q;

    public de9(Context context, ClientVideoEmbedContent clientVideoEmbedContent) {
        boolean z;
        this.c = clientVideoEmbedContent.getProviderID();
        this.d = clientVideoEmbedContent.getUsesControlOverlay();
        if (clientVideoEmbedContent.supportsCommand(ClientVideoEmbedCommand.mute) && clientVideoEmbedContent.supportsCommand(ClientVideoEmbedCommand.unmute)) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.i = clientVideoEmbedContent;
        WebView webView = new WebView(context);
        webView.setBackgroundColor(-16777216);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        defaultUserAgent.getClass();
        settings.setUserAgentString(new Regex("Version/\\d+(\\.\\d+)* ").replace(e.s(defaultUserAgent, "; wv", ""), ""));
        this.q = webView;
        webView.setWebViewClient(new u48(this, 1));
        webView.setWebChromeClient(new t48(this, 1));
        if (!mik.b("WEB_MESSAGE_LISTENER")) {
            m0.p("FloatingVideoPlayer", "WEB_MESSAGE_LISTENER unsupported; embed playback events will no-op");
        } else {
            jik.b(webView, ClientVideoEmbedContent.INSTANCE.getBridgeMessageName(), vzg.b(Auth.WILDCARD_CLIENTID), new ca6(this, 12));
        }
    }

    @Override // defpackage.y7k
    public final View a() {
        return this.q;
    }

    @Override // defpackage.y7k
    public final void b() {
        boolean z;
        if (!this.k && o() != r98.Playing) {
            z = false;
        } else {
            z = true;
        }
        this.l = z;
        this.k = false;
        if (o() != r98.Loading && o() != r98.Paused) {
            this.m = this.i.getEndsSessionOnPause();
            m(ClientVideoEmbedCommand.pause, new ae9(this, 1));
        }
        this.q.onPause();
    }

    @Override // defpackage.y7k
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.y7k
    public final void d(d98 d98Var) {
        this.g = d98Var;
    }

    @Override // defpackage.y7k
    public final void destroy() {
        n();
        WebView webView = this.q;
        webView.stopLoading();
        webView.destroy();
    }

    @Override // defpackage.y7k
    public final void e(boolean z) {
        ClientVideoEmbedCommand clientVideoEmbedCommand;
        kvd kvdVar = this.b;
        if (((Boolean) kvdVar.getValue()).booleanValue() != z) {
            kvdVar.setValue(Boolean.valueOf(z));
            if (z) {
                clientVideoEmbedCommand = ClientVideoEmbedCommand.mute;
            } else {
                clientVideoEmbedCommand = ClientVideoEmbedCommand.unmute;
            }
            m(clientVideoEmbedCommand, new j69(17));
            d98 d98Var = this.g;
            if (d98Var != null) {
                d98Var.invoke(Boolean.valueOf(z));
            }
        }
    }

    @Override // defpackage.y7k
    public final void g() {
        WebView webView = this.q;
        webView.stopLoading();
        webView.loadUrl("about:blank");
        this.j = null;
        this.n = null;
        this.k = false;
        p(r98.Idle);
    }

    @Override // defpackage.y7k
    public final void h(d98 d98Var) {
        this.f = d98Var;
    }

    @Override // defpackage.y7k
    public final void i() {
        this.k = true;
        if (this.m) {
            this.m = false;
            e98 e98Var = this.h;
            if (e98Var != null) {
                e98Var.invoke();
                return;
            }
            return;
        }
        if (o() == r98.Loading) {
            return;
        }
        m(ClientVideoEmbedCommand.play, new ae9(this, 0));
    }

    @Override // defpackage.y7k
    public final void j() {
        this.q.onResume();
        if (this.i.getEndsSessionOnPause() && o() == r98.Paused) {
            this.m = true;
        }
        if (this.l) {
            this.l = false;
            i();
        }
    }

    @Override // defpackage.y7k
    public final boolean k() {
        return this.e;
    }

    @Override // defpackage.y7k
    public final void l(e98 e98Var) {
        this.h = e98Var;
    }

    public final void m(ClientVideoEmbedCommand clientVideoEmbedCommand, Function1 function1) {
        if (!this.i.supportsCommand(clientVideoEmbedCommand)) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        this.q.evaluateJavascript(ClientVideoEmbedContent.INSTANCE.commandScript(clientVideoEmbedCommand), new be9(function1, 0));
    }

    public final void n() {
        ViewGroup viewGroup;
        View view = this.o;
        if (view != null) {
            Context context = this.q.getContext();
            context.getClass();
            Activity b = gzl.b(context);
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            this.o = null;
            WebChromeClient.CustomViewCallback customViewCallback = this.p;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
            this.p = null;
            if (b != null) {
                new e3g(b.getWindow(), b.getWindow().getDecorView()).n(519);
            }
        }
    }

    public final r98 o() {
        return (r98) this.a.getValue();
    }

    public final void p(r98 r98Var) {
        if (o() != r98Var) {
            this.a.setValue(r98Var);
            d98 d98Var = this.f;
            if (d98Var != null) {
                d98Var.invoke(r98Var);
            }
        }
    }
}
