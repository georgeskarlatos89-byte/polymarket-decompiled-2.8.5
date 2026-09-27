package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzej implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num;
        Integer num2;
        EVConnectorType eVConnectorType = (EVConnectorType) parcel.readParcelable(ConnectorAggregation.class.getClassLoader());
        Double valueOf = Double.valueOf(parcel.readDouble());
        Integer valueOf2 = Integer.valueOf(parcel.readInt());
        Instant instant = null;
        if (parcel.readInt() == 0) {
            num = Integer.valueOf(parcel.readInt());
        } else {
            num = null;
        }
        if (parcel.readInt() == 0) {
            num2 = Integer.valueOf(parcel.readInt());
        } else {
            num2 = null;
        }
        if (parcel.readInt() == 0) {
            instant = (Instant) parcel.readSerializable();
        }
        return new zzek(eVConnectorType, valueOf, valueOf2, num, num2, instant);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzek[i];
    }
}
