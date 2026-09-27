package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class k2e extends g5 {
    public static final Parcelable.Creator<k2e> CREATOR = new t1o(8);
    public String a;
    public re5 b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.j(parcel, 1, this.a);
        hxn.i(parcel, 2, this.b, i);
        hxn.q(parcel, p);
    }
}
