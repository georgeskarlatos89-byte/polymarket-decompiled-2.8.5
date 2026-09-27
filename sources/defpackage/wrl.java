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
public abstract class wrl implements Future {
    public static final boolean d;
    public static final bvl e;
    public static final ofn f;
    public static final Object g;
    public volatile Object a;
    public volatile qrl b;
    public volatile vrl c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [ofn] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        boolean z;
        Throwable th;
        Throwable th2;
        ?? rrlVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new bvl(wrl.class);
        try {
            th = null;
            th2 = null;
            rrlVar = new Object();
        } catch (Error | Exception e2) {
            try {
                th2 = e2;
                rrlVar = new rrl(AtomicReferenceFieldUpdater.newUpdater(vrl.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(vrl.class, vrl.class, "b"), AtomicReferenceFieldUpdater.newUpdater(wrl.class, vrl.class, "c"), AtomicReferenceFieldUpdater.newUpdater(wrl.class, qrl.class, "b"), AtomicReferenceFieldUpdater.newUpdater(wrl.class, Object.class, "a"));
                th = null;
            } catch (Error | Exception e3) {
                th = e3;
                th2 = e2;
                rrlVar = new Object();
            }
        }
        f = rrlVar;
        if (th != null) {
            bvl bvlVar = e;
            Logger a = bvlVar.a();
            Level level = Level.SEVERE;
            a.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            bvlVar.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void d(wrl wrlVar) {
        for (vrl o = f.o(wrlVar); o != null; o = o.b) {
            Thread thread = o.a;
            if (thread != null) {
                o.a = null;
                LockSupport.unpark(thread);
            }
        }
        wrlVar.b();
        qrl n = f.n(wrlVar);
        qrl qrlVar = null;
        while (n != null) {
            qrl qrlVar2 = n.c;
            n.c = qrlVar;
            qrlVar = n;
            n = qrlVar2;
        }
        while (qrlVar != null) {
            Runnable runnable = qrlVar.a;
            qrl qrlVar3 = qrlVar.c;
            Objects.requireNonNull(runnable);
            if (!(runnable instanceof srl)) {
                Executor executor = qrlVar.b;
                Objects.requireNonNull(executor);
                e(runnable, executor);
                qrlVar = qrlVar3;
            } else {
                throw null;
            }
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", m51.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object g(Object obj) {
        if (!(obj instanceof nrl)) {
            if (!(obj instanceof prl)) {
                if (obj == g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((prl) obj).a);
        }
        Throwable th = ((nrl) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a() {
        if (this instanceof ScheduledFuture) {
            return ace.g(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    public final void c(StringBuilder sb) {
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
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            } catch (Exception e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        nrl nrlVar;
        nrl nrlVar2;
        Object obj = this.a;
        boolean z3 = obj instanceof srl;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z3 | z2) {
            if (d) {
                nrlVar2 = new nrl(new CancellationException("Future.cancel() was called."), z);
            } else {
                if (z) {
                    nrlVar = nrl.c;
                } else {
                    nrlVar = nrl.d;
                }
                nrlVar2 = nrlVar;
                Objects.requireNonNull(nrlVar2);
            }
            while (!f.s(this, obj, nrlVar2)) {
                obj = this.a;
                if (!(obj instanceof srl)) {
                }
            }
            d(this);
            return true;
        }
        return false;
    }

    public final void f(vrl vrlVar) {
        vrlVar.a = null;
        while (true) {
            vrl vrlVar2 = this.c;
            if (vrlVar2 != vrl.c) {
                vrl vrlVar3 = null;
                while (vrlVar2 != null) {
                    vrl vrlVar4 = vrlVar2.b;
                    if (vrlVar2.a != null) {
                        vrlVar3 = vrlVar2;
                    } else if (vrlVar3 != null) {
                        vrlVar3.b = vrlVar4;
                        if (vrlVar3.a == null) {
                            break;
                        }
                    } else if (!f.t(this, vrlVar2, vrlVar4)) {
                        break;
                    }
                    vrlVar2 = vrlVar4;
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
        long j3;
        boolean z3;
        boolean z4;
        vrl vrlVar = vrl.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & (!(obj instanceof srl))) {
                return g(obj);
            }
            long j4 = 0;
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                vrl vrlVar2 = this.c;
                if (vrlVar2 != vrlVar) {
                    vrl vrlVar3 = new vrl();
                    z2 = true;
                    while (true) {
                        ofn ofnVar = f;
                        ofnVar.p(vrlVar3, vrlVar2);
                        if (ofnVar.t(this, vrlVar2, vrlVar3)) {
                            j3 = j4;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 & (!(obj2 instanceof srl))) {
                                        return g(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    f(vrlVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(vrlVar3);
                        } else {
                            long j5 = j4;
                            vrlVar2 = this.c;
                            if (vrlVar2 == vrlVar) {
                                break;
                            }
                            j4 = j5;
                        }
                    }
                }
                Object obj3 = this.a;
                Objects.requireNonNull(obj3);
                return g(obj3);
            }
            z2 = true;
            j3 = 0;
            while (nanos > j3) {
                Object obj4 = this.a;
                if (obj4 != null) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                if (z3 & (!(obj4 instanceof srl))) {
                    return g(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String wrlVar = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j + ApiConstant.SPACE + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j3) {
                String concat = str.concat(" (plus ");
                long j6 = -nanos;
                long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
                long nanos2 = j6 - timeUnit.toNanos(convert);
                if (convert != j3 && nanos2 <= 1000) {
                    z2 = false;
                }
                if (convert > j3) {
                    String str2 = concat + convert + ApiConstant.SPACE + lowerCase;
                    if (z2) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(ApiConstant.SPACE);
                }
                if (z2) {
                    concat = ace.g(nanos2, concat, " nanoseconds ");
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(sv6.n(str, " for ", wrlVar));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof nrl;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        Object obj = this.a;
        boolean z2 = obj instanceof srl;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return z & (!z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String a;
        boolean z;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.a instanceof nrl) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            String str = null;
            if (this.a instanceof srl) {
                sb.append(", setFuture=[");
                try {
                    sb.append((Object) null);
                } catch (Exception | StackOverflowError e2) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e2.getClass());
                }
                sb.append("]");
            } else {
                try {
                    a = a();
                } catch (Exception | StackOverflowError e3) {
                    str = "Exception thrown from implementation: ".concat(String.valueOf(e3.getClass()));
                }
                if (a != null) {
                    if (!a.isEmpty()) {
                        z = false;
                        if (!z) {
                            str = a;
                        }
                        if (str != null) {
                            ix2.C(sb, ", info=[", str, "]");
                        }
                    }
                }
                z = true;
                if (!z) {
                }
                if (str != null) {
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                c(sb);
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
        vrl vrlVar = vrl.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof srl))) {
                return g(obj2);
            }
            vrl vrlVar2 = this.c;
            if (vrlVar2 != vrlVar) {
                vrl vrlVar3 = new vrl();
                do {
                    ofn ofnVar = f;
                    ofnVar.p(vrlVar3, vrlVar2);
                    if (ofnVar.t(this, vrlVar2, vrlVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                f(vrlVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof srl))));
                        return g(obj);
                    }
                    vrlVar2 = this.c;
                } while (vrlVar2 != vrlVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
