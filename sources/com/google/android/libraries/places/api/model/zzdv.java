package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzdv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        String str2;
        String str3;
        String str4 = null;
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
        }
        return new zzdw(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdw[i];
    }
}
