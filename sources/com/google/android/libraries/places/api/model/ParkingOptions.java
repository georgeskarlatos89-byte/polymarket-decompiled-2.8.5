package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ParkingOptions implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract ParkingOptions build();

        public abstract Place.BooleanPlaceAttributeValue getFreeGarageParking();

        public abstract Place.BooleanPlaceAttributeValue getFreeParkingLot();

        public abstract Place.BooleanPlaceAttributeValue getFreeStreetParking();

        public abstract Place.BooleanPlaceAttributeValue getPaidGarageParking();

        public abstract Place.BooleanPlaceAttributeValue getPaidParkingLot();

        public abstract Place.BooleanPlaceAttributeValue getPaidStreetParking();

        public abstract Place.BooleanPlaceAttributeValue getValetParking();

        public abstract Builder setFreeGarageParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setFreeParkingLot(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setFreeStreetParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setPaidGarageParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setPaidParkingLot(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setPaidStreetParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setValetParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);
    }

    public static Builder builder() {
        zzbm zzbmVar = new zzbm();
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = Place.BooleanPlaceAttributeValue.UNKNOWN;
        zzbmVar.setFreeParkingLot(booleanPlaceAttributeValue);
        zzbmVar.setPaidParkingLot(booleanPlaceAttributeValue);
        zzbmVar.setFreeStreetParking(booleanPlaceAttributeValue);
        zzbmVar.setPaidStreetParking(booleanPlaceAttributeValue);
        zzbmVar.setValetParking(booleanPlaceAttributeValue);
        zzbmVar.setFreeGarageParking(booleanPlaceAttributeValue);
        zzbmVar.setPaidGarageParking(booleanPlaceAttributeValue);
        return zzbmVar;
    }

    public abstract Place.BooleanPlaceAttributeValue getFreeGarageParking();

    public abstract Place.BooleanPlaceAttributeValue getFreeParkingLot();

    public abstract Place.BooleanPlaceAttributeValue getFreeStreetParking();

    public abstract Place.BooleanPlaceAttributeValue getPaidGarageParking();

    public abstract Place.BooleanPlaceAttributeValue getPaidParkingLot();

    public abstract Place.BooleanPlaceAttributeValue getPaidStreetParking();

    public abstract Place.BooleanPlaceAttributeValue getValetParking();
}
