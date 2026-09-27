package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationStartInfo;
import android.content.ContentProvider;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import defpackage.so0;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.j;
import io.sentry.android.core.m0;
import io.sentry.android.core.n0;
import io.sentry.android.core.x;
import io.sentry.protocol.w;
import io.sentry.u2;
import io.sentry.v3;
import io.sentry.y4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class f implements Application.ActivityLifecycleCallbacks {
    public static volatile f z;
    public volatile Boolean b;
    public volatile com.socure.docv.capturesdk.core.extractor.a r;
    public w s;
    public String t;
    public String u;
    public y4 v;
    public ApplicationStartInfo w;
    public static long y = SystemClock.uptimeMillis();
    public static final io.sentry.util.a A = new Object();
    public e a = e.UNKNOWN;
    public volatile long c = -1;
    public x i = null;
    public j j = null;
    public v3 k = null;
    public boolean l = false;
    public volatile boolean m = true;
    public final AtomicInteger n = new AtomicInteger();
    public final AtomicBoolean o = new AtomicBoolean(false);
    public final AtomicBoolean p = new AtomicBoolean(false);
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final n0 x = new n0(1);
    public final g d = new Object();
    public final g e = new Object();
    public final g f = new Object();
    public final HashMap g = new HashMap();
    public final ArrayList h = new ArrayList();

    public static f c() {
        if (z == null) {
            io.sentry.util.a aVar = A;
            aVar.e();
            try {
                if (z == null) {
                    z = new f();
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [io.sentry.android.core.performance.g, java.lang.Object] */
    public static void d(ContentProvider contentProvider) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ?? obj = new Object();
        obj.f(uptimeMillis);
        c().g.put(contentProvider, obj);
    }

    public static void e(ContentProvider contentProvider) {
        long uptimeMillis = SystemClock.uptimeMillis();
        g gVar = (g) c().g.get(contentProvider);
        if (gVar != null && gVar.c()) {
            gVar.a = contentProvider.getClass().getName().concat(".onCreate");
            gVar.d = uptimeMillis;
        }
    }

    public final String a() {
        ApplicationStartInfo applicationStartInfo = this.w;
        if (applicationStartInfo != null && Build.VERSION.SDK_INT >= 35) {
            switch (so0.B(applicationStartInfo)) {
                case 0:
                    return "alarm";
                case 1:
                    return "backup";
                case 2:
                    return "boot_complete";
                case 3:
                    return "broadcast";
                case 4:
                    return "content_provider";
                case 5:
                    return "job";
                case 6:
                    return MetricTracker.Object.LAUNCHER;
                case 7:
                    return "launcher_recents";
                case 8:
                    return "other";
                case 9:
                    return MetricTracker.Place.PUSH;
                case 10:
                    return "service";
                case 11:
                    return "start_activity";
                default:
                    return null;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [io.sentry.android.core.performance.g, java.lang.Object] */
    public final g b(SentryAndroidOptions sentryAndroidOptions) {
        if (this.a != e.UNKNOWN && Boolean.TRUE.equals(this.b)) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                g gVar = this.d;
                if (gVar.d() && gVar.a() <= RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) {
                    return gVar;
                }
            }
            g gVar2 = this.e;
            if (gVar2.d() && gVar2.a() <= RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) {
                return gVar2;
            }
        }
        return new Object();
    }

    public final synchronized void f() {
        if (!this.o.getAndSet(true)) {
            f c = c();
            g gVar = c.e;
            gVar.getClass();
            gVar.d = SystemClock.uptimeMillis();
            g gVar2 = c.d;
            gVar2.getClass();
            gVar2.d = SystemClock.uptimeMillis();
        }
    }

    public final void g(Application application) {
        ActivityManager activityManager;
        if (!this.l) {
            this.l = true;
            Boolean bool = null;
            this.b = null;
            application.registerActivityLifecycleCallbacks(z);
            if (Build.VERSION.SDK_INT >= 35 && (activityManager = (ActivityManager) application.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY)) != null) {
                try {
                    List j = so0.j(activityManager);
                    if (!j.isEmpty()) {
                        ApplicationStartInfo c = so0.c(j.get(0));
                        this.w = c;
                        if (so0.a(c) == 0) {
                            if (so0.v(c) == 1) {
                                this.a = e.COLD;
                            } else {
                                this.a = e.WARM;
                            }
                            switch (so0.A(c)) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 9:
                                case 10:
                                    bool = Boolean.FALSE;
                                    break;
                                case 6:
                                case 7:
                                case 11:
                                    bool = Boolean.TRUE;
                                    break;
                            }
                            this.b = bool;
                        }
                    }
                } catch (RuntimeException e) {
                    Log.w("AppStartMetrics", e);
                }
            }
            if (this.b == null) {
                this.b = Boolean.valueOf(m0.i());
            }
            if ((this.a == e.UNKNOWN || this.r != null) && this.p.compareAndSet(false, true)) {
                Looper.getMainLooper().getQueue().addIdleHandler(new d(this));
            }
        }
    }

    public final void h(long j) {
        g gVar = this.d;
        if (gVar.d()) {
            if (gVar.c()) {
                gVar.d = j;
            }
        } else {
            g gVar2 = this.e;
            if (gVar2.d() && gVar2.c()) {
                gVar2.d = j;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long uptimeMillis = SystemClock.uptimeMillis();
        n0.b.b(activity);
        if (this.n.incrementAndGet() == 1 && !this.o.get()) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - this.d.c;
            if (Boolean.TRUE.equals(this.b) && uptimeMillis2 <= RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) {
                if (this.a == e.UNKNOWN) {
                    if (bundle != null) {
                        this.a = e.WARM;
                    } else if (this.c != -1 && uptimeMillis > this.c) {
                        this.a = e.WARM;
                    } else {
                        this.a = e.COLD;
                    }
                }
            } else {
                io.sentry.util.a aVar = (io.sentry.util.a) this.x.a;
                aVar.e();
                aVar.close();
                this.a = e.WARM;
                this.m = true;
                g gVar = this.d;
                gVar.a = null;
                gVar.c = 0L;
                gVar.d = 0L;
                gVar.b = 0L;
                gVar.f(uptimeMillis);
                y = uptimeMillis;
                this.g.clear();
                g gVar2 = this.f;
                gVar2.a = null;
                gVar2.c = 0L;
                gVar2.d = 0L;
                gVar2.b = 0L;
            }
        }
        this.b = Boolean.TRUE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        n0 n0Var = n0.b;
        WeakReference weakReference = (WeakReference) n0Var.a;
        if (weakReference == null || weakReference.get() == activity) {
            n0Var.a = null;
        }
        int decrementAndGet = this.n.decrementAndGet();
        if (decrementAndGet < 0) {
            this.n.set(0);
            decrementAndGet = 0;
        }
        if (decrementAndGet == 0 && !activity.isChangingConfigurations()) {
            this.a = e.WARM;
            this.b = Boolean.TRUE;
            this.m = true;
            this.o.set(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        n0 n0Var = n0.b;
        WeakReference weakReference = (WeakReference) n0Var.a;
        if (weakReference != null && weakReference.get() != activity) {
            return;
        }
        n0Var.a = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        n0.b.b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        n0.b.b(activity);
        if (this.o.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            final int i = 0;
            io.sentry.android.core.internal.util.h.a(activity, new Runnable(this) { // from class: io.sentry.android.core.performance.c
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    f fVar = this.b;
                    switch (i2) {
                        case 0:
                            fVar.f();
                            return;
                        default:
                            fVar.f();
                            return;
                    }
                }
            }, new n0(u2.a));
        } else {
            final int i2 = 1;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.performance.c
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    f fVar = this.b;
                    switch (i22) {
                        case 0:
                            fVar.f();
                            return;
                        default:
                            fVar.f();
                            return;
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        n0 n0Var = n0.b;
        WeakReference weakReference = (WeakReference) n0Var.a;
        if (weakReference != null && weakReference.get() != activity) {
            return;
        }
        n0Var.a = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
