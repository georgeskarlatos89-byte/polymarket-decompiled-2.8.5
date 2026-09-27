package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzeo extends zzad {
    public static final Parcelable.Creator<zzeo> CREATOR = new zzen();

    public zzeo(String str, String str2, String str3, Uri uri) {
        super(str, str2, str3, uri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (getTitle() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getTitle());
        }
        if (getDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDescription());
        }
        if (getAboutLinkTitle() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAboutLinkTitle());
        }
        parcel.writeParcelable(getAboutLinkUri(), i);
    }
}
