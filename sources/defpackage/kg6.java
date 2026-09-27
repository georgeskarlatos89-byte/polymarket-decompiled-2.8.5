package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kg6 extends t1m {
    public final Object e = new Object();
    public final ExecutorService f = Executors.newFixedThreadPool(4, new u03(1));
    public volatile Handler g;

    public final boolean e() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
