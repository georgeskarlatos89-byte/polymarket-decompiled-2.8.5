package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u5j {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public u5j(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u5j)) {
            return false;
        }
        u5j u5jVar = (u5j) obj;
        long j = u5jVar.a;
        int i = ib4.n;
        if (hkj.a(this.a, j) && hkj.a(this.b, u5jVar.b) && hkj.a(this.c, u5jVar.c) && hkj.a(this.d, u5jVar.d) && hkj.a(this.e, u5jVar.e) && hkj.a(this.f, u5jVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.f) + woa.d(woa.d(woa.d(woa.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
