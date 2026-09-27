package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.polymarket.android.R;
import defpackage.d55;
import defpackage.m51;
import defpackage.na0;
import defpackage.q65;
import defpackage.r79;
import defpackage.rhn;
import defpackage.s79;
import defpackage.t20;
import defpackage.uen;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends q65 {
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public AccessibilityManager g;
    public r79 h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet a = new LinkedHashSet();
    public int f = 0;
    public final boolean i = true;
    public int j = 2;
    public int l = 0;
    public int m = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.q65
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = uen.c(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = uen.c(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = rhn.c(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, na0.d);
        this.e = rhn.c(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, na0.c);
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) d55.l(view.getContext(), AccessibilityManager.class);
            this.g = accessibilityManager;
        }
        if (accessibilityManager != null && this.h == null) {
            r79 r79Var = new r79(this, view, 0);
            this.h = r79Var;
            accessibilityManager.addTouchExplorationStateChangeListener(r79Var);
            view.addOnAttachStateChangeListener(new t20(this, 4));
        }
        return false;
    }

    @Override // defpackage.q65
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i > 0) {
            if (this.j != 1) {
                if (!this.i || (accessibilityManager = this.g) == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    x(view, 1);
                    this.k = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new s79(0, this, view));
                    return;
                }
                return;
            }
            return;
        }
        if (i < 0) {
            w(view);
        }
    }

    @Override // defpackage.q65
    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public final void w(View view) {
        if (this.j == 2) {
            return;
        }
        x(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.k = view.animate().translationY(0.0f).setInterpolator(this.d).setDuration(this.b).setListener(new s79(0, this, view));
    }

    public final void x(View view, int i) {
        this.j = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.m);
            }
        }
        Iterator it = this.a.iterator();
        if (!it.hasNext()) {
        } else {
            throw m51.g(it);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
