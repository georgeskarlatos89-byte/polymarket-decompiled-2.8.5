package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface y07 extends il6 {
    static void D(y07 y07Var, mxd mxdVar, long j, float f, z07 z07Var, of1 of1Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            z07Var = h18.a;
        }
        z07 z07Var2 = z07Var;
        if ((i & 16) != 0) {
            of1Var = null;
        }
        y07Var.F0(mxdVar, j, f2, z07Var2, of1Var);
    }

    static void F(y07 y07Var, mxd mxdVar, zo1 zo1Var, float f, p9i p9iVar, int i) {
        int i2;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        z07 z07Var = p9iVar;
        if ((i & 8) != 0) {
            z07Var = h18.a;
        }
        z07 z07Var2 = z07Var;
        if ((i & 32) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        y07Var.l0(mxdVar, zo1Var, f2, z07Var2, i2);
    }

    static void K(y07 y07Var, v20 v20Var, long j, long j2, long j3, float f, kb4 kb4Var, int i, int i2) {
        long j4;
        long j5;
        long j6;
        float f2;
        kb4 kb4Var2;
        int i3;
        if ((i2 & 4) != 0) {
            j4 = (v20Var.a.getHeight() & 4294967295L) | (v20Var.a.getWidth() << 32);
        } else {
            j4 = j;
        }
        if ((i2 & 8) != 0) {
            j5 = 0;
        } else {
            j5 = j2;
        }
        if ((i2 & 16) != 0) {
            j6 = j4;
        } else {
            j6 = j3;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 128) != 0) {
            kb4Var2 = null;
        } else {
            kb4Var2 = kb4Var;
        }
        if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
            i3 = 1;
        } else {
            i3 = i;
        }
        y07Var.p0(v20Var, 0L, j4, j5, j6, f2, kb4Var2, i3);
    }

    static void M0(y07 y07Var, long j, float f, long j2, float f2, z07 z07Var, int i, int i2) {
        float f3;
        z07 z07Var2;
        int i3;
        if ((i2 & 2) != 0) {
            f = d9h.d(y07Var.d()) / 2.0f;
        }
        float f4 = f;
        if ((i2 & 4) != 0) {
            j2 = y07Var.H0();
        }
        long j3 = j2;
        if ((i2 & 8) != 0) {
            f3 = 1.0f;
        } else {
            f3 = f2;
        }
        if ((i2 & 16) != 0) {
            z07Var2 = h18.a;
        } else {
            z07Var2 = z07Var;
        }
        if ((i2 & 64) != 0) {
            i3 = 3;
        } else {
            i3 = i;
        }
        y07Var.n0(j, f4, j3, f3, z07Var2, i3);
    }

    static void O0(t35 t35Var, i09 i09Var, Function1 function1) {
        long d = ((lxa) t35Var).a.d();
        ((lxa) t35Var).c((((int) Float.intBitsToFloat((int) (d >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (d & 4294967295L))) & 4294967295L), i09Var, function1);
    }

    static void P0(y07 y07Var, long j, long j2, long j3, float f, int i, e40 e40Var, int i2) {
        int i3;
        e40 e40Var2;
        if ((i2 & 16) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            e40Var2 = null;
        } else {
            e40Var2 = e40Var;
        }
        y07Var.g(j, j2, j3, f, i3, e40Var2, 3);
    }

    static void Q(y07 y07Var, long j, long j2, long j3, long j4, z07 z07Var, int i) {
        long j5;
        long j6;
        z07 z07Var2;
        int i2;
        if ((i & 2) != 0) {
            j5 = 0;
        } else {
            j5 = j2;
        }
        if ((i & 4) != 0) {
            j6 = m0(y07Var.d(), j5);
        } else {
            j6 = j3;
        }
        if ((i & 16) != 0) {
            z07Var2 = h18.a;
        } else {
            z07Var2 = z07Var;
        }
        if ((i & 128) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        y07Var.u0(j, j5, j6, j4, z07Var2, i2);
    }

    static void R(y07 y07Var, zo1 zo1Var, long j, long j2, float f, z07 z07Var, int i, int i2) {
        long j3;
        float f2;
        z07 z07Var2;
        int i3;
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        if ((i2 & 4) != 0) {
            j3 = m0(y07Var.d(), j4);
        } else {
            j3 = j2;
        }
        if ((i2 & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 16) != 0) {
            z07Var2 = h18.a;
        } else {
            z07Var2 = z07Var;
        }
        if ((i2 & 64) != 0) {
            i3 = 3;
        } else {
            i3 = i;
        }
        y07Var.E(zo1Var, j4, j3, f2, z07Var2, i3);
    }

    static void V(y07 y07Var, zo1 zo1Var, long j, long j2, float f, float f2, int i) {
        float f3;
        if ((i & 64) != 0) {
            f3 = 1.0f;
        } else {
            f3 = f2;
        }
        y07Var.s0(zo1Var, j, j2, f, f3);
    }

    static void W(y07 y07Var, zo1 zo1Var, long j, long j2, long j3, z07 z07Var, int i) {
        long j4;
        long j5;
        z07 z07Var2;
        int i2;
        if ((i & 2) != 0) {
            j4 = 0;
        } else {
            j4 = j;
        }
        if ((i & 4) != 0) {
            j5 = m0(y07Var.d(), j4);
        } else {
            j5 = j2;
        }
        if ((i & 32) != 0) {
            z07Var2 = h18.a;
        } else {
            z07Var2 = z07Var;
        }
        if ((i & 128) != 0) {
            i2 = 3;
        } else {
            i2 = 14;
        }
        y07Var.A(zo1Var, j4, j5, j3, 1.0f, z07Var2, i2);
    }

    static void h0(y07 y07Var, r0h r0hVar, float f, long j, float f2, p9i p9iVar, int i, int i2) {
        int i3;
        if ((i2 & 8) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        z07 z07Var = p9iVar;
        if ((i2 & 16) != 0) {
            z07Var = h18.a;
        }
        z07 z07Var2 = z07Var;
        if ((i2 & 64) != 0) {
            i3 = 3;
        } else {
            i3 = i;
        }
        y07Var.K0(r0hVar, f, j, f3, z07Var2, i3);
    }

    static void i0(y07 y07Var, long j, long j2, long j3, float f, p9i p9iVar, kb4 kb4Var, int i) {
        long j4;
        long j5;
        float f2;
        z07 z07Var;
        kb4 kb4Var2;
        int i2;
        if ((i & 2) != 0) {
            j4 = 0;
        } else {
            j4 = j2;
        }
        if ((i & 4) != 0) {
            j5 = m0(y07Var.d(), j4);
        } else {
            j5 = j3;
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            z07Var = h18.a;
        } else {
            z07Var = p9iVar;
        }
        if ((i & 32) != 0) {
            kb4Var2 = null;
        } else {
            kb4Var2 = kb4Var;
        }
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        y07Var.G0(j, j4, j5, f2, z07Var, kb4Var2, i2);
    }

    static long m0(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static void t(y07 y07Var, long j, float f, float f2, long j2, long j3, float f3, z07 z07Var, int i) {
        long j4;
        long j5;
        float f4;
        if ((i & 16) != 0) {
            j4 = 0;
        } else {
            j4 = j2;
        }
        if ((i & 32) != 0) {
            j5 = m0(y07Var.d(), j4);
        } else {
            j5 = j3;
        }
        if ((i & 64) != 0) {
            f4 = 1.0f;
        } else {
            f4 = f3;
        }
        y07Var.n(j, f, f2, j4, j5, f4, z07Var);
    }

    static void w(y07 y07Var, v20 v20Var, of1 of1Var, int i) {
        if ((i & 16) != 0) {
            of1Var = null;
        }
        y07Var.U(v20Var, of1Var);
    }

    void A(zo1 zo1Var, long j, long j2, long j3, float f, z07 z07Var, int i);

    void E(zo1 zo1Var, long j, long j2, float f, z07 z07Var, int i);

    void F0(mxd mxdVar, long j, float f, z07 z07Var, kb4 kb4Var);

    void G0(long j, long j2, long j3, float f, z07 z07Var, kb4 kb4Var, int i);

    default long H0() {
        return yhl.b(y0().B());
    }

    void K0(r0h r0hVar, float f, long j, float f2, z07 z07Var, int i);

    void U(v20 v20Var, kb4 kb4Var);

    default long d() {
        return y0().B();
    }

    void g(long j, long j2, long j3, float f, int i, e40 e40Var, int i2);

    owa getLayoutDirection();

    void l0(mxd mxdVar, zo1 zo1Var, float f, z07 z07Var, int i);

    void n(long j, float f, float f2, long j2, long j3, float f3, z07 z07Var);

    void n0(long j, float f, long j2, float f2, z07 z07Var, int i);

    void p0(v20 v20Var, long j, long j2, long j3, long j4, float f, kb4 kb4Var, int i);

    void s0(zo1 zo1Var, long j, long j2, float f, float f2);

    void u0(long j, long j2, long j3, long j4, z07 z07Var, int i);

    ysk y0();
}
