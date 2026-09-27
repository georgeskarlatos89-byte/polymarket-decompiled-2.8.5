package io.sentry;

import java.util.List;
import java.util.Map;
import java.util.Queue;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface c1 {
    String A();

    void B();

    io.sentry.featureflags.b C();

    a7 D();

    p5 E();

    v3 F();

    void G(String str);

    h1 H();

    List I();

    void J(h5 h5Var);

    v3 K(a4 a4Var);

    void L(c4 c4Var);

    void M(io.sentry.protocol.w wVar);

    List N();

    void O(v3 v3Var);

    m1 c();

    void clear();

    c1 clone();

    void e(io.sentry.protocol.i0 i0Var);

    void g(e eVar, j0 j0Var);

    Map getAttributes();

    Map getExtras();

    p6 getOptions();

    io.sentry.protocol.r getRequest();

    io.sentry.protocol.i0 getUser();

    o1 j();

    a7 m();

    void n(Throwable th, b7 b7Var, String str);

    io.sentry.protocol.j o();

    io.sentry.protocol.w p();

    void q(io.sentry.protocol.w wVar);

    io.sentry.internal.debugmeta.c r();

    Queue s();

    a7 t(b4 b4Var);

    Map u();

    List v();

    io.sentry.protocol.e w();

    String x();

    void y(o1 o1Var);

    List z();
}
