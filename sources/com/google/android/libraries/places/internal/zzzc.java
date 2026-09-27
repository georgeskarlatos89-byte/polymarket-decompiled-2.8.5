package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzzc implements zzbwm {
    private final zzbwp zza;
    private final zzbwp zzb;

    private zzzc(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        this.zza = zzbwpVar;
        this.zzb = zzbwpVar2;
    }

    public static zzzc zzc(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        return new zzzc(zzbwpVar, zzbwpVar2);
    }

    public final zzzb zza() {
        return new zzzb(((zzpn) this.zza).zza(), (zzyd) this.zzb.zzb());
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
