package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n1a {
    public final long a;

    public /* synthetic */ n1a(long j) {
        this.a = j;
    }

    public static boolean a(long j, Object obj) {
        if (!(obj instanceof n1a) || j != ((n1a) obj).a) {
            return false;
        }
        return true;
    }

    public static final boolean b(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static String c(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
