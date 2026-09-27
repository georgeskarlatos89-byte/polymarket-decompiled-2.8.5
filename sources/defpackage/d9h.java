package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d9h {
    public final long a;

    public /* synthetic */ d9h(long j) {
        this.a = j;
    }

    public static long a(float f, long j, int i) {
        float f2;
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        } else {
            f2 = 120.0f;
        }
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final boolean b(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float d(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float e(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean f(long j) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (j == 9205357640488583168L) {
            z = true;
        } else {
            z = false;
        }
        if (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z | z2;
        if (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f) {
            z3 = true;
        }
        return z4 | z3;
    }

    public static String g(long j) {
        if (j != 9205357640488583168L) {
            return "Size(" + wql.b(Float.intBitsToFloat((int) (j >> 32))) + ", " + wql.b(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d9h) {
            if (this.a != ((d9h) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return g(this.a);
    }
}
