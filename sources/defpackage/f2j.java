package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class f2j implements ii4 {
    public final long a;

    public /* synthetic */ f2j(long j) {
        this.a = j;
    }

    public static long b(long j) {
        fkc.a.getClass();
        long b = fkc.b();
        m47 m47Var = m47.NANOSECONDS;
        m47Var.getClass();
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return d47.p(man.d(j));
        }
        return man.f(b, j, m47Var);
    }

    public static final long c(long j, long j2) {
        fkc.a.getClass();
        m47 m47Var = m47.NANOSECONDS;
        m47Var.getClass();
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                d47.b.getClass();
                return 0L;
            }
            return d47.p(man.d(j2));
        }
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return man.d(j);
        }
        return man.f(j, j2, m47Var);
    }

    public static String d(long j) {
        return "ValueTimeMark(reading=" + j + ')';
    }

    @Override // kotlin.time.TimeMark
    public final long a() {
        return b(this.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ int compareTo(Object obj) {
        return hqn.e(this, (ii4) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f2j) {
            if (this.a != ((f2j) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    @Override // defpackage.ii4
    public final long l(ii4 ii4Var) {
        ii4Var.getClass();
        ii4Var.getClass();
        boolean z = ii4Var instanceof f2j;
        long j = this.a;
        if (z) {
            return c(j, ((f2j) ii4Var).a);
        }
        py2.h("Subtracting or comparing time marks from different time sources is not possible: ", d(j), " and ", ii4Var);
        return 0L;
    }

    public final String toString() {
        return d(this.a);
    }
}
