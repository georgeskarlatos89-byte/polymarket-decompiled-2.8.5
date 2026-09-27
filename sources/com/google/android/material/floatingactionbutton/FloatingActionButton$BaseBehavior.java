package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.jlf;
import defpackage.q65;
import defpackage.t65;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class FloatingActionButton$BaseBehavior<T> extends q65 {
    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jlf.l);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.q65
    public final boolean e(View view) {
        throw new ClassCastException();
    }

    @Override // defpackage.q65
    public final void g(t65 t65Var) {
        if (t65Var.h == 0) {
            t65Var.h = 80;
        }
    }

    @Override // defpackage.q65
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // defpackage.q65
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior() {
    }
}
