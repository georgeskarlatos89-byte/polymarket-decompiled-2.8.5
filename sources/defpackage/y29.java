package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class y29 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z29 b;

    public /* synthetic */ y29(z29 z29Var, int i) {
        this.a = i;
        this.b = z29Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        z29 z29Var = this.b;
        switch (i) {
            case 0:
                z29Var.b.onOpen();
                return;
            default:
                z29Var.b.f();
                return;
        }
    }
}
