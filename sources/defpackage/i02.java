package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class i02 extends k02 {
    public final float c;
    public final float d;

    public i02(float f, float f2) {
        super(f, f2);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i02) {
                i02 i02Var = (i02) obj;
                if (!hy6.c(this.c, i02Var.c) || !hy6.c(this.d, i02Var.d)) {
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
        return hdi.p("CustomRect(customWidth=", hy6.d(this.c), ", customHeight=", hy6.d(this.d), ")");
    }
}
