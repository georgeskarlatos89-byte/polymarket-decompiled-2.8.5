package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzsp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        parcel.getClass();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        boolean z5 = false;
        boolean z6 = true;
        if (readInt != 0) {
            i = readInt2;
            z = true;
        } else {
            i = readInt2;
            z = false;
        }
        if (i != 0) {
            i2 = readInt3;
            z2 = true;
        } else {
            i2 = readInt3;
            z2 = false;
        }
        if (i2 != 0) {
            i3 = readInt4;
            z3 = true;
        } else {
            i3 = readInt4;
            z3 = false;
        }
        if (i3 != 0) {
            z4 = false;
            z5 = true;
        } else {
            z4 = false;
        }
        if (readInt5 == 0) {
            z6 = z4;
        }
        return new zzsq(z, z2, z3, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsq[i];
    }
}
