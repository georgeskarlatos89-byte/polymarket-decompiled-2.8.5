package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fdh extends mxh {
    public uje c;
    public int d;

    public fdh(long j, uje ujeVar) {
        super(j);
        this.c = ujeVar;
    }

    @Override // defpackage.mxh
    public final void a(mxh mxhVar) {
        mxhVar.getClass();
        fdh fdhVar = (fdh) mxhVar;
        synchronized (zzm.a) {
            this.c = fdhVar.c;
            this.d = fdhVar.d;
        }
    }

    @Override // defpackage.mxh
    public final mxh b(long j) {
        return new fdh(j, this.c);
    }
}
