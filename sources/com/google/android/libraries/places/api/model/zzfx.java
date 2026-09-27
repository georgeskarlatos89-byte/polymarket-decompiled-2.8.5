package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.OpeningHours;
import java.time.Instant;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzfx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean bool;
        Instant instant;
        OpeningHours.HoursType hoursType = (OpeningHours.HoursType) parcel.readParcelable(OpeningHours.class.getClassLoader());
        ArrayList readArrayList = parcel.readArrayList(OpeningHours.class.getClassLoader());
        ArrayList readArrayList2 = parcel.readArrayList(OpeningHours.class.getClassLoader());
        ArrayList readArrayList3 = parcel.readArrayList(OpeningHours.class.getClassLoader());
        Instant instant2 = null;
        if (parcel.readInt() == 0) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (parcel.readInt() == 0) {
            instant = (Instant) parcel.readSerializable();
        } else {
            instant = null;
        }
        if (parcel.readInt() == 0) {
            instant2 = (Instant) parcel.readSerializable();
        }
        return new zzfy(hoursType, readArrayList, readArrayList2, readArrayList3, bool, instant, instant2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfy[i];
    }
}
