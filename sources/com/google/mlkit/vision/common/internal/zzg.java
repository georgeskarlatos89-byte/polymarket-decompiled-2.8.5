package com.google.mlkit.vision.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fxn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int v = fxn.v(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        while (parcel.dataPosition() < v) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                fxn.u(parcel, readInt);
                            } else {
                                i4 = fxn.q(parcel, readInt);
                            }
                        } else {
                            j = fxn.s(parcel, readInt);
                        }
                    } else {
                        i3 = fxn.q(parcel, readInt);
                    }
                } else {
                    i2 = fxn.q(parcel, readInt);
                }
            } else {
                i = fxn.q(parcel, readInt);
            }
        }
        fxn.l(parcel, v);
        return new VisionImageMetadataParcel(i, i2, i3, j, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VisionImageMetadataParcel[i];
    }
}
