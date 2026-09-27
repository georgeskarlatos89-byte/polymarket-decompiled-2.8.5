package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzhc extends zzco {
    public static final Parcelable.Creator<zzhc> CREATOR = new zzhb();

    public zzhc(boolean z, boolean z2, boolean z3, boolean z4) {
        super(z, z2, z3, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(isTollAvoided() ? 1 : 0);
        parcel.writeInt(isHighwayAvoided() ? 1 : 0);
        parcel.writeInt(isFerryAvoided() ? 1 : 0);
        parcel.writeInt(isIndoorAvoided() ? 1 : 0);
    }
}
