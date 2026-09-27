package defpackage;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class cuk implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ni1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ pi1 d;

    public /* synthetic */ cuk(ni1 ni1Var, String str, pi1 pi1Var) {
        this.b = ni1Var;
        this.c = str;
        this.d = pi1Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [oi1, java.lang.Object, android.webkit.WebView] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        pi1 pi1Var = this.d;
        String str = this.c;
        ni1 ni1Var = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                boolean booleanValue = ((Boolean) pi1Var.c.getValue()).booleanValue();
                ?? webView = new WebView(context);
                webView.a = booleanValue;
                webView.setBackgroundColor(0);
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setLoadsImagesAutomatically(true);
                settings.setBlockNetworkLoads(false);
                settings.setBlockNetworkImage(false);
                settings.setCacheMode(-1);
                settings.setUseWideViewPort(true);
                settings.setLoadWithOverviewMode(true);
                webView.setWebViewClient(ni1Var);
                webView.onResume();
                webView.loadUrl(str);
                return webView;
            default:
                oi1 oi1Var = (oi1) obj;
                oi1Var.getClass();
                oi1Var.setWebViewClient(ni1Var);
                if (!Intrinsics.areEqual(oi1Var.getUrl(), str)) {
                    oi1Var.loadUrl(str);
                }
                if (oi1Var.getExpansionState() != ((Boolean) pi1Var.c.getValue()).booleanValue()) {
                    oi1Var.a = ((Boolean) pi1Var.c.getValue()).booleanValue();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ cuk(pi1 pi1Var, ni1 ni1Var, String str) {
        this.d = pi1Var;
        this.b = ni1Var;
        this.c = str;
    }
}
