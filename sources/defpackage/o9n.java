package defpackage;

import android.util.Log;
import io.sentry.android.core.m0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class o9n {
    public static int a = 3;

    public static n70 a(rp4 rp4Var, pq4 pq4Var, v5c v5cVar, pq4 pq4Var2, sje sjeVar) {
        zzm.d(pq4Var, v5cVar, rp4.f);
        zzm.d(pq4Var2, sjeVar, rp4.e);
        return rp4.g;
    }

    public static void b(String str, String str2) {
        if (e(6, str)) {
            m0.d(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (e(6, str)) {
            m0.e(str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        if (e(4, str)) {
            Log.i(str, str2);
        }
    }

    public static boolean e(int i, String str) {
        if (a > i && !Log.isLoggable(str, i)) {
            return false;
        }
        return true;
    }

    public static void f(String str, String str2) {
        if (e(5, str)) {
            m0.p(str, str2);
        }
    }

    public static void g(String str, String str2, Throwable th) {
        if (e(5, str)) {
            m0.q(str, str2, th);
        }
    }
}
