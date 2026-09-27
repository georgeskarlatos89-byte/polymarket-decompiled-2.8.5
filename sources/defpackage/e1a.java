package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e1a {
    public final long a;

    public /* synthetic */ e1a(long j) {
        this.a = j;
    }

    public static long a(long j, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (j & 4294967295L);
        }
        return (i << 32) | (i2 & 4294967295L);
    }

    public static final boolean b(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long c(long j, long j2) {
        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final long d(long j, long j2) {
        return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static String e(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return sv6.o(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e1a) {
            if (this.a != ((e1a) obj).a) {
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
