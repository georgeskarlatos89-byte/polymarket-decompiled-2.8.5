package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rqe extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tqe b;

    public /* synthetic */ rqe(tqe tqeVar, int i) {
        this.a = i;
        this.b = tqeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        tqe tqeVar = this.b;
        switch (i) {
            case 0:
                View view = tqeVar.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = tqeVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = tqeVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    return;
                }
                return;
            case 1:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                tqeVar.i(0);
                return;
            case 3:
                tqeVar.i(0);
                return;
            case 4:
                ViewGroup viewGroup3 = tqeVar.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    return;
                }
                return;
            case 5:
                ViewGroup viewGroup4 = tqeVar.h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        int i2 = 4;
        tqe tqeVar = this.b;
        switch (i) {
            case 0:
                View view = tqeVar.j;
                if ((view instanceof sg6) && !tqeVar.A) {
                    sg6 sg6Var = (sg6) view;
                    ValueAnimator valueAnimator = sg6Var.E;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(sg6Var.F, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    return;
                }
                return;
            case 1:
                View view2 = tqeVar.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = tqeVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = tqeVar.e;
                if (viewGroup2 != null) {
                    if (tqeVar.A) {
                        i2 = 0;
                    }
                    viewGroup2.setVisibility(i2);
                }
                View view3 = tqeVar.j;
                if ((view3 instanceof sg6) && !tqeVar.A) {
                    sg6 sg6Var2 = (sg6) view3;
                    ValueAnimator valueAnimator2 = sg6Var2.E;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    sg6Var2.G = false;
                    valueAnimator2.setFloatValues(sg6Var2.F, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    return;
                }
                return;
            case 2:
                tqeVar.i(4);
                return;
            case 3:
                tqeVar.i(4);
                return;
            case 4:
                ViewGroup viewGroup3 = tqeVar.h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    viewGroup3.setTranslationX(viewGroup3.getWidth());
                    viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
                    return;
                }
                return;
            default:
                ViewGroup viewGroup4 = tqeVar.f;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
