package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class mbf {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public mbf(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbf)) {
            return false;
        }
        mbf mbfVar = (mbf) obj;
        if (Float.compare(this.a, mbfVar.a) == 0 && Float.compare(this.b, mbfVar.b) == 0 && Float.compare(this.c, mbfVar.c) == 0 && Float.compare(this.d, mbfVar.d) == 0 && Float.compare(this.e, mbfVar.e) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + sv6.a(sv6.a(sv6.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder u = hdi.u(this.a, this.b, "FlamePlacement(x=", ", y=", ", size=");
        u.append(this.c);
        u.append(", rotationDegrees=");
        u.append(this.d);
        u.append(", alpha=");
        return hdi.r(u, this.e, ")");
    }
}
