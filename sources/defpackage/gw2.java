package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gw2 implements ujb {
    public final WeakReference a;
    public final fw2 b = new fw2(this);

    public gw2(cw2 cw2Var) {
        this.a = new WeakReference(cw2Var);
    }

    public final boolean a(Throwable th) {
        return this.b.j(th);
    }

    @Override // defpackage.ujb
    public final void addListener(Runnable runnable, Executor executor) {
        this.b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        cw2 cw2Var = (cw2) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && cw2Var != null) {
            cw2Var.a = null;
            cw2Var.b = null;
            cw2Var.c.i(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof y4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
