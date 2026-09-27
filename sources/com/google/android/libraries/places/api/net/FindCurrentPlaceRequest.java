package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzqk;
import defpackage.jr9;
import defpackage.p23;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes3.dex */
public abstract class FindCurrentPlaceRequest implements zzqk {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Deprecated
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public FindCurrentPlaceRequest build() {
            zza(jr9.m(zzb().getPlaceFields()));
            return zzb();
        }

        public abstract p23 getCancellationToken();

        public abstract Builder setCancellationToken(p23 p23Var);

        public abstract Builder zza(List list);

        public abstract FindCurrentPlaceRequest zzb();
    }

    public static Builder builder(List<Place.Field> list) {
        zzm zzmVar = new zzm();
        zzmVar.zza(list);
        return zzmVar;
    }

    public static FindCurrentPlaceRequest newInstance(List<Place.Field> list) {
        return builder(list).build();
    }

    @Override // com.google.android.libraries.places.internal.zzqk
    public abstract p23 getCancellationToken();

    public abstract List<Place.Field> getPlaceFields();
}
