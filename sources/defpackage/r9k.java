package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r9k implements Interpolator {
    public final /* synthetic */ s9k a;

    public r9k(s9k s9kVar) {
        this.a = s9kVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.u.getInterpolation(f);
    }
}
