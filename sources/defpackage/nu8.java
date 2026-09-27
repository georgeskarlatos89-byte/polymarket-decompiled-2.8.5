package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class nu8 implements exh {
    public final epi a;

    public nu8(epi epiVar) {
        this.a = epiVar;
    }

    @Override // defpackage.exh
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.exh
    public final boolean b(sx0 sx0Var) {
        pje pjeVar = sx0Var.b;
        if (pjeVar == pje.UNREGISTERED || pjeVar == pje.REGISTERED || pjeVar == pje.REGISTER_ERROR) {
            this.a.d(sx0Var.a);
            return true;
        }
        return false;
    }
}
