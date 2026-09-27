package com.fingerprintjs.android.fpjs_pro_internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l extends f5<String> {
    public static int b = 0;
    public static int c = 1;
    public final String a;

    public l(String str) {
        super(null);
        this.a = str;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.f5
    public final /* synthetic */ Object a() {
        int i = b;
        int i2 = ((i | 99) << 1) - (i ^ 99);
        c = i2 % 128;
        if (i2 % 2 != 0) {
            return b();
        }
        b();
        throw null;
    }

    public final String b() {
        int i = c;
        int i2 = (i & 61) + (i | 61);
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
        int i4 = i + 105;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return this.a;
        }
        throw null;
    }
}
