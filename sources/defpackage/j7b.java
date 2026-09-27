package defpackage;

import androidx.lifecycle.LifecycleOwner;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j7b implements o6b, l7b {
    public final HashSet a = new HashSet();
    public final p6b b;

    public j7b(p6b p6bVar) {
        this.b = p6bVar;
        p6bVar.a(this);
    }

    @Override // defpackage.o6b
    public final void d(k7b k7bVar) {
        this.a.add(k7bVar);
        p6b p6bVar = this.b;
        if (p6bVar.b() == n6b.DESTROYED) {
            k7bVar.onDestroy();
        } else if (p6bVar.b().a(n6b.STARTED)) {
            k7bVar.onStart();
        } else {
            k7bVar.onStop();
        }
    }

    @Override // defpackage.o6b
    public final void f(k7b k7bVar) {
        this.a.remove(k7bVar);
    }

    @lid(m6b.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Iterator it = o1k.g(this.a).iterator();
        while (it.hasNext()) {
            ((k7b) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().c(this);
    }

    @lid(m6b.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        Iterator it = o1k.g(this.a).iterator();
        while (it.hasNext()) {
            ((k7b) it.next()).onStart();
        }
    }

    @lid(m6b.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        Iterator it = o1k.g(this.a).iterator();
        while (it.hasNext()) {
            ((k7b) it.next()).onStop();
        }
    }
}
