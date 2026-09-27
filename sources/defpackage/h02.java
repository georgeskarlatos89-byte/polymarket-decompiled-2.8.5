package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class h02 extends k02 {
    public final float c;

    public h02(float f) {
        super(f, f);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof h02) || !hy6.c(this.c, ((h02) obj).c)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return sv6.n("Custom(size=", hy6.d(this.c), ")");
    }
}
