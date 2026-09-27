package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import skip.lib.Duration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class d47 implements Comparable {
    public static final c47 b = new c47(null);
    public static final long c = h47.b(4611686018427387903L);
    public static final long d = h47.b(-4611686018427387903L);
    public static final long e = 9223372036854759646L;
    public final long a;

    public /* synthetic */ d47(long j) {
        this.a = j;
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long a = h47.a(j, j3);
        if (-4611686018426L <= a && a < 4611686018427L) {
            return h47.d((a * 1000000) + (j2 - (j3 * 1000000)));
        }
        return h47.b(a);
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String X = StringsKt.X(i3, String.valueOf(i2));
            int i4 = -1;
            int length = X.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (X.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((CharSequence) X, 0, i6);
            } else {
                sb.append((CharSequence) X, 0, ((i4 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            if (j(j)) {
                return -i;
            }
            return i;
        }
        return Intrinsics.e(j, j2);
    }

    public static final boolean d(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long e(long j) {
        if ((((int) j) & 1) == 1 && !i(j)) {
            return j >> 1;
        }
        return n(j, m47.MILLISECONDS);
    }

    public static final long f(long j) {
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            return j2;
        }
        if (j2 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j2 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j2 * 1000000;
    }

    public static final int g(long j) {
        long j2;
        if (i(j)) {
            return 0;
        }
        if ((((int) j) & 1) == 1) {
            j2 = ((j >> 1) % 1000) * 1000000;
        } else {
            j2 = (j >> 1) % Duration.ATTOSECONDS_PER_NANOSECOND;
        }
        return (int) j2;
    }

    public static final int h(long j) {
        if (i(j)) {
            return 0;
        }
        return (int) (n(j, m47.SECONDS) % 60);
    }

    public static final boolean i(long j) {
        if (j != c && j != d) {
            return false;
        }
        return true;
    }

    public static final boolean j(long j) {
        if (j < 0) {
            return true;
        }
        return false;
    }

    public static final long k(long j, long j2) {
        int i = ((int) j) & 1;
        if (i == (((int) j2) & 1)) {
            if (i == 0) {
                long j3 = (j >> 1) + (j2 >> 1);
                if (-4611686018426999999L <= j3 && j3 < 4611686018427000000L) {
                    return h47.d(j3);
                }
                return h47.b(j3 / 1000000);
            }
            long a = h47.a(j >> 1, j2 >> 1);
            if (a != 9223372036854759646L) {
                if (a != 4611686018427387903L && a != -4611686018427387903L) {
                    return h47.c(a);
                }
                return h47.b(a);
            }
            dmk.v("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (i == 1) {
            return a(j >> 1, j2 >> 1);
        }
        return a(j2 >> 1, j >> 1);
    }

    public static final double m(long j, m47 m47Var) {
        m47 m47Var2;
        m47Var.getClass();
        if (j == c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == d) {
            return Double.NEGATIVE_INFINITY;
        }
        double d2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            m47Var2 = m47.NANOSECONDS;
        } else {
            m47Var2 = m47.MILLISECONDS;
        }
        return n47.a(d2, m47Var2, m47Var);
    }

    public static final long n(long j, m47 m47Var) {
        m47 m47Var2;
        m47Var.getClass();
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            m47Var2 = m47.NANOSECONDS;
        } else {
            m47Var2 = m47.MILLISECONDS;
        }
        m47Var2.getClass();
        return m47Var.a().convert(j2, m47Var2.a());
    }

    public static String o(long j) {
        int n;
        int n2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (j == 0) {
            return "0s";
        }
        if (j == c) {
            return "Infinity";
        }
        if (j == d) {
            return "-Infinity";
        }
        boolean j2 = j(j);
        StringBuilder sb = new StringBuilder();
        if (j2) {
            sb.append('-');
        }
        if (j(j)) {
            j = p(j);
        }
        long n3 = n(j, m47.DAYS);
        int i = 0;
        if (i(j)) {
            n = 0;
        } else {
            n = (int) (n(j, m47.HOURS) % 24);
        }
        if (i(j)) {
            n2 = 0;
        } else {
            n2 = (int) (n(j, m47.MINUTES) % 60);
        }
        int h = h(j);
        int g = g(j);
        if (n3 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (n != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (n2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (h == 0 && g == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z) {
            sb.append(n3);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(n);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(n2);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (h == 0 && !z && !z2 && !z3) {
                if (g >= 1000000) {
                    b(sb, g / 1000000, g % 1000000, 6, "ms", false);
                } else if (g >= 1000) {
                    b(sb, g / 1000, g % 1000, 3, "us", false);
                } else {
                    sb.append(g);
                    sb.append("ns");
                }
            } else {
                b(sb, h, g, 9, "s", false);
            }
            i = i4;
        }
        if (j2 && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long p(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        b.getClass();
        int i = f47.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.a, ((d47) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d47) {
            if (this.a != ((d47) obj).a) {
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
        return o(this.a);
    }
}
