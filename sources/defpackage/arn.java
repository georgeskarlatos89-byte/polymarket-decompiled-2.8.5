package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.appsflyer.internal.l;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class arn {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        dmk.v(str);
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        omf.a();
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            int length = String.valueOf(name).length();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length + 35 + 1);
            k84.q(sb, "Must be called on ", name, " thread, but got ", str);
            l.m(sb, ".");
        }
    }

    public static void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        dmk.v("Given String is empty or null");
    }

    public static void f(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        dmk.v(str2);
    }

    public static void g(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        dmk.n(str);
    }

    public static void h(Object obj) {
        if (obj != null) {
            return;
        }
        dmk.s("null reference");
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        dmk.s(str);
    }

    public static void j(String str, boolean z) {
        if (z) {
            return;
        }
        dmk.n(str);
    }

    public static void k(boolean z) {
        if (z) {
            return;
        }
        l.o();
    }
}
