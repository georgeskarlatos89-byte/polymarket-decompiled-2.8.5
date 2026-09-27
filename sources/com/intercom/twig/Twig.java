package com.intercom.twig;

import android.util.Log;
import defpackage.sv6;
import io.sentry.android.core.m0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class Twig {
    public static final int DISABLED = 8;
    private static final int MAX_LOG_LENGTH = 4000;
    private final boolean internalLoggingEnabled;
    private int logLevel;
    private final String tag;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface LogLevel {
    }

    public Twig(int i, String str, boolean z) {
        this.logLevel = i;
        this.tag = str == null ? "Twig" : str;
        this.internalLoggingEnabled = z;
    }

    private String getStackTraceString(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    private void log(int i, String str, String str2) {
        int min;
        if (str2.length() < MAX_LOG_LENGTH) {
            printLog(i, str, str2);
            return;
        }
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            int indexOf = str2.indexOf(10, i2);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i2 + MAX_LOG_LENGTH);
                printLog(i, str, str2.substring(i2, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i2 = min;
                }
            }
            i2 = min + 1;
        }
    }

    private void prepareLog(int i, Throwable th, String str, Object... objArr) {
        String str2;
        if (i >= this.logLevel) {
            String tag = getTag();
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str == null) {
                if (th == null) {
                    return;
                } else {
                    str2 = getStackTraceString(th);
                }
            } else {
                if (objArr.length > 0) {
                    str = String.format(str, objArr);
                }
                if (th != null) {
                    StringBuilder t = sv6.t(str, "\n");
                    t.append(getStackTraceString(th));
                    str2 = t.toString();
                } else {
                    str2 = str;
                }
            }
            log(i, tag, str2);
        }
    }

    private void printLog(int i, String str, String str2) {
        if (i == 7) {
            m0.s(str, str2);
        } else {
            Log.println(i, str, str2);
        }
    }

    public void d(Throwable th) {
        prepareLog(3, th, null, new Object[0]);
    }

    public void e(Throwable th) {
        prepareLog(6, th, null, new Object[0]);
    }

    public int getLogLevel() {
        return this.logLevel;
    }

    public String getTag() {
        return this.tag;
    }

    public void i(Throwable th) {
        prepareLog(4, th, null, new Object[0]);
    }

    public void internal(String str) {
        internal(this.tag, str);
    }

    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    public void v(Throwable th) {
        prepareLog(2, th, null, new Object[0]);
    }

    public void w(Throwable th) {
        prepareLog(5, th, null, new Object[0]);
    }

    public void wtf(Throwable th) {
        prepareLog(7, th, null, new Object[0]);
    }

    public void internal(String str, String str2) {
    }

    public void d(Throwable th, String str, Object... objArr) {
        prepareLog(3, th, str, objArr);
    }

    public void e(Throwable th, String str, Object... objArr) {
        prepareLog(6, th, str, objArr);
    }

    public void i(Throwable th, String str, Object... objArr) {
        prepareLog(4, th, str, objArr);
    }

    public void v(Throwable th, String str, Object... objArr) {
        prepareLog(2, th, str, objArr);
    }

    public void w(Throwable th, String str, Object... objArr) {
        prepareLog(5, th, str, objArr);
    }

    public void wtf(Throwable th, String str, Object... objArr) {
        prepareLog(7, th, str, objArr);
    }

    public void d(String str, Object... objArr) {
        prepareLog(3, null, str, objArr);
    }

    public void e(String str, Object... objArr) {
        prepareLog(6, null, str, objArr);
    }

    public void i(String str, Object... objArr) {
        prepareLog(4, null, str, objArr);
    }

    public void v(String str, Object... objArr) {
        prepareLog(2, null, str, objArr);
    }

    public void w(String str, Object... objArr) {
        prepareLog(5, null, str, objArr);
    }

    public void wtf(String str, Object... objArr) {
        prepareLog(7, null, str, objArr);
    }

    public void log(int i, String str, Object... objArr) {
        prepareLog(i, null, str, objArr);
    }
}
