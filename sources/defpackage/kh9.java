package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kh9 {
    public long a;
    public long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh9)) {
            return false;
        }
        kh9 kh9Var = (kh9) obj;
        if (this.a == kh9Var.a && this.b == kh9Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return woa.n(this.b, ")", ace.p(this.a, "HttpResponseTiming(startTime=", ", endTime="));
    }
}
