package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.RoutingParameters;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcp extends RoutingParameters.Builder {
    private LatLng zza;
    private RoutingParameters.TravelMode zzb;
    private RouteModifiers zzc;
    private RoutingParameters.RoutingPreference zzd;

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters build() {
        return new zzhe(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final LatLng getOrigin() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RouteModifiers getRouteModifiers() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters.RoutingPreference getRoutingPreference() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters.TravelMode getTravelMode() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters.Builder setOrigin(LatLng latLng) {
        this.zza = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters.Builder setRouteModifiers(RouteModifiers routeModifiers) {
        this.zzc = routeModifiers;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters.Builder setRoutingPreference(RoutingParameters.RoutingPreference routingPreference) {
        this.zzd = routingPreference;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final RoutingParameters.Builder setTravelMode(RoutingParameters.TravelMode travelMode) {
        this.zzb = travelMode;
        return this;
    }
}
