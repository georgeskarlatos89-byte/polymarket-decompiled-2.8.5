package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class hjn {
    public static final void a(boolean z, pq4 pq4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-1800331964);
        if ((i & 6) == 0) {
            if (sr8Var.i(z)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sr8Var.V(i2 & 1, z2)) {
            z3 = z;
            jl7.e(z3, null, zf7.e(null, 3), zf7.f(null, 3), null, dil.a, sr8Var, (i2 & 14) | 200064, 18);
        } else {
            z3 = z;
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new e6d(z3, i, 0);
        }
    }

    public static final void b(float f, float f2, toi toiVar, qq6 qq6Var, boolean z, boolean z2, zh7 zh7Var, pq4 pq4Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        toiVar.getClass();
        qq6Var.getClass();
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-242199923);
        if ((i & 6) == 0) {
            if (sr8Var.e(f)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sr8Var.e(f2)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (sr8Var.h(toiVar)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (sr8Var.e(160.0f)) {
                i7 = 2048;
            } else {
                i7 = Barcode.FORMAT_UPC_E;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (sr8Var.f(qq6Var.ordinal())) {
                i6 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            z3 = z;
            if (sr8Var.i(z3)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        } else {
            z3 = z;
        }
        if ((1572864 & i) == 0) {
            if (sr8Var.i(z2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (sr8Var.j(zh7Var)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        boolean z11 = false;
        if ((4793491 & i2) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (sr8Var.V(i2 & 1, z4)) {
            if ((i2 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i2 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z12 = z5 | z6;
            if ((i2 & 896) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z13 = z12 | z7;
            if ((i2 & 7168) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z14 = z13 | z8;
            if ((57344 & i2) == 16384) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z15 = z14 | z9;
            if ((458752 & i2) == 131072) {
                z11 = true;
            }
            boolean z16 = z15 | z11;
            Object Q = sr8Var.Q();
            if (!z16 && Q != oq4.a) {
                z10 = true;
            } else {
                z10 = true;
                f6d f6dVar = new f6d(f, f2, toiVar, qq6Var, z3);
                sr8Var.o0(f6dVar);
                Q = f6dVar;
            }
            v5c v5cVar = (v5c) Q;
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
            zzm.d(sr8Var, v5cVar, rp4.f);
            zzm.d(sr8Var, n, rp4.e);
            zzm.a(sr8Var, Integer.valueOf(hashCode), rp4.g);
            zzm.b(sr8Var, rp4.h);
            zzm.d(sr8Var, e, rp4.d);
            a(z2, sr8Var, (i2 >> 18) & 14);
            yh7.a(zh7Var, null, sr8Var, (i2 >> 21) & 14);
            sr8Var.s(z10);
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new jc2(f, f2, toiVar, qq6Var, z, z2, zh7Var, i);
        }
    }
}
