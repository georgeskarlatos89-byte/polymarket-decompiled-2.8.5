package com.google.android.libraries.places.internal;

import defpackage.npn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbyj {
    private static final boolean zza = zzb("GRPC_ENABLE_RFC3986_URIS", false);

    public static boolean zza() {
        return zza;
    }

    public static boolean zzb(String str, boolean z) {
        String str2 = System.getenv(str);
        if (str2 == null) {
            str2 = System.getProperty(str);
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        if (z) {
            if (npn.c(str2) || Boolean.parseBoolean(str2)) {
                return true;
            }
            return false;
        }
        if (!npn.c(str2) && Boolean.parseBoolean(str2)) {
            return true;
        }
        return false;
    }
}
