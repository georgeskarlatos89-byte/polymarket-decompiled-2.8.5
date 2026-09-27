package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sr1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public sr1(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof sr1)) {
                sr1 sr1Var = (sr1) obj;
                if (hy6.c(this.a, sr1Var.a) && hy6.c(this.b, sr1Var.b) && hy6.c(this.c, sr1Var.c) && hy6.c(this.d, sr1Var.d) && hy6.c(this.e, sr1Var.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + sv6.a(sv6.a(sv6.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }
}
