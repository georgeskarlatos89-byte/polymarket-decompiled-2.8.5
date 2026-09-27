package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzez implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        ContentBlock contentBlock = (ContentBlock) parcel.readParcelable(EvChargeAmenitySummary.class.getClassLoader());
        ContentBlock contentBlock2 = (ContentBlock) parcel.readParcelable(EvChargeAmenitySummary.class.getClassLoader());
        ContentBlock contentBlock3 = (ContentBlock) parcel.readParcelable(EvChargeAmenitySummary.class.getClassLoader());
        ContentBlock contentBlock4 = (ContentBlock) parcel.readParcelable(EvChargeAmenitySummary.class.getClassLoader());
        Uri uri = (Uri) parcel.readParcelable(EvChargeAmenitySummary.class.getClassLoader());
        String str2 = null;
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        } else {
            str = null;
        }
        if (parcel.readInt() == 0) {
            str2 = parcel.readString();
        }
        return new zzfa(contentBlock, contentBlock2, contentBlock3, contentBlock4, uri, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfa[i];
    }
}
