package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class h19 extends wfj {
    public wfj a;

    @Override // defpackage.wfj
    public final Object b(ufa ufaVar) {
        wfj wfjVar = this.a;
        if (wfjVar != null) {
            return wfjVar.b(ufaVar);
        }
        dmk.n("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // defpackage.wfj
    public final void c(xga xgaVar, Object obj) {
        wfj wfjVar = this.a;
        if (wfjVar != null) {
            wfjVar.c(xgaVar, obj);
        } else {
            dmk.n("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }
}
