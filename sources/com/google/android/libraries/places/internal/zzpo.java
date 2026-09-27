package com.google.android.libraries.places.internal;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzpo implements zzbwm {
    private final zzbwp zza;

    private zzpo(zzbwp zzbwpVar) {
        this.zza = zzbwpVar;
    }

    public static zzpo zzc(zzbwp zzbwpVar) {
        return new zzpo(zzbwpVar);
    }

    public final Context zza() {
        Context zza = ((zzpn) this.zza).zza();
        zza.getClass();
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
