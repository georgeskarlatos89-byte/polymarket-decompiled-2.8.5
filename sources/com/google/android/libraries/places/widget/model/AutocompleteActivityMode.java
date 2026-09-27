package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes3.dex */
public enum AutocompleteActivityMode implements Parcelable {
    FULLSCREEN,
    OVERLAY;

    public static final Parcelable.Creator<AutocompleteActivityMode> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.widget.model.zzn
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return AutocompleteActivityMode.valueOf(readString);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AutocompleteActivityMode[i];
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
