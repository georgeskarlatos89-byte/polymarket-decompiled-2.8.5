package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class g84 {
    public static final g84 h = new g84(128.0f, 0.08f, 1.0f, 0.05f, 96);
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ g84(float f, float f2, float f3, float f4, int i) {
        this(f, f2, 0.39f, f3, f4, 2.0071287f, r13);
        float f5;
        if ((i & 64) != 0) {
            f5 = 0.12f;
        } else {
            f5 = 0.0f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g84)) {
            return false;
        }
        g84 g84Var = (g84) obj;
        if (Float.compare(this.a, g84Var.a) == 0 && Float.compare(this.b, g84Var.b) == 0 && Float.compare(this.c, g84Var.c) == 0 && Float.compare(this.d, g84Var.d) == 0 && Float.compare(this.e, g84Var.e) == 0 && Float.compare(this.f, g84Var.f) == 0 && Float.compare(this.g, g84Var.g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + sv6.a(sv6.a(sv6.a(sv6.a(sv6.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder u = hdi.u(this.a, this.b, "ClothConfiguration(weaveScale=", ", weaveIntensity=", ", holeRatio=");
        u.append(this.c);
        u.append(", speed=");
        u.append(this.d);
        u.append(", waveAmount=");
        u.append(this.e);
        u.append(", angle=");
        u.append(this.f);
        u.append(", sheen=");
        return hdi.r(u, this.g, ")");
    }

    public g84(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
    }
}
