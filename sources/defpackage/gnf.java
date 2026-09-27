package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class gnf {
    public static final fnf a = new fnf(null);
    public static final s4 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [s4] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        ?? r0;
        Integer num = r9a.b;
        if (num != null && num.intValue() < 34) {
            r0 = new wv7();
        } else {
            r0 = new Object();
        }
        b = r0;
    }

    public abstract int a(int i);

    public float b() {
        return a(24) / 1.6777216E7f;
    }

    public int c() {
        return a(32);
    }

    public int d(int i) {
        return e(0, i);
    }

    public int e(int i, int i2) {
        int c;
        int i3;
        int i4;
        if (i2 > i) {
            int i5 = i2 - i;
            if (i5 > 0 || i5 == Integer.MIN_VALUE) {
                if (((-i5) & i5) == i5) {
                    i4 = a(31 - Integer.numberOfLeadingZeros(i5));
                    return i + i4;
                }
                do {
                    c = c() >>> 1;
                    i3 = c % i5;
                } while ((i5 - 1) + (c - i3) < 0);
                i4 = i3;
                return i + i4;
            }
            while (true) {
                int c2 = c();
                if (i <= c2 && c2 < i2) {
                    return c2;
                }
            }
        } else {
            f27.q(ltn.d(Integer.valueOf(i), Integer.valueOf(i2)));
            return 0;
        }
    }

    public long f() {
        return (c() << 32) + c();
    }

    public long g(long j, long j2) {
        long f;
        long j3;
        long j4;
        int c;
        if (j2 > j) {
            long j5 = j2 - j;
            if (j5 > 0) {
                if (((-j5) & j5) == j5) {
                    int i = (int) j5;
                    int i2 = (int) (j5 >>> 32);
                    if (i != 0) {
                        c = a(31 - Integer.numberOfLeadingZeros(i));
                    } else if (i2 == 1) {
                        c = c();
                    } else {
                        j4 = (a(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (c() & 4294967295L);
                        return j + j4;
                    }
                    j4 = c & 4294967295L;
                    return j + j4;
                }
                do {
                    f = f() >>> 1;
                    j3 = f % j5;
                } while ((j5 - 1) + (f - j3) < 0);
                j4 = j3;
                return j + j4;
            }
            while (true) {
                long f2 = f();
                if (j <= f2 && f2 < j2) {
                    return f2;
                }
            }
        } else {
            f27.q(ltn.d(Long.valueOf(j), Long.valueOf(j2)));
            return 0L;
        }
    }
}
