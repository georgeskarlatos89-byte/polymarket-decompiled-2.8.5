package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class i2 {
    public static int a;
    public static int b;

    public static int a() {
        int i = a;
        int i2 = i % 8244615;
        a = i + 1;
        if (i2 != 0) {
            return b;
        }
        int myUid = Process.myUid();
        b = myUid;
        return myUid;
    }
}
