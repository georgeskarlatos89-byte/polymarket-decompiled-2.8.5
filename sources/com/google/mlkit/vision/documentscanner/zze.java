package com.google.mlkit.vision.documentscanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zze extends zza {
    public static final Parcelable.Creator<zze> CREATOR = new zzd();

    public zze(List list, GmsDocumentScanningResult.Pdf pdf) {
        super(list, pdf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getPages());
        parcel.writeParcelable(getPdf(), i);
    }
}
