package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ec4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;

    public ec4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec4)) {
            return false;
        }
        ec4 ec4Var = (ec4) obj;
        if (this.a == ec4Var.a && this.b == ec4Var.b && this.c == ec4Var.c && this.d == ec4Var.d && this.e == ec4Var.e && this.f == ec4Var.f && this.g == ec4Var.g && this.h == ec4Var.h && this.i == ec4Var.i && this.j == ec4Var.j && this.k == ec4Var.k && this.l == ec4Var.l && this.m == ec4Var.m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder p = ace.p(this.a, "ColorTokens(disabled=", ", error=");
        p.append(this.b);
        ix2.A(p, ", inverse=", this.c, ", action=");
        p.append(this.d);
        ix2.A(p, ", success=", this.e, ", primary=");
        p.append(this.f);
        ix2.A(p, ", secondary=", this.g, ", formBorder=");
        p.append(this.h);
        ix2.A(p, ", border=", this.i, ", outline=");
        p.append(this.j);
        ix2.A(p, ", formBackground=", this.k, ", background=");
        p.append(this.l);
        p.append(", scrolledContainer=");
        p.append(this.m);
        p.append(")");
        return p.toString();
    }
}
