package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import defpackage.qp7;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return Transport.e(parcel.readString());
        } catch (Transport.a e) {
            qp7.n(e);
            return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Transport[i];
    }
}
