package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzes extends zzah {
    public static final Parcelable.Creator<zzes> CREATOR = new zzer();

    public zzes(String str, String str2, List list, List list2) {
        super(str, str2, list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (getContent() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getContent());
        }
        if (getContentLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getContentLanguageCode());
        }
        parcel.writeList(getReferencedPlaceResourceNames());
        parcel.writeList(getReferencedPlaceIds());
    }
}
