package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uch extends mxh {
    public float c;

    public uch(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.mxh
    public final void a(mxh mxhVar) {
        mxhVar.getClass();
        this.c = ((uch) mxhVar).c;
    }

    @Override // defpackage.mxh
    public final mxh b(long j) {
        return new uch(this.c, j);
    }
}
