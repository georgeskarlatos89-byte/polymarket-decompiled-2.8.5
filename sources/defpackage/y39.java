package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y39 extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {
    public final Handler a;

    static {
        new aj(8);
    }

    public y39(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(y39.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.a;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.ScheduledFuture, nq9] */
    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.a;
        x39 x39Var = new x39(handler, convert, callable);
        if (handler.postAtTime(x39Var, convert)) {
            return x39Var;
        }
        return new nq9(new RejectedExecutionException(handler + " is shutting down"), 1);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(y39.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(y39.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(y39.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException(y39.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new lu6(runnable, 2), j, timeUnit);
    }
}
