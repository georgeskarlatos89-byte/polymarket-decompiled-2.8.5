package io.sentry;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class v1 implements a1 {
    public final Runtime a = Runtime.getRuntime();

    @Override // io.sentry.a1
    public final void b(n3 n3Var) {
        Runtime runtime = this.a;
        n3Var.c = runtime.totalMemory() - runtime.freeMemory();
        n3Var.d = true;
    }

    @Override // io.sentry.a1
    public final void a() {
    }
}
