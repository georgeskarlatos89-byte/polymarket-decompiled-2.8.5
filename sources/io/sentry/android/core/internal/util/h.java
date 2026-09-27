package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import defpackage.qmf;
import io.sentry.android.core.n0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class h implements ViewTreeObserver.OnDrawListener {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final AtomicReference b;
    public final Runnable c;

    public h(View view, Runnable runnable) {
        this.b = new AtomicReference(view);
        this.c = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, Runnable runnable, n0 n0Var) {
        Window.Callback callback;
        Window window = activity.getWindow();
        if (window != null) {
            View peekDecorView = window.peekDecorView();
            if (peekDecorView != null) {
                peekDecorView.getViewTreeObserver().addOnDrawListener(new h(peekDecorView, runnable));
                return;
            }
            Window.Callback callback2 = window.getCallback();
            if (callback2 != null) {
                callback = callback2;
            } else {
                callback = new Object();
            }
            window.setCallback(new io.sentry.android.core.performance.h(callback, new qmf(window, callback2, runnable, n0Var)));
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new g(this, view));
        this.a.postAtFrontOfQueue(this.c);
    }
}
