package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzsq implements Parcelable {
    public static final Parcelable.Creator<zzsq> CREATOR = new zzsp();
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzsq(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzsq)) {
            return false;
        }
        zzsq zzsqVar = (zzsq) obj;
        if (this.zza == zzsqVar.zza && this.zzb == zzsqVar.zzb && this.zzc == zzsqVar.zzc && this.zzd == zzsqVar.zzd && this.zze == zzsqVar.zze) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.zzb) + (Boolean.hashCode(this.zza) * 31);
        int hashCode2 = Boolean.hashCode(this.zzc) + (hashCode * 31);
        int hashCode3 = Boolean.hashCode(this.zzd);
        return Boolean.hashCode(this.zze) + ((hashCode3 + (hashCode2 * 31)) * 31);
    }

    public final String toString() {
        boolean z = this.zza;
        int length = String.valueOf(z).length();
        boolean z2 = this.zzb;
        int length2 = String.valueOf(z2).length();
        boolean z3 = this.zzc;
        int length3 = String.valueOf(z3).length();
        boolean z4 = this.zzd;
        int length4 = String.valueOf(z4).length();
        boolean z5 = this.zze;
        StringBuilder sb = new StringBuilder(length + 80 + length2 + 29 + length3 + 23 + length4 + 29 + String.valueOf(z5).length() + 1);
        sb.append("AutocompleteThemeCustomization(isCustomColorApplied=");
        sb.append(z);
        sb.append(", isCustomTypographyApplied=");
        sb.append(z2);
        sb.append(", isCustomMeasurementApplied=");
        sb.append(z3);
        sb.append(", isCustomShapeApplied=");
        sb.append(z4);
        sb.append(", isCustomAttributionApplied=");
        sb.append(z5);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.zza ? 1 : 0);
        parcel.writeInt(this.zzb ? 1 : 0);
        parcel.writeInt(this.zzc ? 1 : 0);
        parcel.writeInt(this.zzd ? 1 : 0);
        parcel.writeInt(this.zze ? 1 : 0);
    }

    public final boolean zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zze;
    }

    public zzsq() {
        this(false, false, false, false, false);
    }
}
