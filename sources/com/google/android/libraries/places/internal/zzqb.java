package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzqb implements zzbwm {
    private final zzbwp zza;
    private final zzbwp zzb;

    private zzqb(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        this.zza = zzbwpVar;
        this.zzb = zzbwpVar2;
    }

    public static zzqb zza(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        return new zzqb(zzbwpVar, zzbwpVar2);
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* synthetic */ Object zzb() {
        zzqe zza = ((zzpm) this.zza).zza();
        zzqj zzqjVar = (zzqj) this.zzb.zzb();
        zza.getClass();
        if (zzqjVar != null) {
            return new zzqa(zzqjVar, zza);
        }
        return zza;
    }
}
