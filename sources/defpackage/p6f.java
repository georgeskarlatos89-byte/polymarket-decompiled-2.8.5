package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p6f extends jhh {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public p6f(int i, long j, long j2) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                this.c = j2;
                return;
            default:
                this.b = j2;
                this.c = j;
                return;
        }
    }

    public static long d(long j, svd svdVar) {
        long t = svdVar.t();
        if ((128 & t) != 0) {
            return 8589934591L & ((((t & 1) << 32) | svdVar.v()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.jhh
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return woa.n(this.c, " }", sb);
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.b);
                sb2.append(", playbackPositionUs= ");
                return woa.n(this.c, " }", sb2);
        }
    }
}
