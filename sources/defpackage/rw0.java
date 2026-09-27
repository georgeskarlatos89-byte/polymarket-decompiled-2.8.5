package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rw0 {
    public final nx0 a;
    public final nx0 b;

    public rw0(nx0 nx0Var, nx0 nx0Var2) {
        this.a = nx0Var;
        this.b = nx0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof rw0) {
                rw0 rw0Var = (rw0) obj;
                if (this.a.equals(rw0Var.a) && this.b.equals(rw0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
