package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wn0 implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public wn0() {
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
            default:
                handler.post(runnable);
                return;
        }
    }

    public /* synthetic */ wn0(p3l p3lVar) {
        this.a = 1;
        this.b = p3lVar;
    }
}
