package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a0 {
    public static int c = 1;
    public static int d;
    public static int e;
    public final List a;
    public final List b;

    public a0(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public static int b() {
        int i = d;
        int i2 = i % 7605326;
        d = i + 1;
        if (i2 != 0) {
            return e;
        }
        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
        e = elapsedRealtime;
        return elapsedRealtime;
    }

    public final List a() {
        int i = c;
        c = (((((i | 41) << 1) - (i ^ 41)) % 128) + 9) % 128;
        return this.b;
    }
}
