package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class tgn {
    public static final void a(kjc kjcVar, ggf ggfVar, vl4 vl4Var, pq4 pq4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-714464401);
        if ((i & 6) == 0) {
            if (sr8Var.h(kjcVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sr8Var.h(ggfVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        int i7 = i & 384;
        vl4 vl4Var2 = ohl.a;
        if (i7 == 0) {
            if (sr8Var.j(vl4Var2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (sr8Var.j(vl4Var)) {
                i3 = 2048;
            } else {
                i3 = Barcode.FORMAT_UPC_E;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i2 & 1, z)) {
            Object Q = sr8Var.Q();
            if (Q == oq4.a) {
                kvd kvdVar = new kvd(null, vwb.l);
                sr8Var.o0(kvdVar);
                Q = kvdVar;
            }
            ib1 b = b(vl4Var2, sr8Var, (i2 >> 6) & 14);
            sqn.a(ggfVar.a(b), sel.d(274270255, new xa(kjcVar, (qqc) Q, vl4Var, b), sr8Var), sr8Var, 56);
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new l50(kjcVar, ggfVar, vl4Var, i, 4);
        }
    }

    public static final ib1 b(vl4 vl4Var, pq4 pq4Var, int i) {
        boolean z;
        if ((((i & 14) ^ 6) > 4 && ((sr8) pq4Var).h(vl4Var)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        sr8 sr8Var = (sr8) pq4Var;
        Object Q = sr8Var.Q();
        uwn uwnVar = oq4.a;
        if (z || Q == uwnVar) {
            Q = new ib1(vl4Var);
            sr8Var.o0(Q);
        }
        ib1 ib1Var = (ib1) Q;
        boolean h = sr8Var.h(ib1Var);
        Object Q2 = sr8Var.Q();
        if (h || Q2 == uwnVar) {
            Q2 = new ye6(ib1Var, 18);
            sr8Var.o0(Q2);
        }
        hrl.b(ib1Var, (Function1) Q2, sr8Var);
        return ib1Var;
    }

    public static void c(int i, int i2) {
        String e;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                dmk.v(hdi.l(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                return;
            }
            e = wgn.e("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            e = wgn.e("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(e);
    }

    public static void d(int i, int i2, int i3) {
        String e;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                e = wgn.e("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                e = e(i2, i3, "end index");
            }
        } else {
            e = e(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(e);
    }

    public static String e(int i, int i2, String str) {
        if (i < 0) {
            return wgn.e("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return wgn.e("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        dmk.v(hdi.l(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
