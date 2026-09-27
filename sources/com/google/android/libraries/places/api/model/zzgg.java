package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzgg extends zzbt {
    public static final Parcelable.Creator<zzgg> CREATOR = new zzgf();

    public zzgg(String str, int i, int i2, String str2, String str3, AuthorAttributions authorAttributions, Uri uri, Uri uri2) {
        super(str, i, i2, str2, str3, authorAttributions, uri, uri2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getAttributions());
        parcel.writeInt(getHeight());
        parcel.writeInt(getWidth());
        parcel.writeString(zza());
        if (zzb() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzb());
        }
        parcel.writeParcelable(getAuthorAttributions(), i);
        parcel.writeParcelable(getFlagContentUri(), i);
        parcel.writeParcelable(getGoogleMapsUri(), i);
    }
}
