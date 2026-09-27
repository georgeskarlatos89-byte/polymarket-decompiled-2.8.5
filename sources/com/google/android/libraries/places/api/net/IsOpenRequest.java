package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzqk;
import defpackage.brn;
import defpackage.p23;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class IsOpenRequest implements zzqk {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public IsOpenRequest build() {
            boolean z;
            IsOpenRequest zza = zza();
            Place place = zza.getPlace();
            if (place != null) {
                if (place.getId() != null) {
                    z = true;
                } else {
                    z = false;
                }
                brn.g("Place must have a valid place id.", z);
            }
            return zza;
        }

        public abstract p23 getCancellationToken();

        public abstract Place getPlace();

        public abstract String getPlaceId();

        public abstract long getUtcTimeMillis();

        public abstract Builder setCancellationToken(p23 p23Var);

        public abstract Builder setPlace(Place place);

        public abstract Builder setPlaceId(String str);

        public abstract Builder setUtcTimeMillis(long j);

        public abstract IsOpenRequest zza();
    }

    public static Builder builder(Place place) {
        zzp zzpVar = new zzp();
        zzpVar.setPlace(place);
        zzpVar.setUtcTimeMillis(System.currentTimeMillis());
        return zzpVar;
    }

    public static IsOpenRequest newInstance(Place place) {
        return builder(place).build();
    }

    @Override // com.google.android.libraries.places.internal.zzqk
    public abstract p23 getCancellationToken();

    public abstract Place getPlace();

    public abstract String getPlaceId();

    public abstract long getUtcTimeMillis();

    public static IsOpenRequest newInstance(Place place, long j) {
        return builder(place, j).build();
    }

    public static IsOpenRequest newInstance(String str) {
        return builder(str).build();
    }

    public static IsOpenRequest newInstance(String str, long j) {
        return builder(str, j).build();
    }

    public static Builder builder(Place place, long j) {
        zzp zzpVar = new zzp();
        zzpVar.setPlace(place);
        zzpVar.setUtcTimeMillis(j);
        return zzpVar;
    }

    public static Builder builder(String str) {
        zzp zzpVar = new zzp();
        zzpVar.setPlaceId(str);
        zzpVar.setUtcTimeMillis(System.currentTimeMillis());
        return zzpVar;
    }

    public static Builder builder(String str, long j) {
        zzp zzpVar = new zzp();
        zzpVar.setPlaceId(str);
        zzpVar.setUtcTimeMillis(j);
        return zzpVar;
    }
}
