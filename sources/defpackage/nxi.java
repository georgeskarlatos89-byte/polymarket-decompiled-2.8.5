package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nxi {
    public static final long b = h8m.a(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ nxi(long j) {
        this.a = j;
    }

    public static boolean a(long j, Object obj) {
        if (!(obj instanceof nxi) || j != ((nxi) obj).a) {
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

    public static final boolean c(long j) {
        if (((int) (j >> 32)) == ((int) (j & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static final int d(long j) {
        return e(j) - f(j);
    }

    public static final int e(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int f(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean g(long j) {
        if (((int) (j >> 32)) > ((int) (j & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static String h(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return sv6.o(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
