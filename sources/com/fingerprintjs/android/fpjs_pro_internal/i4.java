package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i4 {
    public static int c = 0;
    public static int d = 1;
    public static int e;
    public static int f;
    public final bc a;
    public final Context b;

    public i4(bc bcVar, Context context) {
        this.a = bcVar;
        this.b = context;
    }

    public static int a() {
        int i = e;
        int i2 = i % 8591544;
        e = i + 1;
        if (i2 != 0) {
            return f;
        }
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        f = freeMemory;
        return freeMemory;
    }

    public static final /* synthetic */ bc b(i4 i4Var) {
        int i = d;
        int i2 = ((i | 65) << 1) - (i ^ 65);
        c = i2 % 128;
        int i3 = i2 % 2;
        bc bcVar = i4Var.a;
        if (i3 == 0) {
            c = (i + 119) % 128;
            return bcVar;
        }
        throw null;
    }
}
