package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m1j {
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
    public final long n;

    public m1j(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
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
        this.n = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m1j.class != obj.getClass()) {
            return false;
        }
        m1j m1jVar = (m1j) obj;
        long j = m1jVar.a;
        int i = ib4.n;
        if (hkj.a(this.a, j) && hkj.a(this.b, m1jVar.b) && hkj.a(this.c, m1jVar.c) && hkj.a(this.d, m1jVar.d) && hkj.a(this.g, m1jVar.g) && hkj.a(this.h, m1jVar.h) && hkj.a(this.i, m1jVar.i) && hkj.a(this.j, m1jVar.j) && hkj.a(this.k, m1jVar.k) && hkj.a(this.l, m1jVar.l) && hkj.a(this.m, m1jVar.m) && hkj.a(this.n, m1jVar.n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.n) + woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }
}
