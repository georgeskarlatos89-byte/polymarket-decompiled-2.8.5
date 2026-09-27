package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class h53 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public h53(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h53)) {
            return false;
        }
        h53 h53Var = (h53) obj;
        long j = h53Var.a;
        int i = ib4.n;
        if (hkj.a(this.a, j) && hkj.a(this.b, h53Var.b) && hkj.a(this.c, h53Var.c) && hkj.a(this.d, h53Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.d) + woa.d(woa.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
