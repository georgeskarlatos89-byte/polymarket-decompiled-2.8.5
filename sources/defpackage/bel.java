package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bel extends ei4 {
    public final /* synthetic */ int f;
    public final /* synthetic */ gi4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bel(gi4 gi4Var, int i) {
        super(gi4Var, (byte) 0);
        this.f = i;
        this.g = gi4Var;
    }

    @Override // defpackage.ei4
    public final Object b(int i) {
        int i2 = this.f;
        gi4 gi4Var = this.g;
        switch (i2) {
            case 0:
                Object obj = gi4.l;
                return gi4Var.m()[i];
            case 1:
                return new xel(gi4Var, i);
            default:
                Object obj2 = gi4.l;
                return gi4Var.n()[i];
        }
    }
}
