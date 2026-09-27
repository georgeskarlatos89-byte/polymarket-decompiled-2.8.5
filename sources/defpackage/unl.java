package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class unl extends g5 {
    public static final Parcelable.Creator<unl> CREATOR = new ofl(14);
    public final long a;
    public final long b;
    public final boolean c;
    public final Bundle d;
    public final String e;

    public unl(long j, long j2, boolean z, Bundle bundle, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = bundle;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 8);
        parcel.writeLong(this.a);
        hxn.o(parcel, 2, 8);
        parcel.writeLong(this.b);
        hxn.o(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        hxn.b(parcel, 7, this.d);
        hxn.j(parcel, 8, this.e);
        hxn.q(parcel, p);
    }
}
