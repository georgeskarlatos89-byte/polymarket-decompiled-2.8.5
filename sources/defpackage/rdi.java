package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class rdi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vdi b;

    public /* synthetic */ rdi(vdi vdiVar, int i) {
        this.a = i;
        this.b = vdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        vdi vdiVar = this.b;
        switch (i) {
            case 0:
                ((y39) syb.b()).execute(new rdi(vdiVar, 1));
                return;
            default:
                if (!vdiVar.n) {
                    vdiVar.d();
                    return;
                }
                return;
        }
    }
}
