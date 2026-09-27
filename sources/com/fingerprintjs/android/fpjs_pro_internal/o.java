package com.fingerprintjs.android.fpjs_pro_internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o extends f5<Integer> {
    public static int b;
    public final int a;

    public o(int i) {
        super(null);
        this.a = i;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.f5
    public final Object a() {
        Integer valueOf = Integer.valueOf(this.a);
        int i = (b + 17) % 128;
        int i2 = ((i | 51) << 1) - (i ^ 51);
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
        return valueOf;
    }
}
