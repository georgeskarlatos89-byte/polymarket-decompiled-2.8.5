package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class r5 extends ue8 implements Runnable {
    public ujb a;
    public Object b;

    public r5(ujb ujbVar, Object obj) {
        ujbVar.getClass();
        this.a = ujbVar;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [r5, q5, ue8, java.lang.Runnable] */
    public static q5 i(ujb ujbVar, op8 op8Var, Executor executor) {
        op8Var.getClass();
        ?? r5Var = new r5(ujbVar, op8Var);
        ujbVar.addListener(r5Var, lhn.b(executor, r5Var));
        return r5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [r5, p5, ue8, java.lang.Runnable] */
    public static p5 j(ujb ujbVar, ym0 ym0Var, Executor executor) {
        executor.getClass();
        ?? r5Var = new r5(ujbVar, ym0Var);
        ujbVar.addListener(r5Var, lhn.b(executor, r5Var));
        return r5Var;
    }

    @Override // defpackage.u2
    public final void afterDone() {
        maybePropagateCancellationTo(this.a);
        this.a = null;
        this.b = null;
    }

    public abstract Object k(Object obj, Object obj2);

    public abstract void l(Object obj);

    @Override // defpackage.u2
    public final String pendingToString() {
        String str;
        ujb ujbVar = this.a;
        Object obj = this.b;
        String pendingToString = super.pendingToString();
        if (ujbVar != null) {
            str = "inputFuture=[" + ujbVar + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        }
        if (pendingToString != null) {
            return str.concat(pendingToString);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ujb ujbVar = this.a;
        Object obj = this.b;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (ujbVar == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (obj != null) {
            z2 = false;
        }
        if (z3 | z2) {
            return;
        }
        this.a = null;
        if (ujbVar.isCancelled()) {
            setFuture(ujbVar);
            return;
        }
        try {
            try {
                Object k = k(obj, pql.c(ujbVar));
                this.b = null;
                l(k);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    setException(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            setException(e2.getCause());
        } catch (Exception e3) {
            setException(e3);
        }
    }
}
