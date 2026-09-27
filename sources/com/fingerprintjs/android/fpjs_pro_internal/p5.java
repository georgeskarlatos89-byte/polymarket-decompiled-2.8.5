package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p5 extends eT28692 {
    public static int f;
    public static int g;

    public static int b() {
        int i = f;
        int i2 = i % 7995436;
        f = i + 1;
        if (i2 != 0) {
            return g;
        }
        int uptimeMillis = (int) SystemClock.uptimeMillis();
        g = uptimeMillis;
        return uptimeMillis;
    }
}
