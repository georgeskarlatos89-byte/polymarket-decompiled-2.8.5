package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class a1o extends g5 {
    public static final Parcelable.Creator<a1o> CREATOR = new t1o(2);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public a1o(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.j(parcel, 1, this.a);
        hxn.j(parcel, 2, this.b);
        hxn.j(parcel, 3, this.c);
        hxn.j(parcel, 4, this.d);
        hxn.j(parcel, 5, this.e);
        hxn.j(parcel, 6, this.f);
        hxn.j(parcel, 7, this.g);
        hxn.q(parcel, p);
    }
}
