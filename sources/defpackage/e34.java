package defpackage;

import android.animation.Animator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e34 implements Animator.AnimatorListener {
    public final /* synthetic */ f34 a;
    public final /* synthetic */ g34 b;

    public e34(g34 g34Var, f34 f34Var) {
        this.b = g34Var;
        this.a = f34Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        g34 g34Var = this.b;
        f34 f34Var = this.a;
        g34Var.a(1.0f, f34Var, true);
        f34Var.k = f34Var.e;
        f34Var.l = f34Var.f;
        f34Var.m = f34Var.g;
        f34Var.a((f34Var.j + 1) % f34Var.i.length);
        if (g34Var.f) {
            g34Var.f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (f34Var.n) {
                f34Var.n = false;
                return;
            }
            return;
        }
        g34Var.e += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.e = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
