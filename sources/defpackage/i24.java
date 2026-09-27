package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i24 implements ong {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public i24(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        } else {
            this.f = 0L;
        }
    }

    @Override // defpackage.ong
    public final nng d(long j) {
        long[] jArr = this.e;
        int e = u1k.e(jArr, j, true);
        long j2 = jArr[e];
        long[] jArr2 = this.c;
        qng qngVar = new qng(j2, jArr2[e]);
        if (j2 < j && e != this.a - 1) {
            int i = e + 1;
            return new nng(qngVar, new qng(jArr[i], jArr2[i]));
        }
        return new nng(qngVar, qngVar);
    }

    @Override // defpackage.ong
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ong
    public final long k() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
