package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i1a {
    public static final i1a e = new i1a(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public i1a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((b() / 2) + this.b) & 4294967295L) | (((d() / 2) + this.a) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (this.a << 32) | (this.b & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1a)) {
            return false;
        }
        i1a i1aVar = (i1a) obj;
        if (this.a == i1aVar.a && this.b == i1aVar.b && this.c == i1aVar.c && this.d == i1aVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + woa.b(this.c, woa.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return sv6.o(sb, this.d, ')');
    }
}
