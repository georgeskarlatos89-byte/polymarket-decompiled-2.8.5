package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h9 implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ h9(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                Process.setThreadPriority(10);
                runnable.run();
                return;
            case 1:
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    gan.c("Executor", "Background execution failure.", e);
                    return;
                }
            case 2:
                runnable.run();
                return;
            case 3:
                runnable.run();
                return;
            case 4:
                runnable.run();
                return;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                return;
        }
    }

    public String toString() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 2:
                return runnable.toString();
            case 3:
                return runnable.toString();
            default:
                return super.toString();
        }
    }
}
