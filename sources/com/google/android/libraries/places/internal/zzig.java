package com.google.android.libraries.places.internal;

import defpackage.npn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzig {
    public static final com.google.android.libraries.places.api.model.zzde zza(zzbhy zzbhyVar) {
        com.google.android.libraries.places.api.model.zzdb zzd = com.google.android.libraries.places.api.model.zzde.zzd();
        if (zzbhyVar.zza()) {
            zzbhx zzc = zzbhyVar.zzc();
            com.google.android.libraries.places.api.model.zzdc zzf = com.google.android.libraries.places.api.model.zzdd.zzf();
            zzf.zza(npn.b(zzc.zza()));
            zzf.zzb(zzir.zza(zzc.zzc()));
            zzf.zzc(zzir.zza(zzc.zzd()));
            if (zzc.zze()) {
                zzf.zzd(npn.b(zzc.zzf().zzc()));
                zzf.zze(npn.b(zzc.zzf().zze()));
            }
            zzd.zza(zzf.zzf());
        }
        zzd.zzb(npn.b(zzbhyVar.zze()));
        zzd.zzc(npn.b(zzbhyVar.zzd()));
        return zzd.zzd();
    }
}
