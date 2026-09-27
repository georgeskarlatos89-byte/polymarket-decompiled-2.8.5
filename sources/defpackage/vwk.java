package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vwk implements jgf {
    public final /* synthetic */ int a;
    public final /* synthetic */ myk b;

    public /* synthetic */ vwk(myk mykVar, int i) {
        this.a = i;
        this.b = mykVar;
    }

    @Override // defpackage.kgf
    public final Object get() {
        int i = this.a;
        myk mykVar = this.b;
        switch (i) {
            case 0:
                return new nbi(mykVar.l, 10);
            case 1:
                return new e3g(mykVar.l, 15);
            case 2:
                return new evf(mykVar.l, 16);
            case 3:
                return new zcf(mykVar.l, 21);
            case 4:
                return new nhj(mykVar.l, 4);
            default:
                return new x3g(mykVar.l, 19);
        }
    }
}
