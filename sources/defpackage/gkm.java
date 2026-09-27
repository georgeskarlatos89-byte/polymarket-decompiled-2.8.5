package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class gkm extends usk {
    public final ywl[] P(rfd rfdVar, rfd rfdVar2, rfd rfdVar3, int i, int i2, int i3, int i4, int i5, int i6, dfn dfnVar) {
        Parcel L = L();
        pil.a(L, rfdVar);
        pil.a(L, rfdVar2);
        pil.a(L, rfdVar3);
        L.writeInt(i);
        L.writeInt(i2);
        L.writeInt(i3);
        L.writeInt(i4);
        L.writeInt(i5);
        L.writeInt(i6);
        L.writeInt(1);
        dfnVar.writeToParcel(L, 0);
        Parcel M = M(L, 4);
        ywl[] ywlVarArr = (ywl[]) M.createTypedArray(ywl.CREATOR);
        M.recycle();
        return ywlVarArr;
    }
}
