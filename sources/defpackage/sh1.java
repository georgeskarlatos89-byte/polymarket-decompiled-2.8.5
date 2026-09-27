package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sh1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public sh1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh1)) {
            return false;
        }
        sh1 sh1Var = (sh1) obj;
        if (this.a == sh1Var.a && this.b == sh1Var.b && this.c == sh1Var.c && this.d == sh1Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + woa.b(this.c, woa.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder n = m51.n(this.a, "BorderRadius(bottomStart=", this.b, ", bottomEnd=", ", topStart=");
        n.append(this.c);
        n.append(", topEnd=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
