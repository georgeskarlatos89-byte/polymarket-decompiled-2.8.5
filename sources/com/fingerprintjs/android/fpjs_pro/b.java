package com.fingerprintjs.android.fpjs_pro;

import android.os.SystemClock;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b extends Error {
    public static int c;
    public static int d;

    public static int component9() {
        int i = c;
        int i2 = i % 7556627;
        c = i + 1;
        if (i2 != 0) {
            return d;
        }
        int uptimeMillis = (int) SystemClock.uptimeMillis();
        d = uptimeMillis;
        return uptimeMillis;
    }
}
