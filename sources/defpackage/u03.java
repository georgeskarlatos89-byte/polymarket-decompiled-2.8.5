package defpackage;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u03 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;

    public u03(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new AtomicInteger(0);
                return;
            case 2:
                this.b = new AtomicInteger(0);
                return;
            default:
                this.b = new AtomicInteger(0);
                return;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        AtomicInteger atomicInteger = this.b;
        switch (i) {
            case 0:
                Thread thread = new Thread(new q1(runnable, 15));
                thread.setPriority(7);
                Locale locale = Locale.US;
                thread.setName("CameraX-core_camera_" + atomicInteger.getAndIncrement());
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                thread2.setName("arch_disk_io_" + atomicInteger.getAndIncrement());
                return thread2;
            default:
                Thread thread3 = new Thread(runnable);
                Locale locale2 = Locale.US;
                thread3.setName("CameraX-camerax_io_" + atomicInteger.getAndIncrement());
                return thread3;
        }
    }
}
