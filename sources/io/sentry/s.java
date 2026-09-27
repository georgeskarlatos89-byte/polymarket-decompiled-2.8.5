package io.sentry;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class s implements j1 {
    public final e1 a;

    public s(e1 e1Var) {
        this.a = e1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        t.a.set(this.a);
    }
}
