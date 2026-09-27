package defpackage;

import android.util.Log;
import io.sentry.android.core.m0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class yw8 {
    public final String a;
    public final String b;

    public yw8(String str, String str2) {
        boolean z;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        arn.c(z, "tag \"%s\" is longer than the %d character maximum", objArr);
        this.a = str;
        this.b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public final void a(String str) {
        if (Log.isLoggable(this.a, 3)) {
            f(str);
        }
    }

    public final void b(String str, String str2) {
        if (Log.isLoggable(this.a, 6)) {
            m0.d(str, f(str2));
        }
    }

    public final void c(String str, String str2, Exception exc) {
        if (Log.isLoggable(this.a, 6)) {
            m0.e(str, f(str2), exc);
        }
    }

    public final void d(String str, String str2) {
        if (Log.isLoggable(this.a, 4)) {
            Log.i(str, f(str2));
        }
    }

    public final void e(String str, String str2) {
        if (Log.isLoggable(this.a, 5)) {
            m0.p(str, f(str2));
        }
    }

    public final String f(String str) {
        String str2 = this.b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }
}
