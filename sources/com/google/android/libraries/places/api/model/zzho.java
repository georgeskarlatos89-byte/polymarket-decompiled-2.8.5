package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzho extends zzcz {
    public static final Parcelable.Creator<zzho> CREATOR = new zzhn();

    public zzho(LocalDate localDate, DayOfWeek dayOfWeek, LocalTime localTime, boolean z) {
        super(localDate, dayOfWeek, localTime, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getDate(), i);
        parcel.writeParcelable(getDay(), i);
        parcel.writeParcelable(getTime(), i);
        parcel.writeInt(isTruncated() ? 1 : 0);
    }
}
