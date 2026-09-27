package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class o8m extends g5 {
    public static final Parcelable.Creator<o8m> CREATOR = new rwl(15);
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final float f;

    public o8m(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
        this.f = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 2, 4);
        parcel.writeInt(this.a);
        hxn.o(parcel, 3, 4);
        parcel.writeInt(this.b);
        hxn.o(parcel, 4, 4);
        parcel.writeInt(this.c);
        hxn.o(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        hxn.o(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        hxn.o(parcel, 7, 4);
        parcel.writeFloat(this.f);
        hxn.q(parcel, p);
    }
}
