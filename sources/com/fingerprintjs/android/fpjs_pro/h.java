package com.fingerprintjs.android.fpjs_pro;

import defpackage.hdi;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h extends Error {
    public static int c;
    public static int d;

    public static int a() {
        int i = c;
        int i2 = i % 9090493;
        c = i + 1;
        if (i2 != 0) {
            return d;
        }
        int b = hdi.b(1713472744);
        d = b;
        return b;
    }
}
