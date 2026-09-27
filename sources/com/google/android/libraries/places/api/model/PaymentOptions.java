package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Place;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class PaymentOptions implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract PaymentOptions build();

        public abstract Place.BooleanPlaceAttributeValue getAcceptsCashOnly();

        public abstract Place.BooleanPlaceAttributeValue getAcceptsCreditCards();

        public abstract Place.BooleanPlaceAttributeValue getAcceptsDebitCards();

        public abstract Place.BooleanPlaceAttributeValue getAcceptsNfc();

        public abstract Builder setAcceptsCashOnly(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setAcceptsCreditCards(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setAcceptsDebitCards(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setAcceptsNfc(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);
    }

    public static Builder builder() {
        zzbo zzboVar = new zzbo();
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = Place.BooleanPlaceAttributeValue.UNKNOWN;
        zzboVar.setAcceptsCreditCards(booleanPlaceAttributeValue);
        zzboVar.setAcceptsDebitCards(booleanPlaceAttributeValue);
        zzboVar.setAcceptsCashOnly(booleanPlaceAttributeValue);
        zzboVar.setAcceptsNfc(booleanPlaceAttributeValue);
        return zzboVar;
    }

    public abstract Place.BooleanPlaceAttributeValue getAcceptsCashOnly();

    public abstract Place.BooleanPlaceAttributeValue getAcceptsCreditCards();

    public abstract Place.BooleanPlaceAttributeValue getAcceptsDebitCards();

    public abstract Place.BooleanPlaceAttributeValue getAcceptsNfc();
}
