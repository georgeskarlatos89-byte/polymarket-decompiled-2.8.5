package io.sentry;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class y4 implements Comparable {
    public int a(y4 y4Var) {
        return Long.compare(d(), y4Var.d());
    }

    public long b(y4 y4Var) {
        return d() - y4Var.d();
    }

    public long c(y4 y4Var) {
        if (y4Var != null && a(y4Var) < 0) {
            return y4Var.d();
        }
        return d();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((y4) obj);
    }

    public abstract long d();
}
