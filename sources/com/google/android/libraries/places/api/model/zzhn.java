package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzhn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        LocalDate localDate = (LocalDate) parcel.readParcelable(TimeOfWeek.class.getClassLoader());
        DayOfWeek dayOfWeek = (DayOfWeek) parcel.readParcelable(TimeOfWeek.class.getClassLoader());
        LocalTime localTime = (LocalTime) parcel.readParcelable(TimeOfWeek.class.getClassLoader());
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new zzho(localDate, dayOfWeek, localTime, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzho[i];
    }
}
