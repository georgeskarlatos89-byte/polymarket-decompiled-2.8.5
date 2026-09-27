package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class idn extends g5 {
    public static final Parcelable.Creator<idn> CREATOR = new num(13);
    public final List a;

    public idn(ArrayList arrayList) {
        this.a = arrayList;
    }

    public static idn O(rym... rymVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(rymVarArr[0].zza()));
        return new idn(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.g(parcel, 1, this.a);
        hxn.q(parcel, p);
    }
}
