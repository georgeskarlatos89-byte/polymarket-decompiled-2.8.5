package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class oq2 implements qq2 {
    public final double a;

    public oq2(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof oq2) && Double.compare(this.a, ((oq2) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return "After(seconds=" + this.a + ")";
    }
}
