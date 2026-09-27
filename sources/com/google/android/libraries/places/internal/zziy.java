package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zziy implements zzbwm {
    private final zzbwp zza;
    private final zzbwp zzb;

    private zziy(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        this.zza = zzbwpVar;
        this.zzb = zzbwpVar2;
    }

    public static zziy zzc(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        return new zziy(zzbwpVar, zzbwpVar2);
    }

    public static zzix zzd(zzcai zzcaiVar, zzkl zzklVar) {
        return new zzix(zzcaiVar, zzklVar);
    }

    public final zzix zza() {
        return new zzix((zzcai) this.zza.zzb(), ((zzkm) this.zzb).zza());
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
