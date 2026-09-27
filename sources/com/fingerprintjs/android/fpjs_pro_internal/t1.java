package com.fingerprintjs.android.fpjs_pro_internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t1 {
    public static int d = 0;
    public static int e = 1;
    public final Integer a;
    public final Boolean b;
    public final Boolean c;

    public t1(Integer num, Boolean bool, Boolean bool2) {
        this.a = num;
        this.b = bool;
        this.c = bool2;
    }

    public final Integer a() {
        int i = d;
        int i2 = ((i ^ 81) + ((i & 81) << 1)) % 128;
        e = i2;
        d = (((i2 | 123) << 1) - (i2 ^ 123)) % 128;
        return this.a;
    }

    public final Boolean b() {
        int i = e;
        int i2 = (i & 95) + (i | 95);
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        d = ((i ^ 97) + ((i & 97) << 1)) % 128;
        return this.b;
    }

    public final Boolean c() {
        int i = e;
        int i2 = ((i & 93) + (i | 93)) % 128;
        d = i2;
        int i3 = i2 + 119;
        e = i3 % 128;
        if (i3 % 2 != 0) {
            return this.c;
        }
        throw null;
    }
}
