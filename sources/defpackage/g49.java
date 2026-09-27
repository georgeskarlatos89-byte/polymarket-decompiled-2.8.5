package defpackage;

import android.util.Log;
import com.socure.docv.capturesdk.common.utils.Scanner;
import io.sentry.android.core.m0;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g49 {
    public static final File c = new File("/proc/self/fd");
    public static volatile g49 d;
    public int a;
    public boolean b;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, g49] */
    public static g49 a() {
        if (d == null) {
            synchronized (g49.class) {
                try {
                    if (d == null) {
                        ?? obj = new Object();
                        obj.b = true;
                        new AtomicBoolean(false);
                        d = obj;
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final boolean b(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (!z) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (z2) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (i >= 0 && i2 >= 0) {
            synchronized (this) {
                try {
                    int i3 = this.a + 1;
                    this.a = i3;
                    if (i3 >= 50) {
                        this.a = 0;
                        int length = c.list().length;
                        if (length < Scanner.MANUAL_BUTTON_DISPLAY_DELAY_MS) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        this.b = z4;
                        if (!z4 && Log.isLoggable("Downsampler", 5)) {
                            m0.p("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit 20000");
                        }
                    }
                    z3 = this.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                return true;
            }
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }
}
