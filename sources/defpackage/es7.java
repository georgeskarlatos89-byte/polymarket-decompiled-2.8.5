package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class es7 {
    public final int a;
    public final int b;

    public es7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es7)) {
            return false;
        }
        es7 es7Var = (es7) obj;
        if (this.a == es7Var.a && this.b == es7Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return m51.j(this.a, "ExpiryDate(month=", this.b, ", year=", ")");
    }
}
