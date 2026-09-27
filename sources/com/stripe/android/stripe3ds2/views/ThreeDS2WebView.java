package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.u48;
import defpackage.zzi;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "Landroid/webkit/WebView;", "Landroid/webkit/WebViewClient;", "client", "", "setWebViewClient", "(Landroid/webkit/WebViewClient;)V", "Lzzi;", "listener", "setOnHtmlSubmitListener$3ds2sdk_release", "(Lzzi;)V", "setOnHtmlSubmitListener", "3ds2sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThreeDS2WebView extends WebView {
    public final u48 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        u48 u48Var = new u48();
        this.a = u48Var;
        WebSettings settings = getSettings();
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setBlockNetworkImage(true);
        settings.setBlockNetworkLoads(true);
        super.setWebViewClient(u48Var);
    }

    public final void setOnHtmlSubmitListener$3ds2sdk_release(zzi listener) {
        this.a.b = listener;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient client) {
        client.getClass();
    }
}
