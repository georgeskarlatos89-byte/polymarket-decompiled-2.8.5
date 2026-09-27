package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class re5 extends g5 {
    public static final Parcelable.Creator<re5> CREATOR = new rwl(17);
    public int a;
    public int b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        int i2 = this.a;
        hxn.o(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        hxn.o(parcel, 2, 4);
        parcel.writeInt(i3);
        hxn.q(parcel, p);
    }
}
