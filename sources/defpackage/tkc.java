package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tkc implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tkc(Executor executor, Object obj, int i) {
        this.a = i;
        this.b = executor;
        this.c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Executor executor = this.b;
        switch (i) {
            case 0:
                try {
                    executor.execute(runnable);
                    return;
                } catch (RejectedExecutionException e) {
                    ((ue8) this.c).setException(e);
                    return;
                }
            default:
                executor.execute(runnable);
                return;
        }
    }
}
