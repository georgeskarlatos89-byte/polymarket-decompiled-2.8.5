package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class usk implements IInterface {
    public final /* synthetic */ int f;
    public final IBinder g;
    public final String h;

    public /* synthetic */ usk(IBinder iBinder, String str, int i) {
        this.f = i;
        this.g = iBinder;
        this.h = str;
    }

    public Parcel H() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.h);
        return obtain;
    }

    public void I(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.g.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel J(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.g.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel K(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.g.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel L() {
        int i = this.f;
        String str = this.h;
        switch (i) {
            case 3:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(str);
                return obtain;
            case 4:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(str);
                return obtain2;
            case 5:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(str);
                return obtain3;
            case 6:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(str);
                return obtain4;
            case 7:
                Parcel obtain5 = Parcel.obtain();
                obtain5.writeInterfaceToken(str);
                return obtain5;
            default:
                Parcel obtain6 = Parcel.obtain();
                obtain6.writeInterfaceToken(str);
                return obtain6;
        }
    }

    public Parcel M(Parcel parcel, int i) {
        int i2 = this.f;
        IBinder iBinder = this.g;
        switch (i2) {
            case 4:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } finally {
                    }
                } catch (RuntimeException e) {
                    obtain.recycle();
                    throw e;
                }
            case 5:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } catch (RuntimeException e2) {
                        obtain2.recycle();
                        throw e2;
                    }
                } finally {
                }
            case 6:
                Parcel obtain3 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, obtain3, 0);
                        obtain3.readException();
                        return obtain3;
                    } catch (RuntimeException e3) {
                        obtain3.recycle();
                        throw e3;
                    }
                } finally {
                }
            default:
                Parcel obtain4 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, obtain4, 0);
                        obtain4.readException();
                        return obtain4;
                    } catch (RuntimeException e4) {
                        obtain4.recycle();
                        throw e4;
                    }
                } finally {
                }
        }
    }

    public void N(Parcel parcel, int i) {
        Parcel obtain;
        int i2 = this.f;
        IBinder iBinder = this.g;
        switch (i2) {
            case 4:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 5:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 6:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 7:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 8:
                try {
                    iBinder.transact(i, parcel, null, 1);
                    return;
                } finally {
                    parcel.recycle();
                }
            default:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void O(Parcel parcel) {
        try {
            this.g.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public void a(Parcel parcel, int i) {
        try {
            this.g.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f;
        return this.g;
    }

    public Parcel c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.h);
        return obtain;
    }

    public void p(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.g.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
