package defpackage;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.l;
import com.google.android.gms.common.api.Status;
import com.google.mlkit.common.MlKitException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class nuk extends Binder implements IInterface {
    public final /* synthetic */ int f;

    public nuk(String str, int i) {
        this.f = i;
        switch (i) {
            case 1:
                attachInterface(this, str);
                return;
            case 2:
                attachInterface(this, str);
                return;
            case 3:
                attachInterface(this, str);
                return;
            case 4:
            default:
                attachInterface(this, str);
                return;
            case 5:
                attachInterface(this, str);
                return;
        }
    }

    public static void I(Parcel parcel) {
        int i = kil.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
        } else {
            throw new BadParcelableException(hdi.l(dataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(dataAvail).length() + 45)));
        }
    }

    public abstract boolean H(Parcel parcel, int i);

    public abstract boolean N(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean O(int i, Parcel parcel, Parcel parcel2);

    public boolean P(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean Q(Parcel parcel, int i);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = this.f;
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        Parcelable parcelable;
        boolean z2 = false;
        switch (this.f) {
            case 0:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return H(parcel, i);
            case 1:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return N(i, parcel, parcel2);
            case 2:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return O(i, parcel, parcel2);
            case 3:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return P(i, parcel, parcel2);
            case 4:
                if (i > 16777215) {
                    z = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z = false;
                }
                if (z) {
                    return true;
                }
                c6a c6aVar = (c6a) this;
                switch (i) {
                    case 1:
                        Status status = (Status) kil.a(parcel, Status.CREATOR);
                        ije ijeVar = (ije) kil.a(parcel, ije.CREATOR);
                        I(parcel);
                        int i3 = c6aVar.g;
                        status.getClass();
                        switch (i3) {
                            case 1:
                                u1m.a(status, ijeVar, c6aVar.h);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 2:
                        Status status2 = (Status) kil.a(parcel, Status.CREATOR);
                        I(parcel);
                        status2.getClass();
                        l.g();
                        break;
                    case 3:
                        Status status3 = (Status) kil.a(parcel, Status.CREATOR);
                        I(parcel);
                        status3.getClass();
                        l.g();
                        break;
                    case 4:
                        Status status4 = (Status) kil.a(parcel, Status.CREATOR);
                        I(parcel);
                        status4.getClass();
                        l.g();
                        break;
                    case 5:
                        Status status5 = (Status) kil.a(parcel, Status.CREATOR);
                        I(parcel);
                        status5.getClass();
                        l.g();
                        break;
                    case 6:
                        Status status6 = (Status) kil.a(parcel, Status.CREATOR);
                        I(parcel);
                        status6.getClass();
                        l.g();
                        break;
                    case 7:
                        Status status7 = (Status) kil.a(parcel, Status.CREATOR);
                        fb5 fb5Var = (fb5) kil.a(parcel, fb5.CREATOR);
                        I(parcel);
                        int i4 = c6aVar.g;
                        status7.getClass();
                        switch (i4) {
                            case 0:
                                u1m.a(status7, fb5Var, c6aVar.h);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 8:
                        Status status8 = (Status) kil.a(parcel, Status.CREATOR);
                        I(parcel);
                        status8.getClass();
                        l.g();
                        break;
                    case 9:
                        Status status9 = (Status) kil.a(parcel, Status.CREATOR);
                        I(parcel);
                        status9.getClass();
                        throw new UnsupportedOperationException();
                    case 10:
                        Status status10 = (Status) kil.a(parcel, Status.CREATOR);
                        I(parcel);
                        status10.getClass();
                        throw new UnsupportedOperationException();
                    case 11:
                        Status status11 = (Status) kil.a(parcel, Status.CREATOR);
                        I(parcel);
                        status11.getClass();
                        l.g();
                        break;
                    case 12:
                        Status status12 = (Status) kil.a(parcel, Status.CREATOR);
                        I(parcel);
                        status12.getClass();
                        l.g();
                        break;
                    case 13:
                        Status status13 = (Status) kil.a(parcel, Status.CREATOR);
                        I(parcel);
                        status13.getClass();
                        l.g();
                        break;
                    case 14:
                        Status status14 = (Status) kil.a(parcel, Status.CREATOR);
                        I(parcel);
                        status14.getClass();
                        l.g();
                        break;
                    case 15:
                        Status status15 = (Status) kil.a(parcel, Status.CREATOR);
                        I(parcel);
                        status15.getClass();
                        l.g();
                        break;
                }
                return false;
            case 5:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return Q(parcel, i);
            case 6:
            case 7:
            case 8:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 9:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                l8m l8mVar = (l8m) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i5 = xil.a;
                if (parcel.readInt() == 0) {
                    parcelable = null;
                } else {
                    parcelable = (Parcelable) creator.createFromParcel(parcel);
                }
                Bundle bundle = (Bundle) parcelable;
                int dataAvail = parcel.dataAvail();
                if (dataAvail <= 0) {
                    dtn dtnVar = l8mVar.i.a;
                    if (dtnVar != null) {
                        epi epiVar = l8mVar.h;
                        synchronized (dtnVar.f) {
                            dtnVar.e.remove(epiVar);
                        }
                        dtnVar.a().post(new n5n(dtnVar, 0));
                    }
                    l8mVar.g.c("onGetLaunchReviewFlowInfo", new Object[0]);
                    l8mVar.h.d(new x4l((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
                    return true;
                }
                throw new BadParcelableException(ace.f(dataAvail, "Parcel data not fully consumed, unread size: "));
            case 10:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                switch (i) {
                    case 1:
                        parcel.readInt();
                        ril.d(parcel);
                        return true;
                    case 2:
                        parcel.readInt();
                        ril.d(parcel);
                        return true;
                    case 3:
                        int readInt = parcel.readInt();
                        int i6 = ril.a;
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        }
                        ril.d(parcel);
                        M(readInt, z2);
                        return true;
                    case 4:
                        parcel.readInt();
                        ril.d(parcel);
                        return true;
                    case 5:
                    default:
                        return false;
                    case 6:
                        parcel.readInt();
                        int i7 = ril.a;
                        parcel.readInt();
                        ril.d(parcel);
                        return true;
                    case 7:
                        ril.d(parcel);
                        return true;
                    case 8:
                        ril.d(parcel);
                        return true;
                    case 9:
                        Status status16 = (Status) ril.a(parcel, Status.CREATOR);
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        }
                        ril.d(parcel);
                        J(status16, z2);
                        return true;
                    case 10:
                        ril.d(parcel);
                        return true;
                    case 11:
                        ril.d(parcel);
                        return true;
                    case 12:
                        ril.d(parcel);
                        return true;
                    case 13:
                        ril.d(parcel);
                        return true;
                    case 14:
                        Status status17 = (Status) ril.a(parcel, Status.CREATOR);
                        o2e o2eVar = (o2e) ril.a(parcel, o2e.CREATOR);
                        ril.d(parcel);
                        L(status17, o2eVar);
                        return true;
                    case 15:
                        ril.d(parcel);
                        return true;
                    case 16:
                        ril.d(parcel);
                        return true;
                    case 17:
                        ril.d(parcel);
                        return true;
                    case MlKitException.UNSUPPORTED /* 18 */:
                        parcel.readInt();
                        ril.d(parcel);
                        return true;
                    case zh4.REMOTE_EXCEPTION /* 19 */:
                        Status status18 = (Status) ril.a(parcel, Status.CREATOR);
                        j2e j2eVar = (j2e) ril.a(parcel, j2e.CREATOR);
                        ril.d(parcel);
                        K(status18, j2eVar);
                        return true;
                    case 20:
                        ril.d(parcel);
                        return true;
                    case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        ril.d(parcel);
                        return true;
                }
        }
    }

    public nuk() {
        this.f = 10;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    public /* synthetic */ nuk(int i) {
        this.f = i;
    }

    public void J(Status status, boolean z) {
    }

    public void K(Status status, j2e j2eVar) {
    }

    public void L(Status status, o2e o2eVar) {
    }

    public void M(int i, boolean z) {
    }
}
