package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class getContext {
    public static int e = 0;
    public static int f = 1;
    public static int g;
    public static int h;
    public final List a;
    public final boolean b;
    public final String c;
    public final long d;

    public getContext(List list, long j, String str, boolean z) {
        this.a = list;
        this.b = z;
        this.c = str;
        this.d = j;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i)) | i8;
        int i10 = ~i6;
        int i11 = ~(i10 | i5);
        int i12 = i8 | i11 | (~(i10 | i));
        int i13 = (~((~i) | i10)) | i8 | i11;
        int i14 = (-88866816) * i4;
        int i15 = ((-410517504) * i2) + (217841664 * i3) + i14 + (865627525 * i13) + ((-1731255050) * i12) + ((-1698084721) * i9) + (776760710 * i6) + ((-1820121865) * i5) + 1478230016;
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i2, 1794320298, ((-369695973) * i3) + i5 + i6 + i4);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a, -1691287552, (i2 * (-1296121642)) + (i3 * (-1328892763)) + (i4 * 1872134975) + (i13 * 699) + (i12 * (-1398)) + (i9 * 2097) + (i6 * 1872135674) + ((i5 * 1872133577) - 2052485254), -1729036288, ((-175177728) * a) + i15) != 1) {
            getContext getcontext = (getContext) objArr[0];
            int i16 = f + 95;
            e = i16 % 128;
            int i17 = i16 % 2;
            List list = getcontext.a;
            if (i17 != 0) {
                int i18 = 21 / 0;
            }
            return list;
        }
        getContext getcontext2 = (getContext) objArr[0];
        int i19 = f;
        e = (((i19 | 11) << 1) - (i19 ^ 11)) % 128;
        boolean z = getcontext2.b;
        int pivotYN16904 = R24140$5$1.setPivotYN16904();
        int i20 = ~(((-187637777) & pivotYN16904) | ((-187637777) ^ pivotYN16904));
        int i21 = -(-((((-2138040026) & i20) | ((-2138040026) ^ i20)) * (-476)));
        int i22 = ((-1274026064) ^ i21) + ((i21 & (-1274026064)) << 1);
        int i23 = -(-(i20 * 952));
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        int i25 = ~pivotYN16904;
        int i26 = (i25 & (-2133845210)) | ((-2133845210) ^ i25);
        int i27 = -(-((~((i26 & (-191832593)) | (i26 ^ (-191832593)))) * 476));
        int i28 = (i24 & i27) + (i27 | i24);
        int identityHashCode = System.identityHashCode(getcontext2);
        int i29 = ~identityHashCode;
        int i30 = (i29 & 1356894270) | (1356894270 ^ i29);
        int i31 = (~((i30 & (-1164632605)) | (i30 ^ (-1164632605)))) * 433;
        int i32 = (((-876604122) | i31) << 1) - (i31 ^ (-876604122));
        int i33 = ~((1164632604 & identityHashCode) | (1164632604 ^ identityHashCode));
        int i34 = (((i33 & 1356894270) | (1356894270 ^ i33)) * (-433)) + i32;
        int i35 = ~((identityHashCode & 1356894270) | (1356894270 ^ identityHashCode));
        if (i28 > (i34 - (~(-(-(((i35 & 1080066076) | (i35 ^ 1080066076)) * 433))))) - 1) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    public static int vD14832N6715() {
        int i = g;
        int i2 = i % 5532155;
        g = i + 1;
        if (i2 != 0) {
            return h;
        }
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        h = freeMemory;
        return freeMemory;
    }
}
