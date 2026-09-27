package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.CircularBounds;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.internal.zzqk;
import defpackage.brn;
import defpackage.jr9;
import defpackage.p23;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class SearchNearbyRequest implements zzqk {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public SearchNearbyRequest build() {
            List<Place.Field> placeFields = getPlaceFields();
            boolean z = getLocationRestriction() instanceof CircularBounds;
            List<String> includedTypes = getIncludedTypes();
            List<String> excludedTypes = getExcludedTypes();
            List<String> includedPrimaryTypes = getIncludedPrimaryTypes();
            List<String> excludedPrimaryTypes = getExcludedPrimaryTypes();
            brn.g("LocationRestriction must be of type CircularBounds.", z);
            setPlaceFields(jr9.m(placeFields));
            if (includedTypes != null) {
                setIncludedTypes(jr9.m(includedTypes));
            }
            if (excludedTypes != null) {
                setExcludedTypes(jr9.m(excludedTypes));
            }
            if (includedPrimaryTypes != null) {
                setIncludedPrimaryTypes(jr9.m(includedPrimaryTypes));
            }
            if (excludedPrimaryTypes != null) {
                setExcludedPrimaryTypes(jr9.m(excludedPrimaryTypes));
            }
            return zza();
        }

        public abstract p23 getCancellationToken();

        public abstract List<String> getExcludedPrimaryTypes();

        public abstract List<String> getExcludedTypes();

        public abstract List<String> getIncludedPrimaryTypes();

        public abstract List<String> getIncludedTypes();

        public abstract LocationRestriction getLocationRestriction();

        public abstract Integer getMaxResultCount();

        public abstract List<Place.Field> getPlaceFields();

        public abstract RankPreference getRankPreference();

        public abstract String getRegionCode();

        public abstract RoutingParameters getRoutingParameters();

        public abstract boolean isRoutingSummariesIncluded();

        public abstract Builder setCancellationToken(p23 p23Var);

        public abstract Builder setExcludedPrimaryTypes(List<String> list);

        public abstract Builder setExcludedTypes(List<String> list);

        public abstract Builder setIncludedPrimaryTypes(List<String> list);

        public abstract Builder setIncludedTypes(List<String> list);

        public abstract Builder setLocationRestriction(LocationRestriction locationRestriction);

        public abstract Builder setMaxResultCount(Integer num);

        public abstract Builder setPlaceFields(List<Place.Field> list);

        public abstract Builder setRankPreference(RankPreference rankPreference);

        public abstract Builder setRegionCode(String str);

        public abstract Builder setRoutingParameters(RoutingParameters routingParameters);

        public abstract Builder setRoutingSummariesIncluded(boolean z);

        public abstract SearchNearbyRequest zza();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum RankPreference {
        DISTANCE,
        POPULARITY
    }

    public static Builder builder(LocationRestriction locationRestriction, List<Place.Field> list) {
        zzaa zzaaVar = new zzaa();
        zzaaVar.setLocationRestriction(locationRestriction);
        zzaaVar.setPlaceFields(list);
        zzaaVar.setRoutingSummariesIncluded(false);
        return zzaaVar;
    }

    public static SearchNearbyRequest newInstance(LocationRestriction locationRestriction, List<Place.Field> list) {
        return builder(locationRestriction, list).build();
    }

    @Override // com.google.android.libraries.places.internal.zzqk
    public abstract p23 getCancellationToken();

    public abstract List<String> getExcludedPrimaryTypes();

    public abstract List<String> getExcludedTypes();

    public abstract List<String> getIncludedPrimaryTypes();

    public abstract List<String> getIncludedTypes();

    public abstract LocationRestriction getLocationRestriction();

    public abstract Integer getMaxResultCount();

    public abstract List<Place.Field> getPlaceFields();

    public abstract RankPreference getRankPreference();

    public abstract String getRegionCode();

    public abstract RoutingParameters getRoutingParameters();

    public abstract boolean isRoutingSummariesIncluded();

    public abstract Builder zza();
}
