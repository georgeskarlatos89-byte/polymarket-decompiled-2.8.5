package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tx0 {
    public final a67 a;
    public final a67 b;
    public final int c;
    public final ArrayList d;

    public tx0(a67 a67Var, a67 a67Var2, int i, ArrayList arrayList) {
        this.a = a67Var;
        this.b = a67Var2;
        this.c = i;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof tx0) {
                tx0 tx0Var = (tx0) obj;
                if (this.a == tx0Var.a && this.b == tx0Var.b && this.c == tx0Var.c && this.d.equals(tx0Var.d)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "In{edge=" + this.a + ", postviewEdge=" + this.b + ", inputFormat=" + this.c + ", outputFormats=" + this.d + "}";
    }
}
