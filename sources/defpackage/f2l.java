package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class f2l extends g5 {
    public static final Parcelable.Creator<f2l> CREATOR = new iek(11);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public f2l(int i, int i2, long j, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        hxn.j(parcel, 2, this.b);
        hxn.o(parcel, 3, 8);
        parcel.writeLong(this.c);
        hxn.o(parcel, 4, 4);
        parcel.writeInt(this.d);
        hxn.o(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        hxn.q(parcel, p);
    }
}
