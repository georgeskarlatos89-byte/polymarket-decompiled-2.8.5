package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cyi {
    public static final dyi[] b = {new dyi(0), new dyi(4294967296L), new dyi(8589934592L)};
    public static final long c = f9m.k(Float.NaN, 0);
    public final long a;

    public /* synthetic */ cyi(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean d(long j) {
        if ((j & 1095216660480L) == 8589934592L) {
            return true;
        }
        return false;
    }

    public static String e(long j) {
        long b2 = b(j);
        if (dyi.a(b2, 0L)) {
            return "Unspecified";
        }
        if (dyi.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (dyi.a(b2, 8589934592L)) {
            return c(j) + ".em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cyi) {
            if (this.a != ((cyi) obj).a) {
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
        return e(this.a);
    }
}
