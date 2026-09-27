package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ru6 implements AutoCloseable {
    public final nu6 a;
    public boolean b;
    public final /* synthetic */ vu6 c;

    public ru6(vu6 vu6Var, nu6 nu6Var) {
        this.c = vu6Var;
        this.a = nu6Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.b) {
            this.b = true;
            vu6 vu6Var = this.c;
            synchronized (vu6Var.h) {
                nu6 nu6Var = this.a;
                int i = nu6Var.h - 1;
                nu6Var.h = i;
                if (i == 0 && nu6Var.f) {
                    vu6Var.G(nu6Var);
                }
            }
        }
    }
}
