package com.socure.idplus.device.internal.permission;

import android.content.Context;
import defpackage.d55;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class a {
    public static boolean a(b bVar, Context context) {
        bVar.getClass();
        context.getClass();
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            context.getClass();
                            if (context == null || d55.a(context, "com.google.android.gms.permission.AD_ID") != 0) {
                                return false;
                            }
                            return true;
                        }
                        dmk.a();
                        return false;
                    }
                    context.getClass();
                    if (context == null || d55.a(context, "android.permission.READ_PHONE_STATE") != 0) {
                        return false;
                    }
                    return true;
                }
                context.getClass();
                if (context == null || d55.a(context, "android.permission.ACCESS_WIFI_STATE") != 0) {
                    return false;
                }
                return true;
            }
            context.getClass();
            if (context == null || d55.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                return false;
            }
            return true;
        }
        context.getClass();
        if ((context == null || d55.a(context, "android.permission.ACCESS_FINE_LOCATION") != 0) && (context == null || d55.a(context, "android.permission.ACCESS_COARSE_LOCATION") != 0)) {
            return false;
        }
        return true;
    }
}
