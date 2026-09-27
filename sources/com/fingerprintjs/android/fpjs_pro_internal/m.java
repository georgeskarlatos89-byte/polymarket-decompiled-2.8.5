package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m extends f5<String> {
    public static int b = 0;
    public static int c = 1;
    public static int d;
    public static int e;
    public final String a;

    public m(String str) {
        super(null);
        this.a = str;
    }

    public static int c() {
        int i = d;
        int i2 = i % 6954374;
        d = i + 1;
        if (i2 != 0) {
            return e;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        e = elapsedCpuTime;
        return elapsedCpuTime;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.f5
    public final /* synthetic */ Object a() {
        int i = c;
        int i2 = (i & 47) + (i | 47);
        b = i2 % 128;
        int i3 = i2 % 2;
        String b2 = b();
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        int i5 = b;
        c = ((i5 & 19) + (i5 | 19)) % 128;
        return b2;
    }

    public final String b() {
        int i = b;
        int i2 = (i & 37) + (i | 37);
        int i3 = i2 % 128;
        c = i3;
        if (i2 % 2 == 0) {
            int i4 = 84 / 0;
        }
        b = (i3 + 35) % 128;
        return this.a;
    }
}
