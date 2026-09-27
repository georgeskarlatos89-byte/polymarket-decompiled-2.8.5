package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.CircularBounds;
import com.google.android.libraries.places.api.model.RectangularBounds;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzio {
    public static final zzbvu zza(LatLng latLng) {
        zzbvt zzf = zzbvu.zzf();
        zzf.zza(latLng.a);
        zzf.zzb(latLng.b);
        return (zzbvu) zzf.zzD();
    }

    public static final zzbja zzb(CircularBounds circularBounds) {
        LatLng center = circularBounds.getCenter();
        zzbiz zza = zzbja.zza();
        zzbvt zzf = zzbvu.zzf();
        zzf.zza(center.a);
        zzf.zzb(center.b);
        zza.zza(zzf);
        zza.zzb(circularBounds.getRadius());
        return (zzbja) zza.zzD();
    }

    public static final zzbfq zzc(RectangularBounds rectangularBounds) {
        LatLng southwest = rectangularBounds.getSouthwest();
        LatLng northeast = rectangularBounds.getNortheast();
        zzbfp zzd = zzbfq.zzd();
        zzbvt zzf = zzbvu.zzf();
        zzf.zza(southwest.a);
        zzf.zzb(southwest.b);
        zzd.zza((zzbvu) zzf.zzD());
        zzbvt zzf2 = zzbvu.zzf();
        zzf2.zza(northeast.a);
        zzf2.zzb(northeast.b);
        zzd.zzb((zzbvu) zzf2.zzD());
        return (zzbfq) zzd.zzD();
    }
}
