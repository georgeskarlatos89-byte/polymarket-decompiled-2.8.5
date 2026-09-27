package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class q7g implements sx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t7g b;

    public /* synthetic */ q7g(t7g t7gVar, int i) {
        this.a = i;
        this.b = t7gVar;
    }

    @Override // defpackage.sx6
    public final double c(double d) {
        int i = this.a;
        t7g t7gVar = this.b;
        switch (i) {
            case 0:
                return lnf.c(t7gVar.k.c(d), t7gVar.e, t7gVar.f);
            default:
                return t7gVar.n.c(lnf.c(d, t7gVar.e, t7gVar.f));
        }
    }
}
