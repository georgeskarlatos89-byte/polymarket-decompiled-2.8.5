package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzew extends zzal {
    public static final Parcelable.Creator<zzew> CREATOR = new zzev();

    public zzew(Double d, List list) {
        super(d, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (getMinimumChargingRateKw() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(getMinimumChargingRateKw().doubleValue());
        }
        parcel.writeList(getConnectorTypes());
    }
}
