package com.google.android.libraries.places.internal;

import defpackage.jr9;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzgk implements zzbwm {
    private final zzbwp zza;

    private zzgk(zzbwp zzbwpVar) {
        this.zza = zzbwpVar;
    }

    public static zzgk zzc(zzbwp zzbwpVar) {
        return new zzgk(zzbwpVar);
    }

    public final jr9 zza() {
        jr9 m = jr9.m(((zzbws) this.zza).zzc());
        zzbwo.zza(m);
        return m;
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
