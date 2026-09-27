package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ea9 extends zh {
    public final int a;
    public final int b;
    public final x71 c;
    public final uk d;

    public ea9(int i, int i2, x71 x71Var, uk ukVar) {
        this.a = i;
        this.b = i2;
        this.c = x71Var;
        this.d = ukVar;
    }

    public final int c() {
        x71 x71Var = x71.h;
        int i = this.b;
        x71 x71Var2 = this.c;
        if (x71Var2 == x71Var) {
            return i;
        }
        if (x71Var2 == x71.e) {
            return i + 5;
        }
        if (x71Var2 == x71.f) {
            return i + 5;
        }
        if (x71Var2 == x71.g) {
            return i + 5;
        }
        dmk.n("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ea9)) {
            return false;
        }
        ea9 ea9Var = (ea9) obj;
        if (ea9Var.a != this.a || ea9Var.c() != c() || ea9Var.c != this.c || ea9Var.d != this.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.c);
        sb.append(", hashType: ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.b);
        sb.append("-byte tags, and ");
        return ix2.i(this.a, "-byte key)", sb);
    }
}
