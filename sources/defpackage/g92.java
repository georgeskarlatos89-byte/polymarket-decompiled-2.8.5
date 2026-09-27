package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class g92 {
    public final long a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final float f;

    public g92(long j, float f, float f2, boolean z, boolean z2, float f3) {
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = z2;
        this.f = f3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g92) {
                g92 g92Var = (g92) obj;
                if (!n1a.b(this.a, g92Var.a) || Float.compare(this.b, g92Var.b) != 0 || Float.compare(this.c, g92Var.c) != 0 || this.d != g92Var.d || this.e != g92Var.e || Float.compare(this.f, g92Var.f) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + hdi.g(hdi.g(sv6.a(sv6.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "EffectKey(size=" + n1a.c(this.a) + ", radius=" + this.b + ", corner=" + this.c + ", liquid=" + this.d + ", interactive=" + this.e + ", saturation=" + this.f + ")";
    }
}
