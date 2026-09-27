package io.intercom.android.sdk.conversation;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class JavascriptRunner {
    private final Collection<Runnable> actionsAfterLoad;
    private boolean hasLoaded;
    private final WebView webView;

    public JavascriptRunner(WebView webView, Collection<Runnable> collection) {
        this.hasLoaded = false;
        this.webView = webView;
        this.actionsAfterLoad = collection;
    }

    public static /* synthetic */ WebView access$000(JavascriptRunner javascriptRunner) {
        return javascriptRunner.webView;
    }

    public synchronized void clearPendingScripts() {
        this.actionsAfterLoad.clear();
    }

    public synchronized void reset() {
        this.hasLoaded = false;
        clearPendingScripts();
    }

    public synchronized void run(final String str) {
        try {
            Runnable runnable = new Runnable() { // from class: io.intercom.android.sdk.conversation.JavascriptRunner.1
                @Override // java.lang.Runnable
                public void run() {
                    JavascriptRunner.access$000(JavascriptRunner.this).loadUrl("javascript:" + str);
                }
            };
            if (this.hasLoaded) {
                this.webView.post(runnable);
            } else {
                this.actionsAfterLoad.add(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void runPendingScripts() {
        try {
            this.hasLoaded = true;
            Iterator<Runnable> it = this.actionsAfterLoad.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            clearPendingScripts();
        } catch (Throwable th) {
            throw th;
        }
    }

    public JavascriptRunner(WebView webView) {
        this(webView, new ArrayList());
    }
}
