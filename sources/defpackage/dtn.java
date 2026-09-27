package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dtn {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final uk b;
    public boolean g;
    public final Intent h;
    public dnc l;
    public twl m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final k1l j = new k1l(this, 1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public dtn(Context context, uk ukVar, Intent intent) {
        this.a = context;
        this.b = ukVar;
        this.h = intent;
    }

    public static void b(dtn dtnVar, swl swlVar) {
        twl twlVar = dtnVar.m;
        uk ukVar = dtnVar.b;
        ArrayList arrayList = dtnVar.d;
        if (twlVar == null && !dtnVar.g) {
            ukVar.c("Initiate binding to the service.", new Object[0]);
            arrayList.add(swlVar);
            dnc dncVar = new dnc(dtnVar, 2);
            dtnVar.l = dncVar;
            dtnVar.g = true;
            if (!dtnVar.a.bindService(dtnVar.h, dncVar, 1)) {
                ukVar.c("Failed to bind to the service.", new Object[0]);
                dtnVar.g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bkm bkmVar = (bkm) it.next();
                    RuntimeException runtimeException = new RuntimeException("Failed to bind to the service.");
                    epi epiVar = bkmVar.a;
                    if (epiVar != null) {
                        epiVar.c(runtimeException);
                    }
                }
                arrayList.clear();
                return;
            }
            return;
        }
        if (dtnVar.g) {
            ukVar.c("Waiting to bind to the service.", new Object[0]);
            arrayList.add(swlVar);
        } else {
            swlVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((epi) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
