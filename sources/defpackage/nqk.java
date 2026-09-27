package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nqk implements aog {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public nqk(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.ong
    public final nng d(long j) {
        double d;
        double d2;
        boolean g = g();
        int i = this.b;
        long j2 = this.a;
        if (!g) {
            qng qngVar = new qng(0L, j2 + i);
            return new nng(qngVar, qngVar);
        }
        long j3 = u1k.j(j, 0L, this.c);
        double d3 = (j3 * 100.0d) / this.c;
        double d4 = ConstantsKt.UNSET;
        if (d3 <= ConstantsKt.UNSET) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            pfn.g(jArr);
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j4 = this.e;
        qng qngVar2 = new qng(j3, j2 + u1k.j(Math.round((d4 / d) * j4), i, j4 - 1));
        return new nng(qngVar2, qngVar2);
    }

    @Override // defpackage.aog
    public final long f() {
        return this.f;
    }

    @Override // defpackage.ong
    public final boolean g() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aog
    public final long h(long j) {
        long j2;
        double d;
        long j3 = j - this.a;
        if (g() && j3 > this.b) {
            long[] jArr = this.g;
            pfn.g(jArr);
            double d2 = (j3 * 256.0d) / this.e;
            int e = u1k.e(jArr, (long) d2, true);
            long j4 = this.c;
            long j5 = (e * j4) / 100;
            long j6 = jArr[e];
            int i = e + 1;
            long j7 = (j4 * i) / 100;
            if (e == 99) {
                j2 = 256;
            } else {
                j2 = jArr[i];
            }
            if (j6 == j2) {
                d = ConstantsKt.UNSET;
            } else {
                d = (d2 - j6) / (j2 - j6);
            }
            return Math.round(d * (j7 - j5)) + j5;
        }
        return 0L;
    }

    @Override // defpackage.aog
    public final int j() {
        return this.d;
    }

    @Override // defpackage.ong
    public final long k() {
        return this.c;
    }
}
