package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import defpackage.dkn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzdp {
    private final zznz zza;
    private final Boolean zzb;
    private final zzni zzc = null;
    private final zzqu zzd;

    public /* synthetic */ zzdp(zzdn zzdnVar, zzdo zzdoVar) {
        this.zza = zzdn.zze(zzdnVar);
        this.zzb = zzdn.zzg(zzdnVar);
        this.zzd = zzdn.zzf(zzdnVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdp)) {
            return false;
        }
        zzdp zzdpVar = (zzdp) obj;
        if (dkn.b(this.zza, zzdpVar.zza) && dkn.b(this.zzb, zzdpVar.zzb) && dkn.b(null, null) && dkn.b(this.zzd, zzdpVar.zzd)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, null, this.zzd});
    }

    public final zznz zza() {
        return this.zza;
    }

    public final zzqu zzb() {
        return this.zzd;
    }

    public final Boolean zzc() {
        return this.zzb;
    }
}
