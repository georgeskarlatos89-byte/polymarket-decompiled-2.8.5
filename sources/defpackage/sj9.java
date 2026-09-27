package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sj9 implements tj9 {
    public IBinder f;

    @Override // defpackage.tj9
    public final void F(rj9 rj9Var, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(tj9.d);
            obtain.writeStrongInterface(rj9Var);
            obtain.writeInt(i);
            this.f.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f;
    }

    @Override // defpackage.tj9
    public final int i(rj9 rj9Var, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(tj9.d);
            obtain.writeStrongInterface(rj9Var);
            obtain.writeString(str);
            this.f.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.tj9
    public final void v(int i, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(tj9.d);
            obtain.writeInt(i);
            obtain.writeStringArray(strArr);
            this.f.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
