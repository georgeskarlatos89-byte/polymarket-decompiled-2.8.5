package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class x7c {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public x7c(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final x7c a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new x7c(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        if (this.b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7c)) {
            return false;
        }
        x7c x7cVar = (x7c) obj;
        if (this.a.equals(x7cVar.a) && this.b == x7cVar.b && this.c == x7cVar.c && this.d == x7cVar.d && this.e == x7cVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public x7c(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public x7c(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public x7c(Object obj) {
        this(-1L, obj);
    }
}
