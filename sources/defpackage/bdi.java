package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bdi extends ddi {
    public final cdi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdi(sci sciVar, String str) {
        super(sciVar, str);
        sciVar.getClass();
        str.getClass();
        this.d = sciVar.o0(str);
    }

    @Override // defpackage.lcg
    public final void H(int i, String str) {
        str.getClass();
        e();
        this.d.l0(i, str);
    }

    @Override // defpackage.lcg
    public final String N0(int i) {
        e();
        swn.d(21, "no row");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.close();
        this.c = true;
    }

    @Override // defpackage.lcg
    public final int getColumnCount() {
        e();
        return 0;
    }

    @Override // defpackage.lcg
    public final String getColumnName(int i) {
        e();
        swn.d(21, "no row");
        throw null;
    }

    @Override // defpackage.lcg
    public final long getLong(int i) {
        e();
        swn.d(21, "no row");
        throw null;
    }

    @Override // defpackage.lcg
    public final boolean isNull(int i) {
        e();
        swn.d(21, "no row");
        throw null;
    }

    @Override // defpackage.lcg
    public final boolean j1() {
        e();
        this.d.execute();
        return false;
    }

    @Override // defpackage.lcg
    public final void l(int i, long j) {
        e();
        this.d.l(i, j);
    }

    @Override // defpackage.lcg
    public final void m(int i) {
        e();
        this.d.m(i);
    }

    @Override // defpackage.lcg
    public final void reset() {
    }
}
