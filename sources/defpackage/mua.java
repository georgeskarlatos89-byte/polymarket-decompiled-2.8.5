package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mua implements Future {
    public volatile Object a = null;
    public volatile Throwable b = null;
    public volatile boolean c = false;
    public final Object d = new Object();
    public ArrayList e = new ArrayList();

    public final List a(Object obj, Throwable th) {
        synchronized (this.d) {
            try {
                if (this.c) {
                    return null;
                }
                this.a = obj;
                this.b = th;
                this.c = true;
                ArrayList arrayList = this.e;
                this.e = null;
                this.d.notifyAll();
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Object obj) {
        List a = a(obj, null);
        if (a != null) {
            Iterator it = ((ArrayList) a).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        long nanoTime = System.nanoTime() + nanos;
        synchronized (this.d) {
            while (!this.c && nanos > 0) {
                try {
                    TimeUnit.NANOSECONDS.timedWait(this.d, nanos);
                    nanos = nanoTime - System.nanoTime();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.c) {
            if (this.b == null) {
                return this.a;
            }
            throw new ExecutionException(this.b);
        }
        throw new TimeoutException("LDAwaitFuture timed out awaiting completion");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        synchronized (this.d) {
            while (!this.c) {
                try {
                    this.d.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.b == null) {
            return this.a;
        }
        throw new ExecutionException(this.b);
    }
}
