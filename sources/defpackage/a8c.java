package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class a8c implements k05 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c27 b;
    public final /* synthetic */ gnb c;
    public final /* synthetic */ l7c d;

    public /* synthetic */ a8c(c27 c27Var, gnb gnbVar, l7c l7cVar, int i) {
        this.a = i;
        this.b = c27Var;
        this.c = gnbVar;
        this.d = l7cVar;
    }

    @Override // defpackage.k05
    public final void accept(Object obj) {
        int i = this.a;
        l7c l7cVar = this.d;
        gnb gnbVar = this.c;
        c27 c27Var = this.b;
        d8c d8cVar = (d8c) obj;
        switch (i) {
            case 0:
                d8cVar.x(c27Var.a, c27Var.b, gnbVar, l7cVar);
                return;
            default:
                d8cVar.w(c27Var.a, c27Var.b, gnbVar, l7cVar);
                return;
        }
    }
}
