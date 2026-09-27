package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ab1 {
    public final float a;

    public /* synthetic */ ab1(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ab1) {
            if (Float.compare(this.a, ((ab1) obj).a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
