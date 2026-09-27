package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class RectangularBounds implements LocationBias, LocationRestriction {
    public static RectangularBounds newInstance(LatLngBounds latLngBounds) {
        zzcd zzcdVar = new zzcd();
        zzcdVar.zza(latLngBounds.a);
        zzcdVar.zzb(latLngBounds.b);
        return zzcdVar.zzc();
    }

    public abstract LatLng getNortheast();

    public abstract LatLng getSouthwest();

    public static RectangularBounds newInstance(LatLng latLng, LatLng latLng2) {
        return newInstance(new LatLngBounds(latLng, latLng2));
    }
}
