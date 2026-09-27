package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzec extends zzt {
    public static final Parcelable.Creator<zzec> CREATOR = new zzeb();

    public zzec(String str, Integer num, List list, String str2, String str3, String str4, List list2, List list3, List list4) {
        super(str, num, list, str2, str3, str4, list2, list3, list4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getPlaceId());
        if (getDistanceMeters() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getDistanceMeters().intValue());
        }
        parcel.writeList(getTypes());
        parcel.writeString(zza());
        parcel.writeString(zzb());
        parcel.writeString(zzc());
        parcel.writeList(zzd());
        parcel.writeList(zze());
        parcel.writeList(zzf());
    }
}
