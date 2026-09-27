package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e89 {
    public final long a;
    public final double b;
    public final double c;
    public final double d;

    public e89(long j, double d, double d2, double d3) {
        this.a = j;
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e89)) {
            return false;
        }
        e89 e89Var = (e89) obj;
        if (this.a == e89Var.a && Double.compare(this.b, e89Var.b) == 0 && Double.compare(this.c, e89Var.c) == 0 && Double.compare(this.d, e89Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + hdi.c(hdi.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "HistogramSnapshot(count=" + this.a + ", min=" + this.b + ", max=" + this.c + ", sum=" + this.d + ')';
    }
}
