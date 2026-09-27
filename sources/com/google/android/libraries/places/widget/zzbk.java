package com.google.android.libraries.places.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.widget.PlaceDetailsFragment;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i != readInt; i++) {
            arrayList.add(PlaceDetailsFragment.Content.valueOf(parcel.readString()));
        }
        return new zzbl(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbl[i];
    }
}
