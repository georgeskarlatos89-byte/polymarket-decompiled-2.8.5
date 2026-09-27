package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rz4 {
    public final long a;

    public /* synthetic */ rz4(long j) {
        this.a = j;
    }

    public static final long a(int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            mw9.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return uz4.h(i, i2, i3, i4);
    }

    public static /* synthetic */ long b(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = k(j);
        }
        if ((i5 & 2) != 0) {
            i2 = i(j);
        }
        if ((i5 & 4) != 0) {
            i3 = j(j);
        }
        if ((i5 & 8) != 0) {
            i4 = h(j);
        }
        return a(i, i2, i3, i4);
    }

    public static final boolean c(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final boolean d(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        if ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean e(long j) {
        int i = (int) (3 & j);
        if ((((int) (j >> 33)) & ((1 << k84.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean f(long j) {
        int i;
        int i2 = (int) (3 & j);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        int i4 = (1 << (18 - i3)) - 1;
        int i5 = ((int) (j >> (i3 + 15))) & i4;
        int i6 = ((int) (j >> (i3 + 46))) & i4;
        if (i6 == 0) {
            i = bd0.API_PRIORITY_OTHER;
        } else {
            i = i6 - 1;
        }
        if (i5 == i) {
            return true;
        }
        return false;
    }

    public static final boolean g(long j) {
        int i;
        int i2 = (int) (3 & j);
        int a = (1 << k84.a((i2 & 2) >> 1, 3, (i2 & 1) << 1, 13)) - 1;
        int i3 = ((int) (j >> 2)) & a;
        int i4 = ((int) (j >> 33)) & a;
        if (i4 == 0) {
            i = bd0.API_PRIORITY_OTHER;
        } else {
            i = i4 - 1;
        }
        if (i3 == i) {
            return true;
        }
        return false;
    }

    public static final int h(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return bd0.API_PRIORITY_OTHER;
        }
        return i3 - 1;
    }

    public static final int i(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int a = i2 & ((1 << k84.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
        if (a == 0) {
            return bd0.API_PRIORITY_OTHER;
        }
        return a - 1;
    }

    public static final int j(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final int k(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << k84.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
    }

    public static final boolean l(long j) {
        boolean z;
        int i = (int) (3 & j);
        boolean z2 = true;
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1;
        int i4 = (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1;
        if (i3 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i4 != 0) {
            z2 = false;
        }
        return z | z2;
    }

    public static String m(long j) {
        String valueOf;
        int i = i(j);
        String str = "Infinity";
        if (i == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(i);
        }
        int h = h(j);
        if (h != Integer.MAX_VALUE) {
            str = String.valueOf(h);
        }
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(k(j));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(j(j));
        sb.append(", maxHeight = ");
        return m51.m(sb, str, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rz4) {
            if (this.a != ((rz4) obj).a) {
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
        return m(this.a);
    }
}
