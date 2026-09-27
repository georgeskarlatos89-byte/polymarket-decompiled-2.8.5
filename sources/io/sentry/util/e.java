package io.sentry.util;

import io.sentry.j2;
import io.sentry.k1;
import io.sentry.p5;
import io.sentry.x0;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class e {
    public static final Charset a = Charset.forName("UTF-8");

    public static long a(k1 k1Var, x0 x0Var, j2 j2Var) {
        try {
            d dVar = new d();
            k1Var.a(dVar, j2Var);
            return dVar.a;
        } catch (Throwable th) {
            x0Var.d(p5.ERROR, "Could not calculate size of serializable", th);
            return 0L;
        }
    }

    public static HashMap b(Calendar calendar) {
        HashMap hashMap = new HashMap();
        hashMap.put("year", Integer.valueOf(calendar.get(1)));
        hashMap.put("month", Integer.valueOf(calendar.get(2)));
        hashMap.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        hashMap.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        hashMap.put("minute", Integer.valueOf(calendar.get(12)));
        hashMap.put("second", Integer.valueOf(calendar.get(13)));
        return hashMap;
    }
}
