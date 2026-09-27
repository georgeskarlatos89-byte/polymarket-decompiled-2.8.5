package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ixh implements hxh {
    public final ep0 a = new AtomicInteger(0);

    public final boolean o(int i) {
        if ((this.a.get() & i) != 0) {
            return true;
        }
        return false;
    }

    public final void p(int i) {
        ep0 ep0Var;
        int i2;
        do {
            ep0Var = this.a;
            i2 = ep0Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!ep0Var.compareAndSet(i2, i2 | i));
    }
}
