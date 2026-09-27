package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ky6 {
    public final long a;

    public /* synthetic */ ky6(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String c(long j) {
        if (j != 9205357640488583168L) {
            return ((Object) hy6.d(b(j))) + " x " + ((Object) hy6.d(a(j)));
        }
        return "DpSize.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ky6) {
            if (this.a != ((ky6) obj).a) {
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
