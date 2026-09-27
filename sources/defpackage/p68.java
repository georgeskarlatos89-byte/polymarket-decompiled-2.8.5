package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class p68 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public p68(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p68)) {
            return false;
        }
        p68 p68Var = (p68) obj;
        if (Float.compare(this.a, p68Var.a) == 0 && Float.compare(this.b, p68Var.b) == 0 && Float.compare(this.c, p68Var.c) == 0 && Float.compare(this.d, p68Var.d) == 0 && Float.compare(this.e, p68Var.e) == 0 && Float.compare(this.f, p68Var.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + sv6.a(sv6.a(sv6.a(sv6.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder u = hdi.u(this.a, this.b, "FizzParticle(spawnAtMs=", ", xFraction=", ", dxDp=");
        u.append(this.c);
        u.append(", dyDp=");
        u.append(this.d);
        u.append(", radiusDp=");
        u.append(this.e);
        u.append(", peakAlpha=");
        u.append(this.f);
        u.append(")");
        return u.toString();
    }
}
