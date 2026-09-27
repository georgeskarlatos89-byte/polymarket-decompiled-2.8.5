package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class FuelPrice implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract FuelPrice build();

        public abstract Builder setPrice(Money money);

        public abstract Builder setType(FuelType fuelType);

        public abstract Builder setUpdateTime(Instant instant);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum FuelType implements Parcelable {
        FUEL_TYPE_UNSPECIFIED,
        DIESEL,
        DIESEL_PLUS,
        REGULAR_UNLEADED,
        MIDGRADE,
        PREMIUM,
        SP91,
        SP91_E10,
        SP92,
        SP95,
        SP95_E10,
        SP98,
        SP99,
        SP100,
        LPG,
        E80,
        E85,
        E100,
        METHANE,
        BIO_DIESEL,
        TRUCK_DIESEL;

        public static final Parcelable.Creator<FuelType> CREATOR = new zzht();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public static FuelPrice newInstance(FuelType fuelType, Money money, Instant instant) {
        zzar zzarVar = new zzar();
        zzarVar.setType(fuelType);
        zzarVar.setPrice(money);
        zzarVar.setUpdateTime(instant);
        return zzarVar.build();
    }

    public abstract Money getPrice();

    public abstract FuelType getType();

    public abstract Instant getUpdateTime();
}
