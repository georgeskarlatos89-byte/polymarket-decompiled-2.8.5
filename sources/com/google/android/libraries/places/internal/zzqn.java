package com.google.android.libraries.places.internal;

import android.content.Context;
import defpackage.gdj;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzqn implements zzbwm {
    private final zzbwp zza;

    private zzqn(zzbwp zzbwpVar) {
        this.zza = zzbwpVar;
    }

    public static zzqn zzc(zzbwp zzbwpVar) {
        return new zzqn(zzbwpVar);
    }

    public static gdj zzd(Context context) {
        gdj zza = zzqy.zza(context);
        zzbwo.zza(zza);
        return zza;
    }

    public final gdj zza() {
        return zzd(((zzpo) this.zza).zza());
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
