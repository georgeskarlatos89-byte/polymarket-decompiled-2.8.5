package io.sentry.android.core;

import android.os.Bundle;
import android.os.ProfilingResult;
import android.os.SystemClock;
import defpackage.bk0;
import defpackage.qw5;
import defpackage.so0;
import io.sentry.i7;
import io.sentry.n3;
import io.sentry.p3;
import io.sentry.p4;
import io.sentry.p5;
import io.sentry.p6;
import io.sentry.s3;
import io.sentry.x5;
import io.sentry.y2;
import io.sentry.y4;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g1 implements io.sentry.s0, io.sentry.transport.o {
    public final io.sentry.x0 a;
    public final r b;
    public final s c;
    public final qw5 e;
    public io.sentry.e1 g;
    public io.sentry.l h;
    public Future i;
    public io.sentry.protocol.w j;
    public io.sentry.protocol.w k;
    public final AtomicBoolean l;
    public y4 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public final io.sentry.util.a r;
    public j1 d = null;
    public boolean f = false;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, io.sentry.util.a] */
    public g1(io.sentry.x0 x0Var, io.sentry.android.core.internal.util.p pVar, r rVar, s sVar) {
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        this.j = wVar;
        this.k = wVar;
        this.l = new AtomicBoolean(false);
        this.m = new x5();
        this.n = true;
        this.o = false;
        this.p = false;
        this.q = 0;
        this.r = new Object();
        this.a = x0Var;
        this.e = new qw5(pVar);
        this.b = rVar;
        this.c = sVar;
    }

    @Override // io.sentry.transport.o
    public final void A(io.sentry.android.core.internal.tombstone.b bVar) {
        if (!bVar.g(io.sentry.m.All) && !bVar.g(io.sentry.m.ProfileChunkUi)) {
            return;
        }
        io.sentry.util.a aVar = this.r;
        aVar.e();
        try {
            this.a.f(p5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            i(false);
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

    @Override // io.sentry.s0
    public final void a(boolean z) {
        io.sentry.util.a aVar = this.r;
        aVar.e();
        try {
            this.q = 0;
            this.o = true;
            if (z) {
                i(false);
                this.l.set(true);
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

    @Override // io.sentry.s0
    public final void b(s3 s3Var, i7 i7Var) {
        io.sentry.util.a aVar = this.r;
        aVar.e();
        try {
            if (this.n) {
                this.p = i7Var.b(io.sentry.util.o.a().c());
                this.n = false;
            }
            boolean z = this.p;
            io.sentry.x0 x0Var = this.a;
            if (!z) {
                x0Var.f(p5.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                aVar.close();
                return;
            }
            int i = f1.a[s3Var.ordinal()];
            if (i != 1) {
                if (i == 2 && f()) {
                    x0Var.f(p5.WARNING, "Unexpected call to startProfiler(MANUAL) while profiler already running. Skipping.", new Object[0]);
                    aVar.close();
                    return;
                }
            } else {
                this.q = Math.max(0, this.q) + 1;
            }
            if (!f()) {
                x0Var.f(p5.DEBUG, "Started Profiler.", new Object[0]);
                this.o = false;
                h();
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

    @Override // io.sentry.s0
    public final void c() {
        io.sentry.util.a aVar = this.r;
        aVar.e();
        try {
            this.n = true;
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

    @Override // io.sentry.s0
    public final void d(s3 s3Var) {
        io.sentry.util.a aVar = this.r;
        aVar.e();
        try {
            int i = f1.a[s3Var.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.o = true;
                }
            } else {
                int i2 = this.q - 1;
                this.q = i2;
                int max = Math.max(0, i2);
                this.q = max;
                if (max > 0) {
                    aVar.close();
                    return;
                }
                this.o = true;
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

    @Override // io.sentry.s0
    public final io.sentry.protocol.w e() {
        io.sentry.util.a aVar = this.r;
        aVar.e();
        try {
            io.sentry.protocol.w wVar = this.j;
            aVar.close();
            return wVar;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean f() {
        io.sentry.util.a aVar = this.r;
        aVar.e();
        try {
            boolean z = this.f;
            aVar.close();
            return z;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.e1 g() {
        io.sentry.e1 e1Var = this.g;
        if (e1Var != null && e1Var != y2.b) {
            return e1Var;
        }
        io.sentry.e1 c = p4.c();
        if (c == y2.b) {
            this.a.f(p5.ERROR, "PerfettoContinuousProfiler: scopes not available. This is unexpected.", new Object[0]);
            return c;
        }
        this.g = c;
        this.h = c.getOptions().getCompositePerformanceCollector();
        io.sentry.android.core.internal.tombstone.b f = c.f();
        if (f != null) {
            ((CopyOnWriteArrayList) f.d).add(this);
        }
        return this.g;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, io.sentry.protocol.w] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, io.sentry.protocol.w] */
    /* JADX WARN: Type inference failed for: r7v0, types: [io.sentry.android.core.h1] */
    public final void h() {
        io.sentry.e1 g = g();
        io.sentry.android.core.internal.tombstone.b f = g.f();
        if (f != null && (f.g(io.sentry.m.All) || f.g(io.sentry.m.ProfileChunkUi))) {
            this.a.f(p5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            i(false);
            return;
        }
        if (g.getOptions().getConnectionStatusProvider().T() == io.sentry.p0.DISCONNECTED) {
            this.a.f(p5.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
            i(false);
            return;
        }
        this.m = g.getOptions().getDateProvider().a();
        final j1 j1Var = (j1) this.c.get();
        this.d = j1Var;
        if (j1Var.h) {
            j1Var.a.f(p5.WARNING, "PerfettoProfiler was already started.", new Object[0]);
        } else {
            j1Var.h = true;
            if (j1Var.c == null) {
                j1Var.a.f(p5.WARNING, "ProfilingManager is not available.", new Object[0]);
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("KEY_DURATION_MS", 60000);
                bundle.putInt("KEY_FREQUENCY_HZ", 101);
                try {
                    so0.q(j1Var.c, bundle, j1Var.d, new bk0(1), new Consumer() { // from class: io.sentry.android.core.h1
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            j1 j1Var2 = j1.this;
                            ProfilingResult profilingResult = (ProfilingResult) obj;
                            j1Var2.a.f(p5.DEBUG, "Perfetto ProfilingResult received: errorCode=%d, filePath=%s", Integer.valueOf(profilingResult.getErrorCode()), profilingResult.getResultFilePath());
                            synchronized (j1Var2.e) {
                                try {
                                    j1Var2.f = profilingResult;
                                    Consumer consumer = j1Var2.g;
                                    if (consumer != null) {
                                        consumer.accept(j1Var2.b(profilingResult));
                                        j1Var2.g = null;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                    this.f = true;
                    io.sentry.protocol.w wVar = this.j;
                    io.sentry.protocol.w wVar2 = io.sentry.protocol.w.b;
                    if (wVar.equals(wVar2)) {
                        this.j = new Object();
                    }
                    if (this.k.equals(wVar2)) {
                        this.k = new Object();
                    }
                    qw5 qw5Var = this.e;
                    io.sentry.l lVar = this.h;
                    String a = this.k.a();
                    qw5Var.d = lVar;
                    qw5Var.e = a;
                    qw5Var.a = SystemClock.elapsedRealtimeNanos();
                    ((ConcurrentLinkedDeque) qw5Var.f).clear();
                    ((ConcurrentLinkedDeque) qw5Var.g).clear();
                    ((ConcurrentLinkedDeque) qw5Var.h).clear();
                    qw5Var.c = ((io.sentry.android.core.internal.util.p) qw5Var.b).a(new u(qw5Var, 1));
                    if (lVar != null) {
                        lVar.f(a);
                    }
                    try {
                        this.i = this.b.b.getExecutorService().b(new com.appsflyer.a(this, 13), RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
                        return;
                    } catch (RejectedExecutionException e) {
                        this.a.d(p5.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
                        this.o = true;
                        return;
                    }
                } catch (Throwable th) {
                    j1Var.a.d(p5.ERROR, "Failed to request Profiling.", th);
                }
            }
        }
        this.a.f(p5.ERROR, "Failed to start Perfetto profiling. PerfettoProfiler.start() returned false.", new Object[0]);
    }

    public final void i(boolean z) {
        io.sentry.e1 e1Var;
        p6 p6Var;
        j1 j1Var;
        final boolean z2;
        String str;
        long j;
        long j2;
        j1 j1Var2 = this.d;
        Future future = this.i;
        if (future != null) {
            future.cancel(false);
        }
        if (j1Var2 != null && this.f) {
            io.sentry.e1 g = g();
            p6 options = g.getOptions();
            qw5 qw5Var = this.e;
            final HashMap hashMap = new HashMap();
            ((io.sentry.android.core.internal.util.p) qw5Var.b).b((String) qw5Var.c);
            qw5Var.c = null;
            ConcurrentLinkedDeque concurrentLinkedDeque = (ConcurrentLinkedDeque) qw5Var.h;
            ConcurrentLinkedDeque concurrentLinkedDeque2 = (ConcurrentLinkedDeque) qw5Var.g;
            ConcurrentLinkedDeque concurrentLinkedDeque3 = (ConcurrentLinkedDeque) qw5Var.f;
            if (!concurrentLinkedDeque3.isEmpty()) {
                hashMap.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", new ArrayList(concurrentLinkedDeque3)));
            }
            if (!concurrentLinkedDeque2.isEmpty()) {
                hashMap.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", new ArrayList(concurrentLinkedDeque2)));
            }
            if (!concurrentLinkedDeque.isEmpty()) {
                hashMap.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", new ArrayList(concurrentLinkedDeque)));
            }
            io.sentry.l lVar = (io.sentry.l) qw5Var.d;
            if (lVar != null && (str = (String) qw5Var.e) != null) {
                List b = lVar.b(str);
                long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long j3 = qw5Var.a;
                if (b != null) {
                    ArrayList arrayList = (ArrayList) b;
                    if (!arrayList.isEmpty()) {
                        ArrayDeque arrayDeque = new ArrayDeque(arrayList.size());
                        ArrayDeque arrayDeque2 = new ArrayDeque(arrayList.size());
                        ArrayDeque arrayDeque3 = new ArrayDeque(arrayList.size());
                        synchronized (b) {
                            try {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    n3 n3Var = (n3) it.next();
                                    io.sentry.e1 e1Var2 = g;
                                    p6 p6Var2 = options;
                                    long j4 = n3Var.g;
                                    long j5 = (elapsedRealtimeNanos - (nanos - j4)) - j3;
                                    Iterator it2 = it;
                                    if (n3Var.b) {
                                        j = elapsedRealtimeNanos;
                                        j2 = j3;
                                        arrayDeque.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Double.valueOf(n3Var.a), j4));
                                    } else {
                                        j = elapsedRealtimeNanos;
                                        j2 = j3;
                                    }
                                    if (n3Var.d) {
                                        arrayDeque2.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Long.valueOf(n3Var.c), j4));
                                    }
                                    if (n3Var.f) {
                                        arrayDeque3.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Long.valueOf(n3Var.e), j4));
                                    }
                                    g = e1Var2;
                                    options = p6Var2;
                                    it = it2;
                                    elapsedRealtimeNanos = j;
                                    j3 = j2;
                                }
                                e1Var = g;
                                p6Var = options;
                            } finally {
                            }
                        }
                        if (!arrayDeque.isEmpty()) {
                            hashMap.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque));
                        }
                        if (!arrayDeque2.isEmpty()) {
                            hashMap.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
                        }
                        if (!arrayDeque3.isEmpty()) {
                            hashMap.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque3));
                        }
                        j1Var = null;
                    }
                }
                e1Var = g;
                p6Var = options;
                j1Var = null;
            } else {
                e1Var = g;
                p6Var = options;
                j1Var = null;
            }
            qw5Var.d = j1Var;
            qw5Var.e = j1Var;
            final io.sentry.protocol.w wVar = this.j;
            final io.sentry.protocol.w wVar2 = this.k;
            final y4 y4Var = this.m;
            this.f = false;
            this.d = j1Var;
            io.sentry.protocol.w wVar3 = io.sentry.protocol.w.b;
            this.k = wVar3;
            if (!z || this.o) {
                this.j = wVar3;
            }
            if (z && !this.o) {
                z2 = true;
            } else {
                z2 = false;
            }
            final io.sentry.e1 e1Var3 = e1Var;
            final p6 p6Var3 = p6Var;
            Consumer consumer = new Consumer() { // from class: io.sentry.android.core.e1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    File file = (File) obj;
                    g1 g1Var = g1.this;
                    io.sentry.x0 x0Var = g1Var.a;
                    if (file == null) {
                        x0Var.f(p5.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                    } else {
                        p3 p3Var = new p3(wVar, wVar2, hashMap, file, y4Var);
                        p3Var.f = "application/x-perfetto-trace";
                        io.sentry.e1 e1Var4 = e1Var3;
                        p6 p6Var4 = p6Var3;
                        com.appsflyer.internal.p pVar = new com.appsflyer.internal.p(g1Var, e1Var4, p3Var, p6Var4, 3);
                        try {
                            if (Thread.currentThread().getName().startsWith("SentryExecutorServiceThreadFactory")) {
                                pVar.run();
                            } else {
                                g1Var.b.b.getExecutorService().submit(pVar);
                            }
                        } catch (Throwable th) {
                            p6Var4.getLogger().d(p5.DEBUG, "Failed to send profile chunk.", th);
                        }
                    }
                    if (z2) {
                        io.sentry.util.a aVar = g1Var.r;
                        aVar.e();
                        try {
                            if (!g1Var.f && !g1Var.l.get() && !g1Var.o) {
                                x0Var.f(p5.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                                g1Var.h();
                                aVar.close();
                            }
                            x0Var.f(p5.DEBUG, "Profile chunk finished, but profiler was already restarted, closed or stopped. Skipping.", new Object[0]);
                            aVar.close();
                        } finally {
                        }
                    } else {
                        x0Var.f(p5.DEBUG, "Profile chunk finished.", new Object[0]);
                    }
                }
            };
            if (!j1Var2.h) {
                j1Var2.a.f(p5.WARNING, "PerfettoProfiler was never started", new Object[0]);
                consumer.accept(null);
                return;
            }
            j1Var2.d.cancel();
            synchronized (j1Var2.e) {
                try {
                    ProfilingResult profilingResult = j1Var2.f;
                    if (profilingResult != null) {
                        consumer.accept(j1Var2.b(profilingResult));
                        return;
                    }
                    j1Var2.g = consumer;
                    try {
                        j1Var2.b.b(new com.appsflyer.a(j1Var2, 14), 5000L);
                        return;
                    } catch (RejectedExecutionException e) {
                        j1Var2.a.d(p5.DEBUG, "Failed to schedule profiling result timeout.", e);
                        return;
                    }
                } finally {
                }
            }
        }
        io.sentry.protocol.w wVar4 = io.sentry.protocol.w.b;
        this.j = wVar4;
        this.k = wVar4;
    }
}
