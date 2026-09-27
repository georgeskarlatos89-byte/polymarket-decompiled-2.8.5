package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzfv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        ContentBlock contentBlock = (ContentBlock) parcel.readParcelable(NeighborhoodSummary.class.getClassLoader());
        ContentBlock contentBlock2 = (ContentBlock) parcel.readParcelable(NeighborhoodSummary.class.getClassLoader());
        Uri uri = (Uri) parcel.readParcelable(NeighborhoodSummary.class.getClassLoader());
        String str2 = null;
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        } else {
            str = null;
        }
        if (parcel.readInt() == 0) {
            str2 = parcel.readString();
        }
        return new zzfw(contentBlock, contentBlock2, uri, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfw[i];
    }
}
