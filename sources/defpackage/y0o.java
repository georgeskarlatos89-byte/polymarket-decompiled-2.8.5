package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class y0o extends g5 {
    public static final Parcelable.Creator<y0o> CREATOR = new t1o(1);
    public final double a;
    public final double b;

    public y0o(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 8);
        parcel.writeDouble(this.a);
        hxn.o(parcel, 2, 8);
        parcel.writeDouble(this.b);
        hxn.q(parcel, p);
    }
}
