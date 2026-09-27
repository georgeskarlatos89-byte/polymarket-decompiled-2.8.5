package com.google.android.libraries.places.internal;

import android.content.Context;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzpn implements zzbwm {
    private final zzbwp zza;

    private zzpn(zzbwp zzbwpVar) {
        this.zza = zzbwpVar;
    }

    public static zzpn zzc(zzbwp zzbwpVar) {
        return new zzpn(zzbwpVar);
    }

    public final Context zza() {
        zzpu zzpuVar = (zzpu) this.zza.zzb();
        zzpuVar.getClass();
        if (zzpuVar instanceof zzpl) {
            Context zza = ((zzpl) zzpuVar).zza();
            zzbwo.zza(zza);
            return zza;
        }
        dmk.v("Dependencies must be of type PlacesSdkExternalDependencies");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
