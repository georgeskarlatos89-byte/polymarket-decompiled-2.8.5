package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tpi extends g5 {
    public static final Parcelable.Creator<tpi> CREATOR = new iek(7);
    public final int a;
    public List b;

    public tpi(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        hxn.n(parcel, 2, this.b);
        hxn.q(parcel, p);
    }
}
