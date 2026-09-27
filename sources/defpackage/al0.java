package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class al0 extends mt9 {
    public final /* synthetic */ int d;
    public final /* synthetic */ fl0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al0(fl0 fl0Var, int i) {
        super(fl0Var.c);
        this.d = i;
        switch (i) {
            case 1:
                this.e = fl0Var;
                super(fl0Var.c);
                return;
            default:
                this.e = fl0Var;
                return;
        }
    }

    @Override // defpackage.mt9
    public final Object a(int i) {
        int i2 = this.d;
        fl0 fl0Var = this.e;
        switch (i2) {
            case 0:
                return fl0Var.f(i);
            default:
                return fl0Var.j(i);
        }
    }

    @Override // defpackage.mt9
    public final void b(int i) {
        int i2 = this.d;
        fl0 fl0Var = this.e;
        switch (i2) {
            case 0:
                fl0Var.h(i);
                return;
            default:
                fl0Var.h(i);
                return;
        }
    }
}
