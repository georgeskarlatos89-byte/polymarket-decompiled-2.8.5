package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ed1 implements jn {
    public final float a;

    public ed1(float f) {
        this.a = f;
    }

    @Override // defpackage.jn
    public final long a(long j, long j2, owa owaVar) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        float f = (1.0f + this.a) * (((int) (j3 >> 32)) / 2.0f);
        float f2 = 0.0f * (((int) (j3 & 4294967295L)) / 2.0f);
        return (Math.round(f) << 32) | (Math.round(f2) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ed1) || Float.compare(this.a, ((ed1) obj).a) != 0 || Float.compare(-1.0f, -1.0f) != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hdi.r(new StringBuilder("BiasAbsoluteAlignment(horizontalBias="), this.a, ", verticalBias=-1.0)");
    }
}
