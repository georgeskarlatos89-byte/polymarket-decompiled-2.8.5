package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class f31 implements ThreadFactory {
    public final /* synthetic */ ThreadGroup a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AtomicInteger c;

    public f31(ThreadGroup threadGroup, String str, AtomicInteger atomicInteger) {
        this.a = threadGroup;
        this.b = str;
        this.c = atomicInteger;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.a, runnable, this.b + "-" + this.c.incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
