package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class sfc extends g5 {
    public static final Parcelable.Creator<sfc> CREATOR = new iek(18);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public sfc(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
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
        hxn.o(parcel, 4, 8);
        parcel.writeLong(this.d);
        hxn.o(parcel, 5, 8);
        parcel.writeLong(this.e);
        hxn.j(parcel, 6, this.f);
        hxn.j(parcel, 7, this.g);
        hxn.o(parcel, 8, 4);
        parcel.writeInt(this.h);
        hxn.o(parcel, 9, 4);
        parcel.writeInt(this.i);
        hxn.q(parcel, p);
    }
}
