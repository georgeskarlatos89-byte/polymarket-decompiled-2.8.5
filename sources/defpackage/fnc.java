package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import io.sentry.android.core.m0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fnc extends Binder implements tj9 {
    public static final /* synthetic */ int g = 0;
    public final /* synthetic */ MultiInstanceInvalidationService f;

    public fnc(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f = multiInstanceInvalidationService;
        attachInterface(this, tj9.d);
    }

    @Override // defpackage.tj9
    public final void F(rj9 rj9Var, int i) {
        rj9Var.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f;
        synchronized (multiInstanceInvalidationService.c) {
            multiInstanceInvalidationService.c.unregister(rj9Var);
        }
    }

    @Override // defpackage.tj9
    public final int i(rj9 rj9Var, String str) {
        rj9Var.getClass();
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                int i2 = multiInstanceInvalidationService.a + 1;
                multiInstanceInvalidationService.a = i2;
                if (multiInstanceInvalidationService.c.register(rj9Var, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.b.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [qj9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [qj9, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = tj9.d;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        rj9 rj9Var = null;
        rj9 rj9Var2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                v(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(rj9.c);
                if (queryLocalInterface != null && (queryLocalInterface instanceof rj9)) {
                    rj9Var2 = (rj9) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f = readStrongBinder;
                    rj9Var2 = obj;
                }
            }
            F(rj9Var2, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(rj9.c);
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof rj9)) {
                rj9Var = (rj9) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.f = readStrongBinder2;
                rj9Var = obj2;
            }
        }
        int i3 = i(rj9Var, parcel.readString());
        parcel2.writeNoException();
        parcel2.writeInt(i3);
        return true;
    }

    @Override // defpackage.tj9
    public final void v(int i, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f;
        synchronized (multiInstanceInvalidationService.c) {
            String str = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(i));
            if (str == null) {
                m0.p("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
            int i2 = 0;
            while (true) {
                gnc gncVar = multiInstanceInvalidationService.c;
                if (i2 < beginBroadcast) {
                    try {
                        Object broadcastCookie = gncVar.getBroadcastCookie(i2);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.b.get(num);
                        if (i != intValue && Intrinsics.areEqual(str, str2)) {
                            try {
                                ((rj9) multiInstanceInvalidationService.c.getBroadcastItem(i2)).h(strArr);
                            } catch (RemoteException e) {
                                m0.q("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i2++;
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.c.finishBroadcast();
                        throw th;
                    }
                } else {
                    gncVar.finishBroadcast();
                    return;
                }
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
