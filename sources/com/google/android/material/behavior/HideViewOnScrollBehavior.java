package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.polymarket.android.R;
import defpackage.d55;
import defpackage.dmk;
import defpackage.m51;
import defpackage.na0;
import defpackage.q65;
import defpackage.r79;
import defpackage.rhn;
import defpackage.s79;
import defpackage.sv6;
import defpackage.t20;
import defpackage.t65;
import defpackage.t79;
import defpackage.uen;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends q65 {
    public t79 a;
    public AccessibilityManager b;
    public r79 c;
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet d = new LinkedHashSet();
    public int i = 0;
    public int j = 2;
    public int l = 0;
    public int m = 0;

    public HideViewOnScrollBehavior() {
    }

    @Override // defpackage.q65
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        int measuredHeight;
        int i2;
        int i3;
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) d55.l(view.getContext(), AccessibilityManager.class);
            this.b = accessibilityManager;
        }
        if (accessibilityManager != null && this.c == null) {
            r79 r79Var = new r79(this, view, 1);
            this.c = r79Var;
            accessibilityManager.addTouchExplorationStateChangeListener(r79Var);
            view.addOnAttachStateChangeListener(new t20(this, 5));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i4 = ((t65) view.getLayoutParams()).c;
        if (i4 != 80 && i4 != 81) {
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            w(i3);
        } else {
            w(1);
        }
        switch (this.a.a) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i2 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.rightMargin;
                break;
        }
        this.i = measuredHeight + i2;
        this.e = uen.c(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = uen.c(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = rhn.c(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, na0.d);
        this.h = rhn.c(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, na0.c);
        return false;
    }

    @Override // defpackage.q65
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i > 0) {
            if (this.j != 1) {
                AccessibilityManager accessibilityManager = this.b;
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    y(view, 1);
                    this.k = this.a.c(view, this.i).setInterpolator(this.h).setDuration(this.f).setListener(new s79(1, this, view));
                    return;
                }
                return;
            }
            return;
        }
        if (i < 0) {
            x(view);
        }
    }

    @Override // defpackage.q65
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public final void w(int i) {
        int i2;
        t79 t79Var = this.a;
        if (t79Var != null) {
            switch (t79Var.a) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.a = new t79(1);
                    return;
                } else {
                    dmk.v(sv6.j(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                    return;
                }
            }
            this.a = new t79(0);
            return;
        }
        this.a = new t79(2);
    }

    public final void x(View view) {
        if (this.j == 2) {
            return;
        }
        y(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.a.getClass();
        this.k = this.a.c(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new s79(1, this, view));
    }

    public final void y(View view, int i) {
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
        Iterator it = this.d.iterator();
        if (!it.hasNext()) {
        } else {
            throw m51.g(it);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
