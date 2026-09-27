package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fzn extends Task {
    public final Object a = new Object();
    public final s8h b = new s8h(14);
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final void a(bid bidVar) {
        b(fpi.a, bidVar);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.b.u(new k8m(fpi.a, onCompleteListener));
        v();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final void b(Executor executor, bid bidVar) {
        this.b.u(new k8m(executor, bidVar));
        v();
    }

    @Override // com.google.android.gms.tasks.Task
    public final void c(Executor executor, OnCompleteListener onCompleteListener) {
        this.b.u(new k8m(executor, onCompleteListener));
        v();
    }

    @Override // com.google.android.gms.tasks.Task
    public final fzn d(iid iidVar) {
        e(fpi.a, iidVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final fzn e(Executor executor, iid iidVar) {
        this.b.u(new k8m(executor, iidVar));
        v();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final fzn f(tid tidVar) {
        g(fpi.a, tidVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final fzn g(Executor executor, tid tidVar) {
        this.b.u(new k8m(executor, tidVar));
        v();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.a) {
            try {
                arn.j("Task is not yet complete", this.c);
                if (!this.d) {
                    Exception exc = this.f;
                    if (exc == null) {
                        obj = this.e;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task h(p55 p55Var) {
        return i(fpi.a, p55Var);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task i(Executor executor, p55 p55Var) {
        fzn fznVar = new fzn();
        this.b.u(new inl(executor, p55Var, fznVar, 0));
        v();
        return fznVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task j(p55 p55Var) {
        return k(fpi.a, p55Var);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task k(Executor executor, p55 p55Var) {
        fzn fznVar = new fzn();
        this.b.u(new inl(executor, p55Var, fznVar, 1));
        v();
        return fznVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object l() {
        Object obj;
        synchronized (this.a) {
            try {
                arn.j("Task is not yet complete", this.c);
                if (!this.d) {
                    boolean isInstance = IOException.class.isInstance(this.f);
                    Exception exc = this.f;
                    if (!isInstance) {
                        if (exc == null) {
                            obj = this.e;
                        } else {
                            throw new RuntimeException(exc);
                        }
                    } else {
                        throw ((Throwable) IOException.class.cast(exc));
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean m() {
        return this.d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task o(xbi xbiVar) {
        p8a p8aVar = fpi.a;
        fzn fznVar = new fzn();
        this.b.u(new k8m(p8aVar, xbiVar, fznVar));
        v();
        return fznVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task p(Executor executor, xbi xbiVar) {
        fzn fznVar = new fzn();
        this.b.u(new k8m(executor, xbiVar, fznVar));
        v();
        return fznVar;
    }

    public final void q(Object obj) {
        synchronized (this.a) {
            u();
            this.c = true;
            this.e = obj;
        }
        this.b.w(this);
    }

    public final boolean r(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.w(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(Exception exc) {
        arn.i(exc, "Exception must not be null");
        synchronized (this.a) {
            u();
            this.c = true;
            this.f = exc;
        }
        this.b.w(this);
    }

    public final void t() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.w(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        String str;
        if (this.c) {
            if (n()) {
                Exception exception = getException();
                if (exception == null) {
                    if (!isSuccessful()) {
                        if (this.d) {
                            str = "cancellation";
                        } else {
                            str = "unknown issue";
                        }
                    } else {
                        str = "result ".concat(String.valueOf(getResult()));
                    }
                } else {
                    str = "failure";
                }
                throw new IllegalStateException("Complete with: ".concat(str), exception);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public final void v() {
        synchronized (this.a) {
            try {
                if (!this.c) {
                    return;
                }
                this.b.w(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
