package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class re6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lei b;

    public /* synthetic */ re6(lei leiVar, int i) {
        this.a = i;
        this.b = leiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        lei leiVar = this.b;
        switch (i) {
            case 0:
                leiVar.c();
                return;
            default:
                leiVar.f.cancel(true);
                return;
        }
    }
}
