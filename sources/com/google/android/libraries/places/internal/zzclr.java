package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzclr implements zzbzz {
    final /* synthetic */ zzbzx zza;
    final /* synthetic */ zzclv zzb;

    public zzclr(zzclv zzclvVar, zzbzx zzbzxVar) {
        this.zza = zzbzxVar;
        Objects.requireNonNull(zzclvVar);
        this.zzb = zzclvVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbzz
    public final void zza(zzbxw zzbxwVar) {
        this.zzb.zze(this.zza, zzbxwVar);
    }
}
