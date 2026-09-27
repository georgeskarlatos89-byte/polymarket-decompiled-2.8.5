package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q9d implements hcj {
    public final vcj a;
    public final sp9 b;

    public q9d(vcj vcjVar, sp9 sp9Var) {
        this.a = vcjVar;
        this.b = sp9Var;
    }

    @Override // defpackage.hcj
    public final void a() {
        sp9 sp9Var = this.b;
        boolean z = sp9Var instanceof aci;
        vcj vcjVar = this.a;
        if (z) {
            vcjVar.onSuccess(((aci) sp9Var).a);
        } else if (sp9Var instanceof ij7) {
            vcjVar.onError(((ij7) sp9Var).a);
        } else {
            dmk.a();
        }
    }
}
