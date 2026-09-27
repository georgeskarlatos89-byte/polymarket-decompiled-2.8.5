package io.sentry;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class l7 extends io.sentry.hints.c implements io.sentry.hints.i, io.sentry.hints.l {
    public final AtomicReference d;

    public l7(long j, x0 x0Var) {
        super(j, x0Var);
        this.d = new AtomicReference();
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.w wVar) {
        io.sentry.protocol.w wVar2 = (io.sentry.protocol.w) this.d.get();
        if (wVar2 != null && wVar2.equals(wVar)) {
            return true;
        }
        return false;
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.w wVar) {
        this.d.set(wVar);
    }
}
