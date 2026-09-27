package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dcn extends g5 {
    public static final Parcelable.Creator<dcn> CREATOR = new num(11);
    public final String a;
    public final long b;
    public final int c;

    public dcn(int i, long j, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.j(parcel, 1, this.a);
        hxn.o(parcel, 2, 8);
        parcel.writeLong(this.b);
        hxn.o(parcel, 3, 4);
        parcel.writeInt(this.c);
        hxn.q(parcel, p);
    }
}
