package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g0d {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public g0d(float f, float f2, float f3, int i, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0d.class == obj.getClass()) {
            g0d g0dVar = (g0d) obj;
            if (this.c == g0dVar.c && this.d == g0dVar.d && this.b == g0dVar.b && this.a == g0dVar.a && this.e == g0dVar.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + woa.b(this.a, sv6.a(sv6.a(Float.hashCode(this.c) * 31, this.d, 31), this.b, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEvent(touchX=");
        sb.append(this.c);
        sb.append(", touchY=");
        sb.append(this.d);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", swipeEdge=");
        sb.append(this.a);
        sb.append(", frameTimeMillis=");
        return ix2.n(sb, this.e, ')');
    }
}
