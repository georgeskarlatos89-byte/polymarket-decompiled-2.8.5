package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class p5h extends n5f {
    public static final p5h c;

    /* JADX WARN: Type inference failed for: r0v0, types: [p5h, n5f] */
    static {
        q5h.a.getClass();
        c = new n5f(s5h.a);
    }

    @Override // defpackage.p1
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.xa4, defpackage.p1
    public final void f(xq4 xq4Var, int i, Object obj) {
        o5h o5hVar = (o5h) obj;
        o5hVar.getClass();
        short x = xq4Var.x(this.b, i);
        l5f.c(o5hVar);
        short[] sArr = o5hVar.a;
        int i2 = o5hVar.b;
        o5hVar.b = i2 + 1;
        sArr[i2] = x;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o5h, java.lang.Object] */
    @Override // defpackage.p1
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        ?? obj2 = new Object();
        obj2.a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.n5f
    public final Object j() {
        return new short[0];
    }

    @Override // defpackage.n5f
    public final void k(yq4 yq4Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        yq4Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            yq4Var.k(this.b, i2, sArr[i2]);
        }
    }
}
