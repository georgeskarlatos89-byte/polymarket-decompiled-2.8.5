package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ix2;
import defpackage.k84;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zze implements Parcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzd();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    public zze(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        if (Intrinsics.areEqual(this.zza, zzeVar.zza) && Intrinsics.areEqual(this.zzb, zzeVar.zzb) && Intrinsics.areEqual(this.zzc, zzeVar.zzc) && Intrinsics.areEqual(this.zzd, zzeVar.zzd) && Intrinsics.areEqual(this.zze, zzeVar.zze) && Intrinsics.areEqual(this.zzf, zzeVar.zzf) && Intrinsics.areEqual(this.zzg, zzeVar.zzg)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.zza.hashCode() * 31;
        String str = this.zzb;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        String str2 = this.zzc;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.zzd;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.zze;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.zzf;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.zzg;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzc;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzd;
        int length4 = String.valueOf(str4).length();
        String str5 = this.zze;
        int length5 = String.valueOf(str5).length();
        String str6 = this.zzf;
        int length6 = String.valueOf(str6).length();
        String str7 = this.zzg;
        StringBuilder sb = new StringBuilder(length + 43 + length2 + 17 + length3 + 18 + length4 + 15 + length5 + 17 + length6 + 16 + String.valueOf(str7).length() + 1);
        k84.q(sb, "PhotoPageData(photoUri=", str, ", photoThumbnailUri=", str2);
        k84.q(sb, ", reportPhotoUri=", str3, ", userDisplayName=", str4);
        k84.q(sb, ", userImageUri=", str5, ", userProfileUri=", str6);
        return ix2.p(sb, ", googleMapsUri=", str7, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        parcel.writeString(this.zze);
        parcel.writeString(this.zzf);
        parcel.writeString(this.zzg);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzg;
    }
}
