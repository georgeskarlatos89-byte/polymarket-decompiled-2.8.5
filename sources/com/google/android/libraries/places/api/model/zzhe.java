package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.RoutingParameters;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzhe extends zzcq {
    public static final Parcelable.Creator<zzhe> CREATOR = new zzhd();

    public zzhe(LatLng latLng, RoutingParameters.TravelMode travelMode, RouteModifiers routeModifiers, RoutingParameters.RoutingPreference routingPreference) {
        super(latLng, travelMode, routeModifiers, routingPreference);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getOrigin(), i);
        parcel.writeParcelable(getTravelMode(), i);
        parcel.writeParcelable(getRouteModifiers(), i);
        parcel.writeParcelable(getRoutingPreference(), i);
    }
}
