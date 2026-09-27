package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzsx implements Parcelable {
    FRAGMENT,
    INTENT;

    public static final Parcelable.Creator<zzsx> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.internal.zzsw
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return (zzsx) Enum.valueOf(zzsx.class, readString);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzsx[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
