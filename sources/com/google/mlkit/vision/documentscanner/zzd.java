package com.google.mlkit.vision.documentscanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zze(parcel.readArrayList(GmsDocumentScanningResult.class.getClassLoader()), (GmsDocumentScanningResult.Pdf) parcel.readParcelable(GmsDocumentScanningResult.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
