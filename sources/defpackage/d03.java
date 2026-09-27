package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d03 implements bo9 {
    public final c03 a;

    public d03(c03 c03Var) {
        this.a = c03Var;
    }

    @Override // defpackage.bo9
    public final void a(wp7 wp7Var) {
        this.a.a(wp7Var);
    }

    @Override // defpackage.bo9
    public final int b() {
        int ordinal = this.a.b().ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal == 3) {
            return 1;
        }
        return 0;
    }

    @Override // defpackage.bo9
    public final int c() {
        return 0;
    }

    @Override // defpackage.bo9
    public final oki e() {
        return this.a.e();
    }

    @Override // defpackage.bo9
    public final long f() {
        return this.a.f();
    }
}
