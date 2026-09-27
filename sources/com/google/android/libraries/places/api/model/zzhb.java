package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzhb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        boolean z4 = false;
        if (readInt == 1) {
            z = true;
        } else {
            z = false;
        }
        if (readInt2 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (readInt3 == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (readInt4 == 1) {
            z4 = true;
        }
        return new zzhc(z, z2, z3, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzhc[i];
    }
}
