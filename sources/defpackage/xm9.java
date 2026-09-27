package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xm9 extends ml8 {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public xm9(to9 to9Var, ym9 ym9Var) {
        super(to9Var);
        this.e = new WeakReference(ym9Var);
        e(new wm9(this, 0));
    }

    @Override // defpackage.ml8, java.lang.AutoCloseable
    public void close() {
        switch (this.d) {
            case 1:
                if (!((AtomicBoolean) this.e).getAndSet(true)) {
                    super.close();
                    return;
                }
                return;
            default:
                super.close();
                return;
        }
    }

    public xm9(to9 to9Var) {
        super(to9Var);
        this.e = new AtomicBoolean(false);
    }
}
