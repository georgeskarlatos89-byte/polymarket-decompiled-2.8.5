package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzdj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        } else {
            str = null;
        }
        return new zzdk(readString, str, parcel.readArrayList(AddressComponent.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdk[i];
    }
}
