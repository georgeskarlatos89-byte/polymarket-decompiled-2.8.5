package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.polymarket.clients.ClientVideoEmbedCommand;
import com.socure.docv.capturesdk.databinding.b;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class u48 extends WebViewClient {
    public final /* synthetic */ int a;
    public Object b;

    public u48(ivi iviVar) {
        this.a = 4;
        this.b = iviVar;
    }

    public void a(Uri uri) {
        zzi zziVar;
        uri.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String lowerCase = uri2.toLowerCase(locale);
        lowerCase.getClass();
        if (e.u(lowerCase, "https://emv3ds/challenge", false) && (zziVar = (zzi) this.b) != null) {
            String query = uri.getQuery();
            ke3 ke3Var = (ke3) ((a5e) zziVar).b;
            if (query == null) {
                query = "";
            }
            ke3Var.b = query;
            View.OnClickListener onClickListener = ke3Var.c;
            if (onClickListener != null) {
                onClickListener.onClick(ke3Var);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        ClientVideoEmbedCommand clientVideoEmbedCommand;
        switch (this.a) {
            case 1:
                de9 de9Var = (de9) this.b;
                if (!Intrinsics.areEqual(str, "about:blank")) {
                    String str2 = de9Var.n;
                    if (str2 != null) {
                        de9Var.q.evaluateJavascript(str2, null);
                    }
                    de9Var.p(r98.Ready);
                    if (((Boolean) de9Var.b.getValue()).booleanValue()) {
                        clientVideoEmbedCommand = ClientVideoEmbedCommand.mute;
                    } else {
                        clientVideoEmbedCommand = ClientVideoEmbedCommand.unmute;
                    }
                    de9Var.m(clientVideoEmbedCommand, new j69(18));
                    if (de9Var.k) {
                        de9Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.onPageFinished(webView, str);
                ((b) this.b).b.setVisibility(8);
                return;
            default:
                super.onPageFinished(webView, str);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 1:
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    ((de9) this.b).p(r98.Failed);
                    return;
                }
                return;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 3:
                webView.getClass();
                webResourceRequest.getClass();
                Uri url = webResourceRequest.getUrl();
                url.getClass();
                a(url);
                Uri url2 = webResourceRequest.getUrl();
                url2.getClass();
                url2.getClass();
                if (URLUtil.isDataUrl(url2.toString())) {
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
                return new WebResourceResponse(null, null, null);
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object m882constructorimpl;
        Object value;
        Uri url;
        Uri uri = null;
        String str = null;
        String str2 = null;
        switch (this.a) {
            case 0:
                FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = (FinancialConnectionsSheetLiteActivity) this.b;
                if (webResourceRequest != null) {
                    uri = webResourceRequest.getUrl();
                }
                int i = FinancialConnectionsSheetLiteActivity.d;
                if (uri == null) {
                    return false;
                }
                f38 f38Var = (f38) financialConnectionsSheetLiteActivity.c.getValue();
                String uri2 = uri.toString();
                uri2.getClass();
                g75 g75Var = new g75(19, uri2, f38Var);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    value = f38Var.h.getValue();
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
                }
                if (value != null) {
                    g75Var.invoke(value);
                    m882constructorimpl = Result.m882constructorimpl(Unit.INSTANCE);
                    Throwable m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(m882constructorimpl);
                    if (m883exceptionOrNullimpl != null) {
                        f38Var.x("State is null", m883exceptionOrNullimpl);
                    }
                    return true;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 1:
                if (webResourceRequest == null) {
                    return false;
                }
                String scheme = webResourceRequest.getUrl().getScheme();
                if (scheme != null) {
                    str2 = scheme.toLowerCase(Locale.ROOT);
                    str2.getClass();
                }
                if ((!Intrinsics.areEqual(str2, "http") && !Intrinsics.areEqual(str2, "https")) || !webResourceRequest.isForMainFrame() || !webResourceRequest.hasGesture()) {
                    return false;
                }
                de9 de9Var = (de9) this.b;
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    Context context = de9Var.q.getContext();
                    Intent intent = new Intent("android.intent.action.VIEW", webResourceRequest.getUrl());
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    Result.m882constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m882constructorimpl(ResultKt.createFailure(th2));
                }
                return true;
            case 2:
                webView.getClass();
                webResourceRequest.getClass();
                Uri url2 = webResourceRequest.getUrl();
                if (url2 != null) {
                    str = url2.toString();
                }
                webView.removeAllViews();
                webView.destroy();
                if (str != null) {
                    ((Function1) this.b).invoke(str);
                }
                return true;
            case 3:
                webView.getClass();
                webResourceRequest.getClass();
                Uri url3 = webResourceRequest.getUrl();
                url3.getClass();
                a(url3);
                return true;
            case 4:
                if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                    ivi iviVar = (ivi) this.b;
                    String uri3 = url.toString();
                    uri3.getClass();
                    return ((Boolean) iviVar.invoke(uri3)).booleanValue();
                }
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public /* synthetic */ u48(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ u48() {
        this.a = 3;
    }
}
