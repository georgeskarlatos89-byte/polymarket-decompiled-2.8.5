package defpackage;

import androidx.lifecycle.LifecycleOwner;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mlb extends nlb implements h7b {
    public final LifecycleOwner e;
    public final /* synthetic */ olb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlb(olb olbVar, LifecycleOwner lifecycleOwner, zfd zfdVar) {
        super(olbVar, zfdVar);
        this.f = olbVar;
        this.e = lifecycleOwner;
    }

    @Override // defpackage.nlb
    public final void b() {
        this.e.getLifecycle().c(this);
    }

    @Override // defpackage.nlb
    public final boolean c(LifecycleOwner lifecycleOwner) {
        if (this.e == lifecycleOwner) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nlb
    public final boolean d() {
        return this.e.getLifecycle().b().a(n6b.STARTED);
    }

    @Override // defpackage.h7b
    public final void y(LifecycleOwner lifecycleOwner, m6b m6bVar) {
        LifecycleOwner lifecycleOwner2 = this.e;
        n6b b = lifecycleOwner2.getLifecycle().b();
        if (b == n6b.DESTROYED) {
            this.f.j(this.a);
            return;
        }
        n6b n6bVar = null;
        while (n6bVar != b) {
            a(d());
            n6bVar = b;
            b = lifecycleOwner2.getLifecycle().b();
        }
    }
}
