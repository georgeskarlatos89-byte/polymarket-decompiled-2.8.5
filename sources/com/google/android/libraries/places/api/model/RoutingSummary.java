package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcelable;
import defpackage.jr9;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class RoutingSummary implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract RoutingSummary autoBuild();

        public RoutingSummary build() {
            setLegs(jr9.m(getLegs()));
            return autoBuild();
        }

        public abstract List<Leg> getLegs();

        public abstract Builder setDirectionsUri(Uri uri);

        public abstract Builder setLegs(List<Leg> list);
    }

    public static Builder builder(List<Leg> list) {
        zzcr zzcrVar = new zzcr();
        zzcrVar.setLegs(list);
        return zzcrVar;
    }

    public static RoutingSummary newInstance(List<Leg> list) {
        return builder(list).build();
    }

    public abstract Uri getDirectionsUri();

    public abstract List<Leg> getLegs();
}
