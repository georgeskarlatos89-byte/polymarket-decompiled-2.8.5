package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r88 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public r88(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof r88)) {
            r88 r88Var = (r88) obj;
            if (hy6.c(this.a, r88Var.a) && hy6.c(this.b, r88Var.b) && hy6.c(this.c, r88Var.c)) {
                return hy6.c(this.d, r88Var.d);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + sv6.a(sv6.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
