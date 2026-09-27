package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class h3 {
    public h3(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static void a(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            dmk.v(woa.l(i, i2, "startIndex: ", " > endIndex: "));
            return;
        }
        omf.e(i3, m51.n(i, "startIndex: ", i2, ", endIndex: ", ", size: "));
    }

    public static void b(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        f27.m(woa.l(i, i2, "index: ", ", size: "));
    }

    public static void c(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        f27.m(woa.l(i, i2, "index: ", ", size: "));
    }

    public static void d(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            dmk.v(woa.l(i, i2, "fromIndex: ", " > toIndex: "));
            return;
        }
        omf.e(i3, m51.n(i, "fromIndex: ", i2, ", toIndex: ", ", size: "));
    }

    public static int e(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            if (i2 <= 2147483639) {
                return 2147483639;
            }
            return bd0.API_PRIORITY_OTHER;
        }
        return i3;
    }
}
