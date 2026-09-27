package io.sentry.util;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class n {
    public static final ThreadLocal a = new ThreadLocal();
    public static final m b = new Object();

    public static m a() {
        ThreadLocal threadLocal = a;
        Integer num = (Integer) threadLocal.get();
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        threadLocal.set(Integer.valueOf(i));
        return b;
    }

    public static boolean b() {
        Integer num = (Integer) a.get();
        if (num != null && num.intValue() > 0) {
            return true;
        }
        return false;
    }
}
