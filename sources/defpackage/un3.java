package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class un3 extends xn3 {
    public final ln3 a;

    public un3(ln3 ln3Var) {
        ln3Var.getClass();
        this.a = ln3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof un3) && this.a == ((un3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Category(category=" + this.a + ")";
    }
}
