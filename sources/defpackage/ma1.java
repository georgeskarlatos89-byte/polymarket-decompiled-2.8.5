package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ma1 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference a;
    public final WeakReference b;

    public ma1(zah zahVar, View view) {
        this.a = new WeakReference(zahVar);
        this.b = new WeakReference(view);
    }

    public final void a() {
        WeakReference weakReference = this.b;
        if (weakReference.get() != null) {
            ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
            View view = (View) weakReference.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
        weakReference.clear();
        this.a.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null) {
            a();
        } else {
            ((pa1) weakReference.get()).getClass();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.a.get() == null) {
            a();
        } else if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.a.get() == null) {
            a();
        } else if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
