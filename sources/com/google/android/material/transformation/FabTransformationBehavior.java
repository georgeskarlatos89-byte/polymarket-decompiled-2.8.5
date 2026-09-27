package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.dmk;
import defpackage.t65;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.q65
    public final boolean f(View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        dmk.n("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // defpackage.q65
    public final void g(t65 t65Var) {
        if (t65Var.h == 0) {
            t65Var.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
