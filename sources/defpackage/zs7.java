package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zs7 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Function0 c;

    public zs7(Function0 function0, View view) {
        this.b = view;
        this.c = function0;
        view.addOnAttachStateChangeListener(this);
        if (!this.a && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.a = true;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.c.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (!this.a) {
            View view2 = this.b;
            if (view2.isAttachedToWindow()) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.a = true;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (!this.a) {
            return;
        }
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a = false;
    }
}
