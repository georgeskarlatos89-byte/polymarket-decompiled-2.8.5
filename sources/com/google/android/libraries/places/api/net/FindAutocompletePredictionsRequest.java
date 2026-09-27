package com.google.android.libraries.places.api.net;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.internal.zzqk;
import defpackage.jr9;
import defpackage.p23;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class FindAutocompletePredictionsRequest implements zzqk {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public FindAutocompletePredictionsRequest build() {
            setCountries(jr9.m(getCountries()));
            setTypesFilter(jr9.m(getTypesFilter()));
            return zza();
        }

        public abstract p23 getCancellationToken();

        public abstract List<String> getCountries();

        public abstract Integer getInputOffset();

        public abstract LocationBias getLocationBias();

        public abstract LocationRestriction getLocationRestriction();

        public abstract LatLng getOrigin();

        public abstract String getQuery();

        public abstract String getRegionCode();

        public abstract AutocompleteSessionToken getSessionToken();

        public abstract List<String> getTypesFilter();

        public abstract boolean isPureServiceAreaBusinessesIncluded();

        public abstract Builder setCancellationToken(p23 p23Var);

        public abstract Builder setCountries(List<String> list);

        public Builder setCountries(String... strArr) {
            return setCountries(jr9.n(strArr));
        }

        public abstract Builder setInputOffset(Integer num);

        public abstract Builder setLocationBias(LocationBias locationBias);

        public abstract Builder setLocationRestriction(LocationRestriction locationRestriction);

        public abstract Builder setOrigin(LatLng latLng);

        public abstract Builder setPureServiceAreaBusinessesIncluded(boolean z);

        public abstract Builder setQuery(String str);

        public abstract Builder setRegionCode(String str);

        public abstract Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken);

        public abstract Builder setTypesFilter(List<String> list);

        public abstract FindAutocompletePredictionsRequest zza();
    }

    public static Builder builder() {
        zzj zzjVar = new zzj();
        zzjVar.setCountries(new ArrayList());
        zzjVar.setTypesFilter(new ArrayList());
        zzjVar.setPureServiceAreaBusinessesIncluded(false);
        return zzjVar;
    }

    public static FindAutocompletePredictionsRequest newInstance(String str) {
        Builder builder = builder();
        builder.setQuery(str);
        return builder.build();
    }

    @Override // com.google.android.libraries.places.internal.zzqk
    public abstract p23 getCancellationToken();

    public abstract List<String> getCountries();

    public abstract Integer getInputOffset();

    public abstract LocationBias getLocationBias();

    public abstract LocationRestriction getLocationRestriction();

    public abstract LatLng getOrigin();

    public abstract String getQuery();

    public abstract String getRegionCode();

    public abstract AutocompleteSessionToken getSessionToken();

    public abstract List<String> getTypesFilter();

    public abstract boolean isPureServiceAreaBusinessesIncluded();
}
