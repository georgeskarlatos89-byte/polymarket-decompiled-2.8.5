package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sfi extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ sfi(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.a = i;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (i) {
            case 0:
                swipeRefreshLayout.setAnimationProgress(f);
                return;
            case 1:
                swipeRefreshLayout.setAnimationProgress(1.0f - f);
                return;
            case 2:
                int abs = swipeRefreshLayout.x - Math.abs(swipeRefreshLayout.w);
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.v + ((int) ((abs - r1) * f))) - swipeRefreshLayout.t.getTop());
                g34 g34Var = swipeRefreshLayout.z;
                float f2 = 1.0f - f;
                f34 f34Var = g34Var.a;
                if (f2 != f34Var.p) {
                    f34Var.p = f2;
                }
                g34Var.invalidateSelf();
                return;
            default:
                swipeRefreshLayout.k(f);
                return;
        }
    }
}
