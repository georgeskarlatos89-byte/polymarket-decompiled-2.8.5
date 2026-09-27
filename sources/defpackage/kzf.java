package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class kzf {
    public final boolean a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final float g;
    public final float h;
    public final float i;

    public kzf(boolean z, double d, double d2, double d3, double d4, double d5, float f, float f2, float f3) {
        this.a = z;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = d5;
        this.g = f;
        this.h = f2;
        this.i = f3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kzf) {
                kzf kzfVar = (kzf) obj;
                if (this.a != kzfVar.a || Double.compare(this.b, kzfVar.b) != 0 || Double.compare(this.c, kzfVar.c) != 0 || Double.compare(this.d, kzfVar.d) != 0 || Double.compare(this.e, kzfVar.e) != 0 || Double.compare(this.f, kzfVar.f) != 0 || Float.compare(this.g, kzfVar.g) != 0 || Float.compare(this.h, kzfVar.h) != 0 || Float.compare(this.i, kzfVar.i) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + sv6.a(sv6.a(hdi.c(hdi.c(hdi.c(hdi.c(hdi.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), this.g, 31), this.h, 31);
    }

    public final String toString() {
        return "RenderState(isValid=" + this.a + ", xRange=" + this.b + ", yRange=" + this.c + ", minX=" + this.d + ", maxX=" + this.e + ", minY=" + this.f + ", width=" + this.g + ", height=" + this.h + ", chartWidth=" + this.i + ")";
    }
}
