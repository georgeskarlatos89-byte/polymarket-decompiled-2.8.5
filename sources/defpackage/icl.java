package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class icl extends usk {
    public final tvn[] P(rfd rfdVar, idl idlVar) {
        Parcel L = L();
        nil.a(L, rfdVar);
        L.writeInt(1);
        idlVar.writeToParcel(L, 0);
        Parcel M = M(L, 1);
        tvn[] tvnVarArr = (tvn[]) M.createTypedArray(tvn.CREATOR);
        M.recycle();
        return tvnVarArr;
    }
}
