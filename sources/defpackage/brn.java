package defpackage;

import com.appsflyer.internal.l;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class brn {
    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        if (i != 0) {
            return false;
        }
        return true;
    }

    public static String b(int i, int i2, String str) {
        if (i < 0) {
            return wql.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return wql.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        dmk.v(ace.f(i2, "negative size: "));
        return null;
    }

    public static void c(int i, String str, boolean z) {
        if (z) {
            return;
        }
        dmk.v(wql.a(str, Integer.valueOf(i)));
    }

    public static void d(long j, String str, boolean z) {
        if (z) {
            return;
        }
        dmk.v(wql.a(str, Long.valueOf(j)));
    }

    public static void e(Object obj, String str, boolean z) {
        if (z) {
            return;
        }
        dmk.v(wql.a(str, obj));
    }

    public static void f(String str, int i, int i2, boolean z) {
        if (z) {
            return;
        }
        dmk.v(wql.a(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void g(String str, boolean z) {
        if (z) {
            return;
        }
        dmk.v(str);
    }

    public static void h(boolean z) {
        if (z) {
            return;
        }
        omf.a();
    }

    public static void i(boolean z, String str, Number number, Number number2, Number number3) {
        if (z) {
            return;
        }
        dmk.v(wql.a(str, number, number2, number3));
    }

    public static void j(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        dmk.v(wql.a(str, obj, obj2));
    }

    public static void k(int i, int i2) {
        String a;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                dmk.v(ace.f(i2, "negative size: "));
                return;
            }
            a = wql.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            a = wql.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(a);
    }

    public static void l(Object obj, Object obj2, String str) {
        if (obj != null) {
            return;
        }
        dmk.s(wql.a(str, obj2));
    }

    public static void m(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void n(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        f27.m(b(i, i2, "index"));
    }

    public static void o(int i, int i2, int i3) {
        String b;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                b = wql.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                b = b(i2, i3, "end index");
            }
        } else {
            b = b(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(b);
    }

    public static void p(int i, String str, boolean z) {
        if (z) {
            return;
        }
        dmk.n(wql.a(str, Integer.valueOf(i)));
    }

    public static void q(Object obj, String str, boolean z) {
        if (z) {
            return;
        }
        dmk.n(wql.a(str, obj));
    }

    public static void r(String str, boolean z) {
        if (z) {
            return;
        }
        dmk.n(str);
    }

    public static void s(boolean z) {
        if (z) {
            return;
        }
        l.o();
    }
}
