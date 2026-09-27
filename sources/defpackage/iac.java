package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iac {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public iac(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final iac a(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        if (j != 16) {
            j7 = j;
        } else {
            j7 = this.a;
        }
        if (j2 != 16) {
            j8 = j2;
        } else {
            j8 = this.b;
        }
        if (j3 != 16) {
            j9 = j3;
        } else {
            j9 = this.c;
        }
        if (j4 != 16) {
            j10 = j4;
        } else {
            j10 = this.d;
        }
        if (j5 != 16) {
            j11 = j5;
        } else {
            j11 = this.e;
        }
        if (j6 != 16) {
            j12 = j6;
        } else {
            j12 = this.f;
        }
        return new iac(j7, j8, j9, j10, j11, j12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof iac)) {
            return false;
        }
        iac iacVar = (iac) obj;
        long j = iacVar.a;
        int i = ib4.n;
        if (hkj.a(this.a, j) && hkj.a(this.b, iacVar.b) && hkj.a(this.c, iacVar.c) && hkj.a(this.d, iacVar.d) && hkj.a(this.e, iacVar.e) && hkj.a(this.f, iacVar.f)) {
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
