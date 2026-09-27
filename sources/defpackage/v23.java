package defpackage;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v23 implements y07 {
    public final u23 a;
    public final ysk b;
    public w30 c;
    public w30 d;

    /* JADX WARN: Type inference failed for: r0v0, types: [u23, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ysk, java.lang.Object] */
    public v23() {
        owa owaVar = owa.Ltr;
        ?? obj = new Object();
        obj.a = wql.a;
        obj.b = owaVar;
        obj.c = nc7.a;
        obj.d = 0L;
        this.a = obj;
        ?? obj2 = new Object();
        obj2.c = this;
        obj2.a = new jw8(obj2, 17);
        this.b = obj2;
    }

    public static w30 a(v23 v23Var, long j, z07 z07Var, float f, kb4 kb4Var, int i) {
        w30 c = v23Var.c(z07Var);
        Paint paint = c.a;
        if (f != 1.0f) {
            j = ib4.b(j, ib4.c(j) * f, 0.0f, 0.0f, 0.0f, 14);
        }
        long b = hpn.b(paint.getColor());
        int i2 = ib4.n;
        if (!hkj.a(b, j)) {
            c.e(j);
        }
        if (c.c != null) {
            c.i(null);
        }
        if (!Intrinsics.areEqual(c.d, kb4Var)) {
            c.f(kb4Var);
        }
        if (c.b != i) {
            c.d(i);
        }
        if (paint.isFilterBitmap()) {
            return c;
        }
        c.g(1);
        return c;
    }

    @Override // defpackage.y07
    public final void A(zo1 zo1Var, long j, long j2, long j3, float f, z07 z07Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.c.f(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), b(zo1Var, z07Var, f, null, i, 1));
    }

    @Override // defpackage.y07
    public final void E(zo1 zo1Var, long j, long j2, float f, z07 z07Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.c.r(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), b(zo1Var, z07Var, f, null, i, 1));
    }

    @Override // defpackage.y07
    public final void F0(mxd mxdVar, long j, float f, z07 z07Var, kb4 kb4Var) {
        this.a.c.e(mxdVar, a(this, j, z07Var, f, kb4Var, 3));
    }

    @Override // defpackage.y07
    public final void G0(long j, long j2, long j3, float f, z07 z07Var, kb4 kb4Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.c.r(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, z07Var, f, kb4Var, i));
    }

    @Override // defpackage.y07
    public final void K0(r0h r0hVar, float f, long j, float f2, z07 z07Var, int i) {
        this.a.c.c(f, j, b(r0hVar, z07Var, f2, null, i, 1));
    }

    @Override // defpackage.y07
    public final void U(v20 v20Var, kb4 kb4Var) {
        this.a.c.a(v20Var, b(null, h18.a, 1.0f, kb4Var, 3, 1));
    }

    public final w30 b(zo1 zo1Var, z07 z07Var, float f, kb4 kb4Var, int i, int i2) {
        w30 c = c(z07Var);
        Paint paint = c.a;
        if (zo1Var != null) {
            zo1Var.a(f, d(), c);
        } else {
            if (c.c != null) {
                c.i(null);
            }
            long b = hpn.b(paint.getColor());
            long j = ib4.b;
            if (!hkj.a(b, j)) {
                c.e(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                c.c(f);
            }
        }
        if (!Intrinsics.areEqual(c.d, kb4Var)) {
            c.f(kb4Var);
        }
        if (c.b != i) {
            c.d(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return c;
        }
        c.g(i2);
        return c;
    }

    public final w30 c(z07 z07Var) {
        if (Intrinsics.areEqual(z07Var, h18.a)) {
            w30 w30Var = this.c;
            if (w30Var == null) {
                w30 a = mcn.a();
                a.m(0);
                this.c = a;
                return a;
            }
            return w30Var;
        }
        if (z07Var instanceof p9i) {
            w30 w30Var2 = this.d;
            if (w30Var2 == null) {
                w30Var2 = mcn.a();
                w30Var2.m(1);
                this.d = w30Var2;
            }
            Paint paint = w30Var2.a;
            float strokeWidth = paint.getStrokeWidth();
            p9i p9iVar = (p9i) z07Var;
            e40 e40Var = p9iVar.e;
            float f = p9iVar.a;
            if (strokeWidth != f) {
                w30Var2.l(f);
            }
            int a2 = w30Var2.a();
            int i = p9iVar.c;
            if (a2 != i) {
                w30Var2.j(i);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f2 = p9iVar.b;
            if (strokeMiter != f2) {
                paint.setStrokeMiter(f2);
            }
            int b = w30Var2.b();
            int i2 = p9iVar.d;
            if (b != i2) {
                w30Var2.k(i2);
            }
            if (!Intrinsics.areEqual(w30Var2.e, e40Var)) {
                w30Var2.h(e40Var);
            }
            return w30Var2;
        }
        dmk.a();
        return null;
    }

    @Override // defpackage.y07
    public final void g(long j, long j2, long j3, float f, int i, e40 e40Var, int i2) {
        t23 t23Var = this.a.c;
        w30 w30Var = this.d;
        if (w30Var == null) {
            w30Var = mcn.a();
            w30Var.m(1);
            this.d = w30Var;
        }
        w30 w30Var2 = w30Var;
        Paint paint = w30Var2.a;
        long b = hpn.b(paint.getColor());
        int i3 = ib4.n;
        if (!hkj.a(b, j)) {
            w30Var2.e(j);
        }
        if (w30Var2.c != null) {
            w30Var2.i(null);
        }
        if (!Intrinsics.areEqual(w30Var2.d, null)) {
            w30Var2.f(null);
        }
        if (w30Var2.b != i2) {
            w30Var2.d(i2);
        }
        if (paint.getStrokeWidth() != f) {
            w30Var2.l(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (w30Var2.a() != i) {
            w30Var2.j(i);
        }
        if (w30Var2.b() != 0) {
            w30Var2.k(0);
        }
        if (!Intrinsics.areEqual(w30Var2.e, e40Var)) {
            w30Var2.h(e40Var);
        }
        if (!paint.isFilterBitmap()) {
            w30Var2.g(1);
        }
        t23Var.g(j2, j3, w30Var2);
    }

    @Override // defpackage.il6
    public final float getDensity() {
        return this.a.a.getDensity();
    }

    @Override // defpackage.y07
    public final owa getLayoutDirection() {
        return this.a.b;
    }

    @Override // defpackage.y07
    public final void l0(mxd mxdVar, zo1 zo1Var, float f, z07 z07Var, int i) {
        this.a.c.e(mxdVar, b(zo1Var, z07Var, f, null, i, 1));
    }

    @Override // defpackage.y07
    public final void n(long j, float f, float f2, long j2, long j3, float f3, z07 z07Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, z07Var, f3, null, 3));
    }

    @Override // defpackage.y07
    public final void n0(long j, float f, long j2, float f2, z07 z07Var, int i) {
        this.a.c.c(f, j2, a(this, j, z07Var, f2, null, i));
    }

    @Override // defpackage.y07
    public final void p0(v20 v20Var, long j, long j2, long j3, long j4, float f, kb4 kb4Var, int i) {
        this.a.c.d(v20Var, j, j2, j3, j4, b(null, h18.a, f, kb4Var, 3, i));
    }

    @Override // defpackage.il6
    public final float q0() {
        return this.a.a.q0();
    }

    @Override // defpackage.y07
    public final void s0(zo1 zo1Var, long j, long j2, float f, float f2) {
        t23 t23Var = this.a.c;
        w30 w30Var = this.d;
        if (w30Var == null) {
            w30Var = mcn.a();
            w30Var.m(1);
            this.d = w30Var;
        }
        Paint paint = w30Var.a;
        if (zo1Var != null) {
            zo1Var.a(f2, d(), w30Var);
        } else if (paint.getAlpha() / 255.0f != f2) {
            w30Var.c(f2);
        }
        if (!Intrinsics.areEqual(w30Var.d, null)) {
            w30Var.f(null);
        }
        if (w30Var.b != 3) {
            w30Var.d(3);
        }
        if (paint.getStrokeWidth() != f) {
            w30Var.l(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (w30Var.a() != 0) {
            w30Var.j(0);
        }
        if (w30Var.b() != 0) {
            w30Var.k(0);
        }
        if (!Intrinsics.areEqual(w30Var.e, null)) {
            w30Var.h(null);
        }
        if (!paint.isFilterBitmap()) {
            w30Var.g(1);
        }
        t23Var.g(j, j2, w30Var);
    }

    @Override // defpackage.y07
    public final void u0(long j, long j2, long j3, long j4, z07 z07Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.c.f(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, z07Var, 1.0f, null, i));
    }

    @Override // defpackage.y07
    public final ysk y0() {
        return this.b;
    }
}
