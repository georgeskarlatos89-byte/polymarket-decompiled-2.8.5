package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class x9g extends g5 {
    public static final Parcelable.Creator<x9g> CREATOR = new o4l(27);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public x9g(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        hxn.o(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        hxn.o(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        hxn.o(parcel, 4, 4);
        parcel.writeInt(this.d);
        hxn.o(parcel, 5, 4);
        parcel.writeInt(this.e);
        hxn.q(parcel, p);
    }
}
