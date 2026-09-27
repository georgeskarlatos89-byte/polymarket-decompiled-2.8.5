package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class hz5 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hz5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Handler) obj).post(runnable);
                return;
            default:
                ((Choreographer) obj).postFrameCallback(new ga0(runnable, 3));
                return;
        }
    }
}
