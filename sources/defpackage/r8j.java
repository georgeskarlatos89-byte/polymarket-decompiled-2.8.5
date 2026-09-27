package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r8j {
    public final j8j a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public r8j(j8j j8jVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        pfn.b(z2);
        pfn.b(iArr2.length == jArr2.length);
        this.a = j8jVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int a = u1k.a(jArr, j, true); a < jArr.length; a++) {
            if ((this.g[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
