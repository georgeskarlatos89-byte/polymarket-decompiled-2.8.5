package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k1j implements ldg {
    public final ldg a;
    public final long b;

    public k1j(ldg ldgVar, long j) {
        this.a = ldgVar;
        this.b = j;
    }

    @Override // defpackage.ldg
    public final int c(bw4 bw4Var, zx5 zx5Var, int i) {
        int c = this.a.c(bw4Var, zx5Var, i);
        if (c == -4) {
            zx5Var.g += this.b;
        }
        return c;
    }

    @Override // defpackage.ldg
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.ldg
    public final boolean isReady() {
        return this.a.isReady();
    }

    @Override // defpackage.ldg
    public final int k(long j) {
        return this.a.k(j - this.b);
    }
}
