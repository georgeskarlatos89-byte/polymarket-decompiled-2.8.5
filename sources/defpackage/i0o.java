package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class i0o {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public i0o(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float a() {
        if (b()) {
            return (this.d - this.b) * (this.c - this.a);
        }
        return 0.0f;
    }

    public final boolean b() {
        float f = this.a;
        if (f >= 0.0f) {
            float f2 = this.c;
            if (f < f2 && f2 <= 1.0f) {
                float f3 = this.b;
                if (f3 >= 0.0f) {
                    float f4 = this.d;
                    if (f3 < f4 && f4 <= 1.0f) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0o) {
            i0o i0oVar = (i0o) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(i0oVar.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(i0oVar.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(i0oVar.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(i0oVar.d) && Float.floatToIntBits(0.0f) == Float.floatToIntBits(0.0f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.d) ^ ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PredictedArea{xMin=");
        sb.append(this.a);
        sb.append(", yMin=");
        sb.append(this.b);
        sb.append(", xMax=");
        sb.append(this.c);
        sb.append(", yMax=");
        return hdi.r(sb, this.d, ", confidenceScore=0.0}");
    }
}
