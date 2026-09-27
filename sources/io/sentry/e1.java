package io.sentry;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface e1 {
    io.sentry.protocol.w A(io.sentry.protocol.f0 f0Var, h7 h7Var, j0 j0Var, t3 t3Var);

    e1 B(String str);

    io.sentry.protocol.w C(io.sentry.protocol.k kVar);

    void a(boolean z);

    void b(long j);

    m1 c();

    w0 clone();

    boolean d();

    void e(io.sentry.protocol.i0 i0Var);

    io.sentry.android.core.internal.tombstone.b f();

    void g(e eVar, j0 j0Var);

    p6 getOptions();

    io.sentry.protocol.w h(io.sentry.internal.debugmeta.c cVar, j0 j0Var);

    default boolean i() {
        return false;
    }

    boolean isEnabled();

    o1 j();

    void k(e eVar);

    io.sentry.protocol.w l(q3 q3Var);

    io.sentry.logger.a logger();

    void m();

    void n(Throwable th, b7 b7Var, String str);

    io.sentry.metrics.a o();

    void p(f4 f4Var);

    io.sentry.protocol.w q(r6 r6Var, j0 j0Var);

    void r();

    c1 s();

    io.sentry.protocol.w t(String str, p5 p5Var);

    io.sentry.protocol.w u(h5 h5Var, j0 j0Var);

    default io.sentry.protocol.w v(io.sentry.protocol.k kVar) {
        return C(kVar);
    }

    o1 w(j7 j7Var, k7 k7Var);

    c1 x();

    v0 y();

    io.sentry.protocol.w z(Throwable th, j0 j0Var);
}
