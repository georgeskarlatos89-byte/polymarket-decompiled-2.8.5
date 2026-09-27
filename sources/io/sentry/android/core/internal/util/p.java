package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import defpackage.q8k;
import io.sentry.android.core.n0;
import io.sentry.android.core.w;
import io.sentry.p5;
import io.sentry.x0;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class p implements Application.ActivityLifecycleCallbacks {
    public final n0 a;
    public final CopyOnWriteArraySet b;
    public final x0 c;
    public volatile Handler d;
    public final io.sentry.util.a e;
    public WeakReference f;
    public final ConcurrentHashMap g;
    public final boolean h;
    public final c i;
    public final l j;
    public volatile Choreographer k;
    public volatile Field l;
    public long m;
    public long n;
    public final ConcurrentSkipListSet o;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.sentry.android.core.internal.util.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, io.sentry.util.a] */
    /* JADX WARN: Type inference failed for: r4v4, types: [io.sentry.android.core.internal.util.l] */
    public p(Context context, w wVar, final n0 n0Var) {
        ?? obj = new Object();
        this.b = new CopyOnWriteArraySet();
        this.e = new Object();
        this.g = new ConcurrentHashMap();
        this.h = false;
        this.m = 0L;
        this.n = 0L;
        this.o = new ConcurrentSkipListSet();
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        io.sentry.util.b.t(wVar, "Logger is required");
        this.c = wVar;
        io.sentry.util.b.t(n0Var, "BuildInfoProvider is required");
        this.a = n0Var;
        this.i = obj;
        if (!(context instanceof Application)) {
            return;
        }
        this.h = true;
        ((Application) context).registerActivityLifecycleCallbacks(this);
        new Handler(Looper.getMainLooper()).post(new q8k(19, this, wVar));
        this.j = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.l
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                long j;
                boolean z;
                boolean z2;
                p pVar = p.this;
                ConcurrentSkipListSet concurrentSkipListSet = pVar.o;
                long nanoTime = System.nanoTime();
                n0Var.getClass();
                float refreshRate = window.getContext().getDisplay().getRefreshRate();
                long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
                long max = Math.max(0L, metric - (1.0E9f / refreshRate));
                pVar.a.getClass();
                long metric2 = frameMetrics.getMetric(10);
                if (metric2 < 0) {
                    metric2 = nanoTime - metric;
                }
                long max2 = Math.max(metric2, pVar.n);
                if (max2 != pVar.m) {
                    pVar.m = max2;
                    long j2 = max2 + metric;
                    pVar.n = j2;
                    if (metric > 1.0E9f / (refreshRate - 1.0f)) {
                        j = j2;
                        z = true;
                    } else {
                        j = j2;
                        z = false;
                    }
                    if (z && metric > 700000000) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (max > 0) {
                        long j3 = j - 300000000000L;
                        concurrentSkipListSet.headSet((ConcurrentSkipListSet) new n(j3, j3)).clear();
                        if (concurrentSkipListSet.size() < 3600) {
                            concurrentSkipListSet.add(new n(max2, pVar.n));
                        }
                    }
                    Iterator it = pVar.g.values().iterator();
                    while (it.hasNext()) {
                        long j4 = metric;
                        long j5 = max;
                        ((o) it.next()).c(max2, pVar.n, j4, j5, z, z2, refreshRate);
                        max = j5;
                        metric = j4;
                    }
                }
            }
        };
    }

    public final String a(o oVar) {
        if (!this.h) {
            return null;
        }
        if (this.d == null) {
            io.sentry.util.a aVar = this.e;
            aVar.e();
            try {
                if (this.d == null) {
                    HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
                    handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.m
                        @Override // java.lang.Thread.UncaughtExceptionHandler
                        public final void uncaughtException(Thread thread, Throwable th) {
                            p.this.c.d(p5.ERROR, "Error during frames measurements.", th);
                        }
                    });
                    handlerThread.start();
                    this.d = new Handler(handlerThread.getLooper());
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
        String i0 = io.sentry.config.a.i0();
        this.g.put(i0, oVar);
        c();
        return i0;
    }

    public final void b(String str) {
        Window window;
        if (this.h) {
            ConcurrentHashMap concurrentHashMap = this.g;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.f;
            if (weakReference != null) {
                window = (Window) weakReference.get();
            } else {
                window = null;
            }
            if (window != null && concurrentHashMap.isEmpty()) {
                new Handler(Looper.getMainLooper()).post(new k(this, window, 1));
            }
        }
    }

    public final void c() {
        Window window;
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            window = (Window) weakReference.get();
        } else {
            window = null;
        }
        if (window != null && this.h && !this.g.isEmpty() && this.d != null) {
            new Handler(Looper.getMainLooper()).post(new k(this, window, 0));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.f;
        if (weakReference != null && weakReference.get() == window) {
            return;
        }
        this.f = new WeakReference(window);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        new Handler(Looper.getMainLooper()).post(new k(this, activity.getWindow(), 1));
        WeakReference weakReference = this.f;
        if (weakReference != null && weakReference.get() == activity.getWindow()) {
            this.f = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
