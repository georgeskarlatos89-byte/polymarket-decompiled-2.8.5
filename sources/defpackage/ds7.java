package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ds7 extends a8l {
    public final int b;
    public final int c;

    public ds7(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds7)) {
            return false;
        }
        ds7 ds7Var = (ds7) obj;
        if (this.b == ds7Var.b && this.c == ds7Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }

    public final String toString() {
        return m51.j(this.b, "Validated(month=", this.c, ", year=", ")");
    }
}
