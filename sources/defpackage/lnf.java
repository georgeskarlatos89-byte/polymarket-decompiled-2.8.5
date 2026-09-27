package defpackage;

import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class lnf extends knf {
    public static Comparable b(hy6 hy6Var, hy6 hy6Var2) {
        if (hy6Var.compareTo(hy6Var2) < 0) {
            return hy6Var2;
        }
        return hy6Var;
    }

    public static double c(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            if (d > d3) {
                return d3;
            }
            return d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float d(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int e(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            if (i > i3) {
                return i3;
            }
            return i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long f(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            if (j > j3) {
                return j3;
            }
            return j;
        }
        dmk.v(ix2.n(ace.p(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, '.'));
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long g(long j, ytb ytbVar) {
        long j2 = ytbVar.b;
        long j3 = ytbVar.a;
        if (ytbVar instanceof z74) {
            return ((Number) h(Long.valueOf(j), (y74) ((z74) ytbVar))).longValue();
        }
        if (!ytbVar.isEmpty()) {
            if (j < Long.valueOf(j3).longValue()) {
                return Long.valueOf(j3).longValue();
            }
            if (j > Long.valueOf(j2).longValue()) {
                return Long.valueOf(j2).longValue();
            }
            return j;
        }
        omf.k("Cannot coerce value to an empty range: ", ytbVar, 46);
        return 0L;
    }

    public static Comparable h(Comparable comparable, y74 y74Var) {
        boolean a = y74Var.a();
        float f = y74Var.b;
        float f2 = y74Var.a;
        if (!a) {
            if (y74Var.b(comparable, Float.valueOf(f2)) && !y74Var.b(Float.valueOf(f2), comparable)) {
                return Float.valueOf(f2);
            }
            if (y74Var.b(Float.valueOf(f), comparable) && !y74Var.b(comparable, Float.valueOf(f))) {
                return Float.valueOf(f);
            }
            return comparable;
        }
        omf.k("Cannot coerce value to an empty range: ", y74Var, 46);
        return null;
    }

    public static a i(IntRange intRange) {
        f1a f1aVar = a.d;
        int i = intRange.b;
        int i2 = intRange.a;
        int i3 = -intRange.c;
        f1aVar.getClass();
        return new a(i, i2, i3);
    }

    public static a j(int i, IntRange intRange) {
        boolean z;
        intRange.getClass();
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        knf.a(z, Integer.valueOf(i));
        f1a f1aVar = a.d;
        int i2 = intRange.a;
        int i3 = intRange.b;
        if (intRange.c <= 0) {
            i = -i;
        }
        f1aVar.getClass();
        return new a(i2, i3, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    public static IntRange k(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            IntRange.e.getClass();
            return IntRange.f;
        }
        return new a(i, i2 - 1, 1);
    }
}
