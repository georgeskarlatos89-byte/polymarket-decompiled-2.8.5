package defpackage;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ni1 extends WebViewClient {
    public final buk a;
    public final buk b;

    public ni1(buk bukVar, buk bukVar2) {
        this.a = bukVar;
        this.b = bukVar2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.a.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.b.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence charSequence;
        if (webResourceError != null) {
            charSequence = webResourceError.getDescription();
        } else {
            charSequence = null;
        }
        new StringBuilder("Error loading page: ").append((Object) charSequence);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
        if (sslError != null) {
            str = sslError.toString();
        } else {
            str = null;
        }
        new StringBuilder("SSL Error: ").append(str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        StringBuilder sb = new StringBuilder("Error ");
        sb.append(i);
        sb.append(": ");
        sb.append(str);
    }
}
