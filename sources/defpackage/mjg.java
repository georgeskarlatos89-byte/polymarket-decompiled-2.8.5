package defpackage;

import android.animation.ValueAnimator;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mjg implements in9 {
    public float a;
    public ValueAnimator b;
    public final /* synthetic */ njg c;

    public mjg(njg njgVar) {
        this.c = njgVar;
    }

    @Override // defpackage.in9
    public final void a(long j, wy2 wy2Var) {
        o9n.e(3, "ScreenFlashView");
        njg njgVar = this.c;
        this.a = njg.a(njgVar);
        njg.b(njgVar, 1.0f);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(wy2Var);
        wvb wvbVar = new wvb(wy2Var, 16);
        o9n.e(3, "ScreenFlashView");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(njgVar.getVisibilityRampUpAnimationDurationMillis());
        ofFloat.addUpdateListener(new rg6(njgVar, 5));
        ofFloat.addListener(new g4f(wvbVar, 1));
        ofFloat.start();
        this.b = ofFloat;
    }

    @Override // defpackage.in9
    public final void clear() {
        o9n.e(3, "ScreenFlashView");
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        njg njgVar = this.c;
        njgVar.setAlpha(0.0f);
        njg.b(njgVar, this.a);
    }
}
