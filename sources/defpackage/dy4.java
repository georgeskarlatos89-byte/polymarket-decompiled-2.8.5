package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dy4 extends cy4 implements aog {
    public final long h;
    public final int i;
    public final int j;
    public final boolean k;
    public final long l;

    public dy4(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = z;
        this.l = j == -1 ? -1L : j;
    }

    @Override // defpackage.aog
    public final long f() {
        return this.l;
    }

    @Override // defpackage.aog
    public final long h(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.e;
    }

    @Override // defpackage.aog
    public final int j() {
        return this.i;
    }
}
