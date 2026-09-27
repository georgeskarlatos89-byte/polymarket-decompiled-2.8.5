package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class kpi {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final ssc f;

    static {
        String str;
        int i = eji.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = jul.d(100000L, "kotlinx.coroutines.scheduler.resolution.ns", 1L, Long.MAX_VALUE);
        int i2 = eji.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = jul.e(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = jul.e(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(jul.d(60L, "kotlinx.coroutines.scheduler.keep.alive.sec", 1L, Long.MAX_VALUE));
        f = ssc.a;
    }
}
