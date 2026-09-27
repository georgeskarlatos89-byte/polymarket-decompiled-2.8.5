package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gu6 extends bij {
    public final bij b;
    public final bij c;

    public gu6(bij bijVar, bij bijVar2) {
        this.b = bijVar;
        this.c = bijVar2;
    }

    @Override // defpackage.bij
    public final boolean a() {
        if (!this.b.a() && !this.c.a()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.bij
    public final boolean b() {
        if (!this.b.b() && !this.c.b()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.bij
    public final ec0 c(ec0 ec0Var) {
        ec0Var.getClass();
        return this.c.c(this.b.c(ec0Var));
    }

    @Override // defpackage.bij
    public final vhj d(ita itaVar) {
        itaVar.getClass();
        vhj d = this.b.d(itaVar);
        if (d == null) {
            return this.c.d(itaVar);
        }
        return d;
    }

    @Override // defpackage.bij
    public final ita f(ita itaVar, e4k e4kVar) {
        itaVar.getClass();
        e4kVar.getClass();
        return this.c.f(this.b.f(itaVar, e4kVar), e4kVar);
    }
}
