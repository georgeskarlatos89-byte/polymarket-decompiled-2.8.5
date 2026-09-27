package io.sentry.hints;

import io.sentry.p5;
import io.sentry.protocol.w;
import io.sentry.x0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class c implements f {
    public final CountDownLatch a = new CountDownLatch(1);
    public final long b;
    public final x0 c;

    public c(long j, x0 x0Var) {
        this.b = j;
        this.c = x0Var;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.a.await(this.b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.c.d(p5.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e);
            return false;
        }
    }

    public abstract boolean f(w wVar);

    public abstract void g(w wVar);
}
