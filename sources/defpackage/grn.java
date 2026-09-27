package defpackage;

import androidx.compose.foundation.layout.b;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class grn {
    public static final void a(ip6 ip6Var, pq4 pq4Var, int i) {
        boolean z;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-492957453);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i & 1, z)) {
            wnl.a(sr8Var, ihn.a(b.d(b.e(hjc.a, 1.0f), 1.0f), 1.0f, hpn.c(ip6Var.a.i), nym.a));
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new t25(ip6Var, i);
        }
    }

    public static void b(String str, boolean z) {
        if (z) {
            return;
        }
        dmk.v(str);
    }

    public static void c(boolean z) {
        if (z) {
            return;
        }
        omf.a();
    }

    public static void d(String str, int i, int i2, int i3) {
        if (i >= i2) {
            if (i <= i3) {
                return;
            }
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
    }

    public static void e(int i) {
        if (i >= 0) {
            return;
        }
        omf.a();
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        dmk.s(str);
    }

    public static void g(String str, boolean z) {
        if (z) {
            return;
        }
        dmk.n(str);
    }
}
