package com.braze.ui;

import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import defpackage.b69;
import defpackage.un1;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/braze/ui/BrazeWebViewActivity$createWebChromeClient$1", "Landroid/webkit/WebChromeClient;", "onConsoleMessage", "", "cm", "Landroid/webkit/ConsoleMessage;", "getDefaultVideoPoster", "Landroid/graphics/Bitmap;", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeWebViewActivity$createWebChromeClient$1 extends WebChromeClient {
    public static /* synthetic */ String a(ConsoleMessage consoleMessage) {
        return onConsoleMessage$lambda$0(consoleMessage);
    }

    private static final String onConsoleMessage$lambda$0(ConsoleMessage consoleMessage) {
        return "Braze WebView Activity log. Line: " + consoleMessage.lineNumber() + ". SourceId: " + consoleMessage.sourceId() + ". Log Level: " + consoleMessage.messageLevel() + ". Message: " + consoleMessage.message();
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
        b69.h(this, null, null, false, new un1(cm, 0), 7);
        return true;
    }
}
