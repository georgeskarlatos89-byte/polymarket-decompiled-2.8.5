package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.HtmlInAppMessageSafeAreaInjector;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.ui.support.MarginBaseline;
import com.braze.ui.support.MarginBaselineKt;
import com.braze.ui.support.ViewUtils;
import com.braze.ui.support.WebViewUtilsKt;
import defpackage.b69;
import defpackage.js9;
import defpackage.mp9;
import defpackage.om1;
import defpackage.pm1;
import defpackage.py2;
import defpackage.sl1;
import defpackage.sv6;
import defpackage.vlk;
import defpackage.vt0;
import defpackage.y85;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u000bR\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010.R\u0016\u0010/\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u00106\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010>\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010A\u001a\u0004\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;", "Landroid/widget/RelativeLayout;", "Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "finishWebViewDisplay", "()V", "", "htmlBody", "assetDirectoryUrl", "setWebViewContent", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;", "inAppMessageWebViewClient", "setInAppMessageWebViewClient", "(Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;)V", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", "listener", "setHtmlPageFinishedListener", "(Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;)V", "injectSafeAreaInsetsIfNeeded$android_sdk_ui", "injectSafeAreaInsetsIfNeeded", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "getWebViewViewId", "()I", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "Lvlk;", "insets", "applyWindowInsets", "(Lvlk;)V", "setupDirectionalNavigation", "Landroid/webkit/WebView;", "configuredMessageWebView", "Landroid/webkit/WebView;", "Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;", "isFinished", "Z", "lastWindowInsets", "Lvlk;", "Lcom/braze/ui/support/MarginBaseline;", "containerMarginBaseline", "Lcom/braze/ui/support/MarginBaseline;", "hasAppliedWindowInsets", "getHasAppliedWindowInsets", "()Z", "setHasAppliedWindowInsets", "(Z)V", "Landroid/view/View;", "getMessageClickableView", "()Landroid/view/View;", "messageClickableView", "getMessageWebView", "()Landroid/webkit/WebView;", "messageWebView", "Companion", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class InAppMessageHtmlBaseView extends RelativeLayout implements IInAppMessageView {
    private WebView configuredMessageWebView;
    private final MarginBaseline containerMarginBaseline;
    private boolean hasAppliedWindowInsets;
    private InAppMessageWebViewClient inAppMessageWebViewClient;
    private boolean isFinished;
    private vlk lastWindowInsets;

    public InAppMessageHtmlBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.containerMarginBaseline = new MarginBaseline();
    }

    private static final String _get_messageWebView_$lambda$0() {
        return "Cannot return the WebView for an already finished message";
    }

    private static final String _get_messageWebView_$lambda$1() {
        return "Cannot find WebView. getWebViewViewId() returned 0.";
    }

    private static final String _get_messageWebView_$lambda$2(int i) {
        return sv6.j(i, "findViewById for ", " returned null. Returning null for WebView.");
    }

    private static final String _get_messageWebView_$lambda$3() {
        return "HtmlInAppMessageHtmlLinkTarget enabled";
    }

    private static final String _get_messageWebView_$lambda$4() {
        return "HtmlInAppMessageHtmlLinkTarget not enabled";
    }

    public static /* synthetic */ String a() {
        return setWebViewContent$lambda$0();
    }

    public static /* synthetic */ String b() {
        return _get_messageWebView_$lambda$3();
    }

    public static /* synthetic */ String c() {
        return _get_messageWebView_$lambda$0();
    }

    public static /* synthetic */ String d(int i) {
        return _get_messageWebView_$lambda$2(i);
    }

    public static /* synthetic */ String e() {
        return _get_messageWebView_$lambda$4();
    }

    public static /* synthetic */ void f(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, IWebViewClientStateListener iWebViewClientStateListener) {
        setHtmlPageFinishedListener$lambda$0$0(inAppMessageHtmlBaseView, iWebViewClientStateListener);
    }

    private static final String finishWebViewDisplay$lambda$0() {
        return "Finishing WebView display";
    }

    public static /* synthetic */ String g() {
        return _get_messageWebView_$lambda$1();
    }

    public static /* synthetic */ void h(WebView webView) {
        setupDirectionalNavigation$lambda$0(webView);
    }

    public static /* synthetic */ String i() {
        return finishWebViewDisplay$lambda$0();
    }

    private static final void setHtmlPageFinishedListener$lambda$0$0(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, IWebViewClientStateListener iWebViewClientStateListener) {
        inAppMessageHtmlBaseView.injectSafeAreaInsetsIfNeeded$android_sdk_ui();
        iWebViewClientStateListener.onPageFinished();
    }

    public static /* synthetic */ void setWebViewContent$default(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            inAppMessageHtmlBaseView.setWebViewContent(str, str2);
            return;
        }
        py2.f("Super calls with default arguments not supported in this target, function: setWebViewContent");
    }

    private static final String setWebViewContent$lambda$0() {
        return "Cannot load WebView. htmlBody was null.";
    }

    private static final void setupDirectionalNavigation$lambda$0(WebView webView) {
        webView.requestFocus();
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(vlk insets) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        insets.getClass();
        this.lastWindowInsets = insets;
        setHasAppliedWindowInsets(true);
        Context context = getContext();
        context.getClass();
        if (!new sl1(context).isHtmlInAppMessageApplyWindowInsetsEnabled()) {
            injectSafeAreaInsetsIfNeeded$android_sdk_ui();
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 == null) {
            return;
        }
        MarginBaselineKt.applySafeAreaMargins$default(marginLayoutParams2, insets, this.containerMarginBaseline, false, 4, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        event.getClass();
        if (InAppMessageViewUtils.isApiBelowBaklava() && !isInTouchMode() && event.getKeyCode() == 4 && BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    public void finishWebViewDisplay() {
        b69.h(this, null, null, false, new js9(3), 7);
        this.isFinished = true;
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            webView.loadUrl("about:blank");
            webView.onPause();
            webView.removeAllViews();
            this.configuredMessageWebView = null;
        }
    }

    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    public WebView getMessageWebView() {
        if (this.isFinished) {
            b69.h(this, pm1.W, null, false, new mp9(28), 6);
            return null;
        }
        int webViewViewId = getWebViewViewId();
        if (webViewViewId == 0) {
            b69.h(this, null, null, false, new mp9(29), 7);
            return null;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            return webView;
        }
        WebView webView2 = (WebView) findViewById(webViewViewId);
        if (webView2 == null) {
            b69.h(this, null, null, false, new om1(webViewViewId, 14), 7);
            return null;
        }
        WebSettings settings = webView2.getSettings();
        settings.getClass();
        Context context = getContext();
        context.getClass();
        WebViewUtilsKt.setWebViewSettings(settings, context);
        webView2.setLayerType(2, null);
        webView2.setBackgroundColor(0);
        Context context2 = getContext();
        context2.getClass();
        boolean isHtmlInAppMessageHtmlLinkTargetEnabled = new sl1(context2).isHtmlInAppMessageHtmlLinkTargetEnabled();
        if (isHtmlInAppMessageHtmlLinkTargetEnabled) {
            webView2.getSettings().setSupportMultipleWindows(true);
            b69.h(this, pm1.V, null, false, new js9(0), 6);
        } else {
            b69.h(this, pm1.V, null, false, new js9(1), 6);
        }
        webView2.setWebChromeClient(new InAppMessageHtmlBaseView$messageWebView$6(this, isHtmlInAppMessageHtmlLinkTargetEnabled));
        this.configuredMessageWebView = webView2;
        return webView2;
    }

    public abstract int getWebViewViewId();

    public final void injectSafeAreaInsetsIfNeeded$android_sdk_ui() {
        vlk vlkVar;
        WebView messageWebView;
        Context context = getContext();
        context.getClass();
        if (new sl1(context).isHtmlInAppMessageApplyWindowInsetsEnabled() || (vlkVar = this.lastWindowInsets) == null || (messageWebView = getMessageWebView()) == null) {
            return;
        }
        HtmlInAppMessageSafeAreaInjector.INSTANCE.inject(messageWebView, vlkVar);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        event.getClass();
        if (InAppMessageViewUtils.isApiBelowBaklava() && keyCode == 4 && BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(webView);
        }
        return super.onKeyDown(keyCode, event);
    }

    public void setHasAppliedWindowInsets(boolean z) {
        this.hasAppliedWindowInsets = z;
    }

    public void setHtmlPageFinishedListener(IWebViewClientStateListener listener) {
        vt0 vt0Var;
        InAppMessageWebViewClient inAppMessageWebViewClient = this.inAppMessageWebViewClient;
        if (inAppMessageWebViewClient != null) {
            if (listener != null) {
                vt0Var = new vt0(17, this, listener);
            } else {
                vt0Var = null;
            }
            inAppMessageWebViewClient.setWebViewClientStateListener(vt0Var);
        }
    }

    public void setInAppMessageWebViewClient(InAppMessageWebViewClient inAppMessageWebViewClient) {
        inAppMessageWebViewClient.getClass();
        WebView messageWebView = getMessageWebView();
        if (messageWebView != null) {
            messageWebView.setWebViewClient(inAppMessageWebViewClient);
        }
        this.inAppMessageWebViewClient = inAppMessageWebViewClient;
    }

    public void setWebViewContent(String htmlBody, String assetDirectoryUrl) {
        if (htmlBody != null) {
            WebView messageWebView = getMessageWebView();
            if (messageWebView != null) {
                messageWebView.loadDataWithBaseURL("https://iamcache.braze/", htmlBody, "text/html", "utf-8", null);
                return;
            }
            return;
        }
        b69.h(this, null, null, false, new js9(2), 7);
    }

    public final void setupDirectionalNavigation() {
        WebView messageWebView = getMessageWebView();
        if (messageWebView == null) {
            return;
        }
        messageWebView.setNextFocusDownId(messageWebView.getId());
        messageWebView.setNextFocusLeftId(messageWebView.getId());
        messageWebView.setNextFocusRightId(messageWebView.getId());
        messageWebView.setNextFocusUpId(messageWebView.getId());
        messageWebView.requestFocus();
        messageWebView.setFocusedByDefault(true);
        messageWebView.post(new y85(messageWebView, 25));
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return this;
    }

    public final void setWebViewContent(String str) {
        setWebViewContent$default(this, str, null, 2, null);
    }
}
