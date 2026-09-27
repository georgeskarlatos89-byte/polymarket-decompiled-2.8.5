package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import defpackage.jr9;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class Landmark implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public Landmark build() {
            List zza = zza();
            if (zza != null) {
                setTypes(jr9.m(zza));
            }
            return zzb();
        }

        public abstract Builder setDisplayName(String str);

        public abstract Builder setDisplayNameLanguageCode(String str);

        public abstract Builder setId(String str);

        public abstract Builder setResourceName(String str);

        public abstract Builder setSpatialRelationship(SpatialRelationship spatialRelationship);

        public abstract Builder setStraightLineDistanceMeters(Double d);

        public abstract Builder setTravelDistanceMeters(Double d);

        public abstract Builder setTypes(List<String> list);

        public abstract List zza();

        public abstract Landmark zzb();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum SpatialRelationship {
        NEAR,
        WITHIN,
        BESIDE,
        ACROSS_THE_ROAD,
        DOWN_THE_ROAD,
        AROUND_THE_CORNER,
        BEHIND
    }

    public static Builder builder() {
        return new zzax();
    }

    public abstract String getDisplayName();

    public abstract String getDisplayNameLanguageCode();

    public abstract String getId();

    public abstract String getResourceName();

    public abstract SpatialRelationship getSpatialRelationship();

    public abstract Double getStraightLineDistanceMeters();

    public abstract Double getTravelDistanceMeters();

    public abstract List<String> getTypes();
}
