package io.sentry.android.core.anr;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class e {
    public static final AtomicBoolean a = new AtomicBoolean(true);
    public static final Object b = new Object();

    public static boolean a(File file) {
        File file2 = new File(file, "anr_profile_old");
        if (!file2.exists()) {
            return true;
        }
        return file2.delete();
    }

    public static void b(File file) {
        AtomicBoolean atomicBoolean = a;
        if (atomicBoolean.get()) {
            synchronized (b) {
                try {
                    if (!atomicBoolean.get()) {
                        return;
                    }
                    File file2 = new File(file, "anr_profile");
                    File file3 = new File(file, "anr_profile_old");
                    try {
                        file3.delete();
                    } catch (Throwable unused) {
                    }
                    try {
                        file2.renameTo(file3);
                    } catch (Throwable unused2) {
                    }
                    a.set(false);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
