package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class t8a extends g5 {
    public static final Parcelable.Creator<t8a> CREATOR = new num(20);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.g(parcel, 2, this.a);
        hxn.j(parcel, 4, this.b);
        hxn.j(parcel, 5, this.c);
        hxn.g(parcel, 6, this.d);
        boolean z = this.e;
        hxn.o(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        hxn.j(parcel, 8, this.f);
        hxn.q(parcel, p);
    }
}
