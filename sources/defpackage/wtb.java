package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wtb extends itb {
    public final long a;
    public final long b;
    public boolean c;
    public long d;

    public wtb(long j, long j2, long j3) {
        this.a = j3;
        this.b = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.c = z;
        this.d = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // defpackage.itb
    public final long nextLong() {
        long j = this.d;
        if (j == this.b) {
            if (this.c) {
                this.c = false;
                return j;
            }
            dmk.t();
            return 0L;
        }
        this.d = this.a + j;
        return j;
    }
}
