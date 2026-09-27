package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ck0 extends t1m {
    public static volatile ck0 f;
    public static final bk0 g = new bk0(0);
    public final kg6 e = new kg6();

    public static ck0 e() {
        if (f != null) {
            return f;
        }
        synchronized (ck0.class) {
            try {
                if (f == null) {
                    f = new ck0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f;
    }

    public final void f(Runnable runnable) {
        kg6 kg6Var = this.e;
        if (kg6Var.g == null) {
            synchronized (kg6Var.e) {
                try {
                    if (kg6Var.g == null) {
                        kg6Var.g = Handler.createAsync(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        kg6Var.g.post(runnable);
    }
}
