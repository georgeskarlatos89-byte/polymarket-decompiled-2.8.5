package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nok {
    public final axg a;
    public final g85 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final u79 d = new u79(this, 1);

    public nok(ExecutorService executorService) {
        axg axgVar = new axg(executorService, 0);
        this.a = axgVar;
        this.b = xtk.c(axgVar);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
