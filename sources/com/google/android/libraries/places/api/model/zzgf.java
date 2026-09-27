package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzgf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        } else {
            str = null;
        }
        return new zzgg(readString, readInt, readInt2, readString2, str, (AuthorAttributions) parcel.readParcelable(PhotoMetadata.class.getClassLoader()), (Uri) parcel.readParcelable(PhotoMetadata.class.getClassLoader()), (Uri) parcel.readParcelable(PhotoMetadata.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzgg[i];
    }
}
