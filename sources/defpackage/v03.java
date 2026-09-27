package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v03 implements Executor {
    public static final u03 c = new u03(0);
    public final Object a = new Object();
    public ThreadPoolExecutor b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public v03() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), c);
        threadPoolExecutor.setRejectedExecutionHandler(new Object());
        this.b = threadPoolExecutor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public final void a(sx2 sx2Var) {
        ThreadPoolExecutor threadPoolExecutor;
        sx2Var.getClass();
        synchronized (this.a) {
            try {
                if (this.b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new Object());
                    this.b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int max = Math.max(1, sx2Var.a().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.a) {
            this.b.execute(runnable);
        }
    }
}
