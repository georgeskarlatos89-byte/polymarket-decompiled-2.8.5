package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j4k implements aog {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public j4k(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.ong
    public final nng d(long j) {
        long[] jArr = this.a;
        int e = u1k.e(jArr, j, true);
        long j2 = jArr[e];
        long[] jArr2 = this.b;
        qng qngVar = new qng(j2, jArr2[e]);
        if (j2 < j && e != jArr.length - 1) {
            int i = e + 1;
            return new nng(qngVar, new qng(jArr[i], jArr2[i]));
        }
        return new nng(qngVar, qngVar);
    }

    @Override // defpackage.aog
    public final long f() {
        return this.d;
    }

    @Override // defpackage.ong
    public final boolean g() {
        return true;
    }

    @Override // defpackage.aog
    public final long h(long j) {
        return this.a[u1k.e(this.b, j, true)];
    }

    @Override // defpackage.aog
    public final int j() {
        return this.e;
    }

    @Override // defpackage.ong
    public final long k() {
        return this.c;
    }
}
