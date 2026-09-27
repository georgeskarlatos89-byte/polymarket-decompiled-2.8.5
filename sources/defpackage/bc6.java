package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bc6 {
    public final long a;
    public final long b;
    public final long c;

    public bc6(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bc6.class != obj.getClass()) {
            return false;
        }
        bc6 bc6Var = (bc6) obj;
        long j = bc6Var.a;
        int i = ib4.n;
        if (hkj.a(this.a, j) && hkj.a(this.b, bc6Var.b) && hkj.a(this.c, bc6Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.c) + woa.d(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
