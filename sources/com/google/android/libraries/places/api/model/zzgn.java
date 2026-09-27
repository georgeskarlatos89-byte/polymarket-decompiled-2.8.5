package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzgn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String readString = parcel.readString();
        String str7 = null;
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
            str5 = parcel.readString();
        } else {
            str5 = null;
        }
        if (parcel.readInt() == 0) {
            str6 = parcel.readString();
        } else {
            str6 = null;
        }
        ArrayList readArrayList = parcel.readArrayList(PostalAddress.class.getClassLoader());
        ArrayList readArrayList2 = parcel.readArrayList(PostalAddress.class.getClassLoader());
        if (parcel.readInt() == 0) {
            str7 = parcel.readString();
        }
        return new zzgo(readString, str, str2, str3, str4, str5, str6, readArrayList, readArrayList2, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzgo[i];
    }
}
