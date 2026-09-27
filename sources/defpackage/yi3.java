package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yi3 extends n5f {
    public static final yi3 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [yi3, n5f] */
    static {
        zi3.a.getClass();
        c = new n5f(qj3.a);
    }

    @Override // defpackage.p1
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.xa4, defpackage.p1
    public final void f(xq4 xq4Var, int i, Object obj) {
        si3 si3Var = (si3) obj;
        si3Var.getClass();
        char h = xq4Var.h(this.b, i);
        l5f.c(si3Var);
        char[] cArr = si3Var.a;
        int i2 = si3Var.b;
        si3Var.b = i2 + 1;
        cArr[i2] = h;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, si3] */
    @Override // defpackage.p1
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        ?? obj2 = new Object();
        obj2.a = cArr;
        obj2.b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.n5f
    public final Object j() {
        return new char[0];
    }

    @Override // defpackage.n5f
    public final void k(yq4 yq4Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        yq4Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            yq4Var.B(this.b, i2, cArr[i2]);
        }
    }
}
