package com.google.mlkit.vision.documentscanner;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzi extends zzc {
    public static final Parcelable.Creator<zzi> CREATOR = new zzh();

    public zzi(Uri uri, int i) {
        super(uri, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getUri(), i);
        parcel.writeInt(getPageCount());
    }
}
