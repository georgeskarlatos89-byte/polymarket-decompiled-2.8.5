package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class uz4 {
    public static final long a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (i4 >= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (i3 >= 0) {
            z4 = true;
        }
        if (!(z4 & z6)) {
            mw9.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i, i2, i3, i4);
    }

    public static /* synthetic */ long b(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(i, i2, i3, i4);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        if (i < 262143) {
            return 18;
        }
        return 255;
    }

    public static final long d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int k = rz4.k(j);
        int i2 = rz4.i(j);
        if (i < k) {
            i = k;
        }
        if (i <= i2) {
            i2 = i;
        }
        int i3 = (int) (j2 & 4294967295L);
        int j3 = rz4.j(j);
        int h = rz4.h(j);
        if (i3 < j3) {
            i3 = j3;
        }
        if (i3 <= h) {
            h = i3;
        }
        return (i2 << 32) | (h & 4294967295L);
    }

    public static final long e(long j, long j2) {
        int k = rz4.k(j);
        int i = rz4.i(j);
        int j3 = rz4.j(j);
        int h = rz4.h(j);
        int k2 = rz4.k(j2);
        if (k2 < k) {
            k2 = k;
        }
        if (k2 > i) {
            k2 = i;
        }
        int i2 = rz4.i(j2);
        if (i2 >= k) {
            k = i2;
        }
        if (k <= i) {
            i = k;
        }
        int j4 = rz4.j(j2);
        if (j4 < j3) {
            j4 = j3;
        }
        if (j4 > h) {
            j4 = h;
        }
        int h2 = rz4.h(j2);
        if (h2 >= j3) {
            j3 = h2;
        }
        if (j3 <= h) {
            h = j3;
        }
        return a(k2, i, j4, h);
    }

    public static final int f(int i, long j) {
        int j2 = rz4.j(j);
        int h = rz4.h(j);
        if (i < j2) {
            i = j2;
        }
        if (i > h) {
            return h;
        }
        return i;
    }

    public static final int g(int i, long j) {
        int k = rz4.k(j);
        int i2 = rz4.i(j);
        if (i < k) {
            i = k;
        }
        if (i > i2) {
            return i2;
        }
        return i;
    }

    public static final long h(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i4 == Integer.MAX_VALUE) {
            i5 = i3;
        } else {
            i5 = i4;
        }
        int c = c(i5);
        if (i2 == Integer.MAX_VALUE) {
            i6 = i;
        } else {
            i6 = i2;
        }
        int c2 = c(i6);
        if (c + c2 > 31) {
            k(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = c2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (c2 + 2)) | ((i8 & (~(i8 >> 31))) << (c2 + 33));
    }

    public static final long i(int i, int i2, long j) {
        int k = rz4.k(j) + i;
        int i3 = 0;
        if (k < 0) {
            k = 0;
        }
        int i4 = rz4.i(j);
        if (i4 != Integer.MAX_VALUE && (i4 = i4 + i) < 0) {
            i4 = 0;
        }
        int j2 = rz4.j(j) + i2;
        if (j2 < 0) {
            j2 = 0;
        }
        int h = rz4.h(j);
        if (h == Integer.MAX_VALUE || (h = h + i2) >= 0) {
            i3 = h;
        }
        return a(k, i4, j2, i3);
    }

    public static /* synthetic */ long j(long j, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return i(i, i2, j);
    }

    public static final void k(int i, int i2) {
        throw new IllegalArgumentException(m51.j(i, "Can't represent a width of ", i2, " and height of ", " in Constraints"));
    }

    public static final Void l(int i) {
        throw new IllegalArgumentException(sv6.j(i, "Can't represent a size of ", " in Constraints"));
    }
}
