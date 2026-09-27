package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d34 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ f34 a;
    public final /* synthetic */ g34 b;

    public d34(g34 g34Var, f34 f34Var) {
        this.b = g34Var;
        this.a = f34Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f34 f34Var = this.a;
        g34.d(floatValue, f34Var);
        g34 g34Var = this.b;
        g34Var.a(floatValue, f34Var, false);
        g34Var.invalidateSelf();
    }
}
