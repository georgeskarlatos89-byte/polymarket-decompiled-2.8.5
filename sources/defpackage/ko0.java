package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ko0 extends b3j {
    private static final go0 Companion = new Object();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static ko0 idleSentinel;
    private static final ReentrantLock lock;
    private static final k6f queue;
    public int index = -1;
    private int state;
    private long timeoutAt;

    /* JADX WARN: Type inference failed for: r0v0, types: [go0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k6f] */
    static {
        ?? obj = new Object();
        obj.b = new ko0[8];
        queue = obj;
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        condition = newCondition;
        IDLE_TIMEOUT_MILLIS = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
    }

    public static final /* synthetic */ go0 access$getCompanion$p() {
        return Companion;
    }

    public static final /* synthetic */ Condition access$getCondition$cp() {
        return condition;
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_MILLIS$cp() {
        return IDLE_TIMEOUT_MILLIS;
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_NANOS$cp() {
        return IDLE_TIMEOUT_NANOS;
    }

    public static final /* synthetic */ ko0 access$getIdleSentinel$cp() {
        return idleSentinel;
    }

    public static final /* synthetic */ ReentrantLock access$getLock$cp() {
        return lock;
    }

    public static final /* synthetic */ k6f access$getQueue$cp() {
        return queue;
    }

    public static final /* synthetic */ void access$setIdleSentinel$cp(ko0 ko0Var) {
        idleSentinel = ko0Var;
    }

    public static final /* synthetic */ void access$setState$p(ko0 ko0Var, int i) {
        ko0Var.state = i;
    }

    public static /* synthetic */ void setTimeoutAt$okio$default(ko0 ko0Var, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = System.nanoTime();
            }
            ko0Var.setTimeoutAt$okio(j);
            return;
        }
        py2.f("Super calls with default arguments not supported in this target, function: setTimeoutAt");
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    @Override // defpackage.b3j
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                queue.b(this);
                this.state = 3;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos == 0 && !hasDeadline) {
            return;
        }
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 0) {
                this.state = 1;
                Companion.getClass();
                go0.b(this);
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i = this.state;
            boolean z = false;
            this.state = 0;
            if (i == 1) {
                queue.b(this);
                return false;
            }
            if (i == 2) {
                z = true;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long getTimeoutAt$okio() {
        return this.timeoutAt;
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long remainingNanos$okio(long j) {
        return this.timeoutAt - j;
    }

    public final void setTimeoutAt$okio(long j) {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos() != 0 && hasDeadline()) {
            this.timeoutAt = Math.min(timeoutNanos, deadlineNanoTime() - j) + j;
            return;
        }
        if (timeoutNanos != 0) {
            this.timeoutAt = j + timeoutNanos;
        } else if (hasDeadline) {
            this.timeoutAt = deadlineNanoTime();
        } else {
            f27.p();
        }
    }

    public final y8h sink(y8h y8hVar) {
        y8hVar.getClass();
        return new io0(this, y8hVar);
    }

    public final meh source(meh mehVar) {
        mehVar.getClass();
        return new jo0(this, mehVar);
    }

    public final <T> T withTimeout(Function0<? extends T> function0) {
        function0.getClass();
        enter();
        try {
            T invoke = function0.invoke();
            if (!exit()) {
                return invoke;
            }
            throw access$newTimeoutException(null);
        } catch (IOException e) {
            if (!exit()) {
                throw e;
            }
            throw access$newTimeoutException(e);
        } finally {
            exit();
        }
    }

    public void timedOut() {
    }
}
