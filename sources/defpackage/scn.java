package defpackage;

import android.graphics.DashPathEffect;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class scn {
    public static final e40 a(float[] fArr) {
        return new e40(new DashPathEffect(fArr, 0.0f));
    }

    public static void b(int i, int i2) {
        String d;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                dmk.v(ace.f(i2, "negative size: "));
                return;
            }
            d = ycn.d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            d = ycn.d("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(d);
    }

    public static void c(int i, int i2, int i3) {
        String e;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                e = ycn.d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                e = e(i2, i3, "end index");
            }
        } else {
            e = e(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(e);
    }

    public static void d(String str, boolean z) {
        if (z) {
            return;
        }
        dmk.n(str);
    }

    public static String e(int i, int i2, String str) {
        if (i < 0) {
            return ycn.d("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return ycn.d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        dmk.v(ace.f(i2, "negative size: "));
        return null;
    }
}
