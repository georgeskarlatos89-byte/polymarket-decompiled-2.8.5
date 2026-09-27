package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dd1 implements in {
    public final float a;

    public dd1(float f) {
        this.a = f;
    }

    @Override // defpackage.in
    public final int a(int i, int i2, owa owaVar) {
        return ix2.b(1.0f, this.a, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dd1) && Float.compare(this.a, ((dd1) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ix2.m(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
