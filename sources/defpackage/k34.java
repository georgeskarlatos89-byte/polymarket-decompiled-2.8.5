package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class k34 {
    public static final k34 d = new k34(l34.ShowAll);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    static {
        new k34(l34.HideAll);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k34(l34 l34Var) {
        boolean z;
        boolean z2;
        int i;
        l34Var.getClass();
        int[] iArr = j34.a;
        int i2 = iArr[l34Var.ordinal()];
        boolean z3 = false;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                dmk.a();
                throw null;
            }
            z = false;
        } else {
            z = true;
        }
        int i3 = iArr[l34Var.ordinal()];
        if (i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                if (i3 != 4) {
                    dmk.a();
                    throw null;
                }
            } else {
                z2 = false;
                i = iArr[l34Var.ordinal()];
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i != 4) {
                            dmk.a();
                            throw null;
                        }
                    }
                    this.a = z;
                    this.b = z2;
                    this.c = z3;
                }
                z3 = true;
                this.a = z;
                this.b = z2;
                this.c = z3;
            }
        }
        z2 = true;
        i = iArr[l34Var.ordinal()];
        if (i != 1) {
        }
        z3 = true;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k34) {
                k34 k34Var = (k34) obj;
                if (this.a != k34Var.a || this.b != k34Var.b || this.c != k34Var.c || !hy6.c(8.0f, 8.0f) || !hy6.c(8.0f, 8.0f) || !hy6.c(8.0f, 8.0f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(8.0f) + sv6.a(sv6.a(hdi.g(hdi.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 8.0f, 31), 8.0f, 31);
    }

    public final String toString() {
        String d2 = hy6.d(8.0f);
        String d3 = hy6.d(8.0f);
        String d4 = hy6.d(8.0f);
        StringBuilder h = k84.h("CjkSuffixConfig(showYearSuffix=", ", showMonthSuffix=", ", showDaySuffix=", this.a, this.b);
        m51.y(", yearSuffixSpacing=", d2, ", monthSuffixSpacing=", h, this.c);
        return sv6.p(h, d3, ", daySuffixSpacing=", d4, ")");
    }
}
