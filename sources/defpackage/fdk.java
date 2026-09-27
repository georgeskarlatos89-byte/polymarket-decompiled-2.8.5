package defpackage;

import android.util.Log;
import io.sentry.android.core.m0;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class fdk {
    public static final boolean a = Log.isLoggable("Volley", 2);
    public static final String b = fdk.class.getName();

    public static String a(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i < stackTrace.length) {
                if (!stackTrace[i].getClassName().equals(b)) {
                    String className = stackTrace[i].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    StringBuilder t = sv6.t(substring.substring(substring.lastIndexOf(36) + 1), ".");
                    t.append(stackTrace[i].getMethodName());
                    str2 = t.toString();
                    break;
                }
                i++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        Locale locale = Locale.US;
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder("[");
        sb.append(id);
        sb.append("] ");
        sb.append(str2);
        return woa.r(sb, ": ", format);
    }

    public static void b(String str, Object... objArr) {
        m0.d("Volley", a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        if (a) {
            a(str, objArr);
        }
    }
}
