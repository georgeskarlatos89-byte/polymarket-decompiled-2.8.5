package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzre implements zzbwm {
    private final zzbwp zza;

    private zzre(zzbwp zzbwpVar) {
        this.zza = zzbwpVar;
    }

    public static zzre zzc(zzbwp zzbwpVar) {
        return new zzre(zzbwpVar);
    }

    public final zzrd zza() {
        return new zzrd(((zzpo) this.zza).zza());
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
