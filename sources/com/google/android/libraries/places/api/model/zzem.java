package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzem extends zzab {
    public static final Parcelable.Creator<zzem> CREATOR = new zzel();

    public zzem(String str, ConsumerAlertDetails consumerAlertDetails, String str2) {
        super(str, consumerAlertDetails, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (getOverview() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOverview());
        }
        parcel.writeParcelable(getDetails(), i);
        if (getLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getLanguageCode());
        }
    }
}
