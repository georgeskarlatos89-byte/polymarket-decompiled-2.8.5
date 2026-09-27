package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r extends f5<List<? extends b5>> {
    public static int b = 1;
    public final List a;

    public r(List list) {
        super(null);
        this.a = list;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.f5
    public final Object a() {
        int i = b;
        int i2 = (((((i | 105) << 1) - (i ^ 105)) % 128) + 75) % 128;
        b = i2;
        int i3 = ((i2 ^ 117) + ((i2 & 117) << 1)) % 2;
        List list = this.a;
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        return list;
    }
}
