package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ych extends mxh {
    public Object c;

    public ych(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.mxh
    public final void a(mxh mxhVar) {
        mxhVar.getClass();
        this.c = ((ych) mxhVar).c;
    }

    @Override // defpackage.mxh
    public final mxh b(long j) {
        return new ych(qch.h().g(), this.c);
    }
}
