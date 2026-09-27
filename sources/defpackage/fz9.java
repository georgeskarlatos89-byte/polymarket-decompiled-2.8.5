package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fz9 {
    public static final fz9 e = new fz9(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public fz9(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static fz9 a(fz9 fz9Var, fz9 fz9Var2) {
        return c(Math.max(fz9Var.a, fz9Var2.a), Math.max(fz9Var.b, fz9Var2.b), Math.max(fz9Var.c, fz9Var2.c), Math.max(fz9Var.d, fz9Var2.d));
    }

    public static fz9 b(fz9 fz9Var, fz9 fz9Var2) {
        return c(Math.min(fz9Var.a, fz9Var2.a), Math.min(fz9Var.b, fz9Var2.b), Math.min(fz9Var.c, fz9Var2.c), Math.min(fz9Var.d, fz9Var2.d));
    }

    public static fz9 c(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new fz9(i, i2, i3, i4);
    }

    public static fz9 d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return Insets.of(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fz9.class != obj.getClass()) {
            return false;
        }
        fz9 fz9Var = (fz9) obj;
        if (this.d == fz9Var.d && this.a == fz9Var.a && this.c == fz9Var.c && this.b == fz9Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return sv6.o(sb, this.d, '}');
    }
}
