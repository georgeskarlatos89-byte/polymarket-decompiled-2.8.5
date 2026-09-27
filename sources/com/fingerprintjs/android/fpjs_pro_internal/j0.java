package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.pC2922;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class j0 {
    public static int a = 1;
    public static int b;
    public static int c;

    public static final int a(List list) {
        int i;
        int i2 = (a + 123) % 128;
        a = ((i2 & 101) + (i2 | 101)) % 128;
        if (list.contains(pC2922.a.e)) {
            int i3 = a;
            int i4 = ((i3 & 99) + (i3 | 99)) % 128;
            a = (((i4 | 47) << 1) - (i4 ^ 47)) % 128;
            i = 0;
        } else {
            i = 1;
        }
        int i5 = a;
        if ((((i5 | 35) << 1) - (i5 ^ 35)) % 2 != 0) {
            int i6 = 18 / 0;
        }
        return i;
    }
}
