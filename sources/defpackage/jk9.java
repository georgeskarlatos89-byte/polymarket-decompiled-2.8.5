package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class jk9 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public jk9(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final jk9 a(long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7;
        long j8;
        if (j != 16) {
            j5 = j;
        } else {
            j5 = this.a;
        }
        if (j2 != 16) {
            j6 = j2;
        } else {
            j6 = this.b;
        }
        if (j3 != 16) {
            j7 = j3;
        } else {
            j7 = this.c;
        }
        if (j4 != 16) {
            j8 = j4;
        } else {
            j8 = this.d;
        }
        return new jk9(j5, j6, j7, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jk9)) {
            return false;
        }
        jk9 jk9Var = (jk9) obj;
        long j = jk9Var.a;
        int i = ib4.n;
        if (hkj.a(this.a, j) && hkj.a(this.b, jk9Var.b) && hkj.a(this.c, jk9Var.c) && hkj.a(this.d, jk9Var.d)) {
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
