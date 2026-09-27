package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class cgl extends g5 implements Iterable {
    public static final Parcelable.Creator<cgl> CREATOR = new ofl(4);
    public final Bundle a;

    public cgl(Bundle bundle) {
        this.a = bundle;
    }

    public final Bundle K0() {
        return new Bundle(this.a);
    }

    public final Object O(String str) {
        return this.a.get(str);
    }

    public final Double T() {
        return Double.valueOf(this.a.getDouble("value"));
    }

    public final String U() {
        return this.a.getString("currency");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new vuj(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.b(parcel, 2, K0());
        hxn.q(parcel, p);
    }
}
