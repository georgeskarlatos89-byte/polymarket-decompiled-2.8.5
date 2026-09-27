package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n7a implements x5c, y6a {
    public final /* synthetic */ y6a a;
    public final owa b;

    public n7a(y6a y6aVar, owa owaVar) {
        this.a = y6aVar;
        this.b = owaVar;
    }

    @Override // defpackage.il6
    public final int A0(long j) {
        return this.a.A0(j);
    }

    @Override // defpackage.x5c
    public final w5c C0(int i, int i2, Map map, Function1 function1, Function1 function12) {
        int i3;
        int i4;
        if (i < 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if (i2 < 0) {
            i4 = 0;
        } else {
            i4 = i2;
        }
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i4) != 0) {
            kw9.c("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new tj0(i3, i4, map, function1, 1);
    }

    @Override // defpackage.y6a
    public final boolean I() {
        return this.a.I();
    }

    @Override // defpackage.il6
    public final long J0(long j) {
        return this.a.J0(j);
    }

    @Override // defpackage.il6
    public final int O(float f) {
        return this.a.O(f);
    }

    @Override // defpackage.il6
    public final float S(long j) {
        return this.a.S(j);
    }

    @Override // defpackage.il6
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.y6a
    public final owa getLayoutDirection() {
        return this.b;
    }

    @Override // defpackage.il6
    public final float j0(int i) {
        return this.a.j0(i);
    }

    @Override // defpackage.il6
    public final long k(float f) {
        return this.a.k(f);
    }

    @Override // defpackage.il6
    public final float k0(float f) {
        return this.a.k0(f);
    }

    @Override // defpackage.il6
    public final long l(long j) {
        return this.a.l(j);
    }

    @Override // defpackage.il6
    public final float p(long j) {
        return this.a.p(j);
    }

    @Override // defpackage.il6
    public final float q0() {
        return this.a.q0();
    }

    @Override // defpackage.il6
    public final float t0(float f) {
        return this.a.t0(f);
    }

    @Override // defpackage.il6
    public final long v(int i) {
        return this.a.v(i);
    }

    @Override // defpackage.il6
    public final long x(float f) {
        return this.a.x(f);
    }
}
