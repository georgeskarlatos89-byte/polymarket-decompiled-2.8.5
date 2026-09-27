package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class RoutingParameters implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract RoutingParameters build();

        public abstract LatLng getOrigin();

        public abstract RouteModifiers getRouteModifiers();

        public abstract RoutingPreference getRoutingPreference();

        public abstract TravelMode getTravelMode();

        public abstract Builder setOrigin(LatLng latLng);

        public abstract Builder setRouteModifiers(RouteModifiers routeModifiers);

        public abstract Builder setRoutingPreference(RoutingPreference routingPreference);

        public abstract Builder setTravelMode(TravelMode travelMode);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum RoutingPreference implements Parcelable {
        ROUTING_PREFERENCE_UNSPECIFIED,
        TRAFFIC_UNAWARE,
        TRAFFIC_AWARE,
        TRAFFIC_AWARE_OPTIMAL;

        public static final Parcelable.Creator<RoutingPreference> CREATOR = new zzij();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum TravelMode implements Parcelable {
        TRAVEL_MODE_UNSPECIFIED,
        DRIVE,
        BICYCLE,
        WALK,
        TWO_WHEELER;

        public static final Parcelable.Creator<TravelMode> CREATOR = new zzik();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public static Builder builder() {
        return new zzcp();
    }

    public abstract LatLng getOrigin();

    public abstract RouteModifiers getRouteModifiers();

    public abstract RoutingPreference getRoutingPreference();

    public abstract TravelMode getTravelMode();
}
