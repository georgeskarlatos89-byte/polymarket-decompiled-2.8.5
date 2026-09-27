package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class y78 {
    public final float a;
    public final float b;
    public final long c;

    public y78(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y78)) {
            return false;
        }
        y78 y78Var = (y78) obj;
        if (Float.compare(this.a, y78Var.a) == 0 && Float.compare(this.b, y78Var.b) == 0 && this.c == y78Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + sv6.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
        sb.append(this.a);
        sb.append(", distance=");
        sb.append(this.b);
        sb.append(", duration=");
        return ix2.n(sb, this.c, ')');
    }
}
