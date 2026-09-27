package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yt1 extends n5f {
    public static final yt1 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [yt1, n5f] */
    static {
        av1.a.getClass();
        c = new n5f(tv1.a);
    }

    @Override // defpackage.p1
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.xa4, defpackage.p1
    public final void f(xq4 xq4Var, int i, Object obj) {
        pt1 pt1Var = (pt1) obj;
        pt1Var.getClass();
        byte k = xq4Var.k(this.b, i);
        l5f.c(pt1Var);
        byte[] bArr = pt1Var.a;
        int i2 = pt1Var.b;
        pt1Var.b = i2 + 1;
        bArr[i2] = k;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pt1] */
    @Override // defpackage.p1
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        ?? obj2 = new Object();
        obj2.a = bArr;
        obj2.b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.n5f
    public final Object j() {
        return new byte[0];
    }

    @Override // defpackage.n5f
    public final void k(yq4 yq4Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        yq4Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            yq4Var.h(this.b, i2, bArr[i2]);
        }
    }
}
