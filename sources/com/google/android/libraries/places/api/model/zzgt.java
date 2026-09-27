package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzgt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = null;
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
        Double valueOf = Double.valueOf(parcel.readDouble());
        AuthorAttribution authorAttribution = (AuthorAttribution) parcel.readParcelable(Review.class.getClassLoader());
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            str6 = parcel.readString();
        }
        return new zzgu(str, str2, str3, str4, str5, valueOf, authorAttribution, readString, str6, (Uri) parcel.readParcelable(Review.class.getClassLoader()), (LocalDate) parcel.readParcelable(Review.class.getClassLoader()), (Uri) parcel.readParcelable(Review.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzgu[i];
    }
}
