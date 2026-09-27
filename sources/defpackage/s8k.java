package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s8k {
    public static final s8k d = new s8k(0, 0, 1.0f);
    public final int a;
    public final int b;
    public final float c;

    static {
        u1k.G(0);
        u1k.G(1);
        u1k.G(3);
    }

    public s8k(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s8k) {
            s8k s8kVar = (s8k) obj;
            if (this.a == s8kVar.a && this.b == s8kVar.b && this.c == s8kVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }
}
