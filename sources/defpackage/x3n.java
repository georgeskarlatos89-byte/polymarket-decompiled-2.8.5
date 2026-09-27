package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class x3n {
    public static final h68 a = new h68(0);

    public static e68 a(float f, int i) {
        if ((i & 8) != 0) {
            f = 0.0f;
        }
        return new e68(0.0f, f);
    }

    public static final nz9 b(t70 t70Var, pq4 pq4Var) {
        return new nz9(t70Var, (il6) ((sr8) pq4Var).l(as4.h));
    }

    public static final long c(float f, int i, long j, boolean z) {
        int i2;
        if ((z || i == 2 || i == 4 || i == 5) && rz4.e(j)) {
            i2 = rz4.i(j);
        } else {
            i2 = bd0.API_PRIORITY_OTHER;
        }
        if (rz4.k(j) != i2) {
            i2 = lnf.e(c4m.a(f), rz4.k(j), i2);
        }
        return drn.c(0, i2, 0, rz4.h(j));
    }
}
