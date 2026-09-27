package io.sentry;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class t implements f1 {
    public static final ThreadLocal a = new ThreadLocal();

    @Override // io.sentry.f1
    public final j1 a(e1 e1Var) {
        e1 e1Var2 = get();
        a.set(e1Var);
        return new s(e1Var2);
    }

    @Override // io.sentry.f1
    public final void close() {
        a.remove();
    }

    @Override // io.sentry.f1
    public final e1 get() {
        return (e1) a.get();
    }
}
