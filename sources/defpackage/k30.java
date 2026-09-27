package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k30 implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public k30() {
        this.a = 0;
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Handler handler = this.b;
        switch (i) {
            case 0:
                handler.post(runnable);
                return;
            case 1:
                handler.post(runnable);
                return;
            default:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public /* synthetic */ k30(Handler handler, int i) {
        this.a = i;
        this.b = handler;
    }
}
