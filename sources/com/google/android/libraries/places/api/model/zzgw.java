package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzgw extends zzci {
    public static final Parcelable.Creator<zzgw> CREATOR = new zzgv();

    public zzgw(String str, zzdg zzdgVar, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, LocalDate localDate) {
        super(str, zzdgVar, num, str2, str3, str4, str5, str6, str7, str8, str9, localDate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(zza());
        parcel.writeParcelable(zzb(), i);
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
        if (zzf() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzf());
        }
        if (zzg() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzg());
        }
        if (zzh() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzh());
        }
        if (zzi() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzi());
        }
        if (zzj() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzj());
        }
        if (zzk() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzk());
        }
        parcel.writeParcelable(zzl(), i);
    }
}
