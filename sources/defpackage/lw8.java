package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lw8 extends p6b {
    public static final lw8 b = new p6b();
    public static final kw8 c = new Object();

    @Override // defpackage.p6b
    public final void a(l7b l7bVar) {
        if (l7bVar instanceof DefaultLifecycleObserver) {
            DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) l7bVar;
            kw8 kw8Var = c;
            defaultLifecycleObserver.onCreate(kw8Var);
            defaultLifecycleObserver.onStart(kw8Var);
            defaultLifecycleObserver.onResume(kw8Var);
            return;
        }
        qp7.o(l7bVar, " must implement androidx.lifecycle.DefaultLifecycleObserver.");
    }

    @Override // defpackage.p6b
    public final n6b b() {
        return n6b.RESUMED;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // defpackage.p6b
    public final void c(l7b l7bVar) {
    }
}
