package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i9 implements ThreadFactory {
    public static final /* synthetic */ i9 b = new i9(5);
    public final /* synthetic */ int a;

    public /* synthetic */ i9(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(new h9(runnable, 0), "glide-active-resources");
            case 1:
                Thread thread = new Thread(runnable);
                thread.setDaemon(true);
                thread.setName(String.format("LaunchDarkly-event-delivery-%d", Long.valueOf(thread.getId())));
                thread.setPriority(5);
                return thread;
            case 2:
                return new dw8(runnable);
            case 3:
                Thread thread2 = new Thread(runnable);
                thread2.setPriority(10);
                thread2.setName("CameraX-camerax_high_priority");
                return thread2;
            case 4:
                return new dw8(runnable, "fonts-androidx", 1);
            default:
                Object obj = zwm.j;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
