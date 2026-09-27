package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class oq9 implements ujb {
    public static final oq9 b = new oq9(null);
    public static final b3b c = new b3b(oq9.class);
    public final Object a;

    public oq9(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ujb
    public final void addListener(Runnable runnable, Executor executor) {
        brn.m(runnable, "Runnable was null.");
        brn.m(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=SUCCESS, result=[");
        return ix2.o(sb, this.a, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a;
    }
}
