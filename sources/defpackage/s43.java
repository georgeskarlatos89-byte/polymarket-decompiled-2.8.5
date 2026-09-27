package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class s43 {
    public final r43 a;
    public final boolean b;

    public s43(r43 r43Var, boolean z) {
        r43Var.getClass();
        this.a = r43Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s43)) {
            return false;
        }
        s43 s43Var = (s43) obj;
        if (this.a == s43Var.a && this.b == s43Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CardBrandChoice(brand=" + this.a + ", enabled=" + this.b + ")";
    }
}
