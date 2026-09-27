package io.sentry;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class x5 extends y4 {
    public final long a;
    public final long b;

    public x5() {
        this(System.currentTimeMillis(), System.nanoTime());
    }

    @Override // io.sentry.y4
    public final int a(y4 y4Var) {
        if (y4Var instanceof x5) {
            x5 x5Var = (x5) y4Var;
            long j = x5Var.a;
            long j2 = this.a;
            if (j2 == j) {
                return Long.compare(this.b, x5Var.b);
            }
            return Long.compare(j2, j);
        }
        return super.a(y4Var);
    }

    @Override // io.sentry.y4
    public final long b(y4 y4Var) {
        if (y4Var instanceof x5) {
            return this.b - ((x5) y4Var).b;
        }
        return super.b(y4Var);
    }

    @Override // io.sentry.y4
    public final long c(y4 y4Var) {
        if (y4Var instanceof x5) {
            x5 x5Var = (x5) y4Var;
            long j = x5Var.b;
            int a = a(y4Var);
            long j2 = this.b;
            if (a < 0) {
                return d() + (j - j2);
            }
            return x5Var.d() + (j2 - j);
        }
        return super.c(y4Var);
    }

    @Override // io.sentry.y4, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((y4) obj);
    }

    @Override // io.sentry.y4
    public final long d() {
        return this.a * 1000000;
    }

    public x5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
