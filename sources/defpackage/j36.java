package defpackage;

import com.google.gson.Gson;
import java.io.Closeable;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class j36 implements Closeable {
    public static final Gson n = new Gson();
    public final kr1 a;
    public final ArrayBlockingQueue b;
    public final ScheduledExecutorService c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g;
    public final Object h;
    public ScheduledFuture i;
    public ScheduledFuture j;
    public ScheduledFuture k;
    public volatile boolean l;
    public final ba6 m;

    public j36(kr1 kr1Var, ScheduledExecutorService scheduledExecutorService, ba6 ba6Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.g = atomicBoolean;
        this.h = new Object();
        this.l = false;
        this.a = kr1Var;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(100);
        this.b = arrayBlockingQueue;
        this.c = scheduledExecutorService;
        this.m = ba6Var;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(kr1Var.a);
        this.e = atomicBoolean2;
        AtomicBoolean atomicBoolean3 = new AtomicBoolean(true);
        this.d = atomicBoolean3;
        new ur(kr1Var, scheduledExecutorService, arrayBlockingQueue, atomicBoolean2, atomicBoolean3, atomicBoolean, ba6Var);
        g(kr1Var.a, true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.compareAndSet(false, true)) {
            synchronized (this.h) {
                this.i = e(false, this.i, 0L, null);
                this.j = e(false, this.j, 0L, null);
                this.k = e(false, this.k, 0L, null);
            }
            if (!this.b.offer(new f36(h36.FLUSH, null, false))) {
                boolean z = this.l;
                this.l = true;
                if (!z) {
                    ((vua) this.m.b).x0(xua.WARN, "Events are being produced faster than they can be processed; some events will be dropped");
                }
            }
            f36 f36Var = new f36(h36.SHUTDOWN, null, true);
            if (this.b.offer(f36Var)) {
                Semaphore semaphore = f36Var.c;
                if (semaphore == null) {
                    return;
                }
                while (true) {
                    try {
                        semaphore.acquire();
                        return;
                    } catch (InterruptedException unused) {
                    }
                }
            } else {
                boolean z2 = this.l;
                this.l = true;
                if (!z2) {
                    ((vua) this.m.b).x0(xua.WARN, "Events are being produced faster than they can be processed; some events will be dropped");
                }
            }
        }
    }

    public final ScheduledFuture e(boolean z, ScheduledFuture scheduledFuture, long j, h36 h36Var) {
        if (z) {
            if (scheduledFuture != null) {
                return scheduledFuture;
            }
            return this.c.scheduleAtFixedRate(new yq8(this, h36Var, false, 5), j, j, TimeUnit.MILLISECONDS);
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        return null;
    }

    public final void g(boolean z, boolean z2) {
        boolean z3;
        ScheduledFuture scheduledFuture = this.i;
        kr1 kr1Var = this.a;
        kr1Var.getClass();
        this.i = e(!z2, scheduledFuture, 30000L, h36.FLUSH);
        if (!z2 && !z && ((zq6) kr1Var.b) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.k = e(z3, this.k, 900000L, h36.DIAGNOSTIC_STATS);
        if (!z && !z2 && !this.f.get() && ((zq6) kr1Var.b) != null) {
            if (!this.b.offer(new f36(h36.DIAGNOSTIC_INIT, null, false))) {
                boolean z4 = this.l;
                this.l = true;
                if (!z4) {
                    ((vua) this.m.b).x0(xua.WARN, "Events are being produced faster than they can be processed; some events will be dropped");
                }
            }
        }
    }
}
