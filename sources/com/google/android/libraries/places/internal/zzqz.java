package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzqz implements zzbwm {
    private final zzbwp zza;
    private final zzbwp zzb;

    private zzqz(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        this.zza = zzbwpVar;
        this.zzb = zzbwpVar2;
    }

    public static zzqz zzc(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        return new zzqz(zzbwpVar, zzbwpVar2);
    }

    public final zzqy zza() {
        return new zzqy(((zzqn) this.zza).zza(), (zzfw) this.zzb.zzb());
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
