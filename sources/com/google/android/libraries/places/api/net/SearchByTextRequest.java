package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.EVSearchOptions;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.api.model.SearchAlongRouteParameters;
import com.google.android.libraries.places.internal.zzqk;
import defpackage.brn;
import defpackage.jnf;
import defpackage.jr9;
import defpackage.p23;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class SearchByTextRequest implements zzqk {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public SearchByTextRequest build() {
            boolean z;
            Double valueOf = Double.valueOf(5.0d);
            Double valueOf2 = Double.valueOf(1.0d);
            setPlaceFields(jr9.m(getPlaceFields()));
            setPriceLevels(jr9.m(getPriceLevels()));
            Double minRating = getMinRating();
            if (minRating != null) {
                if (minRating.doubleValue() >= 1.0d && minRating.doubleValue() <= 5.0d) {
                    z = true;
                } else {
                    z = false;
                }
                brn.i(z, "Min rating must not be out of range of %s to %s, but was: %s.", valueOf2, valueOf, minRating);
            }
            List<Integer> priceLevels = getPriceLevels();
            if (!priceLevels.isEmpty()) {
                for (Integer num : priceLevels) {
                    brn.i(jnf.a(0, 4).b(num), "Price level must not be out of range of %s to %s, but was: %s.", valueOf2, valueOf, num);
                }
            }
            return zzc();
        }

        public abstract p23 getCancellationToken();

        public abstract EVSearchOptions getEvSearchOptions();

        public abstract String getIncludedType();

        public abstract LocationBias getLocationBias();

        public abstract LocationRestriction getLocationRestriction();

        public abstract Integer getMaxResultCount();

        public abstract Double getMinRating();

        public abstract List<Place.Field> getPlaceFields();

        public abstract List<Integer> getPriceLevels();

        public abstract RankPreference getRankPreference();

        public abstract String getRegionCode();

        public abstract RoutingParameters getRoutingParameters();

        public abstract SearchAlongRouteParameters getSearchAlongRouteParameters();

        public abstract String getTextQuery();

        public abstract boolean isOpenNow();

        public abstract boolean isPureServiceAreaBusinessesIncluded();

        public abstract boolean isRoutingSummariesIncluded();

        public abstract boolean isSearchUriIncluded();

        public abstract boolean isStrictTypeFiltering();

        public abstract Builder setCancellationToken(p23 p23Var);

        public abstract Builder setEvSearchOptions(EVSearchOptions eVSearchOptions);

        public abstract Builder setIncludedType(String str);

        public abstract Builder setLocationBias(LocationBias locationBias);

        public abstract Builder setLocationRestriction(LocationRestriction locationRestriction);

        public abstract Builder setMaxResultCount(Integer num);

        public abstract Builder setMinRating(Double d);

        public abstract Builder setOpenNow(boolean z);

        public abstract Builder setPlaceFields(List<Place.Field> list);

        public abstract Builder setPriceLevels(List<Integer> list);

        public abstract Builder setPureServiceAreaBusinessesIncluded(boolean z);

        public abstract Builder setRankPreference(RankPreference rankPreference);

        public abstract Builder setRegionCode(String str);

        public abstract Builder setRoutingParameters(RoutingParameters routingParameters);

        public abstract Builder setRoutingSummariesIncluded(boolean z);

        public abstract Builder setSearchAlongRouteParameters(SearchAlongRouteParameters searchAlongRouteParameters);

        public abstract Builder setSearchUriIncluded(boolean z);

        public abstract Builder setStrictTypeFiltering(boolean z);

        public abstract Builder setTextQuery(String str);

        public abstract Builder zza(String str);

        public abstract Builder zzb(int i);

        public abstract SearchByTextRequest zzc();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum RankPreference {
        DISTANCE,
        RELEVANCE
    }

    public static Builder builder(String str, List<Place.Field> list) {
        zzs zzsVar = new zzs();
        zzsVar.setOpenNow(false);
        zzsVar.setPlaceFields(list);
        zzsVar.setPriceLevels(new ArrayList());
        zzsVar.setTextQuery(str);
        zzsVar.setStrictTypeFiltering(false);
        zzsVar.setRoutingSummariesIncluded(false);
        zzsVar.setPureServiceAreaBusinessesIncluded(false);
        zzsVar.zzb(1);
        zzsVar.setSearchUriIncluded(false);
        return zzsVar;
    }

    public static SearchByTextRequest newInstance(String str, List<Place.Field> list) {
        return builder(str, list).build();
    }

    public abstract EVSearchOptions getEvSearchOptions();

    public abstract String getIncludedType();

    public abstract LocationBias getLocationBias();

    public abstract LocationRestriction getLocationRestriction();

    public abstract Integer getMaxResultCount();

    public abstract Double getMinRating();

    public abstract List<Place.Field> getPlaceFields();

    public abstract List<Integer> getPriceLevels();

    public abstract RankPreference getRankPreference();

    public abstract String getRegionCode();

    public abstract RoutingParameters getRoutingParameters();

    public abstract SearchAlongRouteParameters getSearchAlongRouteParameters();

    public abstract String getTextQuery();

    public abstract boolean isOpenNow();

    public abstract boolean isPureServiceAreaBusinessesIncluded();

    public abstract boolean isRoutingSummariesIncluded();

    public abstract boolean isSearchUriIncluded();

    public abstract boolean isStrictTypeFiltering();

    public abstract String zza();

    public abstract int zzb();

    public abstract Builder zzc();
}
