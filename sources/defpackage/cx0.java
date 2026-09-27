package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cx0 {
    public final px0 a;
    public final int b;

    public cx0(px0 px0Var, int i) {
        this.a = px0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof cx0) {
                cx0 cx0Var = (cx0) obj;
                if (this.a.equals(cx0Var.a) && this.b == cx0Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.a);
        sb.append(", jpegQuality=");
        return ix2.i(this.b, "}", sb);
    }
}
