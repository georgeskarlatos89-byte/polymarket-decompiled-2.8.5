package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ha1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa1 b;

    public /* synthetic */ ha1(pa1 pa1Var, int i) {
        this.a = i;
        this.b = pa1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        pa1 pa1Var = this.b;
        switch (i) {
            case 0:
                pa1Var.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oa1 oa1Var = pa1Var.i;
                oa1Var.setScaleX(floatValue);
                oa1Var.setScaleY(floatValue);
                return;
            case 2:
                pa1Var.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                pa1Var.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
