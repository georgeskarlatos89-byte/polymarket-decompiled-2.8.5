package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzxb implements zzbwm {
    private final zzbwp zza;
    private final zzbwp zzb;

    private zzxb(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        this.zza = zzbwpVar;
        this.zzb = zzbwpVar2;
    }

    public static zzxb zzc(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        return new zzxb(zzbwpVar, zzbwpVar2);
    }

    public final zzxa zza() {
        return new zzxa(((zzpn) this.zza).zza(), (zzwm) this.zzb.zzb());
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
