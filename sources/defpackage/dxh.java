package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dxh extends mxh {
    public r4 c;
    public int d;
    public int e;

    public dxh(long j, r4 r4Var) {
        super(j);
        this.c = r4Var;
    }

    @Override // defpackage.mxh
    public final void a(mxh mxhVar) {
        synchronized (edh.a) {
            mxhVar.getClass();
            this.c = ((dxh) mxhVar).c;
            this.d = ((dxh) mxhVar).d;
            this.e = ((dxh) mxhVar).e;
        }
    }

    @Override // defpackage.mxh
    public final mxh b(long j) {
        return new dxh(j, this.c);
    }
}
