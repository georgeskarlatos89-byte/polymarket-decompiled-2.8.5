package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class nwk implements Runnable {
    public final void a() {
        x71 x71Var;
        synchronized (x71.i) {
            try {
                x71Var = x71.j;
                if (x71Var == null) {
                    x71Var = new x71(5, false);
                    try {
                        x71Var.b = new ThreadPoolExecutor(10, 10, RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(256), new ThreadPoolExecutor.DiscardPolicy());
                    } catch (Exception unused) {
                    }
                    x71.j = x71Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((ThreadPoolExecutor) x71Var.b).execute(this);
    }
}
