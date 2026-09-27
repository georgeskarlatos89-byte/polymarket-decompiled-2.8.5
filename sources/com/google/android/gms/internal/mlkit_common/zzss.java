package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzss {
    private static zzsr zza;

    public static synchronized zzsh zza(zzsb zzsbVar) {
        zzsh zzshVar;
        synchronized (zzss.class) {
            try {
                zzsr zzsrVar = zza;
                if (zzsrVar == null) {
                    zzsrVar = new zzsr(null);
                    zza = zzsrVar;
                }
                zzshVar = (zzsh) zzsrVar.get(zzsbVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzshVar;
    }

    public static synchronized zzsh zzb(String str) {
        zzsh zza2;
        synchronized (zzss.class) {
            zza2 = zza(zzsb.zzd("common").zzd());
        }
        return zza2;
    }
}
