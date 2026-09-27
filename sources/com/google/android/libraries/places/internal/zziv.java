package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zziv implements zzbwm {
    private final zzbwp zza;

    private zziv(zzbwp zzbwpVar) {
        this.zza = zzbwpVar;
    }

    public static zziv zzc(zzbwp zzbwpVar) {
        return new zziv(zzbwpVar);
    }

    public static zziu zzd(zzqj zzqjVar) {
        return new zziu(null);
    }

    public final zziu zza() {
        return new zziu((zzqj) this.zza.zzb());
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
