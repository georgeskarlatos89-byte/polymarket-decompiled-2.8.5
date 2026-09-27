package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class e2o extends g5 {
    public static final Parcelable.Creator<e2o> CREATOR = new t1o(7);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public e2o(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        hxn.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        hxn.o(parcel, 3, 4);
        parcel.writeInt(this.c);
        hxn.o(parcel, 4, 4);
        parcel.writeInt(this.d);
        hxn.o(parcel, 5, 8);
        parcel.writeLong(this.e);
        hxn.q(parcel, p);
    }
}
