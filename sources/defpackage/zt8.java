package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zt8 implements exh {
    public final y1k a;
    public final epi b;

    public zt8(y1k y1kVar, epi epiVar) {
        this.a = y1kVar;
        this.b = epiVar;
    }

    @Override // defpackage.exh
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.exh
    public final boolean b(sx0 sx0Var) {
        if (sx0Var.b == pje.REGISTERED && !this.a.a(sx0Var)) {
            String str = sx0Var.c;
            if (str != null) {
                this.b.b(new gx0(str, sx0Var.e, sx0Var.f));
                return true;
            }
            dmk.s("Null token");
        }
        return false;
    }
}
