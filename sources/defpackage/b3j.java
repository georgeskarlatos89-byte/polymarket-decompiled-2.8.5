package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class b3j {
    public static final a3j Companion = new Object();
    public static final b3j NONE = new Object();
    private volatile Object cancelMark;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public void awaitSignal(Condition condition) {
        condition.getClass();
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - System.nanoTime());
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - System.nanoTime();
            }
            if (timeoutNanos > 0) {
                Object obj = this.cancelMark;
                if (condition.awaitNanos(timeoutNanos) > 0 || this.cancelMark != obj) {
                    return;
                } else {
                    throw new InterruptedIOException("timeout");
                }
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void cancel() {
        this.cancelMark = new Object();
    }

    public b3j clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public b3j clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final b3j deadline(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j > 0) {
            return deadlineNanoTime(timeUnit.toNanos(j) + System.nanoTime());
        }
        f27.q(woa.m(j, "duration <= 0: "));
        return null;
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        dmk.n("No deadline");
        return 0L;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(b3j b3jVar, Function0<? extends T> function0) {
        b3jVar.getClass();
        function0.getClass();
        long timeoutNanos = timeoutNanos();
        a3j a3jVar = Companion;
        long timeoutNanos2 = b3jVar.timeoutNanos();
        long timeoutNanos3 = timeoutNanos();
        a3jVar.getClass();
        if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
            timeoutNanos2 = timeoutNanos3;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(timeoutNanos2, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (b3jVar.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), b3jVar.deadlineNanoTime()));
            }
            try {
                return function0.invoke();
            } finally {
                timeout(timeoutNanos, timeUnit);
                if (b3jVar.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
            }
        }
        if (b3jVar.hasDeadline()) {
            deadlineNanoTime(b3jVar.deadlineNanoTime());
        }
        try {
            return function0.invoke();
        } finally {
            timeout(timeoutNanos, timeUnit);
            if (b3jVar.hasDeadline()) {
                clearDeadline();
            }
        }
    }

    public void throwIfReached() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public b3j timeout(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        f27.q(woa.m(j, "timeout < 0: "));
        return null;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public void waitUntilNotified(Object obj) {
        obj.getClass();
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                Object obj2 = this.cancelMark;
                long j = timeoutNanos / 1000000;
                obj.wait(j, (int) (timeoutNanos - (1000000 * j)));
                if (System.nanoTime() - nanoTime < timeoutNanos || this.cancelMark != obj2) {
                    return;
                } else {
                    throw new InterruptedIOException("timeout");
                }
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public b3j deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
