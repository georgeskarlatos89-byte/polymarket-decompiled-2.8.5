package io.sentry;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class l0 {
    public static volatile l0 g;
    public static final io.sentry.util.a h = new Object();
    public final long a;
    public volatile String b;
    public volatile long c;
    public final AtomicBoolean d;
    public final com.socure.idplus.device.internal.viewModel.deviceV2.f e;
    public final ThreadPoolExecutor f;

    public l0() {
        com.socure.idplus.device.internal.viewModel.deviceV2.f fVar = new com.socure.idplus.device.internal.viewModel.deviceV2.f(1);
        this.d = new AtomicBoolean(false);
        this.a = 18000000L;
        this.e = fVar;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new k0(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f = threadPoolExecutor;
        c();
    }

    public static l0 b() {
        if (g == null) {
            io.sentry.util.a aVar = h;
            aVar.e();
            try {
                if (g == null) {
                    g = new l0();
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return g;
    }

    public final String a() {
        if (this.c < System.currentTimeMillis() && this.d.compareAndSet(false, true)) {
            c();
        }
        return this.b;
    }

    public final void c() {
        try {
            this.f.submit(new com.socure.idplus.device.internal.utils.j(this, 1)).get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.c = System.currentTimeMillis() + 1000;
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.c = System.currentTimeMillis() + 1000;
        }
    }
}
