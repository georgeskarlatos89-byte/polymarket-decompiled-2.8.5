package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ch5 extends Binder implements xi9 {
    public final Handler f;
    public final /* synthetic */ evf g;

    public ch5(evf evfVar) {
        this.g = evfVar;
        attachInterface(this, xi9.a);
        this.f = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        String str = xi9.a;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        Handler handler = this.f;
        evf evfVar = this.g;
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (evfVar != null) {
                    handler.post(new hw2(readInt, this, bundle));
                    return true;
                }
                return true;
            case 3:
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (evfVar != null) {
                    handler.post(new bh5(this, readString, bundle2, 1));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (evfVar != null) {
                    handler.post(new bh5(2, this, bundle3));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String readString2 = parcel.readString();
                Bundle bundle4 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (evfVar != null) {
                    handler.post(new bh5(this, readString2, bundle4, 3));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int readInt2 = parcel.readInt();
                Uri uri = (Uri) parcel.readTypedObject(Uri.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                Bundle bundle5 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (evfVar != null) {
                    handler.post(new bh5(this, readInt2, uri, z, bundle5));
                    return true;
                }
                return true;
            case 7:
                parcel.readString();
                parcel2.writeNoException();
                parcel2.writeTypedObject(null, 1);
                return true;
            case 8:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                Bundle bundle6 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (evfVar != null) {
                    handler.post(new bh5(this, readInt3, readInt4, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (evfVar != null) {
                    handler.post(new bh5(6, this, bundle7));
                    return true;
                }
                return true;
            case 10:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                Bundle bundle8 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (evfVar != null) {
                    handler.post(new bh5(this, readInt5, readInt6, readInt7, readInt8, readInt9, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (evfVar != null) {
                    handler.post(new bh5(8, this, bundle9));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (evfVar != null) {
                    handler.post(new bh5(0, this, bundle10));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
