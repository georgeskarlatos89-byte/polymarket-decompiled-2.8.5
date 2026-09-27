package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ym9 extends tm9 {
    public final Executor v;
    public final Object w = new Object();
    public to9 x;
    public xm9 y;

    public ym9(Executor executor) {
        this.v = executor;
    }

    @Override // defpackage.tm9
    public final to9 a(wo9 wo9Var) {
        return wo9Var.e();
    }

    @Override // defpackage.tm9
    public final void c() {
        synchronized (this.w) {
            try {
                to9 to9Var = this.x;
                if (to9Var != null) {
                    to9Var.close();
                    this.x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tm9
    public final void e(to9 to9Var) {
        synchronized (this.w) {
            try {
                if (!this.u) {
                    to9Var.close();
                    return;
                }
                if (this.y != null) {
                    if (to9Var.P0().f() <= this.y.b.P0().f()) {
                        to9Var.close();
                    } else {
                        to9 to9Var2 = this.x;
                        if (to9Var2 != null) {
                            to9Var2.close();
                        }
                        this.x = to9Var;
                    }
                    return;
                }
                xm9 xm9Var = new xm9(to9Var, this);
                this.y = xm9Var;
                ujb b = b(xm9Var);
                q96 q96Var = new q96(xm9Var, 14);
                b.addListener(new yq8(0, b, q96Var), qt6.a());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
