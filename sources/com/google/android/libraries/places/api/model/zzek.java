package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzek extends zzz {
    public static final Parcelable.Creator<zzek> CREATOR = new zzej();

    public zzek(EVConnectorType eVConnectorType, Double d, Integer num, Integer num2, Integer num3, Instant instant) {
        super(eVConnectorType, d, num, num2, num3, instant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getType(), i);
        parcel.writeDouble(getMaxChargeRateKw().doubleValue());
        parcel.writeInt(getCount().intValue());
        if (getAvailableCount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getAvailableCount().intValue());
        }
        if (getOutOfServiceCount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getOutOfServiceCount().intValue());
        }
        if (getAvailabilityLastUpdateTime() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(getAvailabilityLastUpdateTime());
        }
    }
}
