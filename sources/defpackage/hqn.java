package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class hqn {
    public static final boolean a(nse nseVar) {
        if (!nseVar.b() && !nseVar.h && nseVar.d) {
            return true;
        }
        return false;
    }

    public static final boolean b(nse nseVar) {
        if (!nseVar.h && nseVar.d) {
            return true;
        }
        return false;
    }

    public static final boolean c(nse nseVar) {
        if (!nseVar.b() && nseVar.h && !nseVar.d) {
            return true;
        }
        return false;
    }

    public static final boolean d(nse nseVar) {
        if (nseVar.h && !nseVar.d) {
            return true;
        }
        return false;
    }

    public static int e(ii4 ii4Var, ii4 ii4Var2) {
        ii4Var2.getClass();
        long l = ii4Var.l(ii4Var2);
        d47.b.getClass();
        return d47.c(l, 0L);
    }

    public static final boolean f(nse nseVar, long j, long j2) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (nseVar.i == 1) {
            i = 1;
        } else {
            i = 0;
        }
        long j3 = nseVar.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        float f3 = ((int) (j & 4294967295L)) + intBitsToFloat4;
        if (intBitsToFloat < (-intBitsToFloat3)) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat > f2) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z2 | z;
        if (intBitsToFloat2 < (-intBitsToFloat4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 | z3;
        if (intBitsToFloat2 > f3) {
            z4 = true;
        }
        return z6 | z4;
    }

    public static final long g(nse nseVar, boolean z) {
        long e = ogd.e(nseVar.c, nseVar.g);
        if (!z && nseVar.b()) {
            return 0L;
        }
        return e;
    }
}
