package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class g0o {
    public int a;
    public float b;
    public float c;
    public boolean d;
    public float e;
    public float f;
    public long g;
    public long h;
    public boolean i;
    public float j;
    public float k;
    public short l;

    public final h0o a() {
        if (this.l != 4095) {
            StringBuilder sb = new StringBuilder();
            if ((this.l & 1) == 0) {
                sb.append(" recentFramesToCheck");
            }
            if ((this.l & 2) == 0) {
                sb.append(" recentFramesContainingPredictedArea");
            }
            if ((this.l & 4) == 0) {
                sb.append(" recentFramesIou");
            }
            if ((this.l & 8) == 0) {
                sb.append(" maxCoverage");
            }
            if ((this.l & 16) == 0) {
                sb.append(" useConfidenceScore");
            }
            if ((this.l & 32) == 0) {
                sb.append(" lowerConfidenceScore");
            }
            if ((this.l & 64) == 0) {
                sb.append(" higherConfidenceScore");
            }
            if ((this.l & 128) == 0) {
                sb.append(" zoomIntervalInMillis");
            }
            if ((this.l & 256) == 0) {
                sb.append(" resetIntervalInMillis");
            }
            if ((this.l & 512) == 0) {
                sb.append(" enableZoomThreshold");
            }
            if ((this.l & 1024) == 0) {
                sb.append(" zoomInThreshold");
            }
            if ((this.l & 2048) == 0) {
                sb.append(" zoomOutThreshold");
            }
            dmk.n("Missing required properties:".concat(sb.toString()));
            return null;
        }
        return new h0o(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }
}
