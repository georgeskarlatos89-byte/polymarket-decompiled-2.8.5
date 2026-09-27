package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import io.sentry.android.core.m0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dnc implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dnc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [sj9, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        tj9 tj9Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                componentName.getClass();
                iBinder.getClass();
                enc encVar = (enc) obj;
                int i2 = fnc.g;
                IInterface queryLocalInterface = iBinder.queryLocalInterface(tj9.d);
                if (queryLocalInterface != null && (queryLocalInterface instanceof tj9)) {
                    tj9Var = (tj9) queryLocalInterface;
                } else {
                    ?? obj2 = new Object();
                    obj2.f = iBinder;
                    tj9Var = obj2;
                }
                encVar.g = tj9Var;
                try {
                    encVar.f = tj9Var.i(encVar.j, encVar.a);
                    return;
                } catch (RemoteException e) {
                    m0.q("ROOM", "Cannot register multi-instance invalidation callback", e);
                    return;
                }
            case 1:
                htk htkVar = (htk) obj;
                htkVar.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                htkVar.a().post(new dtk(this, iBinder));
                return;
            default:
                dtn dtnVar = (dtn) obj;
                dtnVar.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                dtnVar.a().post(new swl(this, iBinder));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                componentName.getClass();
                ((enc) obj).g = null;
                return;
            case 1:
                htk htkVar = (htk) obj;
                htkVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                htkVar.a().post(new ftk(this, 0));
                return;
            default:
                dtn dtnVar = (dtn) obj;
                dtnVar.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                dtnVar.a().post(new n5n(this, 1));
                return;
        }
    }
}
