package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.woa;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = woa.e(zze.CREATOR, parcel, arrayList, i, 1);
        }
        return new zzq(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
