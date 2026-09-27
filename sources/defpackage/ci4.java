package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ci4 extends ei4 {
    public final /* synthetic */ int f;
    public final /* synthetic */ gi4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ci4(gi4 gi4Var, int i) {
        super(gi4Var);
        this.f = i;
        this.g = gi4Var;
    }

    @Override // defpackage.ei4
    public final Object a(int i) {
        int i2 = this.f;
        gi4 gi4Var = this.g;
        switch (i2) {
            case 0:
                return gi4Var.i()[i];
            case 1:
                return new fi4(gi4Var, i);
            default:
                return gi4Var.j()[i];
        }
    }
}
