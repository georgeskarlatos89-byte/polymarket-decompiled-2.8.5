package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rk8 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public rk8(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final mqd a() {
        return new mqd(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk8)) {
            return false;
        }
        rk8 rk8Var = (rk8) obj;
        if (Float.compare(this.a, rk8Var.a) == 0 && Float.compare(this.b, rk8Var.b) == 0 && Float.compare(this.c, rk8Var.c) == 0 && Float.compare(this.d, rk8Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + sv6.a(sv6.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder u = hdi.u(this.a, this.b, "FormInsets(start=", ", top=", ", end=");
        u.append(this.c);
        u.append(", bottom=");
        u.append(this.d);
        u.append(")");
        return u.toString();
    }
}
