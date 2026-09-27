package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class yz5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public yz5(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yz5.class != obj.getClass()) {
            return false;
        }
        yz5 yz5Var = (yz5) obj;
        long j = yz5Var.a;
        int i = ib4.n;
        if (hkj.a(this.a, j) && hkj.a(this.b, yz5Var.b) && hkj.a(this.c, yz5Var.c) && hkj.a(this.d, yz5Var.d)) {
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
