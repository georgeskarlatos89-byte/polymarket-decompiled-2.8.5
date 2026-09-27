package defpackage;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class vo7 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Object b;

    public vo7() {
        this.a = 0;
        this.b = new AtomicLong(0L);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                Locale locale = Locale.ROOT;
                newThread.setName("LaunchDarkly-DefaultEventProcessor-" + ((AtomicLong) obj).getAndIncrement());
                newThread.setDaemon(true);
                return newThread;
            default:
                Thread newThread2 = ((ThreadFactory) obj).newThread(runnable);
                newThread2.setName("ScionFrontendApi");
                return newThread2;
        }
    }

    public vo7(iwl iwlVar) {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
    }
}
