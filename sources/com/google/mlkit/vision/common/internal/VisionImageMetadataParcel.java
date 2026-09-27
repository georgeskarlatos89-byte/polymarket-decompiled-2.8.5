package com.google.mlkit.vision.common.internal;

import android.graphics.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.g5;
import defpackage.hxn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class VisionImageMetadataParcel extends g5 {
    public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new zzg();
    public final int height;
    public final int rotation;
    public final long timestampMillis;
    public final int width;
    public final int zza;

    public VisionImageMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.width = i;
        this.height = i2;
        this.zza = i3;
        this.timestampMillis = j;
        this.rotation = i4;
    }

    public Matrix getUprightRotationMatrix() {
        return ImageUtils.getInstance().getUprightRotationMatrix(this.width, this.height, this.rotation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        int i2 = this.width;
        hxn.o(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.height;
        hxn.o(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.zza;
        hxn.o(parcel, 3, 4);
        parcel.writeInt(i4);
        long j = this.timestampMillis;
        hxn.o(parcel, 4, 8);
        parcel.writeLong(j);
        int i5 = this.rotation;
        hxn.o(parcel, 5, 4);
        parcel.writeInt(i5);
        hxn.q(parcel, p);
    }
}
