package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzfg extends zzau {
    public static final Parcelable.Creator<zzfg> CREATOR = new zzff();

    public zzfg(String str, String str2, Uri uri, String str3, String str4) {
        super(str, str2, uri, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (getOverview() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOverview());
        }
        if (getOverviewLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOverviewLanguageCode());
        }
        parcel.writeParcelable(getFlagContentUri(), i);
        if (getDisclosureText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDisclosureText());
        }
        if (getDisclosureTextLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDisclosureTextLanguageCode());
        }
    }
}
