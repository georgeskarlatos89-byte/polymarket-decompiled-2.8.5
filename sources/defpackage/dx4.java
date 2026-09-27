package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class dx4 {
    public final zb4 a;
    public final zb4 b;
    public final zb4 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dx4(zb4 zb4Var, zb4 zb4Var2, int i) {
        this(zb4Var2, r0, r1, r5);
        zb4 zb4Var3;
        zb4 zb4Var4;
        float[] fArr;
        if (kpn.b(zb4Var.b, 12884901888L)) {
            zb4Var3 = mpn.a(zb4Var);
        } else {
            zb4Var3 = zb4Var;
        }
        if (kpn.b(zb4Var2.b, 12884901888L)) {
            zb4Var4 = mpn.a(zb4Var2);
        } else {
            zb4Var4 = zb4Var2;
        }
        float[] fArr2 = null;
        if (i == 3) {
            boolean b = kpn.b(zb4Var.b, 12884901888L);
            boolean b2 = kpn.b(zb4Var2.b, 12884901888L);
            if ((!b || !b2) && (b || b2)) {
                fkk fkkVar = ((t7g) (b ? zb4Var : zb4Var2)).d;
                float[] fArr3 = c1m.e;
                if (b) {
                    fArr = fkkVar.a();
                } else {
                    fArr = fArr3;
                }
                fArr3 = b2 ? fkkVar.a() : fArr3;
                fArr2 = new float[]{fArr[0] / fArr3[0], fArr[1] / fArr3[1], fArr[2] / fArr3[2]};
            }
        }
    }

    public long a(long j) {
        float g = ib4.g(j);
        float f = ib4.f(j);
        float d = ib4.d(j);
        float c = ib4.c(j);
        zb4 zb4Var = this.b;
        long d2 = zb4Var.d(g, f, d);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e = zb4Var.e(g, f, d);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e *= fArr[2];
        }
        float f2 = intBitsToFloat;
        float f3 = intBitsToFloat2;
        return this.c.f(f2, f3, e, c, this.a);
    }

    public dx4(zb4 zb4Var, zb4 zb4Var2, zb4 zb4Var3, float[] fArr) {
        this.a = zb4Var;
        this.b = zb4Var2;
        this.c = zb4Var3;
        this.d = fArr;
    }
}
