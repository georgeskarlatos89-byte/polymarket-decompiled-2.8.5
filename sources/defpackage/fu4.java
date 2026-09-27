package defpackage;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface fu4 {
    @JavascriptInterface
    String getInitParams();

    @JavascriptInterface
    void onError(String str);

    @JavascriptInterface
    void onReady();

    @JavascriptInterface
    void onSuccess(String str);
}
