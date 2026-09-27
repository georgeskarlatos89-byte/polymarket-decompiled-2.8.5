package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class prn {
    public static final k10 a(String str) {
        return new k10(vzg.b(str));
    }

    public static final void b(String str, Integer num, xxi xxiVar, pq4 pq4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        sr8 sr8Var;
        long j;
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.g0(-835962120);
        if (sr8Var2.h(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (sr8Var2.h(num)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (sr8Var2.h(xxiVar)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var2.V(i7 & 1, z)) {
            if (num != null) {
                j = hpn.b(num.intValue());
            } else {
                j = ib4.m;
            }
            kjc i8 = frm.i(hjc.a, 4.0f, 4.0f, 4.0f, 5.0f);
            Object Q = sr8Var2.Q();
            if (Q == oq4.a) {
                Q = new rye(12);
                sr8Var2.o0(Q);
            }
            sr8Var = sr8Var2;
            mwi.b(str, cug.c(i8, false, (Function1) Q), j, 0L, null, null, 0L, new mqi(3), 0L, 0, false, 0, 0, xxiVar, sr8Var, i7 & 14, (i7 << 12) & 3670016, 65016);
        } else {
            sr8Var = sr8Var2;
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new gtc(str, num, xxiVar, i, 12);
        }
    }

    public static final String[] c(z45 z45Var) {
        z45Var.getClass();
        return (String[]) ((k10) z45Var).b.toArray(new String[0]);
    }
}
