package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzfi extends zzaw {
    public static final Parcelable.Creator<zzfi> CREATOR = new zzfh();

    public zzfi(Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5) {
        super(uri, uri2, uri3, uri4, uri5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getDirectionsUri(), i);
        parcel.writeParcelable(getPlaceUri(), i);
        parcel.writeParcelable(getWriteAReviewUri(), i);
        parcel.writeParcelable(getReviewsUri(), i);
        parcel.writeParcelable(getPhotosUri(), i);
    }
}
