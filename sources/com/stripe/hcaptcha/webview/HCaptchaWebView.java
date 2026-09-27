package com.stripe.hcaptcha.webview;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ContentInfo;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "hcaptcha_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HCaptchaWebView extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HCaptchaWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onCheckIsTextEditor() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return super.onCheckIsTextEditor();
        }
        return false;
    }

    @Override // android.view.View
    public final ContentInfo onReceiveContent(ContentInfo contentInfo) {
        contentInfo.getClass();
        return super.onReceiveContent(contentInfo);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return false;
    }
}
