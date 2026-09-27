package com.google.android.libraries.places.internal;

import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzwl {
    public static final zzaxy zza(Parcel parcel) {
        parcel.getClass();
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        return zzaxy.zza(createByteArray);
    }

    public static final void zzb(zzaxy zzaxyVar, Parcel parcel, int i) {
        byte[] bArr;
        parcel.getClass();
        if (zzaxyVar != null) {
            bArr = zzaxyVar.zzbs();
        } else {
            bArr = null;
        }
        parcel.writeByteArray(bArr);
    }
}
