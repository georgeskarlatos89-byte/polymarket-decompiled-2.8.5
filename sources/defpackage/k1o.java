package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class k1o extends g5 {
    public static final Parcelable.Creator<k1o> CREATOR = new t1o(6);
    public final String a;
    public final String b;
    public final int c;

    public k1o(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.j(parcel, 1, this.a);
        hxn.j(parcel, 2, this.b);
        hxn.o(parcel, 3, 4);
        parcel.writeInt(this.c);
        hxn.q(parcel, p);
    }
}
