package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class drn {
    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        dmk.s(str);
    }

    public static long b(int i, int i2, int i3, int i4) {
        int min;
        int i5;
        int i6 = 262142;
        int min2 = Math.min(i3, 262142);
        int i7 = bd0.API_PRIORITY_OTHER;
        if (i4 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i4, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i5 = min2;
        } else {
            i5 = min;
        }
        if (i5 >= 8191) {
            if (i5 < 32767) {
                i6 = 65534;
            } else if (i5 < 65535) {
                i6 = 32766;
            } else if (i5 < 262143) {
                i6 = 8190;
            } else {
                uz4.l(i5);
                f05.c();
                return 0L;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            i7 = Math.min(i6, i2);
        }
        return uz4.a(Math.min(i6, i), i7, min2, min);
    }

    public static long c(int i, int i2, int i3, int i4) {
        int min;
        int i5;
        int i6 = 262142;
        int min2 = Math.min(i, 262142);
        int i7 = bd0.API_PRIORITY_OTHER;
        if (i2 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i2, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i5 = min2;
        } else {
            i5 = min;
        }
        if (i5 >= 8191) {
            if (i5 < 32767) {
                i6 = 65534;
            } else if (i5 < 65535) {
                i6 = 32766;
            } else if (i5 < 262143) {
                i6 = 8190;
            } else {
                uz4.l(i5);
                f05.c();
                return 0L;
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            i7 = Math.min(i6, i4);
        }
        return uz4.a(min2, min, Math.min(i6, i3), i7);
    }
}
