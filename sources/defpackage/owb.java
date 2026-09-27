package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class owb implements ThreadFactory {
    public static final AtomicInteger d = new AtomicInteger(1);
    public final ThreadGroup a;
    public final AtomicInteger b = new AtomicInteger(1);
    public final String c;

    public owb() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.a = threadGroup;
        this.c = "lottie-" + d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.a, runnable, this.c + this.b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
