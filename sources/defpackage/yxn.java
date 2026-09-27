package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class yxn extends g5 {
    public static final Parcelable.Creator<yxn> CREATOR = new upn(14);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final String f;
    public final boolean g;

    public yxn(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.e = i;
        this.d = z;
        this.g = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.j(parcel, 1, this.a);
        hxn.j(parcel, 2, this.b);
        hxn.j(parcel, 3, this.c);
        hxn.o(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        hxn.o(parcel, 5, 4);
        parcel.writeInt(this.e);
        hxn.j(parcel, 6, this.f);
        hxn.o(parcel, 7, 4);
        parcel.writeInt(this.g ? 1 : 0);
        hxn.q(parcel, p);
    }
}
