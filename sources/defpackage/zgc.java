package defpackage;

import android.util.Pair;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zgc implements aog {
    public final long[] a;
    public final long[] b;
    public final long c;

    public zgc(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? u1k.L(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        double d;
        int e = u1k.e(jArr, j, true);
        long j2 = jArr[e];
        long j3 = jArr2[e];
        int i = e + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = ConstantsKt.UNSET;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override // defpackage.ong
    public final nng d(long j) {
        Pair a = a(u1k.W(u1k.j(j, 0L, this.c)), this.b, this.a);
        qng qngVar = new qng(u1k.L(((Long) a.first).longValue()), ((Long) a.second).longValue());
        return new nng(qngVar, qngVar);
    }

    @Override // defpackage.aog
    public final long f() {
        return -1L;
    }

    @Override // defpackage.ong
    public final boolean g() {
        return true;
    }

    @Override // defpackage.aog
    public final long h(long j) {
        return u1k.L(((Long) a(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.aog
    public final int j() {
        return -2147483647;
    }

    @Override // defpackage.ong
    public final long k() {
        return this.c;
    }
}
