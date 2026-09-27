package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzgv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String readString = parcel.readString();
        zzdg zzdgVar = (zzdg) parcel.readParcelable(zzig.class.getClassLoader());
        String str8 = null;
        if (parcel.readInt() == 0) {
            num = Integer.valueOf(parcel.readInt());
        } else {
            num = null;
        }
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
        if (parcel.readInt() == 0) {
            str7 = parcel.readString();
        } else {
            str7 = null;
        }
        if (parcel.readInt() == 0) {
            str8 = parcel.readString();
        }
        return new zzgw(readString, zzdgVar, num, str, str2, str3, str4, str5, str6, str7, str8, (LocalDate) parcel.readParcelable(zzig.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzgw[i];
    }
}
