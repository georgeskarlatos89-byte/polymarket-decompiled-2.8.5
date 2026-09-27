package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum DayOfWeek implements Parcelable {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public static final Parcelable.Creator<DayOfWeek> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.api.model.zzhr
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
            String readString = parcel.readString();
            readString.getClass();
            return DayOfWeek.valueOf(readString);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new DayOfWeek[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
