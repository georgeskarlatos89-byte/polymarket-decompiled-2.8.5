package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e4 {
    public static int c;
    public static int d;
    public static int e;
    public final String a;
    public final long b;

    public e4(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public static int b() {
        int i = d;
        int i2 = i % 7548467;
        d = i + 1;
        if (i2 != 0) {
            return e;
        }
        int myPid = Process.myPid();
        e = myPid;
        return myPid;
    }

    public final long a() {
        int i = c;
        c = (((((i | 83) << 1) - (i ^ 83)) % 128) + 53) % 128;
        return this.b;
    }
}
