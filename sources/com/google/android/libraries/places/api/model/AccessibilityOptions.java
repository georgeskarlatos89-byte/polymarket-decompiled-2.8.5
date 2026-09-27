package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class AccessibilityOptions implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract AccessibilityOptions build();

        public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance();

        public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleParking();

        public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleRestroom();

        public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleSeating();

        public abstract Builder setWheelchairAccessibleEntrance(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setWheelchairAccessibleParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setWheelchairAccessibleRestroom(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setWheelchairAccessibleSeating(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);
    }

    public static Builder builder() {
        zza zzaVar = new zza();
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = Place.BooleanPlaceAttributeValue.UNKNOWN;
        zzaVar.setWheelchairAccessibleEntrance(booleanPlaceAttributeValue);
        zzaVar.setWheelchairAccessibleRestroom(booleanPlaceAttributeValue);
        zzaVar.setWheelchairAccessibleParking(booleanPlaceAttributeValue);
        zzaVar.setWheelchairAccessibleSeating(booleanPlaceAttributeValue);
        return zzaVar;
    }

    public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance();

    public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleParking();

    public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleRestroom();

    public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleSeating();
}
