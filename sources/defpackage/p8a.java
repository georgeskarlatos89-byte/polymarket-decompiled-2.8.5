package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p8a implements Executor {
    public static volatile p8a c;
    public final /* synthetic */ int a;
    public final Object b;

    public p8a(int i) {
        this.a = i;
        switch (i) {
            case 3:
                Handler handler = new Handler(Looper.getMainLooper());
                Looper.getMainLooper();
                this.b = handler;
                return;
            default:
                this.b = Executors.newFixedThreadPool(2, new u03(2));
                return;
        }
    }

    public static Executor a() {
        if (c != null) {
            return c;
        }
        synchronized (p8a.class) {
            try {
                if (c == null) {
                    c = new p8a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ExecutorService) obj).execute(runnable);
                return;
            case 1:
                ((p3l) obj).post(runnable);
                return;
            case 2:
                ((Executor) obj).execute(new h9(runnable, 1));
                return;
            default:
                ((p3l) obj).post(runnable);
                return;
        }
    }

    public p8a(ExecutorService executorService) {
        this.a = 2;
        this.b = executorService;
    }

    public p8a(Looper looper) {
        this.a = 1;
        this.b = new p3l(looper, 3);
    }
}
