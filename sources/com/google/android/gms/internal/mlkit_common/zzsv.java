package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzsv {
    private static zzsv zza;

    private zzsv() {
    }

    public static synchronized zzsv zza() {
        zzsv zzsvVar;
        synchronized (zzsv.class) {
            zzsvVar = zza;
            if (zzsvVar == null) {
                zzsvVar = new zzsv();
                zza = zzsvVar;
            }
        }
        return zzsvVar;
    }

    public static void zzb() {
        zzsu.zza();
    }
}
