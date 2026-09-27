package com.fingerprintjs.android.fpjs_pro_internal;

import defpackage.m51;
import defpackage.woa;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z2 {
    public static int d = 0;
    public static int e = 1;
    public final String a;
    public final String b;
    public final String c;

    public z2(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = i7 | i;
        int i11 = (~i10) | i9;
        int i12 = ~i;
        int i13 = (~(i6 | i10)) | (~(i12 | i4)) | (~(i8 | i12));
        int i14 = (1912995840 * i2) + ((-1727660032) * i5) + (1065222144 * i3) + ((-1616703077) * i9) + (i13 * (-1616703077)) + ((-1061561142) * i11) + ((-1613042074) * i) + ((-551480932) * i4) + 431816704;
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i2, 461141949, ((-1017789379) * i5) + i4 + i + i3);
        int i15 = i13 * 489;
        int i16 = i9 * 489;
        int i17 = i3 * (-1063000885);
        int i18 = i5 * (-90181537);
        int i19 = i2 * (-1548859681);
        int c = com.fingerprintjs.android.fpjs_pro.g.c(a, 816250880, i19 + i18 + i17 + i16 + i15 + (i11 * (-978)) + (i * (-1063001374)) + ((i4 * (-1063000396)) - 360994079), 1493368832, ((-1005256704) * a) + i14);
        if (c != 1) {
            if (c != 2) {
                z2 z2Var = (z2) objArr[0];
                int i20 = d;
                e = (((i20 | 83) << 1) - (i20 ^ 83)) % 128;
                String r = woa.r(m51.r("CameraInfo(cameraName=", z2Var.a, ", cameraType=", z2Var.b, ", cameraOrientation="), z2Var.c, ")");
                int i21 = e;
                int i22 = (i21 & 115) + (i21 | 115);
                d = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 69 / 0;
                }
                return r;
            }
            z2 z2Var2 = (z2) objArr[0];
            int i24 = e;
            int i25 = (((i24 | 9) << 1) - (i24 ^ 9)) % 128;
            d = i25;
            String str = z2Var2.b;
            e = (i25 + 77) % 128;
            return str;
        }
        z2 z2Var3 = (z2) objArr[0];
        Object obj = objArr[1];
        int i26 = e;
        d = ((i26 ^ 25) + ((i26 & 25) << 1)) % 128;
        if (z2Var3 == obj) {
            int i27 = (i26 & 3) + (i26 | 3);
            d = i27 % 128;
            if (i27 % 2 == 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        if (!(obj instanceof z2)) {
            d = ((i26 & 43) + (i26 | 43)) % 128;
            return Boolean.FALSE;
        }
        z2 z2Var4 = (z2) obj;
        if (!Intrinsics.areEqual(z2Var3.a, z2Var4.a)) {
            return Boolean.FALSE;
        }
        if (!Intrinsics.areEqual(z2Var3.b, z2Var4.b)) {
            int i28 = d;
            int i29 = ((i28 | 83) << 1) - (i28 ^ 83);
            e = i29 % 128;
            if (i29 % 2 != 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(z2Var3.c, z2Var4.c)) {
            int i30 = e;
            d = ((i30 ^ 1) + ((i30 & 1) << 1)) % 128;
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        int a = y3.a();
        return ((Boolean) a(new Object[]{this, obj}, 916546176, y3.a(), y3.a(), -916546175, y3.a(), a)).booleanValue();
    }

    public final int hashCode() {
        int i = d;
        e = ((i & 45) + (i | 45)) % 128;
        int hashCode = this.a.hashCode();
        int i2 = hashCode * 31;
        int hashCode2 = this.b.hashCode();
        int a = y3.a();
        int i3 = hashCode2 * 673;
        int i4 = -(-(hashCode * (-41633)));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = ((~(hashCode2 | a)) | i2) * 672;
        int i7 = (i5 & i6) + (i6 | i5);
        int i8 = ~hashCode2;
        int i9 = ~a;
        int i10 = ~((i8 & i9) | (i8 ^ i9));
        int i11 = ~((i2 ^ a) | (i2 & a));
        int i12 = ((i10 & i11) | (i10 ^ i11)) * (-672);
        int i13 = ((i7 | i12) << 1) - (i12 ^ i7);
        int i14 = ~((~i2) | (~a));
        int i15 = ~i2;
        int i16 = ~((i15 & hashCode2) | (i15 ^ hashCode2));
        int i17 = ((i14 & i16) | (i14 ^ i16)) * 672;
        int i18 = ((i13 & i17) + (i17 | i13)) * 31;
        int i19 = -(-this.c.hashCode());
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        int i21 = d;
        e = ((i21 ^ 81) + ((i21 & 81) << 1)) % 128;
        return i20;
    }

    public final String toString() {
        int a = y3.a();
        return (String) a(new Object[]{this}, -1068881968, y3.a(), y3.a(), 1068881968, y3.a(), a);
    }
}
