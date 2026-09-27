package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public FabTransformationScrimBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.q65
    public final boolean f(View view, View view2) {
        return false;
    }

    @Override // defpackage.q65
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
