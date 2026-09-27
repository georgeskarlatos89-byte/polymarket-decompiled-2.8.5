package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.pm.PackageManager;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e1 {
    public static int c = 0;
    public static int d = 0;
    public static int e = 0;
    public static int f = 1;
    public final PackageManager a;
    public final String b;

    public e1(PackageManager packageManager, String str) {
        this.a = packageManager;
        this.b = str;
    }

    public static int a() {
        int i = c;
        int i2 = i % 5766913;
        c = i + 1;
        if (i2 != 0) {
            return d;
        }
        int maxMemory = (int) Runtime.getRuntime().maxMemory();
        d = maxMemory;
        return maxMemory;
    }
}
