package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzfc extends zzaq {
    public static final Parcelable.Creator<zzfc> CREATOR = new zzfb();

    public zzfc(List list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getFuelPrices());
    }
}
