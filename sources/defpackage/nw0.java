package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nw0 extends yj4 {
    public final xw0 a;
    public final xj4 b;

    public nw0(xw0 xw0Var, xj4 xj4Var) {
        this.a = xw0Var;
        this.b = xj4Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof yj4) {
                yj4 yj4Var = (yj4) obj;
                if (this.a.equals(((nw0) yj4Var).a)) {
                    xj4 xj4Var = this.b;
                    if (xj4Var == null) {
                        if (((nw0) yj4Var).b == null) {
                            return true;
                        }
                        return false;
                    }
                    if (xj4Var.equals(((nw0) yj4Var).b)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        xj4 xj4Var = this.b;
        if (xj4Var == null) {
            hashCode = 0;
        } else {
            hashCode = xj4Var.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + this.b + "}";
    }
}
