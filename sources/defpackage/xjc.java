package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xjc extends g5 {
    public static final Parcelable.Creator<xjc> CREATOR = new iek(12);
    public final int a;
    public final boolean b;

    public xjc(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        hxn.o(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        hxn.q(parcel, p);
    }
}
