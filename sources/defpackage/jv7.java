package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jv7 extends AnimatorListenerAdapter implements fcj {
    public final View a;
    public boolean b = false;

    public jv7(View view) {
        this.a = view;
    }

    @Override // defpackage.fcj
    public final void a() {
        float f;
        View view = this.a;
        if (view.getVisibility() == 0) {
            le3 le3Var = xbk.a;
            f = view.getTransitionAlpha();
        } else {
            f = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f));
    }

    @Override // defpackage.fcj
    public final void c() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        le3 le3Var = xbk.a;
        this.a.setTransitionAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (!z) {
            le3 le3Var = xbk.a;
            view.setTransitionAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.fcj
    public final void b(gcj gcjVar) {
    }

    @Override // defpackage.fcj
    public final void d(gcj gcjVar) {
    }

    @Override // defpackage.fcj
    public final void e(gcj gcjVar) {
    }

    @Override // defpackage.fcj
    public final void f(gcj gcjVar) {
    }
}
