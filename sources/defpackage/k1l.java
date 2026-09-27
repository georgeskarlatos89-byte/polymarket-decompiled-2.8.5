package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1l implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k1l(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                htk htkVar = (htk) obj;
                htkVar.b.b("reportBinderDeath", new Object[0]);
                if (htkVar.j.get() == null) {
                    htkVar.b.b("%s : Binder has died.", htkVar.c);
                    Iterator it = htkVar.d.iterator();
                    while (it.hasNext()) {
                        ((h1l) it.next()).a(new RemoteException(String.valueOf(htkVar.c).concat(" : Binder has died.")));
                    }
                    htkVar.d.clear();
                    synchronized (htkVar.f) {
                        htkVar.d();
                    }
                    return;
                }
                dmk.p();
                return;
            default:
                dtn dtnVar = (dtn) obj;
                dtnVar.b.c("reportBinderDeath", new Object[0]);
                if (dtnVar.i.get() == null) {
                    dtnVar.b.c("%s : Binder has died.", dtnVar.c);
                    Iterator it2 = dtnVar.d.iterator();
                    while (it2.hasNext()) {
                        bkm bkmVar = (bkm) it2.next();
                        RemoteException remoteException = new RemoteException(String.valueOf(dtnVar.c).concat(" : Binder has died."));
                        epi epiVar = bkmVar.a;
                        if (epiVar != null) {
                            epiVar.c(remoteException);
                        }
                    }
                    dtnVar.d.clear();
                    synchronized (dtnVar.f) {
                        dtnVar.c();
                    }
                    return;
                }
                dmk.p();
                return;
        }
    }
}
