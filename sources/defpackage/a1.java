package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class a1 extends ue8 implements Runnable {
    public static final /* synthetic */ int d = 0;
    public ujb a;
    public Class b;
    public Object c;

    public a1(ujb ujbVar, Class cls, Object obj) {
        this.a = ujbVar;
        this.b = cls;
        this.c = obj;
    }

    @Override // defpackage.u2
    public final void afterDone() {
        maybePropagateCancellationTo(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public abstract Object i(Object obj, Throwable th);

    public abstract void j(Object obj);

    @Override // defpackage.u2
    public final String pendingToString() {
        String str;
        ujb ujbVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String pendingToString = super.pendingToString();
        if (ujbVar != null) {
            str = "inputFuture=[" + ujbVar + "], ";
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
        }
        if (pendingToString != null) {
            return str.concat(pendingToString);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        Object obj;
        ujb ujbVar = this.a;
        Class cls = this.b;
        Object obj2 = this.c;
        boolean z3 = false;
        if (ujbVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (cls == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z | z2;
        if (obj2 == null) {
            z3 = true;
        }
        if (!(z3 | z4) && !isCancelled()) {
            this.a = null;
            try {
                if (ujbVar instanceof u2) {
                    th = ((u2) ujbVar).tryInternalFastPathGetFailure();
                } else {
                    th = null;
                }
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    cause = new NullPointerException("Future type " + ujbVar.getClass() + " threw " + e.getClass() + " without a cause");
                }
                th = cause;
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                obj = pql.c(ujbVar);
                if (th != null) {
                    set(obj);
                    return;
                }
                if (!cls.isInstance(th)) {
                    setFuture(ujbVar);
                    return;
                }
                try {
                    Object i = i(obj2, th);
                    this.b = null;
                    this.c = null;
                    j(i);
                    return;
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        setException(th2);
                        return;
                    } finally {
                        this.b = null;
                        this.c = null;
                    }
                }
            }
            obj = null;
            if (th != null) {
            }
        }
    }
}
