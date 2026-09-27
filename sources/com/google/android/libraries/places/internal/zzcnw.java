package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcnw extends zzcbh {
    final /* synthetic */ zzcnx zza;
    private final zzcbh zzb;

    public zzcnw(zzcnx zzcnxVar, zzcbh zzcbhVar) {
        Objects.requireNonNull(zzcnxVar);
        this.zza = zzcnxVar;
        this.zzb = zzcbhVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcbh
    public final zzccd zza(zzcbj zzcbjVar) {
        zzccd zza = this.zzb.zza(zzcbjVar);
        boolean zzj = zza.zzj();
        zzcnx zzcnxVar = this.zza;
        if (zzj) {
            zzcnxVar.zze().zzb();
            return zza;
        }
        zzcnxVar.zze().zza(new zzcnv(zzcnxVar));
        return zza;
    }
}
