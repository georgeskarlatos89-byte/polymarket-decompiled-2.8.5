package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class gj9 implements ij9, IInterface {
    public final IBinder f;

    public gj9(IBinder iBinder) {
        this.f = iBinder;
    }

    public final void a(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f;
    }
}
