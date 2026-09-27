package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f26 extends jjc implements w07 {
    public final epc o;
    public boolean p;
    public boolean q;
    public boolean r;

    public f26(epc epcVar) {
        this.o = epcVar;
    }

    @Override // defpackage.w07
    public final void D0(lxa lxaVar) {
        lxaVar.a();
        v23 v23Var = lxaVar.a;
        if (this.p) {
            y07.i0(lxaVar, ib4.b(ib4.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0L, v23Var.d(), 0.0f, null, null, 122);
        } else {
            if (!this.q && !this.r) {
                return;
            }
            y07.i0(lxaVar, ib4.b(ib4.b, 0.1f, 0.0f, 0.0f, 0.0f, 14), 0L, v23Var.d(), 0.0f, null, null, 122);
        }
    }

    @Override // defpackage.jjc
    public final void U0() {
        coc.c(Q0(), null, null, new e26(this, null), 3);
    }
}
