package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class y74 implements z74 {
    public final float a;
    public final float b;

    public y74(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean a() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(Comparable comparable, Comparable comparable2) {
        if (((Number) comparable).floatValue() <= ((Number) comparable2).floatValue()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y74) {
            if (!a() || !((y74) obj).a()) {
                y74 y74Var = (y74) obj;
                if (this.a == y74Var.a && this.b == y74Var.b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
