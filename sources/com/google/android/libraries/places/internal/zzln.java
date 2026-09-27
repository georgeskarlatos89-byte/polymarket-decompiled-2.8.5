package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.RouteModifiers;
import com.google.android.libraries.places.api.model.RoutingParameters;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzln {
    public zzln(zzio zzioVar) {
    }

    public static final zzbnu zza(RoutingParameters routingParameters) {
        int i;
        zzbnt zza = zzbnu.zza();
        LatLng origin = routingParameters.getOrigin();
        if (origin != null) {
            zza.zza(zzio.zza(origin));
        }
        RoutingParameters.TravelMode travelMode = routingParameters.getTravelMode();
        int i2 = 5;
        if (travelMode != null) {
            RoutingParameters.RoutingPreference routingPreference = RoutingParameters.RoutingPreference.ROUTING_PREFERENCE_UNSPECIFIED;
            int ordinal = travelMode.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            i = 2;
                        } else {
                            i = 6;
                        }
                    } else {
                        i = 5;
                    }
                } else {
                    i = 4;
                }
            } else {
                i = 3;
            }
            zza.zzc(i);
        }
        RouteModifiers routeModifiers = routingParameters.getRouteModifiers();
        if (routeModifiers != null) {
            zzbnr zza2 = zzbns.zza();
            zza2.zza(routeModifiers.isTollAvoided());
            zza2.zzb(routeModifiers.isHighwayAvoided());
            zza2.zzc(routeModifiers.isFerryAvoided());
            zza2.zzd(routeModifiers.isIndoorAvoided());
            zza.zzb((zzbns) zza2.zzD());
        }
        RoutingParameters.RoutingPreference routingPreference2 = routingParameters.getRoutingPreference();
        if (routingPreference2 != null) {
            RoutingParameters.TravelMode travelMode2 = RoutingParameters.TravelMode.TRAVEL_MODE_UNSPECIFIED;
            int ordinal2 = routingPreference2.ordinal();
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        i2 = 2;
                    }
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 3;
            }
            zza.zzd(i2);
        }
        return (zzbnu) zza.zzD();
    }
}
