package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class u2 implements ujb {
    private static final z1 ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    static final b3b log;
    private volatile g2 listeners;
    private volatile Object value;
    private volatile s2 waiters;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [z1] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        boolean z;
        Throwable th;
        ?? i2Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        GENERATE_CANCELLATION_CAUSES = z;
        log = new b3b(u2.class);
        Throwable th2 = null;
        try {
            th = null;
            i2Var = new Object();
        } catch (Error | Exception e) {
            th = e;
            try {
                i2Var = new i2(AtomicReferenceFieldUpdater.newUpdater(s2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(s2.class, s2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(u2.class, s2.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(u2.class, g2.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(u2.class, Object.class, "value"));
            } catch (Error | Exception e2) {
                th2 = e2;
                i2Var = new Object();
            }
        }
        ATOMIC_HELPER = i2Var;
        if (th2 != null) {
            b3b b3bVar = log;
            Logger a = b3bVar.a();
            Level level = Level.SEVERE;
            a.log(level, "UnsafeAtomicHelper is broken!", th);
            b3bVar.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        NULL = new Object();
    }

    public static /* synthetic */ z1 access$200() {
        return ATOMIC_HELPER;
    }

    public static /* synthetic */ Object access$300(u2 u2Var) {
        return u2Var.value;
    }

    public static /* synthetic */ Object access$302(u2 u2Var, Object obj) {
        u2Var.value = obj;
        return obj;
    }

    public static /* synthetic */ Object access$400(ujb ujbVar) {
        return f(ujbVar);
    }

    public static /* synthetic */ void access$500(u2 u2Var, boolean z) {
        c(u2Var, z);
    }

    public static /* synthetic */ g2 access$700(u2 u2Var) {
        return u2Var.listeners;
    }

    public static /* synthetic */ g2 access$702(u2 u2Var, g2 g2Var) {
        u2Var.listeners = g2Var;
        return g2Var;
    }

    public static /* synthetic */ s2 access$800(u2 u2Var) {
        return u2Var.waiters;
    }

    public static /* synthetic */ s2 access$802(u2 u2Var, s2 s2Var) {
        u2Var.waiters = s2Var;
        return s2Var;
    }

    public static void c(u2 u2Var, boolean z) {
        g2 g2Var = null;
        while (true) {
            u2Var.getClass();
            for (s2 e = ATOMIC_HELPER.e(u2Var); e != null; e = e.b) {
                Thread thread = e.a;
                if (thread != null) {
                    e.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                u2Var.interruptTask();
                z = false;
            }
            u2Var.afterDone();
            g2 g2Var2 = g2Var;
            g2 d = ATOMIC_HELPER.d(u2Var);
            g2 g2Var3 = g2Var2;
            while (d != null) {
                g2 g2Var4 = d.c;
                d.c = g2Var3;
                g2Var3 = d;
                d = g2Var4;
            }
            while (g2Var3 != null) {
                g2Var = g2Var3.c;
                Runnable runnable = g2Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof k2) {
                    k2 k2Var = (k2) runnable;
                    u2Var = k2Var.a;
                    if (u2Var.value == k2Var) {
                        if (ATOMIC_HELPER.b(u2Var, k2Var, f(k2Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = g2Var3.b;
                    Objects.requireNonNull(executor);
                    d(runnable, executor);
                }
                g2Var3 = g2Var;
            }
            return;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            log.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof a2)) {
            if (!(obj instanceof e2)) {
                if (obj == NULL) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((e2) obj).a);
        }
        Throwable th = ((a2) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object f(ujb ujbVar) {
        Object obj;
        Throwable tryInternalFastPathGetFailure;
        if (ujbVar instanceof o2) {
            Object obj2 = ((u2) ujbVar).value;
            if (obj2 instanceof a2) {
                a2 a2Var = (a2) obj2;
                if (a2Var.a) {
                    obj2 = a2Var.b != null ? new a2(a2Var.b, false) : a2.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((ujbVar instanceof u2) && (tryInternalFastPathGetFailure = ((u2) ujbVar).tryInternalFastPathGetFailure()) != null) {
            return new e2(tryInternalFastPathGetFailure);
        }
        boolean isCancelled = ujbVar.isCancelled();
        boolean z = true;
        if ((!GENERATE_CANCELLATION_CAUSES) & isCancelled) {
            a2 a2Var2 = a2.d;
            Objects.requireNonNull(a2Var2);
            return a2Var2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = ujbVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | Exception e) {
                return new e2(e);
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new e2(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + ujbVar, e2));
                }
                return new a2(e2, false);
            } catch (ExecutionException e3) {
                if (isCancelled) {
                    return new a2(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + ujbVar, e3), false);
                }
                return new e2(e3.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (isCancelled) {
            return new a2(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + ujbVar), false);
        }
        if (obj == null) {
            return NULL;
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        b(sb, obj);
        sb.append("]");
    }

    @Override // defpackage.ujb
    public void addListener(Runnable runnable, Executor executor) {
        g2 g2Var;
        g2 g2Var2 = g2.d;
        brn.m(runnable, "Runnable was null.");
        brn.m(executor, "Executor was null.");
        if (!isDone() && (g2Var = this.listeners) != g2Var2) {
            g2 g2Var3 = new g2(runnable, executor);
            do {
                g2Var3.c = g2Var;
                if (ATOMIC_HELPER.a(this, g2Var, g2Var3)) {
                    return;
                } else {
                    g2Var = this.listeners;
                }
            } while (g2Var != g2Var2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2;
        a2 a2Var;
        boolean z3;
        Object obj = this.value;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof k2))) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            a2Var = new a2(new CancellationException("Future.cancel() was called."), z);
        } else {
            if (z) {
                a2Var = a2.c;
            } else {
                a2Var = a2.d;
            }
            Objects.requireNonNull(a2Var);
        }
        boolean z4 = false;
        while (true) {
            if (ATOMIC_HELPER.b(this, obj, a2Var)) {
                c(this, z);
                if (!(obj instanceof k2)) {
                    break;
                }
                ujb ujbVar = ((k2) obj).b;
                if (ujbVar instanceof o2) {
                    this = (u2) ujbVar;
                    obj = this.value;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof k2)) {
                        break;
                    }
                    z4 = true;
                } else {
                    ujbVar.cancel(z);
                    break;
                }
            } else {
                obj = this.value;
                if (!(obj instanceof k2)) {
                    return z4;
                }
            }
        }
        return true;
    }

    public final void g(s2 s2Var) {
        s2Var.a = null;
        while (true) {
            s2 s2Var2 = this.waiters;
            if (s2Var2 != s2.c) {
                s2 s2Var3 = null;
                while (s2Var2 != null) {
                    s2 s2Var4 = s2Var2.b;
                    if (s2Var2.a != null) {
                        s2Var3 = s2Var2;
                    } else if (s2Var3 != null) {
                        s2Var3.b = s2Var4;
                        if (s2Var3.a == null) {
                            break;
                        }
                    } else if (!ATOMIC_HELPER.c(this, s2Var2, s2Var4)) {
                        break;
                    }
                    s2Var2 = s2Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        boolean z2;
        long j3;
        boolean z3;
        boolean z4;
        boolean z5;
        s2 s2Var = s2.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & (!(obj instanceof k2))) {
                return e(obj);
            }
            long j4 = 0;
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                s2 s2Var2 = this.waiters;
                if (s2Var2 != s2Var) {
                    s2 s2Var3 = new s2();
                    z2 = true;
                    while (true) {
                        access$200().f(s2Var3, s2Var2);
                        if (ATOMIC_HELPER.c(this, s2Var2, s2Var3)) {
                            j3 = j4;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if (obj2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5 & (!(obj2 instanceof k2))) {
                                        return e(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    g(s2Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            g(s2Var3);
                        } else {
                            long j5 = j4;
                            s2Var2 = this.waiters;
                            if (s2Var2 == s2Var) {
                                break;
                            }
                            j4 = j5;
                        }
                    }
                }
                Object obj3 = this.value;
                Objects.requireNonNull(obj3);
                return e(obj3);
            }
            z2 = true;
            j3 = 0;
            while (nanos > j3) {
                Object obj4 = this.value;
                if (obj4 != null) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                if (z4 & (!(obj4 instanceof k2))) {
                    return e(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String u2Var = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            StringBuilder p = ace.p(j, "Waited ", ApiConstant.SPACE);
            p.append(timeUnit.toString().toLowerCase(locale));
            String sb = p.toString();
            if (nanos + 1000 < j3) {
                String concat = sb.concat(" (plus ");
                long j6 = -nanos;
                long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
                long nanos2 = j6 - timeUnit.toNanos(convert);
                if (convert != j3 && nanos2 <= 1000) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (convert > j3) {
                    String str = concat + convert + ApiConstant.SPACE + lowerCase;
                    if (z3) {
                        str = str.concat(",");
                    }
                    concat = str.concat(ApiConstant.SPACE);
                }
                if (z3) {
                    concat = ace.g(nanos2, concat, " nanoseconds ");
                }
                sb = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(sv6.n(sb, " for ", u2Var));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof a2;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean z;
        if (this.value != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(r2 instanceof k2)) & z;
    }

    public final void maybePropagateCancellationTo(Future<?> future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, obj)) {
            return false;
        }
        c(this, false);
        return true;
    }

    public boolean setException(Throwable th) {
        th.getClass();
        if (!ATOMIC_HELPER.b(this, null, new e2(th))) {
            return false;
        }
        c(this, false);
        return true;
    }

    public boolean setFuture(ujb ujbVar) {
        e2 e2Var;
        ujbVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (ujbVar.isDone()) {
                if (ATOMIC_HELPER.b(this, null, f(ujbVar))) {
                    c(this, false);
                    return true;
                }
                return false;
            }
            k2 k2Var = new k2(this, ujbVar);
            if (ATOMIC_HELPER.b(this, null, k2Var)) {
                try {
                    ujbVar.addListener(k2Var, pt6.INSTANCE);
                    return true;
                } catch (Throwable th) {
                    try {
                        e2Var = new e2(th);
                    } catch (Error | Exception unused) {
                        e2Var = e2.b;
                    }
                    ATOMIC_HELPER.b(this, k2Var, e2Var);
                    return true;
                }
            }
            obj = this.value;
        }
        if (obj instanceof a2) {
            ujbVar.cancel(((a2) obj).a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.value;
            if (obj instanceof k2) {
                sb.append(", setFuture=[");
                ujb ujbVar = ((k2) obj).b;
                try {
                    if (ujbVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(ujbVar);
                    }
                } catch (Exception | StackOverflowError e) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    str = npn.b(pendingToString());
                } catch (Exception | StackOverflowError e2) {
                    str = "Exception thrown from implementation: " + e2.getClass();
                }
                if (str != null) {
                    ix2.C(sb, ", info=[", str, "]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                a(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable tryInternalFastPathGetFailure() {
        if (this instanceof o2) {
            Object obj = this.value;
            if (obj instanceof e2) {
                return ((e2) obj).a;
            }
            return null;
        }
        return null;
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        if ((obj instanceof a2) && ((a2) obj).a) {
            return true;
        }
        return false;
    }

    public void afterDone() {
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        s2 s2Var = s2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof k2))) {
                return e(obj2);
            }
            s2 s2Var2 = this.waiters;
            if (s2Var2 != s2Var) {
                s2 s2Var3 = new s2();
                do {
                    access$200().f(s2Var3, s2Var2);
                    if (ATOMIC_HELPER.c(this, s2Var2, s2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                g(s2Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof k2))));
                        return e(obj);
                    }
                    s2Var2 = this.waiters;
                } while (s2Var2 != s2Var);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        throw new InterruptedException();
    }
}
