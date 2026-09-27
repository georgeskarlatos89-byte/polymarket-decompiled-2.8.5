package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.FuelPrice;
import java.time.Instant;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzfe extends zzas {
    public static final Parcelable.Creator<zzfe> CREATOR = new zzfd();

    public zzfe(FuelPrice.FuelType fuelType, Money money, Instant instant) {
        super(fuelType, money, instant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getType(), i);
        parcel.writeParcelable(getPrice(), i);
        parcel.writeSerializable(getUpdateTime());
    }
}
