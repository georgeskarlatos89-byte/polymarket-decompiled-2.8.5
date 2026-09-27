package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.hY16199;
import defpackage.hdi;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b5 {
    public static int c = 0;
    public static int d = 1;
    public final String a;
    public final String b;

    public b5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i2)) | (~(i7 | i)) | (~(i2 | i));
        int i9 = (~(i4 | i)) | i2;
        int i10 = (~(i | i4 | i2)) | (~(i7 | (~i2) | (~i)));
        int i11 = (-1489240064) * i3;
        int i12 = ((-674496512) * i6) + ((-128450560) * i5) + i11 + (402996989 * i10) + ((-805993978) * i9) + (i8 * 402996989) + ((-683246085) * i2) + (((-1892237052) * i4) - 438566912);
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i6, 395103901, (862446602 * i5) + i4 + i2 + i3);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a, 2025127936, (i6 * 120803543) + (i5 * 1640285726) + (i3 * 1384179971) + (i10 * 503) + (i9 * (-1006)) + (i8 * 503) + (i2 * 1384180977) + (i4 * 1384179468) + 550727958, -275709952, ((-1108934656) * a) + i12) != 1) {
            b5 b5Var = (b5) objArr[0];
            int i13 = c + 63;
            d = i13 % 128;
            int i14 = i13 % 2;
            String str = b5Var.a;
            if (i14 != 0) {
                return str;
            }
            throw null;
        }
        b5 b5Var2 = (b5) objArr[0];
        Object obj = objArr[1];
        if (b5Var2 == obj) {
            int i15 = d;
            int i16 = ((i15 ^ 109) + ((i15 & 109) << 1)) % 128;
            c = i16;
            int i17 = i16 + 1;
            d = i17 % 128;
            if (i17 % 2 != 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        if (!(obj instanceof b5)) {
            int i18 = d;
            c = ((i18 ^ 9) + ((i18 & 9) << 1)) % 128;
        } else {
            b5 b5Var3 = (b5) obj;
            if (!Intrinsics.areEqual(b5Var2.a, b5Var3.a)) {
                int i19 = d + 123;
                c = i19 % 128;
                if (i19 % 2 != 0) {
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
            if (!Intrinsics.areEqual(b5Var2.b, b5Var3.b)) {
                int i20 = d + 111;
                c = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 59 / 0;
                } else {
                    return Boolean.FALSE;
                }
            } else {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public final String b() {
        int i = d;
        int i2 = i + 113;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
        int i4 = (i & 91) + (i | 91);
        c = i4 % 128;
        if (i4 % 2 == 0) {
            return this.b;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) a(new Object[]{this, obj}, hY16199.Companion.a(), 954768681, hY16199.Companion.a(), -954768680, hY16199.Companion.a(), hY16199.Companion.a())).booleanValue();
    }

    public final int hashCode() {
        int i;
        int i2 = c + 97;
        d = i2 % 128;
        int i3 = i2 % 2;
        String str = this.b;
        int hashCode = this.a.hashCode();
        if (i3 == 0) {
            i = (hashCode << 27) / str.hashCode();
        } else {
            int i4 = hashCode * 31;
            int hashCode2 = str.hashCode();
            i = (i4 | hashCode2) + (i4 & hashCode2);
        }
        c = (d + 23) % 128;
        return i;
    }

    public final String toString() {
        int i = d + 95;
        c = i % 128;
        int i2 = i % 2;
        String str = this.b;
        String str2 = this.a;
        if (i2 == 0) {
            return hdi.p("InputDeviceData(name=", str2, ", vendor=", str, ")");
        }
        StringBuilder sb = new StringBuilder("InputDeviceData(name=");
        sb.append(str2);
        sb.append(", vendor=");
        sb.append(str);
        sb.append(")");
        throw null;
    }
}
