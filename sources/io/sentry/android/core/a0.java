package io.sentry.android.core;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a0 extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.a {
    public final long d;
    public final boolean e;
    public final boolean f;

    public a0(long j, io.sentry.x0 x0Var, long j2, boolean z, boolean z2) {
        super(j, x0Var);
        this.d = j2;
        this.e = z;
        this.f = z2;
    }

    @Override // io.sentry.hints.b
    public final boolean a() {
        return this.e;
    }

    @Override // io.sentry.hints.a
    public final Long b() {
        return Long.valueOf(this.d);
    }

    @Override // io.sentry.hints.a
    public final boolean c() {
        return false;
    }

    @Override // io.sentry.hints.a
    public final String e() {
        if (this.f) {
            return "anr_background";
        }
        return "anr_foreground";
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.w wVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.w wVar) {
    }
}
