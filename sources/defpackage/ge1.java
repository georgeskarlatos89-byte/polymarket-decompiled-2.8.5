package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ge1 implements ong {
    public final ie1 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public ge1(ie1 ie1Var, long j, long j2, long j3, long j4, long j5) {
        this.a = ie1Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.ong
    public final nng d(long j) {
        qng qngVar = new qng(j, he1.a(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
        return new nng(qngVar, qngVar);
    }

    @Override // defpackage.ong
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ong
    public final long k() {
        return this.b;
    }
}
