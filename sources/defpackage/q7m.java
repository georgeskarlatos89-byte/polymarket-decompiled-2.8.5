package defpackage;

import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.m0;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class q7m {
    public static final Object a = new Object();

    public static String a(String str, Throwable th) {
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (a) {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        try {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th2 = th2.getCause();
                            }
                        } finally {
                        }
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            StringBuilder t = sv6.t(str, "\n  ");
            t.append(replace.replace("\n", "\n  "));
            t.append('\n');
            return t.toString();
        }
        return str;
    }

    public static void b(String str) {
        synchronized (a) {
            a(str, null);
        }
    }

    public static void c(String str, String str2) {
        synchronized (a) {
            m0.d(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (a) {
            m0.d(str, a(str2, th));
        }
    }

    public static void e(String str, String str2) {
        synchronized (a) {
            Log.i(str, a(str2, null));
        }
    }

    public static final hxi f(pq4 pq4Var) {
        sr8 sr8Var = (sr8) pq4Var;
        nh8 nh8Var = (nh8) sr8Var.l(as4.k);
        il6 il6Var = (il6) sr8Var.l(as4.h);
        owa owaVar = (owa) sr8Var.l(as4.n);
        boolean h = sr8Var.h(nh8Var) | sr8Var.h(il6Var) | sr8Var.f(owaVar.ordinal()) | sr8Var.f(8);
        Object Q = sr8Var.Q();
        if (h || Q == oq4.a) {
            Q = new hxi(nh8Var, il6Var, owaVar);
            sr8Var.o0(Q);
        }
        return (hxi) Q;
    }

    public static void g(String str, String str2) {
        synchronized (a) {
            m0.p(str, a(str2, null));
        }
    }

    public static void h(String str, String str2, Throwable th) {
        synchronized (a) {
            m0.p(str, a(str2, th));
        }
    }
}
