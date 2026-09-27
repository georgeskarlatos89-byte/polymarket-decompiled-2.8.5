package com.google.android.libraries.places.internal;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzuj implements zzbwm {
    private final zzbwp zza;
    private final zzbwp zzb;

    private zzuj(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        this.zza = zzbwpVar;
        this.zzb = zzbwpVar2;
    }

    public static zzuj zzc(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        return new zzuj(zzbwpVar, zzbwpVar2);
    }

    public static zzqt zzd(Context context, zzqs zzqsVar) {
        zzqr zzd = zzqt.zzd(context);
        zzd.zzc(zzqsVar);
        return zzd.zze();
    }

    public final zzqt zza() {
        return zzd(((zzqm) this.zza).zza(), (zzqs) this.zzb.zzb());
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
