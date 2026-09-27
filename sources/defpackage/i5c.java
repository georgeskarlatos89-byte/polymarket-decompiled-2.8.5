package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class i5c extends h5c {
    public static double a(double d) {
        if (d < 1.0d) {
            return Double.NaN;
        }
        if (d > ly4.e) {
            return Math.log(d) + ly4.b;
        }
        double d2 = d - 1.0d;
        if (d2 >= ly4.d) {
            return Math.log(Math.sqrt((d * d) - 1.0d) + d);
        }
        double sqrt = Math.sqrt(d2);
        if (sqrt >= ly4.c) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12.0d;
        }
        return Math.sqrt(2.0d) * sqrt;
    }

    public static double b(double d) {
        double d2 = ly4.d;
        if (d >= d2) {
            if (d > ly4.f) {
                if (d > ly4.e) {
                    return Math.log(d) + ly4.b;
                }
                double d3 = d * 2.0d;
                return Math.log((1.0d / d3) + d3);
            }
            return Math.log(Math.sqrt((d * d) + 1.0d) + d);
        }
        if (d <= (-d2)) {
            return -b(-d);
        }
        if (Math.abs(d) >= ly4.c) {
            return d - (((d * d) * d) / 6.0d);
        }
        return d;
    }

    public static double c(double d) {
        if (Math.abs(d) < ly4.d) {
            if (Math.abs(d) > ly4.c) {
                return (((d * d) * d) / 3.0d) + d;
            }
            return d;
        }
        return Math.log((1.0d + d) / (1.0d - d)) / 2.0d;
    }

    public static int d(double d) {
        if (!Double.isNaN(d)) {
            if (d > 2.147483647E9d) {
                return bd0.API_PRIORITY_OTHER;
            }
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
        dmk.v("Cannot round NaN value.");
        return 0;
    }

    public static int e(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        dmk.v("Cannot round NaN value.");
        return 0;
    }

    public static long f(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        dmk.v("Cannot round NaN value.");
        return 0L;
    }
}
