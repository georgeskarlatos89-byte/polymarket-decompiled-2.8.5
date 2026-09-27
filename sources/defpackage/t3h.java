package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class t3h implements ThreadFactory {
    public static final AtomicInteger a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "LaunchDarkly-SharedPreferencesPersistence-" + a.incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
