package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Area;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzdp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        String str2;
        String str3;
        String str4;
        Area.Containment containment = null;
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        } else {
            str = null;
        }
        if (parcel.readInt() == 0) {
            str2 = parcel.readString();
        } else {
            str2 = null;
        }
        if (parcel.readInt() == 0) {
            str3 = parcel.readString();
        } else {
            str3 = null;
        }
        if (parcel.readInt() == 0) {
            str4 = parcel.readString();
        } else {
            str4 = null;
        }
        if (parcel.readInt() == 0) {
            containment = (Area.Containment) Enum.valueOf(Area.Containment.class, parcel.readString());
        }
        return new zzdq(str, str2, str3, str4, containment);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdq[i];
    }
}
