package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class v2 implements ujb {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(v2.class.getName());
    public static final d7n f;
    public static final Object g;
    public volatile Object a;
    public volatile h2 b;
    public volatile t2 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [d7n] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    static {
        ?? r4;
        try {
            th = null;
            r4 = new j2(AtomicReferenceFieldUpdater.newUpdater(t2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(t2.class, t2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(v2.class, t2.class, "c"), AtomicReferenceFieldUpdater.newUpdater(v2.class, h2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(v2.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            r4 = new Object();
        }
        f = r4;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void b(v2 v2Var) {
        h2 h2Var;
        h2 h2Var2;
        h2 h2Var3 = null;
        while (true) {
            t2 t2Var = v2Var.c;
            if (f.d(v2Var, t2Var, t2.c)) {
                while (t2Var != null) {
                    Thread thread = t2Var.a;
                    if (thread != null) {
                        t2Var.a = null;
                        LockSupport.unpark(thread);
                    }
                    t2Var = t2Var.b;
                }
                do {
                    h2Var = v2Var.b;
                } while (!f.b(v2Var, h2Var, h2.d));
                while (true) {
                    h2Var2 = h2Var3;
                    h2Var3 = h2Var;
                    if (h2Var3 == null) {
                        break;
                    }
                    h2Var = h2Var3.c;
                    h2Var3.c = h2Var2;
                }
                while (h2Var2 != null) {
                    h2Var3 = h2Var2.c;
                    Runnable runnable = h2Var2.a;
                    if (runnable instanceof l2) {
                        l2 l2Var = (l2) runnable;
                        v2Var = l2Var.a;
                        if (v2Var.a == l2Var) {
                            if (f.c(v2Var, l2Var, e(l2Var.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, h2Var2.b);
                    }
                    h2Var2 = h2Var3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object d(Object obj) {
        if (!(obj instanceof b2)) {
            if (!(obj instanceof f2)) {
                if (obj == g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((f2) obj).a);
        }
        Throwable th = ((b2) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object e(ujb ujbVar) {
        Object obj;
        if (ujbVar instanceof v2) {
            Object obj2 = ((v2) ujbVar).a;
            if (obj2 instanceof b2) {
                b2 b2Var = (b2) obj2;
                if (b2Var.a) {
                    if (b2Var.b != null) {
                        return new b2(b2Var.b, false);
                    }
                    return b2.d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = ujbVar.isCancelled();
        boolean z = true;
        if ((!d) & isCancelled) {
            return b2.d;
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
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new f2(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + ujbVar, e2));
                }
                return new b2(e2, false);
            } catch (ExecutionException e3) {
                return new f2(e3.getCause());
            } catch (Throwable th2) {
                return new f2(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (obj == null) {
            return g;
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        String valueOf;
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
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb.append(valueOf);
        sb.append("]");
    }

    @Override // defpackage.ujb
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        h2 h2Var = this.b;
        h2 h2Var2 = h2.d;
        if (h2Var != h2Var2) {
            h2 h2Var3 = new h2(runnable, executor);
            do {
                h2Var3.c = h2Var;
                if (f.b(this, h2Var, h2Var3)) {
                    return;
                } else {
                    h2Var = this.b;
                }
            } while (h2Var != h2Var2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        b2 b2Var;
        boolean z3;
        Object obj = this.a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof l2))) {
            return false;
        }
        if (d) {
            b2Var = new b2(new CancellationException("Future.cancel() was called."), z);
        } else if (z) {
            b2Var = b2.c;
        } else {
            b2Var = b2.d;
        }
        boolean z4 = false;
        while (true) {
            if (f.c(this, obj, b2Var)) {
                b(this);
                if (!(obj instanceof l2)) {
                    break;
                }
                ujb ujbVar = ((l2) obj).b;
                if (ujbVar instanceof v2) {
                    this = (v2) ujbVar;
                    obj = this.a;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof l2)) {
                        break;
                    }
                    z4 = true;
                } else {
                    ujbVar.cancel(z);
                    break;
                }
            } else {
                obj = this.a;
                if (!(obj instanceof l2)) {
                    return z4;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String f() {
        String valueOf;
        Object obj = this.a;
        if (obj instanceof l2) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ujb ujbVar = ((l2) obj).b;
            if (ujbVar == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(ujbVar);
            }
            return woa.r(sb, valueOf, "]");
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void g(t2 t2Var) {
        t2Var.a = null;
        while (true) {
            t2 t2Var2 = this.c;
            if (t2Var2 != t2.c) {
                t2 t2Var3 = null;
                while (t2Var2 != null) {
                    t2 t2Var4 = t2Var2.b;
                    if (t2Var2.a != null) {
                        t2Var3 = t2Var2;
                    } else if (t2Var3 != null) {
                        t2Var3.b = t2Var4;
                        if (t2Var3.a == null) {
                            break;
                        }
                    } else if (!f.d(this, t2Var2, t2Var4)) {
                        break;
                    }
                    t2Var2 = t2Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        t2 t2Var = t2.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & (!(obj instanceof l2))) {
                return d(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                t2 t2Var2 = this.c;
                if (t2Var2 != t2Var) {
                    t2 t2Var3 = new t2();
                    z2 = true;
                    do {
                        d7n d7nVar = f;
                        d7nVar.e(t2Var3, t2Var2);
                        if (d7nVar.d(this, t2Var2, t2Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5 & (!(obj2 instanceof l2))) {
                                        return d(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    g(t2Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            g(t2Var3);
                        } else {
                            t2Var2 = this.c;
                        }
                    } while (t2Var2 != t2Var);
                }
                return d(this.a);
            }
            z2 = true;
            while (nanos > 0) {
                Object obj3 = this.a;
                if (obj3 != null) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                if (z4 & (!(obj3 instanceof l2))) {
                    return d(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String v2Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            StringBuilder p = ace.p(j, "Waited ", ApiConstant.SPACE);
            p.append(timeUnit.toString().toLowerCase(locale));
            String sb = p.toString();
            if (nanos + 1000 < 0) {
                String concat = sb.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (convert > 0) {
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
            throw new TimeoutException(sv6.n(sb, " for ", v2Var));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof b2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(r2 instanceof l2)) & z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof b2) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = f();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                ix2.C(sb, "PENDING, info=[", str, "]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        t2 t2Var = t2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof l2))) {
                return d(obj2);
            }
            t2 t2Var2 = this.c;
            if (t2Var2 != t2Var) {
                t2 t2Var3 = new t2();
                do {
                    d7n d7nVar = f;
                    d7nVar.e(t2Var3, t2Var2);
                    if (d7nVar.d(this, t2Var2, t2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                g(t2Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof l2))));
                        return d(obj);
                    }
                    t2Var2 = this.c;
                } while (t2Var2 != t2Var);
            }
            return d(this.a);
        }
        throw new InterruptedException();
    }
}
