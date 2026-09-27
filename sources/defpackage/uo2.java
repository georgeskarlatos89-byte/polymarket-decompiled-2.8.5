package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class uo2 implements vo2 {
    public final float a;

    public uo2(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof uo2) || !hy6.c(this.a, ((uo2) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return sv6.n("Underline(height=", hy6.d(this.a), ")");
    }
}
