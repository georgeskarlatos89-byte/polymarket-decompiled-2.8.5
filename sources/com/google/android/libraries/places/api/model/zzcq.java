package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.RoutingParameters;
import defpackage.k84;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzcq extends RoutingParameters {
    private final LatLng zza;
    private final RoutingParameters.TravelMode zzb;
    private final RouteModifiers zzc;
    private final RoutingParameters.RoutingPreference zzd;

    public zzcq(LatLng latLng, RoutingParameters.TravelMode travelMode, RouteModifiers routeModifiers, RoutingParameters.RoutingPreference routingPreference) {
        this.zza = latLng;
        this.zzb = travelMode;
        this.zzc = routeModifiers;
        this.zzd = routingPreference;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RoutingParameters) {
            RoutingParameters routingParameters = (RoutingParameters) obj;
            LatLng latLng = this.zza;
            if (latLng != null ? latLng.equals(routingParameters.getOrigin()) : routingParameters.getOrigin() == null) {
                RoutingParameters.TravelMode travelMode = this.zzb;
                if (travelMode != null ? travelMode.equals(routingParameters.getTravelMode()) : routingParameters.getTravelMode() == null) {
                    RouteModifiers routeModifiers = this.zzc;
                    if (routeModifiers != null ? routeModifiers.equals(routingParameters.getRouteModifiers()) : routingParameters.getRouteModifiers() == null) {
                        RoutingParameters.RoutingPreference routingPreference = this.zzd;
                        if (routingPreference != null ? routingPreference.equals(routingParameters.getRoutingPreference()) : routingParameters.getRoutingPreference() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final LatLng getOrigin() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final RouteModifiers getRouteModifiers() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final RoutingParameters.RoutingPreference getRoutingPreference() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final RoutingParameters.TravelMode getTravelMode() {
        return this.zzb;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        LatLng latLng = this.zza;
        int i = 0;
        if (latLng == null) {
            hashCode = 0;
        } else {
            hashCode = latLng.hashCode();
        }
        RoutingParameters.TravelMode travelMode = this.zzb;
        if (travelMode == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = travelMode.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        RouteModifiers routeModifiers = this.zzc;
        if (routeModifiers == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = routeModifiers.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        RoutingParameters.RoutingPreference routingPreference = this.zzd;
        if (routingPreference != null) {
            i = routingPreference.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        RoutingParameters.RoutingPreference routingPreference = this.zzd;
        RouteModifiers routeModifiers = this.zzc;
        RoutingParameters.TravelMode travelMode = this.zzb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(travelMode);
        String valueOf3 = String.valueOf(routeModifiers);
        String valueOf4 = String.valueOf(routingPreference);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 17 + valueOf3.length() + 20 + valueOf4.length() + 1);
        k84.q(sb, "RoutingParameters{origin=", valueOf, ", travelMode=", valueOf2);
        k84.q(sb, ", routeModifiers=", valueOf3, ", routingPreference=", valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
