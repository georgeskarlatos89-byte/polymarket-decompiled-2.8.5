package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zh1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zh1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5c a5cVar = ((BottomSheetBehavior) obj).k;
                if (a5cVar != null) {
                    a5cVar.t(floatValue);
                    return;
                }
                return;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                bw7 bw7Var = (bw7) obj;
                bw7Var.c.setAlpha(floatValue2);
                bw7Var.d.setAlpha(floatValue2);
                bw7Var.s.invalidate();
                return;
            case 2:
                ((c9a) obj).m = valueAnimator.getAnimatedFraction();
                return;
            case 3:
                ((e5h) obj).invalidateSelf();
                return;
            case 4:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            default:
                ((TextInputLayout) obj).J1.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
