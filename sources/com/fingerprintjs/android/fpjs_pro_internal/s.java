package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s extends f5<List<? extends z2>> {
    public static int b;
    public static int c;
    public static int d;
    public final List a;

    public s(List list) {
        super(null);
        this.a = list;
    }

    public static int b() {
        int i = b;
        int i2 = i % 9847034;
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
        d = (((d + 107) % 128) + 67) % 128;
        return this.a;
    }
}
