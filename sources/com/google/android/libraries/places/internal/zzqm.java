package com.google.android.libraries.places.internal;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzqm implements zzbwm {
    private final zzbwp zza;

    private zzqm(zzbwp zzbwpVar) {
        this.zza = zzbwpVar;
    }

    public static zzqm zzc(zzbwp zzbwpVar) {
        return new zzqm(zzbwpVar);
    }

    public static Context zzd(Context context) {
        Context applicationContext = context.getApplicationContext();
        zzbwo.zza(applicationContext);
        return applicationContext;
    }

    public final Context zza() {
        return zzd((Context) this.zza.zzb());
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
