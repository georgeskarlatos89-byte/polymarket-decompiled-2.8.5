package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kt4 implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);
    public final /* synthetic */ boolean b;

    public kt4(boolean z) {
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        runnable.getClass();
        if (this.b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        return new Thread(runnable, str + this.a.incrementAndGet());
    }
}
