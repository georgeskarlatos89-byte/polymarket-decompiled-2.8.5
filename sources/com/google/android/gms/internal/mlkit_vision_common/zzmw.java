package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzmw {
    private static zzmw zza;

    private zzmw() {
    }

    public static synchronized zzmw zza() {
        zzmw zzmwVar;
        synchronized (zzmw.class) {
            zzmwVar = zza;
            if (zzmwVar == null) {
                zzmwVar = new zzmw();
                zza = zzmwVar;
            }
        }
        return zzmwVar;
    }

    public static final boolean zzb() {
        return zzmv.zza("mlkit-dev-profiling");
    }
}
