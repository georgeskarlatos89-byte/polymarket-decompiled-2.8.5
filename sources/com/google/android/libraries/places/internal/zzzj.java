package com.google.android.libraries.places.internal;

import io.sentry.android.core.m0;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzzj {
    private static final Method zza;

    static {
        Method method = null;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
                cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            zza = method;
        }
    }

    public static String zza(String str, String str2) {
        try {
            return (String) zza.invoke(null, "tiktok_systrace", "false");
        } catch (Exception e) {
            m0.e("SystemProperties", "get error", e);
            return "false";
        }
    }
}
