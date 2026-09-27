package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pvh extends pl8 {
    public final /* synthetic */ ong b;
    public final /* synthetic */ v14 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvh(v14 v14Var, ong ongVar, ong ongVar2) {
        super(ongVar);
        this.c = v14Var;
        this.b = ongVar2;
    }

    @Override // defpackage.pl8, defpackage.ong
    public final nng d(long j) {
        nng d = this.b.d(j);
        qng qngVar = d.a;
        long j2 = qngVar.a;
        long j3 = qngVar.b;
        long j4 = this.c.b;
        qng qngVar2 = new qng(j2, j3 + j4);
        qng qngVar3 = d.b;
        return new nng(qngVar2, new qng(qngVar3.a, qngVar3.b + j4));
    }
}
