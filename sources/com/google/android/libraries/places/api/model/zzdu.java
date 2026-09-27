package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzdu extends zzm {
    public static final Parcelable.Creator<zzdu> CREATOR = new zzdt();

    public zzdu(String str, Integer num, Integer num2, String str2, String str3) {
        super(str, num, num2, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (zza() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zza());
        }
        if (zzb() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(zzb().intValue());
        }
        if (zzc() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(zzc().intValue());
        }
        if (zzd() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzd());
        }
        if (zze() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zze());
        }
    }
}
