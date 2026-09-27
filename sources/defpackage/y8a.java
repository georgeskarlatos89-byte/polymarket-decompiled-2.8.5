package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class y8a {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public y8a(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8a)) {
            return false;
        }
        y8a y8aVar = (y8a) obj;
        if (Float.compare(this.a, y8aVar.a) == 0 && Float.compare(this.b, y8aVar.b) == 0 && Float.compare(this.c, y8aVar.c) == 0 && Float.compare(this.d, y8aVar.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + sv6.a(sv6.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder u = hdi.u(this.a, this.b, "ItemBounds(left=", ", top=", ", width=");
        u.append(this.c);
        u.append(", height=");
        u.append(this.d);
        u.append(")");
        return u.toString();
    }
}
