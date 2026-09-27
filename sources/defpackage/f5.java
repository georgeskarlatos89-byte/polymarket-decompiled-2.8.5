package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.Locale;
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
/* loaded from: classes.dex */
public abstract class f5 implements ujb {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(f5.class.getName());
    public static final m7n f;
    public static final Object g;
    public volatile Object a;
    public volatile b5 b;
    public volatile e5 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [m7n] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    static {
        ?? r4;
        try {
            th = null;
            r4 = new c5(AtomicReferenceFieldUpdater.newUpdater(e5.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(e5.class, e5.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f5.class, e5.class, "c"), AtomicReferenceFieldUpdater.newUpdater(f5.class, b5.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f5.class, Object.class, "a"));
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

    public static void c(f5 f5Var) {
        e5 e5Var;
        b5 b5Var;
        b5 b5Var2;
        b5 b5Var3;
        do {
            e5Var = f5Var.c;
        } while (!f.c(f5Var, e5Var, e5.c));
        while (true) {
            b5Var = null;
            if (e5Var == null) {
                break;
            }
            Thread thread = e5Var.a;
            if (thread != null) {
                e5Var.a = null;
                LockSupport.unpark(thread);
            }
            e5Var = e5Var.b;
        }
        f5Var.b();
        do {
            b5Var2 = f5Var.b;
        } while (!f.a(f5Var, b5Var2, b5.d));
        while (true) {
            b5Var3 = b5Var;
            b5Var = b5Var2;
            if (b5Var == null) {
                break;
            }
            b5Var2 = b5Var.c;
            b5Var.c = b5Var3;
        }
        while (b5Var3 != null) {
            b5 b5Var4 = b5Var3.c;
            d(b5Var3.a, b5Var3.b);
            b5Var3 = b5Var4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof y4)) {
            if (!(obj instanceof a5)) {
                if (obj == g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((a5) obj).a);
        }
        Throwable th = ((y4) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object f(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        String valueOf;
        try {
            Object f2 = f(this);
            sb.append("SUCCESS, result=[");
            if (f2 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(f2);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // defpackage.ujb
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        b5 b5Var = this.b;
        b5 b5Var2 = b5.d;
        if (b5Var != b5Var2) {
            b5 b5Var3 = new b5(runnable, executor);
            do {
                b5Var3.c = b5Var;
                if (f.a(this, b5Var, b5Var3)) {
                    return;
                } else {
                    b5Var = this.b;
                }
            } while (b5Var != b5Var2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        y4 y4Var;
        Object obj = this.a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (d) {
                y4Var = new y4(new CancellationException("Future.cancel() was called."), z);
            } else if (z) {
                y4Var = y4.c;
            } else {
                y4Var = y4.d;
            }
            if (f.b(this, obj, y4Var)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        boolean z;
        e5 e5Var = e5.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return e(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                e5 e5Var2 = this.c;
                if (e5Var2 != e5Var) {
                    e5 e5Var3 = new e5();
                    do {
                        m7n m7nVar = f;
                        m7nVar.f(e5Var3, e5Var2);
                        if (m7nVar.c(this, e5Var2, e5Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return e(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    h(e5Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(e5Var3);
                        } else {
                            e5Var2 = this.c;
                        }
                    } while (e5Var2 != e5Var);
                }
                return e(this.a);
            }
            while (nanos > 0) {
                Object obj3 = this.a;
                if (obj3 != null) {
                    return e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String f5Var = toString();
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
                    z = false;
                } else {
                    z = true;
                }
                if (convert > 0) {
                    String str = concat + convert + ApiConstant.SPACE + lowerCase;
                    if (z) {
                        str = str.concat(",");
                    }
                    concat = str.concat(ApiConstant.SPACE);
                }
                if (z) {
                    concat = ace.g(nanos2, concat, " nanoseconds ");
                }
                sb = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(sv6.n(sb, " for ", f5Var));
        }
        throw new InterruptedException();
    }

    public final void h(e5 e5Var) {
        e5Var.a = null;
        while (true) {
            e5 e5Var2 = this.c;
            if (e5Var2 != e5.c) {
                e5 e5Var3 = null;
                while (e5Var2 != null) {
                    e5 e5Var4 = e5Var2.b;
                    if (e5Var2.a != null) {
                        e5Var3 = e5Var2;
                    } else if (e5Var3 != null) {
                        e5Var3.b = e5Var4;
                        if (e5Var3.a == null) {
                            break;
                        }
                    } else if (!f.c(this, e5Var2, e5Var4)) {
                        break;
                    }
                    e5Var2 = e5Var4;
                }
                return;
            }
            return;
        }
    }

    public boolean i(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (f.b(this, null, obj)) {
            c(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof y4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public boolean j(Throwable th) {
        th.getClass();
        if (f.b(this, null, new a5(th))) {
            c(this);
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof y4) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = g();
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

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        e5 e5Var = e5.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return e(obj2);
            }
            e5 e5Var2 = this.c;
            if (e5Var2 != e5Var) {
                e5 e5Var3 = new e5();
                do {
                    m7n m7nVar = f;
                    m7nVar.f(e5Var3, e5Var2);
                    if (m7nVar.c(this, e5Var2, e5Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                h(e5Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    e5Var2 = this.c;
                } while (e5Var2 != e5Var);
            }
            return e(this.a);
        }
        throw new InterruptedException();
    }
}
