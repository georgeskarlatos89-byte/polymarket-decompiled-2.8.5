package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzqk;
import defpackage.jr9;
import defpackage.p23;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class FetchPlaceRequest implements zzqk {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public FetchPlaceRequest build() {
            zzb(jr9.m(zzc().getPlaceFields()));
            return zzc();
        }

        public abstract p23 getCancellationToken();

        public abstract String getRegionCode();

        public abstract AutocompleteSessionToken getSessionToken();

        public abstract Builder setCancellationToken(p23 p23Var);

        public abstract Builder setRegionCode(String str);

        public abstract Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken);

        public abstract Builder zzb(List list);

        public abstract FetchPlaceRequest zzc();
    }

    public static Builder builder(String str, List<Place.Field> list) {
        zzd zzdVar = new zzd();
        zzdVar.zza(str);
        zzdVar.zzb(list);
        return zzdVar;
    }

    public static FetchPlaceRequest newInstance(String str, List<Place.Field> list) {
        return builder(str, list).build();
    }

    @Override // com.google.android.libraries.places.internal.zzqk
    public abstract p23 getCancellationToken();

    public abstract List<Place.Field> getPlaceFields();

    public abstract String getPlaceId();

    public abstract String getRegionCode();

    public abstract AutocompleteSessionToken getSessionToken();
}
