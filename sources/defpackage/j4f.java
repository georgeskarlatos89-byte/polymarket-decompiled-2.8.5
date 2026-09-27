package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class j4f {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public j4f(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4f)) {
            return false;
        }
        j4f j4fVar = (j4f) obj;
        long j = j4fVar.a;
        int i = ib4.n;
        if (hkj.a(this.a, j) && hkj.a(this.b, j4fVar.b) && hkj.a(this.c, j4fVar.c) && hkj.a(this.d, j4fVar.d) && hkj.a(this.e, j4fVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.e) + woa.d(woa.d(woa.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String h = ib4.h(this.a);
        String h2 = ib4.h(this.b);
        String h3 = ib4.h(this.c);
        String h4 = ib4.h(this.d);
        String h5 = ib4.h(this.e);
        StringBuilder r = m51.r("PrimaryButtonColors(background=", h, ", onBackground=", h2, ", border=");
        k84.q(r, h3, ", successBackground=", h4, ", onSuccessBackground=");
        return woa.r(r, h5, ")");
    }
}
