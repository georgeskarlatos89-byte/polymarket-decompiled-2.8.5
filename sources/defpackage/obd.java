package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;
import io.sentry.android.core.m0;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class obd implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public obd(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(nbd nbdVar) {
        boolean z;
        ArrayDeque arrayDeque = nbdVar.d;
        ComponentName componentName = nbdVar.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (!arrayDeque.isEmpty()) {
            if (nbdVar.b) {
                z = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.a;
                boolean bindService = context.bindService(component, this, 33);
                nbdVar.b = bindService;
                if (bindService) {
                    nbdVar.e = 0;
                } else {
                    m0.p("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z = nbdVar.b;
            }
            if (z && nbdVar.c != null) {
                while (true) {
                    lbd lbdVar = (lbd) arrayDeque.peek();
                    if (lbdVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            lbdVar.toString();
                        }
                        lbdVar.a(nbdVar.c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName);
                        }
                    } catch (RemoteException e) {
                        m0.q("NotifManCompat", "RemoteException communicating with " + componentName, e);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(nbdVar);
                    return;
                }
                return;
            }
            b(nbdVar);
        }
    }

    public final void b(nbd nbdVar) {
        ComponentName componentName = nbdVar.a;
        ArrayDeque arrayDeque = nbdVar.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = nbdVar.e + 1;
        nbdVar.e = i;
        if (i > 6) {
            m0.p("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + nbdVar.e + " retries");
            arrayDeque.clear();
            return;
        }
        Log.isLoggable("NotifManCompat", 3);
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r3) * 1000);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [uj9, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        wj9 wj9Var = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    nbd nbdVar = (nbd) this.c.get((ComponentName) message.obj);
                    if (nbdVar != null) {
                        a(nbdVar);
                        return true;
                    }
                } else {
                    nbd nbdVar2 = (nbd) this.c.get((ComponentName) message.obj);
                    if (nbdVar2 != null) {
                        if (nbdVar2.b) {
                            this.a.unbindService(this);
                            nbdVar2.b = false;
                        }
                        nbdVar2.c = null;
                        return true;
                    }
                }
            } else {
                mbd mbdVar = (mbd) message.obj;
                ComponentName componentName = mbdVar.a;
                IBinder iBinder = mbdVar.b;
                nbd nbdVar3 = (nbd) this.c.get(componentName);
                if (nbdVar3 != null) {
                    int i2 = vj9.f;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(wj9.e);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof wj9)) {
                            wj9Var = (wj9) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f = iBinder;
                            wj9Var = obj;
                        }
                    }
                    nbdVar3.c = wj9Var;
                    nbdVar3.e = 0;
                    a(nbdVar3);
                    return true;
                }
            }
        } else {
            lbd lbdVar = (lbd) message.obj;
            Context context = this.a;
            Object obj2 = NotificationManagerCompat.c;
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            synchronized (NotificationManagerCompat.c) {
                if (string != null) {
                    try {
                        if (!string.equals(NotificationManagerCompat.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            NotificationManagerCompat.e = hashSet2;
                            NotificationManagerCompat.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = NotificationManagerCompat.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            m0.p("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName3);
                        }
                        this.c.put(componentName3, new nbd(componentName3));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        nbd nbdVar4 = (nbd) entry.getValue();
                        if (nbdVar4.b) {
                            this.a.unbindService(this);
                            nbdVar4.b = false;
                        }
                        nbdVar4.c = null;
                        it2.remove();
                    }
                }
            }
            for (nbd nbdVar5 : this.c.values()) {
                nbdVar5.d.add(lbdVar);
                a(nbdVar5);
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(1, new mbd(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
