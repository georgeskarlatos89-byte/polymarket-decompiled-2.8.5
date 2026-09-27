package com.google.android.libraries.places.internal;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzgv implements zzbwm {
    private final zzbwp zza;
    private final zzbwp zzb;

    private zzgv(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        this.zza = zzbwpVar;
        this.zzb = zzbwpVar2;
    }

    public static zzgv zzc(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        return new zzgv(zzbwpVar, zzbwpVar2);
    }

    public static zzgu zzd(Context context, zzfd zzfdVar) {
        return new zzgu(context, zzfdVar);
    }

    public final zzgu zza() {
        return new zzgu(((zzpn) this.zza).zza(), (zzfd) this.zzb.zzb());
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
