package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class we8 extends y2 {
    public final /* synthetic */ int d = 1;
    public final Iterable e;

    public we8(jr9 jr9Var, int i) {
        super(jr9Var.size(), i);
        this.e = jr9Var;
    }

    @Override // defpackage.y2
    public final Object a(int i) {
        int i2 = this.d;
        Iterable iterable = this.e;
        switch (i2) {
            case 0:
                return ((xe8) iterable).a[i].iterator();
            default:
                return ((jr9) iterable).get(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we8(xe8 xe8Var, int i) {
        super(i, 0);
        this.e = xe8Var;
    }
}
