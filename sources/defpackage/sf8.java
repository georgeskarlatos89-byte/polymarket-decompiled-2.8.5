package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class sf8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vf8 b;
    public final /* synthetic */ cw2 c;

    public /* synthetic */ sf8(vf8 vf8Var, cw2 cw2Var, int i) {
        this.a = i;
        this.b = vf8Var;
        this.c = cw2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        cw2 cw2Var = this.c;
        vf8 vf8Var = this.b;
        switch (i) {
            case 0:
                vf8Var.e(cw2Var);
                return;
            default:
                vf8Var.b(cw2Var);
                return;
        }
    }
}
