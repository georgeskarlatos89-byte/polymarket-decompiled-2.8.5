package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a8g {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public a8g(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8g)) {
            return false;
        }
        a8g a8gVar = (a8g) obj;
        if (this.a == a8gVar.a && this.b == a8gVar.b && this.c == a8gVar.c && this.d == a8gVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + sv6.a(sv6.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return ix2.m(sb, this.d, ')');
    }
}
