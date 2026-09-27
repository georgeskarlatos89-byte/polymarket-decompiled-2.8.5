package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class wa2 extends k02 {
    public final float c;
    public final float d;

    public wa2(float f, float f2) {
        super(f, f2);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wa2) {
                wa2 wa2Var = (wa2) obj;
                if (!hy6.c(this.c, wa2Var.c) || !hy6.c(this.d, wa2Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return hdi.p("Custom(icon=", hy6.d(this.c), ", frame=", hy6.d(this.d), ")");
    }
}
