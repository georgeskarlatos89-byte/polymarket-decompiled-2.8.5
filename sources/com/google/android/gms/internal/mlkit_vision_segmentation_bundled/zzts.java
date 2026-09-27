package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzts {
    private static zzts zza;

    private zzts() {
    }

    public static synchronized zzts zza() {
        zzts zztsVar;
        synchronized (zzts.class) {
            zztsVar = zza;
            if (zztsVar == null) {
                zztsVar = new zzts();
                zza = zztsVar;
            }
        }
        return zztsVar;
    }
}
