package com.fingerprintjs.android.fpjs_pro_internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u extends f5<Long> {
    public static int b;
    public static int c;
    public final long a;

    public u(long j) {
        super(null);
        this.a = j;
    }

    public static int b() {
        int i = b;
        int i2 = i % 7692902;
        b = i + 1;
        if (i2 != 0) {
            return c;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        c = i3;
        return i3;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.f5
    public final Object a() {
        return Long.valueOf(this.a);
    }
}
