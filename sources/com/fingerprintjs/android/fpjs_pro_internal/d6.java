package com.fingerprintjs.android.fpjs_pro_internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d6 {
    public static int b;
    public static int c;
    public final String a;

    public d6(String str) {
        this.a = str;
    }

    public static int a() {
        int i = b;
        int i2 = i % 6128590;
        b = i + 1;
        if (i2 != 0) {
            return c;
        }
        int maxMemory = (int) Runtime.getRuntime().maxMemory();
        c = maxMemory;
        return maxMemory;
    }
}
