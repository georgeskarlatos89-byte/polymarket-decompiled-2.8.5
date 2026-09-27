package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class e0 implements DefaultLifecycleObserver {
    public final d0 a = new d0(this, 0);
    public final /* synthetic */ f0 b;

    public e0(f0 f0Var) {
        this.b = f0Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.b.d = Boolean.FALSE;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((c0) it.next()).e();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.b.d = Boolean.TRUE;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((c0) it.next()).g();
        }
    }
}
