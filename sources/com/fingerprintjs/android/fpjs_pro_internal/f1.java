package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.setScrollYX30569;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f1 {
    public static int c = 0;
    public static int d = 1;
    public static int e;
    public static int f;
    public final String a;
    public final String b;

    public f1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i | i2);
        int i8 = i6 | i7;
        int i9 = (~(i2 | (~i6))) | i;
        int i10 = ((-1398800384) * i4) + ((-2098724864) * i5) + (201850880 * i3) + (1121407813 * i9) + (i8 * 1121407813) + ((-1121407813) * i7) + ((-919556932) * i6) + ((i * (-919556932)) - 154402816);
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i4, 1521317780, ((-1932811043) * i5) + i + i6 + i3);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a, -394526720, (i4 * (-1188939004)) + (i5 * (-1844343719)) + (i3 * 1794637741) + (i9 * 161) + (i8 * 161) + (i7 * (-161)) + (i6 * 1794637580) + (i * 1794637580) + 2133191799, 821297152, ((-1444151296) * a) + i10) != 1) {
            f1 f1Var = (f1) objArr[0];
            Object obj = objArr[1];
            int i11 = d;
            int i12 = (i11 & 35) + (i11 | 35);
            int i13 = i12 % 128;
            c = i13;
            if (i12 % 2 == 0) {
                if (f1Var == obj) {
                    return Boolean.TRUE;
                }
                if (!(obj instanceof f1)) {
                    int i14 = (i13 ^ 67) + ((i13 & 67) << 1);
                    d = i14 % 128;
                    if (i14 % 2 == 0) {
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }
                f1 f1Var2 = (f1) obj;
                if (!Intrinsics.areEqual(f1Var.a, f1Var2.a)) {
                    int i15 = (d + 101) % 128;
                    c = i15;
                    int i16 = ((i15 | 27) << 1) - (i15 ^ 27);
                    d = i16 % 128;
                    if (i16 % 2 != 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                if (!Intrinsics.areEqual(f1Var.b, f1Var2.b)) {
                    d = (c + 19) % 128;
                    return Boolean.FALSE;
                }
                return Boolean.TRUE;
            }
            throw null;
        }
        f1 f1Var3 = (f1) objArr[0];
        int i17 = c;
        int i18 = (i17 & 83) + (i17 | 83);
        int i19 = i18 % 128;
        d = i19;
        int i20 = i18 % 2;
        String str = f1Var3.b;
        if (i20 != 0) {
            int i21 = ((i19 | 53) << 1) - (i19 ^ 53);
            c = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 25 / 0;
            }
            return str;
        }
        throw null;
    }

    public static int b() {
        int i = e;
        int i2 = i % 7932815;
        e = i + 1;
        if (i2 != 0) {
            return f;
        }
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        f = freeMemory;
        return freeMemory;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) a(new Object[]{this, obj}, -1542255252, setScrollYX30569.Companion.b(), setScrollYX30569.Companion.b(), setScrollYX30569.Companion.b(), setScrollYX30569.Companion.b(), 1542255252)).booleanValue();
    }

    public final int hashCode() {
        int i;
        int i2 = d + 3;
        c = i2 % 128;
        int i3 = i2 % 2;
        String str = this.b;
        int hashCode = this.a.hashCode();
        if (i3 != 0) {
            i = (hashCode * 15) >> str.hashCode();
        } else {
            i = ((hashCode * 31) - (~str.hashCode())) - 1;
        }
        int i4 = d;
        c = (((i4 | 49) << 1) - (i4 ^ 49)) % 128;
        return i;
    }

    public final String toString() {
        int i = d;
        int i2 = (i & 23) + (i | 23);
        c = i2 % 128;
        if (i2 % 2 == 0) {
            return "";
        }
        throw null;
    }
}
