package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qj9 implements rj9 {
    public IBinder f;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f;
    }

    @Override // defpackage.rj9
    public final void h(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(rj9.c);
            obtain.writeStringArray(strArr);
            this.f.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
