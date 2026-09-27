package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzfs extends zzbf {
    public static final Parcelable.Creator<zzfs> CREATOR = new zzfr();

    public zzfs(String str, zzdg zzdgVar, zzde zzdeVar) {
        super(str, zzdgVar, zzdeVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(zza());
        parcel.writeParcelable(zzb(), i);
        parcel.writeParcelable(zzc(), i);
    }
}
