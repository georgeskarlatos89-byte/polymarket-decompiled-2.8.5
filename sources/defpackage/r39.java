package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r39 implements oye {
    public final jn a;
    public final sgd b;
    public long c = 0;

    public r39(jn jnVar, sgd sgdVar) {
        this.a = jnVar;
        this.b = sgdVar;
    }

    @Override // defpackage.oye
    public final long e(i1a i1aVar, long j, owa owaVar, long j2) {
        long a = this.b.a();
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            a = this.c;
        }
        this.c = a;
        return e1a.d(e1a.d(i1aVar.c(), frm.m(a)), this.a.a(j2, 0L, owaVar));
    }
}
