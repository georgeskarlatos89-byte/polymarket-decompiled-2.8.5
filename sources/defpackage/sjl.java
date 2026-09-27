package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class sjl {
    public static final vl4 a;
    public static final vl4 b;
    public static final vl4 c;
    public static final vl4 d;

    static {
        new vl4(new hn4(4), false, 866784315);
        new vl4(new hn4(5), false, 1714259275);
        new vl4(new lm4(21), false, -1836397928);
        new vl4(new hn4(6), false, -1406416085);
        a = new vl4(new hn4(7), false, 566090785);
        b = new vl4(new hn4(8), false, -1624772335);
        c = new vl4(new lm4(22), false, 939725476);
        d = new vl4(new hn4(9), false, -1341284559);
    }

    public static final void a(String str, boolean z, Function0 function0, vl4 vl4Var, int i, qp4 qp4Var, String str2, pq4 pq4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        vl4 vl4Var2;
        function0.getClass();
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-582094588);
        if (sr8Var.h(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (sr8Var.i(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (sr8Var.j(function0)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i11 = i10 | i5;
        if (sr8Var.f(i)) {
            i6 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (sr8Var.h(qp4Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i13 = i12 | i7;
        if (sr8Var.h(str2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i14 = i13 | i8;
        if ((599187 & i14) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sr8Var.V(i14 & 1, z2)) {
            kc4 a2 = jc4.a(nk0.c, gdn.o, sr8Var, 0);
            int hashCode = Long.hashCode(sr8Var.T);
            sje n = sr8Var.n();
            kjc e = pqn.e(sr8Var, hjc.a);
            sp4.h0.getClass();
            yr4 yr4Var = rp4.b;
            sr8Var.i0();
            if (sr8Var.S) {
                sr8Var.m(yr4Var);
            } else {
                sr8Var.r0();
            }
            zzm.d(sr8Var, a2, rp4.f);
            zzm.d(sr8Var, n, rp4.e);
            n70 n70Var = rp4.g;
            if (sr8Var.S || !Intrinsics.areEqual(sr8Var.Q(), Integer.valueOf(hashCode))) {
                ix2.w(hashCode, sr8Var, hashCode, n70Var);
            }
            zzm.d(sr8Var, e, rp4.d);
            int i15 = i14 & 112;
            int i16 = i14 & 1022;
            int i17 = i14 >> 3;
            smn.a(str, z, function0, i, qp4Var, str2, sr8Var, (i17 & 458752) | i16 | (i17 & 7168) | (57344 & i17));
            sr8Var = sr8Var;
            vl4Var2 = vl4Var;
            jl7.b(mc4.a, z, null, null, null, null, sel.d(129005650, new fl2(vl4Var2, 5), sr8Var), sr8Var, i15 | 1572870, 30);
            sr8Var.s(true);
        } else {
            vl4Var2 = vl4Var;
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new pd(str, z, function0, vl4Var2, i, qp4Var, str2, i2);
        }
    }

    public abstract void b();
}
