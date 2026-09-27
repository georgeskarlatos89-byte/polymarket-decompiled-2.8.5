package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class h0o {
    public static final h0o l;
    public final int a;
    public final float b;
    public final float c;
    public final boolean d;
    public final float e;
    public final float f;
    public final long g;
    public final long h;
    public final boolean i;
    public final float j;
    public final float k;

    static {
        a().a();
        g0o a = a();
        a.d = false;
        a.l = (short) (a.l | 16);
        l = a.a();
    }

    public h0o(int i, float f, float f2, boolean z, float f3, float f4, long j, long j2, boolean z2, float f5, float f6) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = f3;
        this.f = f4;
        this.g = j;
        this.h = j2;
        this.i = z2;
        this.j = f5;
        this.k = f6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g0o, java.lang.Object] */
    public static g0o a() {
        ?? obj = new Object();
        short s = (short) (obj.l | 1);
        obj.a = 5;
        obj.b = 0.25f;
        obj.c = 0.8f;
        obj.d = true;
        obj.e = 0.5f;
        obj.f = 0.8f;
        obj.g = 1500L;
        obj.h = 3000L;
        obj.i = true;
        obj.j = 0.1f;
        obj.k = 0.05f;
        obj.l = (short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (s | 2)) | 4)) | 8)) | 16)) | 32)) | 64)) | 128)) | 256)) | 512)) | 1024)) | 2048);
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h0o) {
                h0o h0oVar = (h0o) obj;
                if (this.a == h0oVar.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(h0oVar.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(h0oVar.c) && this.d == h0oVar.d && Float.floatToIntBits(this.e) == Float.floatToIntBits(h0oVar.e) && Float.floatToIntBits(this.f) == Float.floatToIntBits(h0oVar.f) && this.g == h0oVar.g && this.h == h0oVar.h && this.i == h0oVar.i && Float.floatToIntBits(this.j) == Float.floatToIntBits(h0oVar.j) && Float.floatToIntBits(this.k) == Float.floatToIntBits(h0oVar.k)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = (((((-715379941) ^ this.a) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c);
        int i2 = 1231;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        int floatToIntBits2 = ((((((((((floatToIntBits * 1000003) ^ i) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ ((int) this.g)) * 1000003) ^ ((int) this.h)) * 1000003;
        if (true != this.i) {
            i2 = 1237;
        }
        return Float.floatToIntBits(this.k) ^ ((((floatToIntBits2 ^ i2) * 1000003) ^ Float.floatToIntBits(this.j)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoZoomOptions{recentFramesToCheck=10, recentFramesContainingPredictedArea=");
        sb.append(this.a);
        sb.append(", recentFramesIou=");
        sb.append(this.b);
        sb.append(", maxCoverage=");
        sb.append(this.c);
        sb.append(", useConfidenceScore=");
        sb.append(this.d);
        sb.append(", lowerConfidenceScore=");
        sb.append(this.e);
        sb.append(", higherConfidenceScore=");
        sb.append(this.f);
        sb.append(", zoomIntervalInMillis=");
        sb.append(this.g);
        sb.append(", resetIntervalInMillis=");
        sb.append(this.h);
        sb.append(", enableZoomThreshold=");
        sb.append(this.i);
        sb.append(", zoomInThreshold=");
        sb.append(this.j);
        sb.append(", zoomOutThreshold=");
        return hdi.r(sb, this.k, "}");
    }
}
