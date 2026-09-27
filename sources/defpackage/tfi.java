package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tfi extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ SwipeRefreshLayout c;

    public tfi(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.c = swipeRefreshLayout;
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.c.z.setAlpha((int) (((this.b - r0) * f) + this.a));
    }
}
