package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jy6 {
    public final long a;

    public /* synthetic */ jy6(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String c(long j) {
        if (j != 9205357640488583168L) {
            return "(" + ((Object) hy6.d(a(j))) + ", " + ((Object) hy6.d(b(j))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jy6) {
            if (this.a != ((jy6) obj).a) {
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
        return c(this.a);
    }
}
