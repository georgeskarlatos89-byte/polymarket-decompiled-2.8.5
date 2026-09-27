package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zzbwo {
    public static Object zza(Object obj) {
        if (obj != null) {
            return obj;
        }
        dmk.s("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public static void zzb(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        dmk.n(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}
