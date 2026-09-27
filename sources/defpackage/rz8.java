package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rz8 extends g5 {
    public static final Parcelable.Creator<rz8> CREATOR = new iek(3);
    public final int a;
    public final int b;
    public final Bundle c;

    public rz8(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        hxn.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        hxn.b(parcel, 3, this.c);
        hxn.q(parcel, p);
    }
}
