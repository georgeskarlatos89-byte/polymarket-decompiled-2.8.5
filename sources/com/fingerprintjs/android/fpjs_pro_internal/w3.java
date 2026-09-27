package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Build;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class w3 {
    public static final String a;

    static {
        String str;
        if (Build.VERSION.SDK_INT >= 35) {
            str = "content://com.google.android.gsf.gservices/prefix";
        } else {
            str = "content://com.google.android.gsf.gservices";
        }
        a = str;
    }
}
