package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yi9 implements aj9 {
    public IBinder f;

    public final boolean a(ch5 ch5Var) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(aj9.b);
            obtain.writeStrongInterface(ch5Var);
            boolean z = false;
            if (this.f.transact(3, obtain, obtain2, 0)) {
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z = true;
                }
                return z;
            }
            throw new RemoteException("Method newSession is unimplemented.");
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f;
    }

    public final boolean c(ch5 ch5Var, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(aj9.b);
            obtain.writeStrongInterface(ch5Var);
            boolean z = false;
            obtain.writeTypedObject(bundle, 0);
            if (this.f.transact(10, obtain, obtain2, 0)) {
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z = true;
                }
                return z;
            }
            throw new RemoteException("Method newSessionWithExtras is unimplemented.");
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean p() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(aj9.b);
            obtain.writeLong(0L);
            boolean z = false;
            if (this.f.transact(2, obtain, obtain2, 0)) {
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z = true;
                }
                return z;
            }
            throw new RemoteException("Method warmup is unimplemented.");
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
