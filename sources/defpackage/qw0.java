package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qw0 {
    public final int a;
    public final int b;
    public final cw2 c;

    public qw0(int i, int i2, cw2 cw2Var) {
        this.a = i;
        this.b = i2;
        this.c = cw2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qw0) {
            qw0 qw0Var = (qw0) obj;
            if (this.a == qw0Var.a && this.b == qw0Var.b && this.c == qw0Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
