package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.input.InputManager;
import defpackage.hdi;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h2 {
    public static int b = 0;
    public static int c = 0;
    public static int d = 1;
    public final InputManager a;

    public h2(InputManager inputManager) {
        this.a = inputManager;
    }

    public static final /* synthetic */ InputManager a(h2 h2Var) {
        int i = d;
        int i2 = ((i | 47) << 1) - (i ^ 47);
        int i3 = i2 % 128;
        int i4 = i2 % 2;
        InputManager inputManager = h2Var.a;
        if (i4 == 0) {
            d = (((i3 | 93) << 1) - (i3 ^ 93)) % 128;
            return inputManager;
        }
        throw null;
    }

    public static int b() {
        int i = b;
        int i2 = i % 9268702;
        b = i + 1;
        if (i2 != 0) {
            return c;
        }
        int a = hdi.a();
        c = a;
        return a;
    }
}
