package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iy6 implements y75, vz9 {
    public final float a;

    public iy6(float f) {
        this.a = f;
    }

    @Override // defpackage.y75
    public final float a(long j, il6 il6Var) {
        return il6Var.t0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof iy6) || !hy6.c(this.a, ((iy6) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return hdi.r(new StringBuilder("CornerSize(size = "), this.a, ".dp)");
    }
}
