package defpackage;

import androidx.lifecycle.LifecycleOwner;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t91 implements v1g {
    public final p6b a;
    public final jca b;

    public t91(p6b p6bVar, jca jcaVar) {
        this.a = p6bVar;
        this.b = jcaVar;
    }

    @Override // defpackage.v1g
    public final void g() {
        this.a.c(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        ica icaVar = jca.C0;
        this.b.e(null);
    }

    @Override // defpackage.v1g
    public final void start() {
        this.a.a(this);
    }
}
