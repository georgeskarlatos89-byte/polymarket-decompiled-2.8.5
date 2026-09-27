package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kl8 extends ve8 {
    public final ujb a;

    public kl8(ujb ujbVar) {
        ujbVar.getClass();
        this.a = ujbVar;
    }

    @Override // defpackage.u2, defpackage.ujb
    public final void addListener(Runnable runnable, Executor executor) {
        this.a.addListener(runnable, executor);
    }

    @Override // defpackage.u2, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.u2, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.u2, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.u2, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.u2
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.u2, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
