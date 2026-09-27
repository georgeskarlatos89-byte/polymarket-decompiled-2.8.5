package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class w extends f5<List<? extends j4>> {
    public static int b;
    public final List a;

    public w(List list) {
        super(null);
        this.a = list;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.f5
    public final Object a() {
        int i = b + 65;
        int i2 = i % 128;
        if (i % 2 != 0) {
            int i3 = i2 + 77;
            b = i3 % 128;
            int i4 = i3 % 2;
            List list = this.a;
            if (i4 != 0) {
                int i5 = 64 / 0;
            }
            return list;
        }
        throw null;
    }
}
