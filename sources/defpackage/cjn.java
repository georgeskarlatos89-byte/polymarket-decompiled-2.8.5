package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class cjn extends usk {
    public final xj9 P(rfd rfdVar, String str, int i, rfd rfdVar2) {
        Parcel L = L();
        cjl.b(L, rfdVar);
        L.writeString(str);
        L.writeInt(i);
        cjl.b(L, rfdVar2);
        Parcel J = J(L, 2);
        xj9 R = rfd.R(J.readStrongBinder());
        J.recycle();
        return R;
    }

    public final xj9 Q(rfd rfdVar, String str, int i, rfd rfdVar2) {
        Parcel L = L();
        cjl.b(L, rfdVar);
        L.writeString(str);
        L.writeInt(i);
        cjl.b(L, rfdVar2);
        Parcel J = J(L, 3);
        xj9 R = rfd.R(J.readStrongBinder());
        J.recycle();
        return R;
    }
}
