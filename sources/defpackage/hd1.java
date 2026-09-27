package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hd1 implements jn {
    public final float a;
    public final float b;

    public hd1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.jn
    public final long a(long j, long j2, owa owaVar) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        owa owaVar2 = owa.Ltr;
        float f3 = this.a;
        if (owaVar != owaVar2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd1)) {
            return false;
        }
        hd1 hd1Var = (hd1) obj;
        if (Float.compare(this.a, hd1Var.a) == 0 && Float.compare(this.b, hd1Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return ix2.m(sb, this.b, ')');
    }
}
