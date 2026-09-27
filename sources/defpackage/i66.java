package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i66 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j66 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ l66 e;

    public /* synthetic */ i66(l66 l66Var, j66 j66Var, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = l66Var;
        this.b = j66Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        j66 j66Var = this.b;
        l66 l66Var = this.e;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                l66Var.dispatchChangeFinished(j66Var.a, true);
                l66Var.mChangeAnimations.remove(j66Var.a);
                l66Var.dispatchFinishedWhenDone();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                l66Var.dispatchChangeFinished(j66Var.b, false);
                l66Var.mChangeAnimations.remove(j66Var.b);
                l66Var.dispatchFinishedWhenDone();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        j66 j66Var = this.b;
        l66 l66Var = this.e;
        switch (i) {
            case 0:
                l66Var.dispatchChangeStarting(j66Var.a, true);
                return;
            default:
                l66Var.dispatchChangeStarting(j66Var.b, false);
                return;
        }
    }
}
