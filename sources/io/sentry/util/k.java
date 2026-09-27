package io.sentry.util;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class k {
    public static final boolean a;
    public static final boolean b;

    static {
        boolean z;
        boolean z2;
        try {
            z = "The Android Project".equals(System.getProperty("java.vendor"));
            a = z;
        } catch (Throwable unused) {
            a = false;
            z = false;
        }
        if (z) {
            b = false;
            return;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                if (Double.parseDouble(property) >= 9.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                b = z2;
            } else {
                b = false;
            }
        } catch (Throwable unused2) {
            b = false;
        }
    }
}
