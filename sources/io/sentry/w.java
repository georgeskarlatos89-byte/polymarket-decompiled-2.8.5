package io.sentry;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class w implements io.sentry.hints.d, io.sentry.hints.h, io.sentry.hints.k, io.sentry.hints.f {
    public boolean a = false;
    public boolean b = false;
    public final CountDownLatch c = new CountDownLatch(1);
    public final long d;
    public final x0 e;
    public final String f;
    public final g7 g;

    public w(long j, x0 x0Var, String str, g7 g7Var) {
        this.d = j;
        this.f = str;
        this.g = g7Var;
        this.e = x0Var;
    }

    @Override // io.sentry.hints.h
    public final boolean a() {
        return this.a;
    }

    @Override // io.sentry.hints.k
    public final void b(boolean z) {
        this.b = z;
        this.c.countDown();
    }

    @Override // io.sentry.hints.h
    public final void c(boolean z) {
        this.a = z;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.c.await(this.d, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.e.d(p5.ERROR, "Exception while awaiting on lock.", e);
            return false;
        }
    }

    @Override // io.sentry.hints.k
    public final boolean e() {
        return this.b;
    }
}
