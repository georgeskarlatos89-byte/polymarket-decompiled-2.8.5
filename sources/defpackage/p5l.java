package defpackage;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class p5l extends l5l {
    public static final pxj b;

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            o5l.class.getName().equals(a());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        b = new pxj(5);
    }

    public static String a() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
