package defpackage;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Lazy;
import kotlin.LazyKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zhd {
    public final Runnable a;
    public final Lazy b = LazyKt.lazy(new mcd(this, 4));

    public zhd(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(uhd uhdVar) {
        uhdVar.getClass();
        h0d.a(c().c, uhdVar.createNavigationEventHandler$activity(new vhd(uhdVar, null)));
    }

    public final void b(uhd uhdVar, LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
        uhdVar.getClass();
        final p6b lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b() == n6b.DESTROYED) {
            return;
        }
        thd createNavigationEventHandler$activity = uhdVar.createNavigationEventHandler$activity(new vhd(uhdVar, lifecycleOwner));
        createNavigationEventHandler$activity.h(false);
        h0d.a(c().c, createNavigationEventHandler$activity);
        final gn8 gn8Var = new gn8(createNavigationEventHandler$activity, this, lifecycle);
        lifecycle.a(gn8Var);
        uhdVar.addCloseable$activity(new AutoCloseable() { // from class: whd
            @Override // java.lang.AutoCloseable
            public final void close() {
                p6b.this.c(gn8Var);
            }
        });
    }

    public final xhd c() {
        return (xhd) this.b.getValue();
    }

    public final void d(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        onBackInvokedDispatcher.getClass();
        c().c.c(new rhd(onBackInvokedDispatcher, 0), 1);
        c().c.c(new rhd(onBackInvokedDispatcher, 1000000), 0);
    }
}
