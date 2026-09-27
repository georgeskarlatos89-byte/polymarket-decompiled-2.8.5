package com.braze.ui.inappmessage.views;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6;
import defpackage.b69;
import defpackage.js9;
import defpackage.pm1;
import defpackage.un1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J,\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/braze/ui/inappmessage/views/InAppMessageHtmlBaseView$messageWebView$6", "Landroid/webkit/WebChromeClient;", "onConsoleMessage", "", "cm", "Landroid/webkit/ConsoleMessage;", "onCreateWindow", "view", "Landroid/webkit/WebView;", "isDialog", "isUserGesture", "resultMsg", "Landroid/os/Message;", "getDefaultVideoPoster", "Landroid/graphics/Bitmap;", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InAppMessageHtmlBaseView$messageWebView$6 extends WebChromeClient {
    final /* synthetic */ boolean $isLinkTargetSupported;
    final /* synthetic */ InAppMessageHtmlBaseView this$0;

    public InAppMessageHtmlBaseView$messageWebView$6(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, boolean z) {
        this.this$0 = inAppMessageHtmlBaseView;
        this.$isLinkTargetSupported = z;
    }

    public static /* synthetic */ String a(WebView.HitTestResult hitTestResult) {
        return onCreateWindow$lambda$4(hitTestResult);
    }

    public static /* synthetic */ String b() {
        return onCreateWindow$lambda$1();
    }

    public static /* synthetic */ String c(WebView.HitTestResult hitTestResult) {
        return onCreateWindow$lambda$3(hitTestResult);
    }

    public static /* synthetic */ String d() {
        return onCreateWindow$lambda$2();
    }

    public static /* synthetic */ String e(ConsoleMessage consoleMessage) {
        return onConsoleMessage$lambda$0(consoleMessage);
    }

    public static /* synthetic */ String f(WebView.HitTestResult hitTestResult) {
        return onCreateWindow$lambda$5(hitTestResult);
    }

    private static final String onConsoleMessage$lambda$0(ConsoleMessage consoleMessage) {
        return "Braze HTML In-app Message log. Line: " + consoleMessage.lineNumber() + ". SourceId: " + consoleMessage.sourceId() + ". Log Level: " + consoleMessage.messageLevel() + ". Message: " + consoleMessage.message();
    }

    private static final String onCreateWindow$lambda$1() {
        return "linkTargetSupport not enabled, passing to super.onCreateWindow()";
    }

    private static final String onCreateWindow$lambda$2() {
        return "onCreateWindow webView is null, not opening link";
    }

    private static final String onCreateWindow$lambda$3(WebView.HitTestResult hitTestResult) {
        return "onCreateWindow HitTestResult is " + hitTestResult;
    }

    private static final String onCreateWindow$lambda$4(WebView.HitTestResult hitTestResult) {
        return "onCreateWindow: hitTestResult type was " + hitTestResult.getType() + ". Not doing anything.";
    }

    private static final String onCreateWindow$lambda$5(WebView.HitTestResult hitTestResult) {
        return "Failed to open link in new window. " + hitTestResult;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        return createBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage cm) {
        cm.getClass();
        b69.h(this.this$0, null, null, false, new un1(cm, 1), 7);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        Uri uri;
        if (!this.$isLinkTargetSupported) {
            b69.h(this, pm1.V, null, false, new js9(4), 6);
            return super.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
        }
        final int i = 0;
        if (view == null) {
            b69.h(this, pm1.V, null, false, new js9(5), 6);
            return false;
        }
        final WebView.HitTestResult hitTestResult = view.getHitTestResult();
        hitTestResult.getClass();
        pm1 pm1Var = pm1.V;
        b69.h(this, pm1Var, null, false, new Function0() { // from class: ks9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WebView.HitTestResult hitTestResult2 = hitTestResult;
                switch (i2) {
                    case 0:
                        return InAppMessageHtmlBaseView$messageWebView$6.c(hitTestResult2);
                    case 1:
                        return InAppMessageHtmlBaseView$messageWebView$6.a(hitTestResult2);
                    default:
                        return InAppMessageHtmlBaseView$messageWebView$6.f(hitTestResult2);
                }
            }
        }, 6);
        final int i2 = 2;
        try {
            int type = hitTestResult.getType();
            if (type != 2) {
                if (type != 4) {
                    if (type != 7) {
                        final int i3 = 1;
                        b69.h(this, pm1Var, null, false, new Function0() { // from class: ks9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i22 = i3;
                                WebView.HitTestResult hitTestResult2 = hitTestResult;
                                switch (i22) {
                                    case 0:
                                        return InAppMessageHtmlBaseView$messageWebView$6.c(hitTestResult2);
                                    case 1:
                                        return InAppMessageHtmlBaseView$messageWebView$6.a(hitTestResult2);
                                    default:
                                        return InAppMessageHtmlBaseView$messageWebView$6.f(hitTestResult2);
                                }
                            }
                        }, 6);
                        return false;
                    }
                    String extra = hitTestResult.getExtra();
                    if (extra != null) {
                        uri = Uri.parse(extra);
                        uri.getClass();
                    } else {
                        uri = null;
                    }
                    this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
                    return false;
                }
                Uri parse = Uri.parse("mailto:" + hitTestResult.getExtra());
                parse.getClass();
                this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", parse));
                return false;
            }
            Uri parse2 = Uri.parse("tel:" + hitTestResult.getExtra());
            parse2.getClass();
            this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", parse2));
            return false;
        } catch (Exception e) {
            b69.h(this, pm1.E, e, false, new Function0() { // from class: ks9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    WebView.HitTestResult hitTestResult2 = hitTestResult;
                    switch (i22) {
                        case 0:
                            return InAppMessageHtmlBaseView$messageWebView$6.c(hitTestResult2);
                        case 1:
                            return InAppMessageHtmlBaseView$messageWebView$6.a(hitTestResult2);
                        default:
                            return InAppMessageHtmlBaseView$messageWebView$6.f(hitTestResult2);
                    }
                }
            }, 4);
            return false;
        }
    }
}
