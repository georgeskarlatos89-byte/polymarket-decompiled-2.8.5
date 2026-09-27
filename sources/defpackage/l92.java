package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class l92 implements m92 {
    public final float a;

    public l92(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof l92) || !hy6.c(this.a, ((l92) obj).a)) {
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
        return sv6.n("RoundedRect(cornerRadius=", hy6.d(this.a), ")");
    }
}
