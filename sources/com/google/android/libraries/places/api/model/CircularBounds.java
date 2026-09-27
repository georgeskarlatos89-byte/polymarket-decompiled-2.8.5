package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class CircularBounds implements LocationBias, LocationRestriction, Parcelable {
    public static CircularBounds newInstance(LatLng latLng, double d) {
        return new zzei(latLng, d);
    }

    public abstract LatLng getCenter();

    public abstract double getRadius();
}
