package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ga1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa1 b;

    public /* synthetic */ ga1(pa1 pa1Var, int i) {
        this.a = i;
        this.b = pa1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        pa1 pa1Var = this.b;
        switch (i) {
            case 0:
                pa1Var.c();
                return;
            case 1:
                pa1Var.d();
                return;
            case 2:
                pa1Var.c();
                return;
            default:
                pa1Var.d();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        pa1 pa1Var = this.b;
        switch (i) {
            case 1:
                SnackbarContentLayout snackbarContentLayout = pa1Var.j;
                int i2 = pa1Var.c;
                int i3 = pa1Var.a;
                int i4 = i2 - i3;
                snackbarContentLayout.a.setAlpha(0.0f);
                long j = i3;
                ViewPropertyAnimator duration = snackbarContentLayout.a.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.d;
                long j2 = i4;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.b.getVisibility() == 0) {
                    snackbarContentLayout.b.setAlpha(0.0f);
                    snackbarContentLayout.b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    return;
                }
                return;
            case 2:
                SnackbarContentLayout snackbarContentLayout2 = pa1Var.j;
                int i5 = pa1Var.b;
                snackbarContentLayout2.a.setAlpha(1.0f);
                long j3 = i5;
                ViewPropertyAnimator duration2 = snackbarContentLayout2.a.animate().alpha(0.0f).setDuration(j3);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.d;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(0L).start();
                if (snackbarContentLayout2.b.getVisibility() == 0) {
                    snackbarContentLayout2.b.setAlpha(1.0f);
                    snackbarContentLayout2.b.animate().alpha(0.0f).setDuration(j3).setInterpolator(timeInterpolator2).setStartDelay(0L).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ ga1(pa1 pa1Var, int i, int i2) {
        this.a = i2;
        this.b = pa1Var;
    }
}
