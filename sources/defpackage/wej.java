package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class wej extends AtomicReference implements Runnable {
    public static final mb7 d = new mb7(1);
    public static final mb7 e = new mb7(1);
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xej b;
    public final Object c;

    public wej(xej xejVar, Callable callable) {
        this.b = xejVar;
        callable.getClass();
        this.c = callable;
    }

    public final void a(Object obj) {
        int i = this.a;
        xej xejVar = this.b;
        switch (i) {
            case 0:
                xejVar.setFuture((ujb) obj);
                return;
            default:
                xejVar.set(obj);
                return;
        }
    }

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        t6a t6aVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof t6a;
            mb7 mb7Var = e;
            if (!z2 && runnable != mb7Var) {
                break;
            }
            if (z2) {
                t6aVar = (t6a) runnable;
            }
            i++;
            if (i > 1000) {
                if (runnable == mb7Var || compareAndSet(runnable, mb7Var)) {
                    if (!Thread.interrupted() && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    LockSupport.park(t6aVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isDone;
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            int i = this.a;
            xej xejVar = this.b;
            switch (i) {
                case 0:
                    isDone = xejVar.isDone();
                    break;
                default:
                    isDone = xejVar.isDone();
                    break;
            }
            mb7 mb7Var = d;
            if (!isDone) {
                Object obj2 = this.c;
                try {
                    switch (i) {
                        case 0:
                            e3g e3gVar = (e3g) obj2;
                            Callable callable = (Callable) e3gVar.b;
                            pt6 pt6Var = pt6.INSTANCE;
                            xej xejVar2 = new xej(callable);
                            pt6Var.execute(xejVar2);
                            brn.l(xejVar2, e3gVar, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
                            obj = xejVar2;
                            break;
                        default:
                            obj = ((Callable) obj2).call();
                            break;
                    }
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, mb7Var)) {
                            b(currentThread);
                        }
                        if (!isDone) {
                            switch (i) {
                                case 0:
                                    xejVar.setException(th);
                                    return;
                                default:
                                    xejVar.setException(th);
                                    return;
                            }
                        }
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, mb7Var)) {
                            b(currentThread);
                        }
                        if (!isDone) {
                            a(obj);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        String obj;
        Runnable runnable = (Runnable) get();
        if (runnable == d) {
            str = "running=[DONE]";
        } else if (runnable instanceof t6a) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder t = sv6.t(str, ", ");
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                obj = ((e3g) obj2).toString();
                break;
            default:
                obj = ((Callable) obj2).toString();
                break;
        }
        t.append(obj);
        return t.toString();
    }

    public wej(xej xejVar, e3g e3gVar) {
        this.b = xejVar;
        this.c = e3gVar;
    }
}
