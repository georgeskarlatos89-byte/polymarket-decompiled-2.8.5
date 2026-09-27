package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qn implements oye {
    public final hd1 a;

    public qn(hd1 hd1Var) {
        this.a = hd1Var;
    }

    @Override // defpackage.oye
    public final long e(i1a i1aVar, long j, owa owaVar, long j2) {
        hd1 hd1Var = this.a;
        long a = hd1Var.a(0L, (i1aVar.d() << 32) | (i1aVar.b() & 4294967295L), owaVar);
        long a2 = hd1Var.a(0L, j2, owaVar);
        long j3 = ((-((int) (a2 >> 32))) << 32) | (4294967295L & (-((int) (a2 & 4294967295L))));
        owa owaVar2 = owa.Ltr;
        return e1a.d(e1a.d(e1a.d(i1aVar.c(), a), j3), 0 << 32);
    }
}
