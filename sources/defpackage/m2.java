package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class m2 extends z1 {
    @Override // defpackage.z1
    public final boolean a(u2 u2Var, g2 g2Var, g2 g2Var2) {
        synchronized (u2Var) {
            try {
                if (u2.access$700(u2Var) == g2Var) {
                    u2.access$702(u2Var, g2Var2);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.z1
    public final boolean b(u2 u2Var, Object obj, Object obj2) {
        synchronized (u2Var) {
            try {
                if (u2.access$300(u2Var) == obj) {
                    u2.access$302(u2Var, obj2);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.z1
    public final boolean c(u2 u2Var, s2 s2Var, s2 s2Var2) {
        synchronized (u2Var) {
            try {
                if (u2.access$800(u2Var) == s2Var) {
                    u2.access$802(u2Var, s2Var2);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.z1
    public final g2 d(u2 u2Var) {
        g2 access$700;
        g2 g2Var = g2.d;
        synchronized (u2Var) {
            try {
                access$700 = u2.access$700(u2Var);
                if (access$700 != g2Var) {
                    u2.access$702(u2Var, g2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return access$700;
    }

    @Override // defpackage.z1
    public final s2 e(u2 u2Var) {
        s2 access$800;
        s2 s2Var = s2.c;
        synchronized (u2Var) {
            try {
                access$800 = u2.access$800(u2Var);
                if (access$800 != s2Var) {
                    u2.access$802(u2Var, s2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return access$800;
    }

    @Override // defpackage.z1
    public final void f(s2 s2Var, s2 s2Var2) {
        s2Var.b = s2Var2;
    }

    @Override // defpackage.z1
    public final void g(s2 s2Var, Thread thread) {
        s2Var.a = thread;
    }
}
