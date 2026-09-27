package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class qil {
    static {
        qil.class.getClassLoader();
    }

    public static void a(Parcel parcel, xj9 xj9Var) {
        if (xj9Var == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(xj9Var.asBinder());
        }
    }
}
