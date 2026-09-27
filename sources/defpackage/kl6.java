package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kl6 implements il6 {
    public final float a;
    public final float b;

    public kl6(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl6)) {
            return false;
        }
        kl6 kl6Var = (kl6) obj;
        if (Float.compare(this.a, kl6Var.a) == 0 && Float.compare(this.b, kl6Var.b) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.il6
    public final float getDensity() {
        return this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.il6
    public final float q0() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.a);
        sb.append(", fontScale=");
        return ix2.m(sb, this.b, ')');
    }
}
