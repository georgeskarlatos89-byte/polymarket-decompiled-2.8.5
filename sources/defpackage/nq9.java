package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class nq9 implements ujb {
    public static final nq9 c = new nq9(null, 0);
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ nq9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ujb
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            o9n.c("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return obj;
            default:
                throw new ExecutionException((Throwable) obj);
        }
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
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(super.toString());
                sb.append("[status=SUCCESS, result=[");
                return ix2.o(sb, obj, "]]");
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) obj) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
