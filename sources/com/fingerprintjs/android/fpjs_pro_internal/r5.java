package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r5 {
    public static int f = 0;
    public static int g = 1;
    public final Location a;
    public final boolean b;
    public final List c;
    public final long d;
    public final d0 e;

    public r5(Location location, boolean z, List list, long j, d0 d0Var) {
        this.a = location;
        this.b = z;
        this.c = list;
        this.d = j;
        this.e = d0Var;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i7 | i)) | (~(i8 | i));
        int i10 = ~i;
        int i11 = (~(i10 | i4)) | (~(i8 | i4));
        int i12 = ~(i8 | i7 | i10);
        int i13 = 1196425216 * i2;
        int i14 = 610271232 * i3;
        int i15 = (922746880 * i5) + i14 + i13 + ((-1134570258) * i12) + (i11 * (-1134570258)) + (1134570258 * i9) + (61854959 * i4) + ((-1963971821) * i) + 932184064;
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i5, 2078889904, ((-2109949842) * i3) + i + i4 + i2);
        int i16 = i11 * 518;
        int i17 = i12 * 518;
        int i18 = i2 * (-573803307);
        int i19 = i3 * (-843101306);
        int i20 = i5 * (-1524517520);
        int c = com.fingerprintjs.android.fpjs_pro.g.c(a, 458489856, i20 + i19 + i18 + i17 + i16 + (i9 * (-518)) + (i4 * (-573802789)) + (i * (-573803825)) + 196542130, 64749568, (671350784 * a) + i15);
        boolean z = false;
        if (c != 1) {
            if (c != 2) {
                if (c != 3) {
                    r5 r5Var = (r5) objArr[0];
                    Object obj = objArr[1];
                    int i21 = f;
                    int i22 = (i21 + 3) % 128;
                    g = i22;
                    if (r5Var == obj) {
                        g = (i21 + 49) % 128;
                        return Boolean.TRUE;
                    }
                    if (!(obj instanceof r5)) {
                        f = ((i22 & 75) + (i22 | 75)) % 128;
                        return Boolean.FALSE;
                    }
                    r5 r5Var2 = (r5) obj;
                    if (!Intrinsics.areEqual(r5Var.a, r5Var2.a)) {
                        f = (g + 113) % 128;
                        return Boolean.FALSE;
                    }
                    if (r5Var.b != r5Var2.b) {
                        f = (g + 93) % 128;
                        return Boolean.FALSE;
                    }
                    if (!Intrinsics.areEqual(r5Var.c, r5Var2.c)) {
                        int i23 = g + 77;
                        f = i23 % 128;
                        if (i23 % 2 != 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (r5Var.d != r5Var2.d) {
                        int i24 = f;
                        int i25 = ((i24 ^ 51) + ((i24 & 51) << 1)) % 128;
                        g = i25;
                        int i26 = i25 + 39;
                        f = i26 % 128;
                        if (i26 % 2 == 0) {
                            return Boolean.FALSE;
                        }
                        throw null;
                    }
                    if (!Intrinsics.areEqual(r5Var.e, r5Var2.e)) {
                        int i27 = g;
                        f = (((i27 | 7) << 1) - (i27 ^ 7)) % 128;
                        return Boolean.FALSE;
                    }
                    return Boolean.TRUE;
                }
                r5 r5Var3 = (r5) objArr[0];
                int i28 = f;
                g = (i28 + 21) % 128;
                d0 d0Var = r5Var3.e;
                int i29 = (i28 ^ 21) + ((i28 & 21) << 1);
                g = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 33 / 0;
                }
                return d0Var;
            }
            int i31 = g + 11;
            f = i31 % 128;
            if (i31 % 2 != 0) {
                int i32 = 43 / 0;
                return "";
            }
            return "";
        }
        r5 r5Var4 = (r5) objArr[0];
        y2.a();
        System.identityHashCode(r5Var4);
        long j = r5Var4.d;
        int i33 = g;
        f = ((i33 ^ 15) + ((i33 & 15) << 1)) % 128;
        return Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        return ((Boolean) a(new Object[]{this, obj}, -1981438347, y2.a(), y2.a(), 1981438347, y2.a(), y2.a())).booleanValue();
    }

    public final int hashCode() {
        int hashCode;
        int i = g;
        f = ((i & 21) + (i | 21)) % 128;
        Location location = this.a;
        if (location == null) {
            int i2 = ((i | 69) << 1) - (i ^ 69);
            f = i2 % 128;
            if (i2 % 2 != 0) {
                hashCode = 1;
            } else {
                hashCode = 0;
            }
        } else {
            hashCode = location.hashCode();
            int i3 = g;
            f = (((i3 | 55) << 1) - (i3 ^ 55)) % 128;
        }
        int i4 = hashCode * 31;
        int hashCode2 = Boolean.hashCode(this.b);
        int i5 = (i4 ^ hashCode2) + ((i4 & hashCode2) << 1);
        int i6 = i5 * 31;
        int hashCode3 = this.c.hashCode();
        int identityHashCode = System.identityHashCode(this);
        int i7 = hashCode3 * 303;
        int i8 = i5 * (-9331);
        int i9 = (i7 & i8) + (i8 | i7);
        int i10 = ~hashCode3;
        int i11 = ~identityHashCode;
        int i12 = ~((i11 & i10) | (i10 ^ i11) | i6);
        int i13 = ~((hashCode3 ^ i6) | (hashCode3 & i6) | identityHashCode);
        int i14 = ((~((i10 & i6) | (i10 ^ i6) | identityHashCode)) * (-604)) + (((i12 & i13) | (i12 ^ i13)) * (-302)) + i9;
        int i15 = ~i6;
        int i16 = ~((hashCode3 & i15) | (i15 ^ hashCode3));
        int i17 = ~((i6 & identityHashCode) | (i6 ^ identityHashCode));
        int i18 = ((i17 & i16) | (i16 ^ i17)) * 302;
        int i19 = (i14 & i18) + (i18 | i14);
        int i20 = i19 * 31;
        int hashCode4 = Long.hashCode(this.d);
        int a = y2.a();
        int i21 = hashCode4 * 69;
        int i22 = -(-(i19 * (-2077)));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        int i24 = ~hashCode4;
        int i25 = ~i20;
        int i26 = (i24 ^ i25) | (i24 & i25);
        int i27 = ~a;
        int i28 = ~((i26 & i27) | (i26 ^ i27));
        int i29 = ~((hashCode4 & i20) | (hashCode4 ^ i20));
        int i30 = (i29 & i28) | (i28 ^ i29);
        int i31 = ~((a & i20) | (i20 ^ a));
        int i32 = (((i30 & i31) | (i30 ^ i31)) * (-68)) + i23;
        int i33 = i24 | i27;
        int i34 = (i32 - (~(-(-((~((i20 & i33) | (i33 ^ i20))) * (-68)))))) - 1;
        int i35 = ~((i25 ^ i27) | (i25 & i27));
        int hashCode5 = this.e.hashCode() + (((((i35 & i24) | (i24 ^ i35)) * 68) + i34) * 31);
        int i36 = g;
        f = (((i36 | 113) << 1) - (i36 ^ 113)) % 128;
        return hashCode5;
    }

    public final String toString() {
        return (String) a(new Object[]{this}, 24279951, y2.a(), y2.a(), -24279949, y2.a(), y2.a());
    }
}
