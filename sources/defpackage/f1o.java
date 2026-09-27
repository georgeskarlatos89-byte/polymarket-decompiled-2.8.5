package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class f1o extends g5 {
    public static final Parcelable.Creator<f1o> CREATOR = new t1o(5);
    public final String a;
    public final String b;

    public f1o(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.j(parcel, 1, this.a);
        hxn.j(parcel, 2, this.b);
        hxn.q(parcel, p);
    }
}
