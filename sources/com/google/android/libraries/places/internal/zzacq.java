package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzacq {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();

    public abstract Object zza();

    public final Object zzb(zzaco zzacoVar, zzadu zzaduVar) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        Object obj = concurrentHashMap.get(zzacoVar);
        if (obj != null) {
            return obj;
        }
        Object zza = zza();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(zzacoVar, zza);
        if (putIfAbsent == null) {
            int zza2 = zzaduVar.zza();
            zzacp zzacpVar = null;
            for (int i = 0; i < zza2; i++) {
                if (zzaci.zzf.equals(zzaduVar.zzb(i))) {
                    Object zzc = zzaduVar.zzc(i);
                    if (zzc instanceof zzacu) {
                        if (zzacpVar == null) {
                            zzacpVar = new zzacp(this, zzacoVar);
                        }
                        ((zzacu) zzc).zza();
                    }
                }
            }
            return zza;
        }
        return putIfAbsent;
    }

    public final /* synthetic */ ConcurrentHashMap zzc() {
        return this.zza;
    }
}
