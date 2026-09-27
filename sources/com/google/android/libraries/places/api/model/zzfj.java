package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Landmark;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzfj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        String str2;
        String str3;
        String str4;
        Landmark.SpatialRelationship spatialRelationship;
        Double d;
        Double d2 = null;
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        } else {
            str = null;
        }
        if (parcel.readInt() == 0) {
            str2 = parcel.readString();
        } else {
            str2 = null;
        }
        if (parcel.readInt() == 0) {
            str3 = parcel.readString();
        } else {
            str3 = null;
        }
        if (parcel.readInt() == 0) {
            str4 = parcel.readString();
        } else {
            str4 = null;
        }
        ArrayList readArrayList = parcel.readArrayList(Landmark.class.getClassLoader());
        if (parcel.readInt() == 0) {
            spatialRelationship = (Landmark.SpatialRelationship) Enum.valueOf(Landmark.SpatialRelationship.class, parcel.readString());
        } else {
            spatialRelationship = null;
        }
        if (parcel.readInt() == 0) {
            d = Double.valueOf(parcel.readDouble());
        } else {
            d = null;
        }
        if (parcel.readInt() == 0) {
            d2 = Double.valueOf(parcel.readDouble());
        }
        return new zzfk(str, str2, str3, str4, readArrayList, spatialRelationship, d, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfk[i];
    }
}
