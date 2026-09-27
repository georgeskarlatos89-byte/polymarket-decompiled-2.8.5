package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class d extends l0 {
    public static final Parcelable.Creator<d> CREATOR = new Object();
    public boolean c;
    public boolean d;
    public int e;
    public float f;
    public boolean g;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z;
        boolean z2;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.d = z2;
        this.e = parcel.readInt();
        this.f = parcel.readFloat();
        this.g = parcel.readByte() != 0;
    }

    @Override // defpackage.l0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
    }
}
