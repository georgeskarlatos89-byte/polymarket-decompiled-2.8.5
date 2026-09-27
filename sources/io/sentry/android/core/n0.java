package io.sentry.android.core;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.sentry.p5;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class n0 implements io.sentry.o0 {
    public static final n0 b = new Object();
    public Object a;

    public n0(int i) {
        switch (i) {
            case 3:
                this.a = new Handler(Looper.getMainLooper());
                return;
            default:
                this.a = new Object();
                return;
        }
    }

    public Boolean a() {
        boolean z;
        try {
            if (Build.BRAND.startsWith("generic")) {
                if (!Build.DEVICE.startsWith("generic")) {
                }
                z = true;
                return Boolean.valueOf(z);
            }
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                            z = false;
                            return Boolean.valueOf(z);
                        }
                    }
                }
            }
            z = true;
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            ((io.sentry.x0) this.a).d(p5.ERROR, "Error checking whether application is running in an emulator.", th);
            return null;
        }
    }

    public void b(Activity activity) {
        WeakReference weakReference = (WeakReference) this.a;
        if (weakReference != null && weakReference.get() == activity) {
            return;
        }
        this.a = new WeakReference(activity);
    }

    public n0(io.sentry.x0 x0Var) {
        io.sentry.util.b.t(x0Var, "The ILogger object is required.");
        this.a = x0Var;
    }
}
