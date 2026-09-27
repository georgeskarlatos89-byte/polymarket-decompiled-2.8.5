package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class sjc extends g5 {
    public static final Parcelable.Creator<sjc> CREATOR = new iek(6);
    public final boolean a;
    public final int b;

    public sjc(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        hxn.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        hxn.q(parcel, p);
    }
}
