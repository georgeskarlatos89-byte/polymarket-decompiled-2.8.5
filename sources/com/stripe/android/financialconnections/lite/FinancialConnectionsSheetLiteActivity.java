package com.stripe.android.financialconnections.lite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.polymarket.android.R;
import defpackage.a48;
import defpackage.az5;
import defpackage.coc;
import defpackage.d55;
import defpackage.d9k;
import defpackage.dmk;
import defpackage.f38;
import defpackage.g48;
import defpackage.g6n;
import defpackage.hak;
import defpackage.k9k;
import defpackage.lvf;
import defpackage.o21;
import defpackage.pk4;
import defpackage.qp7;
import defpackage.r48;
import defpackage.t48;
import defpackage.tw7;
import defpackage.u48;
import defpackage.v48;
import defpackage.w6n;
import defpackage.yhl;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;", "Lpk4;", "<init>", "()V", "financial-connections-lite_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetLiteActivity extends pk4 {
    public static final /* synthetic */ int d = 0;
    public WebView a;
    public ProgressBar b;
    public final hak c;

    public FinancialConnectionsSheetLiteActivity() {
        super(R.layout.stripe_activity_lite);
        this.c = new hak(lvf.a.getOrCreateKotlinClass(f38.class), new v48(this, 0), new tw7(14), new v48(this, 1));
    }

    @Override // defpackage.pk4, defpackage.ok4, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        g48 g48Var;
        int i;
        int i2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("FinancialConnectionsSheetActivityArgs")) {
            setContentView(R.layout.stripe_activity_lite);
            View findViewById = findViewById(R.id.webView);
            findViewById.getClass();
            this.a = (WebView) findViewById;
            View findViewById2 = findViewById(R.id.progressBar);
            findViewById2.getClass();
            this.b = (ProgressBar) findViewById2;
            w6n.c(getWindow(), false);
            View findViewById3 = findViewById(android.R.id.content);
            qp7 qp7Var = new qp7(9);
            WeakHashMap weakHashMap = k9k.a;
            d9k.b(findViewById3, qp7Var);
            Intent intent2 = getIntent();
            intent2.getClass();
            a48 a48Var = (a48) intent2.getParcelableExtra("FinancialConnectionsSheetActivityArgs");
            if (a48Var != null) {
                g48Var = yhl.c(a48Var);
            } else {
                g48Var = null;
            }
            if (g48Var == null) {
                i = -1;
            } else {
                i = r48.a[g48Var.ordinal()];
            }
            if (i != -1 && i != 1 && i != 2) {
                if (i == 3) {
                    i2 = R.color.stripe_link;
                } else {
                    dmk.a();
                    return;
                }
            } else {
                i2 = R.color.stripe_financial_connections;
            }
            int d2 = d55.d(this, i2);
            ProgressBar progressBar = this.b;
            if (progressBar != null) {
                progressBar.getProgressDrawable().setTint(d2);
                ProgressBar progressBar2 = this.b;
                if (progressBar2 != null) {
                    progressBar2.getIndeterminateDrawable().setTint(d2);
                    ProgressBar progressBar3 = this.b;
                    if (progressBar3 != null) {
                        progressBar3.setVisibility(0);
                        WebView webView = this.a;
                        if (webView != null) {
                            webView.getSettings().setJavaScriptEnabled(true);
                            webView.getSettings().setUseWideViewPort(true);
                            webView.getSettings().setLoadWithOverviewMode(true);
                            webView.setWebChromeClient(new t48(this, 0));
                            webView.setWebViewClient(new u48(this, 0));
                            getOnBackPressedDispatcher().b(new o21(this, false, 3), this);
                            coc.c(g6n.c(this), null, null, new az5(this, null, 21), 3);
                            return;
                        }
                        Intrinsics.i("webView");
                        throw null;
                    }
                    Intrinsics.i("progressBar");
                    throw null;
                }
                Intrinsics.i("progressBar");
                throw null;
            }
            Intrinsics.i("progressBar");
            throw null;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        ViewGroup viewGroup;
        WebView webView = this.a;
        if (webView != null) {
            if (webView != null) {
                ViewParent parent = webView.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    WebView webView2 = this.a;
                    if (webView2 != null) {
                        viewGroup.removeView(webView2);
                    } else {
                        Intrinsics.i("webView");
                        throw null;
                    }
                }
                WebView webView3 = this.a;
                if (webView3 != null) {
                    webView3.destroy();
                } else {
                    Intrinsics.i("webView");
                    throw null;
                }
            } else {
                Intrinsics.i("webView");
                throw null;
            }
        }
        super.onDestroy();
    }
}
