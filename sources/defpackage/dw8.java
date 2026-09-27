package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dw8 extends Thread {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dw8(Runnable runnable) {
        super(runnable);
        this.a = 0;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.a) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
            case 1:
                Process.setThreadPriority(10);
                super.run();
                return;
            case 2:
            default:
                super.run();
                return;
            case 3:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dw8(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dw8(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
        this.a = 3;
    }
}
