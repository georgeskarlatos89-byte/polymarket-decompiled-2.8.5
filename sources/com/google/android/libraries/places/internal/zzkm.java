package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzkm implements zzbwm {
    private final zzbwp zza;

    private zzkm(zzbwp zzbwpVar) {
        this.zza = zzbwpVar;
    }

    public static zzkm zzc(zzbwp zzbwpVar) {
        return new zzkm(zzbwpVar);
    }

    public final zzkl zza() {
        return new zzkl(((zzpn) this.zza).zza());
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
