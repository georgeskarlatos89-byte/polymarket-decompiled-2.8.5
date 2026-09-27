package defpackage;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f40 {
    public final PathMeasure a;

    public f40(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, d40 d40Var) {
        this.a.getSegment(f, f2, d40Var.a, true);
    }

    public final void b(d40 d40Var) {
        this.a.setPath(d40Var.a, false);
    }
}
