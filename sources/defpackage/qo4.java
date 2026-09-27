package defpackage;

import androidx.lifecycle.LifecycleOwner;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qo4 implements LifecycleOwner {
    public final p7b a = new p7b(this, true);
    public n6b b;
    public n6b c;

    public qo4() {
        n6b n6bVar = n6b.INITIALIZED;
        this.b = n6bVar;
        this.c = n6bVar;
    }

    public final void a() {
        n6b n6bVar;
        if (this.b.ordinal() < this.c.ordinal()) {
            n6bVar = this.b;
        } else {
            n6bVar = this.c;
        }
        p7b p7bVar = this.a;
        if (p7bVar.d == n6b.INITIALIZED && n6bVar == n6b.DESTROYED) {
            return;
        }
        p7bVar.h(n6bVar);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final p6b getLifecycle() {
        return this.a;
    }
}
