package com.socure.idplus.device.internal.behavior.manager;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Window;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import com.socure.idplus.device.SigmaDeviceOptions;
import com.socure.idplus.device.internal.behavior.model.LifeCycleType;
import com.socure.idplus.device.internal.behavior.model.NavigationContext;
import com.socure.idplus.device.internal.sigmaDeviceConfig.model.Behavioral;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c {
    public final SigmaDeviceOptions a;
    public final com.socure.idplus.device.internal.sharedPrefs.a b;
    public final com.socure.idplus.device.internal.input.b c;
    public final com.socure.idplus.device.internal.thread.e d;
    public final com.socure.idplus.device.internal.behavior.coordinator.c e;
    public final com.socure.idplus.device.internal.input.producer.e f;
    public com.socure.idplus.device.internal.sigmaDeviceLocation.manager.e g;
    public com.socure.idplus.device.internal.input.manager.f h;
    public final g i;
    public final com.socure.idplus.device.internal.mediaDevice.manager.g j;
    public final com.socure.idplus.device.internal.input.manager.e k;
    public final Handler l;
    public Behavioral m;
    public final com.socure.idplus.device.internal.behavior.capture.c n;

    public c(Context context, SigmaDeviceOptions sigmaDeviceOptions, com.socure.idplus.device.internal.sharedPrefs.a aVar, com.socure.idplus.device.internal.input.b bVar, com.socure.idplus.device.internal.thread.e eVar, com.socure.idplus.device.internal.behavior.coordinator.c cVar, com.socure.idplus.device.internal.input.producer.e eVar2) {
        context.getClass();
        sigmaDeviceOptions.getClass();
        aVar.getClass();
        bVar.getClass();
        eVar.getClass();
        cVar.getClass();
        eVar2.getClass();
        this.a = sigmaDeviceOptions;
        this.b = aVar;
        this.c = bVar;
        this.d = eVar;
        this.e = cVar;
        this.f = eVar2;
        g gVar = new g(eVar);
        this.i = gVar;
        this.j = new com.socure.idplus.device.internal.mediaDevice.manager.g(context, eVar);
        com.socure.idplus.device.internal.input.manager.e eVar3 = new com.socure.idplus.device.internal.input.manager.e(eVar, sigmaDeviceOptions.getDisableNavigationContextTracking());
        this.k = eVar3;
        Handler handler = new Handler(context.getMainLooper());
        this.l = handler;
        this.n = new com.socure.idplus.device.internal.behavior.capture.c(handler, eVar, new a(this), com.socure.idplus.device.internal.behavior.capture.b.a);
        eVar2.a(LifeCycleType.INITIALIZED);
        eVar3.b.c = true;
        if (context instanceof Activity) {
            gVar.a((Activity) context);
        }
    }

    public final void a() {
        Long l;
        Behavioral behavioral = this.m;
        if (behavioral != null) {
            int sessionIdleTimeoutSeconds = behavioral.getSessionIdleTimeoutSeconds();
            long j = this.b.a.getLong("lastSessionEventTimeStamp", -1L);
            if (j != -1) {
                l = Long.valueOf(j);
            } else {
                l = null;
            }
            if (l != null) {
                if (SystemClock.uptimeMillis() - l.longValue() > sessionIdleTimeoutSeconds * 1000) {
                    long sessionDuration = behavioral.getSessionDuration();
                    boolean isInputBehaviorEnabled = behavioral.isInputBehaviorEnabled();
                    com.socure.idplus.device.internal.behavior.capture.c cVar = this.n;
                    cVar.a.removeCallbacks(cVar.g);
                    long longValue = ((Number) cVar.d.invoke()).longValue() + sessionDuration;
                    cVar.f = longValue;
                    cVar.a.postAtTime(cVar.g, longValue);
                    cVar.e = com.socure.idplus.device.internal.behavior.capture.a.RUNNING;
                    c(isInputBehaviorEnabled);
                    com.socure.idplus.device.internal.behavior.coordinator.c cVar2 = this.e;
                    com.socure.idplus.device.internal.behavior.coordinator.a aVar = com.socure.idplus.device.internal.behavior.coordinator.a.BEHAVIORAL;
                    aVar.getClass();
                    cVar2.d.add(aVar);
                    cVar2.c.a();
                }
            }
        }
    }

    public final void b() {
        com.socure.idplus.device.internal.behavior.capture.c cVar = this.n;
        com.socure.idplus.device.internal.behavior.capture.a aVar = cVar.e;
        com.socure.idplus.device.internal.behavior.capture.a aVar2 = com.socure.idplus.device.internal.behavior.capture.a.STOPPED;
        if (aVar == aVar2) {
            return;
        }
        com.socure.idplus.device.internal.logger.a aVar3 = com.socure.idplus.device.internal.logger.a.D;
        if (aVar != aVar2) {
            cVar.a.removeCallbacks(cVar.g);
            cVar.f = 0L;
            cVar.e = aVar2;
        }
        c(false);
        com.socure.idplus.device.internal.mediaDevice.manager.g gVar = this.j;
        com.socure.idplus.device.internal.mediaDevice.manager.c cVar2 = gVar.b.c;
        if (cVar2 != null) {
            cVar2.c();
            cVar2.b = null;
            cVar2.c = null;
        }
        gVar.c.c = false;
        com.socure.idplus.device.internal.input.manager.e eVar = this.k;
        eVar.b.c = false;
        com.socure.idplus.device.internal.input.manager.b bVar = eVar.c;
        if (bVar != null) {
            for (Map.Entry entry : bVar.b.entrySet()) {
                Activity activity = (Activity) entry.getKey();
                FragmentManager$FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks = (FragmentManager$FragmentLifecycleCallbacks) entry.getValue();
                activity.getClass();
                fragmentManager$FragmentLifecycleCallbacks.getClass();
                com.socure.idplus.device.internal.input.manager.b.a(activity, fragmentManager$FragmentLifecycleCallbacks);
            }
            bVar.b.clear();
        }
        eVar.d = NavigationContext.UNSET;
        com.socure.idplus.device.internal.behavior.coordinator.c cVar3 = this.e;
        com.socure.idplus.device.internal.behavior.coordinator.a aVar4 = com.socure.idplus.device.internal.behavior.coordinator.a.BEHAVIORAL;
        synchronized (cVar3) {
            try {
                aVar4.getClass();
                cVar3.d.remove(aVar4);
                boolean isEmpty = cVar3.d.isEmpty();
                com.socure.idplus.device.internal.thread.e eVar2 = cVar3.a;
                if (isEmpty) {
                    com.socure.idplus.device.internal.thread.c.a(2, eVar2);
                } else {
                    com.socure.idplus.device.internal.thread.c.a(3, eVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(boolean z) {
        com.socure.idplus.device.internal.input.manager.f fVar = this.h;
        if (fVar != null) {
            int i = 0;
            if (z) {
                fVar.a();
                WeakHashMap weakHashMap = this.c.a;
                ArrayList arrayList = new ArrayList(weakHashMap.size());
                Iterator it = weakHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((Window) ((Map.Entry) it.next()).getKey());
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Window window = (Window) obj;
                    com.socure.idplus.device.internal.input.manager.f fVar2 = this.h;
                    if (fVar2 != null) {
                        fVar2.a(window);
                    }
                }
                this.c.b = this;
                return;
            }
            WeakHashMap weakHashMap2 = this.c.a;
            ArrayList arrayList2 = new ArrayList(weakHashMap2.size());
            Iterator it2 = weakHashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add((Window) ((Map.Entry) it2.next()).getKey());
            }
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                Window window2 = (Window) obj2;
                com.socure.idplus.device.internal.input.manager.f fVar3 = this.h;
                if (fVar3 != null) {
                    fVar3.b(window2);
                }
            }
            this.c.b = null;
            com.socure.idplus.device.internal.input.manager.f fVar4 = this.h;
            if (fVar4 != null) {
                fVar4.b();
            }
        }
    }

    public static final void a(c cVar) {
        cVar.b();
    }

    public final void a(boolean z) {
        com.socure.idplus.device.internal.sharedPrefs.a aVar = this.b;
        aVar.b.putLong("lastSessionEventTimeStamp", SystemClock.uptimeMillis());
        aVar.b.commit();
        com.socure.idplus.device.internal.behavior.capture.c cVar = this.n;
        com.socure.idplus.device.internal.behavior.capture.a aVar2 = cVar.e;
        com.socure.idplus.device.internal.behavior.capture.a aVar3 = com.socure.idplus.device.internal.behavior.capture.a.RUNNING;
        if (aVar2 == aVar3) {
            com.socure.idplus.device.internal.logger.a aVar4 = com.socure.idplus.device.internal.logger.a.D;
            if (aVar2 == aVar3) {
                cVar.a.removeCallbacks(cVar.g);
                cVar.e = z ? com.socure.idplus.device.internal.behavior.capture.a.USER_PAUSED : com.socure.idplus.device.internal.behavior.capture.a.PAUSED;
                com.socure.idplus.device.internal.thread.c.a(7, cVar.b);
            }
            this.f.a(z ? LifeCycleType.PAUSED : LifeCycleType.BACKGROUNDED);
            com.socure.idplus.device.internal.mediaDevice.manager.g gVar = this.j;
            com.socure.idplus.device.internal.mediaDevice.manager.c cVar2 = gVar.b.c;
            if (cVar2 != null) {
                cVar2.c();
            }
            gVar.c.c = false;
            this.k.b.c = false;
            com.socure.idplus.device.internal.input.manager.f fVar = this.h;
            if (fVar != null) {
                fVar.b();
            }
        }
    }

    public final void a(Window window) {
        window.getClass();
        if (this.n.e == com.socure.idplus.device.internal.behavior.capture.a.STOPPED) {
            return;
        }
        Objects.toString(window);
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
        com.socure.idplus.device.internal.input.manager.f fVar = this.h;
        if (fVar != null) {
            fVar.a(window);
        }
    }

    public final void b(boolean z) {
        com.socure.idplus.device.internal.input.manager.f fVar;
        if (z || this.n.e != com.socure.idplus.device.internal.behavior.capture.a.USER_PAUSED) {
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
            if (this.n.e == com.socure.idplus.device.internal.behavior.capture.a.STOPPED) {
                a();
                return;
            }
            this.f.a(z ? LifeCycleType.RESUMED : LifeCycleType.FOREGROUNDED);
            com.socure.idplus.device.internal.mediaDevice.manager.g gVar = this.j;
            com.socure.idplus.device.internal.mediaDevice.manager.c cVar = gVar.b.c;
            if (cVar != null) {
                cVar.a();
            }
            gVar.c.c = true;
            this.k.b.c = true;
            com.socure.idplus.device.internal.behavior.capture.c cVar2 = this.n;
            if (cVar2.f > 0 && ((Number) cVar2.d.invoke()).longValue() >= cVar2.f) {
                b();
                a();
                return;
            }
            Behavioral behavioral = this.m;
            if (behavioral != null && behavioral.isInputBehaviorEnabled() && (fVar = this.h) != null) {
                fVar.a();
            }
            com.socure.idplus.device.internal.behavior.capture.c cVar3 = this.n;
            com.socure.idplus.device.internal.behavior.capture.a aVar2 = cVar3.e;
            if (aVar2 == com.socure.idplus.device.internal.behavior.capture.a.PAUSED || aVar2 == com.socure.idplus.device.internal.behavior.capture.a.USER_PAUSED) {
                cVar3.a.postAtTime(cVar3.g, cVar3.f);
                cVar3.e = com.socure.idplus.device.internal.behavior.capture.a.RUNNING;
                com.socure.idplus.device.internal.thread.c.a(8, cVar3.b);
            }
        }
    }

    public final void c() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            b();
        } else {
            this.l.post(new com.appsflyer.a(this, 4));
        }
    }

    public final void b(Window window) {
        window.getClass();
        Objects.toString(window);
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
        com.socure.idplus.device.internal.input.manager.f fVar = this.h;
        if (fVar != null) {
            fVar.b(window);
        }
    }
}
