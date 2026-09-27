package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qt6 implements Executor {
    public static volatile qt6 b;
    public static final qt6 c = new qt6(1);
    public static final qt6 d = new qt6(2);
    public static final qt6 e = new qt6(3);
    public static final /* synthetic */ qt6 f = new qt6(8);
    public static final /* synthetic */ qt6 g = new qt6(9);
    public static final /* synthetic */ qt6 h = new qt6(10);
    public final /* synthetic */ int a;

    public /* synthetic */ qt6(int i) {
        this.a = i;
    }

    public static qt6 a() {
        if (b != null) {
            return b;
        }
        synchronized (qt6.class) {
            try {
                if (b == null) {
                    b = new qt6(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.getClass();
                runnable.run();
                return;
            case 2:
                runnable.getClass();
                runnable.run();
                return;
            case 3:
                runnable.run();
                return;
            case 4:
                new Thread(runnable).start();
                return;
            case 5:
                o1k.h().post(runnable);
                return;
            case 6:
                runnable.run();
                return;
            case 7:
                runnable.run();
                return;
            case 8:
                runnable.run();
                return;
            case 9:
                runnable.run();
                return;
            case 10:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
