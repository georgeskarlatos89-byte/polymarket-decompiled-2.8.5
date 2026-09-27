package defpackage;

import androidx.compose.foundation.layout.b;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class win {
    public static final void a(final float f, final int i, final String str, final b7i b7iVar, final String str2, final boolean z, final boolean z2, final boolean z3, final String str3, final kjc kjcVar, final Function0 function0, pq4 pq4Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        sr8 sr8Var;
        b7iVar.getClass();
        str2.getClass();
        function0.getClass();
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.g0(-654699572);
        int i13 = 4;
        if (sr8Var2.e(f)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i14 = i2 | i3;
        if (sr8Var2.f(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i15 = i14 | i4;
        if (sr8Var2.h(str)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i16 = i15 | i5;
        if (sr8Var2.j(b7iVar)) {
            i6 = 2048;
        } else {
            i6 = Barcode.FORMAT_UPC_E;
        }
        int i17 = i16 | i6;
        if (sr8Var2.h(str2)) {
            i7 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i7 = 8192;
        }
        int i18 = i17 | i7;
        if (sr8Var2.i(z)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i19 = i18 | i8;
        if (sr8Var2.i(z2)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i20 = i19 | i9;
        if (sr8Var2.i(z3)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i21 = i20 | i10;
        if (sr8Var2.h(str3)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i22 = i21 | i11;
        if (sr8Var2.h(kjcVar)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i23 = i22 | i12;
        if (!sr8Var2.j(function0)) {
            i13 = 2;
        }
        if ((306783379 & i23) == 306783378 && (i13 & 3) == 2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (sr8Var2.V(i23 & 1, z4)) {
            sr8Var = sr8Var2;
            iwn.b(z2, z, false, function0, frm.b(12.0f, 12.0f, 12.0f, 0.0f, 8), b.s(b.g(kjcVar, 60.0f, 0.0f, 2), f, 0.0f, 2), sel.d(-1428691454, new Function3() { // from class: q4d
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z5;
                    pq4 pq4Var2 = (pq4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((lc4) obj).getClass();
                    if ((intValue & 17) != 16) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    sr8 sr8Var3 = (sr8) pq4Var2;
                    if (sr8Var3.V(intValue & 1, z5)) {
                        hbg a = gbg.a(nk0.g, gdn.m, sr8Var3, 54);
                        int hashCode = Long.hashCode(sr8Var3.T);
                        sje n = sr8Var3.n();
                        hjc hjcVar = hjc.a;
                        kjc e = pqn.e(sr8Var3, hjcVar);
                        sp4.h0.getClass();
                        yr4 yr4Var = rp4.b;
                        sr8Var3.i0();
                        if (sr8Var3.S) {
                            sr8Var3.m(yr4Var);
                        } else {
                            sr8Var3.r0();
                        }
                        zzm.d(sr8Var3, a, rp4.f);
                        zzm.d(sr8Var3, n, rp4.e);
                        zzm.a(sr8Var3, Integer.valueOf(hashCode), rp4.g);
                        zzm.b(sr8Var3, rp4.h);
                        zzm.d(sr8Var3, e, rp4.d);
                        jnn.a(i, str, b7iVar, z3, b.s(b.e(hjcVar, 16.0f), 0.0f, 36.0f, 1), gdn.f, sr8Var3, 221184);
                        String str4 = str3;
                        if (str4 == null) {
                            sr8Var3.e0(-1717326703);
                        } else {
                            sr8Var3.e0(-1717326702);
                            fsn.b(str4, null, false, true, sr8Var3, 3072, 6);
                            sr8Var3 = sr8Var3;
                        }
                        sr8Var3.s(false);
                        sr8Var3.s(true);
                        pbn.a(null, str2, ((h6i) sr8Var3.l(k9i.c)).d, frm.h(hjcVar, 0.0f, 6.0f, 1), z2, false, sr8Var3, 3072, 33);
                    } else {
                        sr8Var3.Y();
                    }
                    return Unit.INSTANCE;
                }
            }, sr8Var2), sr8Var, ((i23 >> 18) & 14) | 12779520 | ((i23 >> 12) & 112) | ((i13 << 9) & 7168));
        } else {
            sr8Var = sr8Var2;
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new Function2(f, i, str, b7iVar, str2, z, z2, z3, str3, kjcVar, function0, i2) { // from class: r4d
                public final /* synthetic */ float a;
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ b7i d;
                public final /* synthetic */ String e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ String i;
                public final /* synthetic */ kjc j;
                public final /* synthetic */ Function0 k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a = rtn.a(1);
                    win.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (pq4) obj, a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
