package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.UserManager;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l1 implements m1 {
    public static int b = 0;
    public static int c = 1;
    public final UserManager a;

    public l1(UserManager userManager) {
        this.a = userManager;
    }

    public static final /* synthetic */ UserManager a(l1 l1Var) {
        int i = b + 39;
        int i2 = i % 128;
        c = i2;
        int i3 = i % 2;
        UserManager userManager = l1Var.a;
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        b = ((i2 & 31) + (i2 | 31)) % 128;
        return userManager;
    }
}
