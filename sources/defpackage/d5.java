package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d5 extends m7n {
    @Override // defpackage.m7n
    public final boolean a(f5 f5Var, b5 b5Var, b5 b5Var2) {
        synchronized (f5Var) {
            try {
                if (f5Var.b == b5Var) {
                    f5Var.b = b5Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m7n
    public final boolean b(f5 f5Var, Object obj, Object obj2) {
        synchronized (f5Var) {
            try {
                if (f5Var.a == obj) {
                    f5Var.a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m7n
    public final boolean c(f5 f5Var, e5 e5Var, e5 e5Var2) {
        synchronized (f5Var) {
            try {
                if (f5Var.c == e5Var) {
                    f5Var.c = e5Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m7n
    public final void f(e5 e5Var, e5 e5Var2) {
        e5Var.b = e5Var2;
    }

    @Override // defpackage.m7n
    public final void g(e5 e5Var, Thread thread) {
        e5Var.a = thread;
    }
}
