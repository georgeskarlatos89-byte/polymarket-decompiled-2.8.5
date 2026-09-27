package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ix0 {
    public final int a;
    public final w03 b;

    public ix0(int i, w03 w03Var) {
        this.a = i;
        this.b = w03Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ix0) {
                ix0 ix0Var = (ix0) obj;
                if (this.a == ix0Var.a && this.b.equals(ix0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.a + ", cameraIdentifier=" + this.b + "}";
    }
}
