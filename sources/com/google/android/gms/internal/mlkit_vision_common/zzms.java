package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzms {
    private static zzmr zza;

    public static synchronized zzmj zza(zzme zzmeVar) {
        zzmj zzmjVar;
        synchronized (zzms.class) {
            try {
                zzmr zzmrVar = zza;
                if (zzmrVar == null) {
                    zzmrVar = new zzmr(null);
                    zza = zzmrVar;
                }
                zzmjVar = (zzmj) zzmrVar.get(zzmeVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzmjVar;
    }

    public static synchronized zzmj zzb(String str) {
        zzmj zza2;
        synchronized (zzms.class) {
            zza2 = zza(zzme.zzd("vision-common").zzd());
        }
        return zza2;
    }
}
