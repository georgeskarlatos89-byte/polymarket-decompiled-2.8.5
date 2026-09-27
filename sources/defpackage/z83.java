package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class z83 {
    public final float a;
    public final float b;

    public z83(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z83) {
                z83 z83Var = (z83) obj;
                if (!hy6.c(this.a, z83Var.a) || !hy6.c(this.b, z83Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hdi.p("CardSize(width=", hy6.d(this.a), ", height=", hy6.d(this.b), ")");
    }
}
