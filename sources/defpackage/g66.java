package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g66 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ g b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ l66 e;

    public g66(l66 l66Var, g gVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = l66Var;
        this.b = gVar;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        g gVar = this.b;
        l66 l66Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                l66Var.dispatchRemoveFinished(gVar);
                l66Var.mRemoveAnimations.remove(gVar);
                l66Var.dispatchFinishedWhenDone();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                l66Var.dispatchAddFinished(gVar);
                l66Var.mAddAnimations.remove(gVar);
                l66Var.dispatchFinishedWhenDone();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        g gVar = this.b;
        l66 l66Var = this.e;
        switch (i) {
            case 0:
                l66Var.dispatchRemoveStarting(gVar);
                return;
            default:
                l66Var.dispatchAddStarting(gVar);
                return;
        }
    }

    public g66(l66 l66Var, g gVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = l66Var;
        this.b = gVar;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
