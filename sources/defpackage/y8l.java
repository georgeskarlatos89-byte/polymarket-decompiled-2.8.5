package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class y8l extends g5 {
    public static final Parcelable.Creator<y8l> CREATOR = new o4l(24);
    public final long a;
    public final int b;
    public final long c;

    public y8l(int i, long j, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 8);
        parcel.writeLong(this.a);
        hxn.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        hxn.o(parcel, 3, 8);
        parcel.writeLong(this.c);
        hxn.q(parcel, p);
    }
}
