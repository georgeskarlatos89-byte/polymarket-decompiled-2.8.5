package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wch extends mxh {
    public long c;

    public wch(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.mxh
    public final void a(mxh mxhVar) {
        mxhVar.getClass();
        this.c = ((wch) mxhVar).c;
    }

    @Override // defpackage.mxh
    public final mxh b(long j) {
        return new wch(j, this.c);
    }
}
