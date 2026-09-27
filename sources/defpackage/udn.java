package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class udn {
    public static final sa0 a(sa0 sa0Var) {
        sa0 c = sa0Var.c();
        int b = c.b();
        for (int i = 0; i < b; i++) {
            c.e(sa0Var.a(i), i);
        }
        return c;
    }

    public static void b(int i, int i2) {
        String h;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                dmk.v(ace.f(i2, "negative size: "));
                return;
            }
            h = vdn.h("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            h = vdn.h("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(h);
    }

    public static void c(int i, int i2, int i3) {
        String d;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                d = vdn.h("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                d = d(i2, i3, "end index");
            }
        } else {
            d = d(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(d);
    }

    public static String d(int i, int i2, String str) {
        if (i < 0) {
            return vdn.h("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return vdn.h("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        dmk.v(ace.f(i2, "negative size: "));
        return null;
    }
}
