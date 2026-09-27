package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.q65;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends q65 {
    public ExpandableBehavior() {
    }

    @Override // defpackage.q65
    public abstract boolean f(View view, View view2);

    @Override // defpackage.q65
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.q65
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!view.isLaidOut()) {
            ArrayList j = coordinatorLayout.j(view);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                f(view, (View) j.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
