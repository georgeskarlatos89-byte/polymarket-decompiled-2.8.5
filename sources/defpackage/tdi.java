package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class tdi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi6 b;

    public /* synthetic */ tdi(gi6 gi6Var, int i) {
        this.a = i;
        this.b = gi6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        gi6 gi6Var = this.b;
        switch (i) {
            case 0:
                gi6Var.a();
                return;
            default:
                gi6Var.b();
                return;
        }
    }
}
