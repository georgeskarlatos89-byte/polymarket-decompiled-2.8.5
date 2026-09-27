package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class x0o extends g5 {
    public static final Parcelable.Creator<x0o> CREATOR = new t1o(0);
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public x0o(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        hxn.j(parcel, 2, this.b);
        hxn.j(parcel, 3, this.c);
        hxn.j(parcel, 4, this.d);
        hxn.q(parcel, p);
    }
}
