package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i3j implements s6g {
    public final long b;
    public final s6g c;

    public i3j(long j, s6g s6gVar) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        grn.b("Timeout must be non-negative.", z);
        this.b = j;
        this.c = s6gVar;
    }

    @Override // defpackage.s6g
    public final long a() {
        return this.b;
    }

    @Override // defpackage.s6g
    public final q6g b(tk0 tk0Var) {
        q6g b = this.c.b(tk0Var);
        long j = this.b;
        if (j > 0 && tk0Var.b >= j - b.a) {
            return q6g.d;
        }
        return b;
    }
}
