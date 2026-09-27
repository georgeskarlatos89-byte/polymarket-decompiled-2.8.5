package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xej extends ue8 implements RunnableFuture {
    public volatile wej a;

    public xej(Callable callable) {
        this.a = new wej(this, callable);
    }

    @Override // defpackage.u2
    public final void afterDone() {
        wej wejVar;
        super.afterDone();
        if (wasInterrupted() && (wejVar = this.a) != null) {
            mb7 mb7Var = wej.e;
            mb7 mb7Var2 = wej.d;
            Runnable runnable = (Runnable) wejVar.get();
            if (runnable instanceof Thread) {
                t6a t6aVar = new t6a(wejVar);
                t6aVar.a(Thread.currentThread());
                if (wejVar.compareAndSet(runnable, t6aVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) wejVar.getAndSet(mb7Var2)) == mb7Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.a = null;
    }

    @Override // defpackage.u2
    public final String pendingToString() {
        wej wejVar = this.a;
        if (wejVar != null) {
            return "task=[" + wejVar + "]";
        }
        return super.pendingToString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        wej wejVar = this.a;
        if (wejVar != null) {
            wejVar.run();
        }
        this.a = null;
    }
}
