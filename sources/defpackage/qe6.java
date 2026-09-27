package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class qe6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cw2 b;

    public /* synthetic */ qe6(cw2 cw2Var, int i) {
        this.a = i;
        this.b = cw2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        cw2 cw2Var = this.b;
        switch (i) {
            case 0:
                cw2Var.b(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                return;
            default:
                cw2Var.a(null);
                return;
        }
    }
}
