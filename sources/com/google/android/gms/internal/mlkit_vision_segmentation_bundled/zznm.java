package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zznm {
    private Long zza;
    private zznz zzb;
    private Boolean zzc;
    private Boolean zzd;
    private Boolean zze;

    public static /* bridge */ /* synthetic */ zznz zzg(zznm zznmVar) {
        return zznmVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Boolean zzh(zznm zznmVar) {
        return zznmVar.zzd;
    }

    public static /* bridge */ /* synthetic */ Boolean zzi(zznm zznmVar) {
        return zznmVar.zze;
    }

    public static /* bridge */ /* synthetic */ Boolean zzj(zznm zznmVar) {
        return zznmVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Long zzk(zznm zznmVar) {
        return zznmVar.zza;
    }

    public final zznm zza(Boolean bool) {
        this.zzd = bool;
        return this;
    }

    public final zznm zzb(Boolean bool) {
        this.zze = bool;
        return this;
    }

    public final zznm zzc(Long l) {
        this.zza = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznm zzd(zznz zznzVar) {
        this.zzb = zznzVar;
        return this;
    }

    public final zznm zze(Boolean bool) {
        this.zzc = bool;
        return this;
    }

    public final zzno zzf() {
        return new zzno(this, null);
    }
}
