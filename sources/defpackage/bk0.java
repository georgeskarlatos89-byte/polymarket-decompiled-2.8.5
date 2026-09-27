package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class bk0 implements Executor {
    public final /* synthetic */ int a;

    public /* synthetic */ bk0(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ck0.e().e.f.execute(runnable);
                return;
            case 1:
                runnable.run();
                return;
            default:
                return;
        }
    }

    private final void a(Runnable runnable) {
    }
}
