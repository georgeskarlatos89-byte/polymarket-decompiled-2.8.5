package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lj3 extends ij3 implements a84 {
    public static final kj3 d = new kj3(null);

    static {
        new ij3((char) 1, (char) 0);
    }

    public final boolean a(char c) {
        if (this.a <= c && c <= this.b) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lj3) {
            if (!isEmpty() || !((lj3) obj).isEmpty()) {
                lj3 lj3Var = (lj3) obj;
                if (this.a == lj3Var.a && this.b == lj3Var.b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    public final boolean isEmpty() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
