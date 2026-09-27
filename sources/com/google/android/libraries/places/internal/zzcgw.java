package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcgw extends zzcaa {
    final /* synthetic */ zzcgx zzf;
    private final zzbzr zzg;

    public zzcgw(zzcgx zzcgxVar, zzbzr zzbzrVar) {
        Objects.requireNonNull(zzcgxVar);
        this.zzf = zzcgxVar;
        Objects.requireNonNull(zzbzrVar, "helper");
        this.zzg = zzbzrVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcaa
    public final zzccd zza(zzbzw zzbzwVar) {
        zzcgx zzcgxVar = this.zzf;
        this.zzg.zzb(zzcgxVar.zzf(), zzcgxVar.zzg());
        return zzcgxVar.zzh();
    }

    @Override // com.google.android.libraries.places.internal.zzcaa
    public final void zzb(zzccd zzccdVar) {
        zzcgx zzcgxVar = this.zzf;
        this.zzg.zzb(zzcgxVar.zzf(), zzcgxVar.zzg());
    }

    @Override // com.google.android.libraries.places.internal.zzcaa
    public final void zzc() {
    }
}
