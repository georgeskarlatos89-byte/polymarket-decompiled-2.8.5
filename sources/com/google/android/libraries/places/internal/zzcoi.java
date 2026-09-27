package com.google.android.libraries.places.internal;

import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcoi implements Runnable {
    final /* synthetic */ zzcoj zza;
    final /* synthetic */ zzcok zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ zzcol zzd;

    public zzcoi(zzcol zzcolVar, zzcoj zzcojVar, zzcok zzcokVar, Object obj) {
        this.zza = zzcojVar;
        this.zzb = zzcokVar;
        this.zzc = obj;
        Objects.requireNonNull(zzcolVar);
        this.zzd = zzcolVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcol zzcolVar = this.zzd;
        synchronized (zzcolVar) {
            try {
                if (this.zza.zzb == 0) {
                    IdentityHashMap zze = zzcolVar.zze();
                    zzcok zzcokVar = this.zzb;
                    zze.remove(zzcokVar);
                    if (zzcolVar.zze().isEmpty()) {
                        zzcolVar.zzf().shutdown();
                        zzcolVar.zzg(null);
                    }
                    zzcokVar.zza(this.zzc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
