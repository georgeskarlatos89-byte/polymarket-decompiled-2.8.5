package com.fingerprintjs.android.fpjs_pro_internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class aa extends f5<Long> {
    public static int b = 0;
    public static int c = 1;
    public final long a;

    public aa(long j) {
        super(null);
        this.a = j;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.f5
    public final Object a() {
        int i = b + 91;
        c = i % 128;
        int i2 = i % 2;
        Long valueOf = Long.valueOf(this.a);
        if (i2 == 0) {
            int i3 = 22 / 0;
        }
        int i4 = c;
        int i5 = ((i4 | 35) << 1) - (i4 ^ 35);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return valueOf;
        }
        throw null;
    }
}
