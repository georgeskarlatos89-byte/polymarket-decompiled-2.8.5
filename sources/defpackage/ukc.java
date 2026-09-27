package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ukc extends vpl implements ScheduledFuture, ujb, Future {
    public final u2 c;
    public final ScheduledFuture d;

    public ukc(u2 u2Var, ScheduledFuture scheduledFuture) {
        this.c = u2Var;
        this.d = scheduledFuture;
    }

    @Override // defpackage.vpl
    public final Object a() {
        return this.c;
    }

    @Override // defpackage.ujb
    public final void addListener(Runnable runnable, Executor executor) {
        this.c.addListener(runnable, executor);
    }

    public final boolean c(boolean z) {
        return this.c.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean c = c(z);
        if (c) {
            this.d.cancel(z);
        }
        return c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.d.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.c.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.d.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.c.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.c.get(j, timeUnit);
    }
}
