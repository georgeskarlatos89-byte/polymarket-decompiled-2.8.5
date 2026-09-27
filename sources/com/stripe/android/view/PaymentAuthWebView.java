package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import defpackage.g2g;
import defpackage.ypd;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebView;", "Landroid/webkit/WebView;", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "getOnLoadBlank$payments_core_release", "()Lkotlin/jvm/functions/Function0;", "setOnLoadBlank$payments_core_release", "(Lkotlin/jvm/functions/Function0;)V", "onLoadBlank", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentAuthWebView extends WebView {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: from kotlin metadata */
    public Function0 onLoadBlank;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.onLoadBlank = new ypd(7);
        String str = g2g.a;
        WebSettings settings = getSettings();
        String userAgentString = getSettings().getUserAgentString();
        settings.setUserAgentString((userAgentString == null ? "" : userAgentString).concat(" [Stripe/v1 AndroidBindings/23.16.0]"));
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowContentAccess(false);
        getSettings().setDomStorageEnabled(true);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        clearHistory();
        this.onLoadBlank.invoke();
        loadUrl("about:blank");
        onPause();
        removeAllViews();
        destroyDrawingCache();
        super.destroy();
    }

    public final Function0<Unit> getOnLoadBlank$payments_core_release() {
        return this.onLoadBlank;
    }

    public final void setOnLoadBlank$payments_core_release(Function0<Unit> function0) {
        function0.getClass();
        this.onLoadBlank = function0;
    }
}
