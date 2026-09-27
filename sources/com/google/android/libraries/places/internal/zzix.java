package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.LatLng;
import defpackage.ujb;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzix {
    private final zzcai zza;
    private final zzkl zzb;

    public zzix(zzcai zzcaiVar, zzkl zzklVar) {
        this.zza = zzcaiVar;
        this.zzb = zzklVar;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [wzg, java.lang.Object, ujb] */
    public final ujb zza(LatLng latLng, com.google.android.libraries.places.api.auth.zzb zzbVar, String str) {
        zzbhl zzbhlVar = (zzbhl) zzbhm.zzb(this.zza).zze(zzcsy.zza(this.zzb.zzb(str, "results.placeId,results.types")), zzfx.zza(zzbVar.zzb()));
        zzbhc zza = zzbhd.zza();
        double d = latLng.a;
        double d2 = latLng.b;
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 1 + String.valueOf(d2).length());
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        zza.zza(sb.toString());
        zzbhd zzbhdVar = (zzbhd) zza.zzD();
        ?? obj = new Object();
        zzcsv.zza(zzbhlVar.zzc().zza(zzbhm.zza(), zzbhlVar.zzd()), zzbhdVar, new zziw(this, obj));
        return obj;
    }

    public final void zzb() {
        this.zza.zzd();
    }
}
