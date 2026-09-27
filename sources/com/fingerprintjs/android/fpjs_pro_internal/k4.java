package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.C1722;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class k4 {
    public static final String a = C1722.od.e.setPivotYN16904();
    public static final String b = C1722.xb.e.setPivotYN16904();
    public static final String c = C1722.nc.e.setPivotYN16904();
    public static final String d = C1722.ae.e.setPivotYN16904();
    public static final String e = C1722.b0.e.setPivotYN16904();
    public static final String f = C1722.j.e.setPivotYN16904();
    public static final String g = C1722.e5.e.setPivotYN16904();
    public static final String h = C1722.l6.e.setPivotYN16904();
    public static final String i = C1722.l4.e.setPivotYN16904();
    public static final String j = C1722.c1.e.setPivotYN16904();
    public static final String k = C1722.ec.e.setPivotYN16904();
    public static final String l = C1722.a5.e.setPivotYN16904();
    public static final String m = C1722.u1.e.setPivotYN16904();
    public static final String n = C1722.k0.e.setPivotYN16904();
    public static final String o = C1722.h4.e.setPivotYN16904();
    public static int p = 0;
    public static int q = 1;

    public static final String a() {
        int i2 = (p + 73) % 128;
        q = i2;
        int i3 = ((i2 | 1) << 1) - (i2 ^ 1);
        p = i3 % 128;
        if (i3 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public static final String b() {
        int i2 = p;
        int i3 = (i2 ^ 77) + ((i2 & 77) << 1);
        q = i3 % 128;
        if (i3 % 2 != 0) {
            q = (i2 + 53) % 128;
            return e;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i4 | i6;
        int i9 = (i8 * (-1605095679)) + ((-484454144) * i5) + (i4 * (-484454144)) + 743702528;
        int i10 = ~((~i6) | i4);
        int i11 = ~i4;
        int i12 = i10 | (~(i11 | i5 | i6));
        int i13 = (~(i6 | i11)) | i5;
        int i14 = ((-1434976256) * i3) + (367263744 * i2) + ((-2089549824) * i7) + ((-1605095679) * i13) + (1605095679 * i12) + i9;
        int a2 = com.fingerprintjs.android.fpjs_pro.g.a(i3, 1026174006, (2127773517 * i2) + i4 + i5 + i7);
        int i15 = i8 * 947;
        int i16 = i12 * (-947);
        int i17 = i13 * 947;
        int i18 = i7 * 21309107;
        int i19 = i2 * 1708896471;
        int i20 = i3 * 664464834;
        switch (com.fingerprintjs.android.fpjs_pro.g.c(a2, 287244288, i20 + i19 + i18 + i17 + i16 + i15 + (i5 * 21308160) + (i4 * 21308160) + 1622758390, 966983680, (1105526784 * a2) + i14)) {
            case 1:
                int i21 = q;
                int i22 = (i21 ^ 23) + ((i21 & 23) << 1);
                p = i22 % 128;
                int i23 = i22 % 2;
                String str = i;
                if (i23 != 0) {
                    int i24 = 10 / 0;
                }
                return str;
            case 2:
                int i25 = (p + 83) % 128;
                q = i25;
                p = (i25 + 113) % 128;
                return d;
            case 3:
                int i26 = q;
                int i27 = (i26 ^ 109) + ((i26 & 109) << 1);
                p = i27 % 128;
                if (i27 % 2 == 0) {
                    return j;
                }
                throw null;
            case 4:
                int i28 = q + 89;
                p = i28 % 128;
                if (i28 % 2 == 0) {
                    return c;
                }
                throw null;
            case 5:
                int i29 = p;
                int i30 = ((i29 | 83) << 1) - (i29 ^ 83);
                q = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = (i29 ^ 43) + ((i29 & 43) << 1);
                    q = i31 % 128;
                    int i32 = i31 % 2;
                    String str2 = m;
                    if (i32 == 0) {
                        int i33 = 87 / 0;
                    }
                    return str2;
                }
                throw null;
            case 6:
                int i34 = p;
                int i35 = (i34 & 55) + (i34 | 55);
                q = i35 % 128;
                if (i35 % 2 != 0) {
                    int i36 = (i34 ^ 51) + ((i34 & 51) << 1);
                    q = i36 % 128;
                    int i37 = i36 % 2;
                    String str3 = k;
                    if (i37 == 0) {
                        int i38 = 90 / 0;
                    }
                    return str3;
                }
                throw null;
            default:
                int i39 = q;
                int i40 = ((i39 & 79) + (i39 | 79)) % 128;
                p = i40;
                q = (((i40 | 115) << 1) - (i40 ^ 115)) % 128;
                return g;
        }
    }
}
