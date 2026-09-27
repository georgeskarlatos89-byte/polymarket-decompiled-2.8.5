package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class htk {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final d1l b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final b2l i;
    public dnc m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final k1l k = new k1l(this, 0);
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    public htk(Context context, d1l d1lVar, String str, Intent intent, b2l b2lVar) {
        this.a = context;
        this.b = d1lVar;
        this.c = str;
        this.h = intent;
        this.i = b2lVar;
    }

    public static void b(htk htkVar, h1l h1lVar) {
        IInterface iInterface = htkVar.n;
        d1l d1lVar = htkVar.b;
        ArrayList arrayList = htkVar.d;
        if (iInterface == null && !htkVar.g) {
            d1lVar.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(h1lVar);
            dnc dncVar = new dnc(htkVar, 1);
            htkVar.m = dncVar;
            htkVar.g = true;
            if (!htkVar.a.bindService(htkVar.h, dncVar, 1)) {
                d1lVar.b("Failed to bind to the service.", new Object[0]);
                htkVar.g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((h1l) it.next()).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
                return;
            }
            return;
        }
        if (htkVar.g) {
            d1lVar.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(h1lVar);
        } else {
            h1lVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = o;
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

    public final void c(epi epiVar) {
        synchronized (this.f) {
            this.e.remove(epiVar);
        }
        a().post(new ftk(this, 1));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((epi) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
