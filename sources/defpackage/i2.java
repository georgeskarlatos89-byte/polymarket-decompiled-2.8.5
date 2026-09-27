package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class i2 extends z1 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public i2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.z1
    public final boolean a(u2 u2Var, g2 g2Var, g2 g2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(u2Var, g2Var, g2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u2Var) == g2Var);
        return false;
    }

    @Override // defpackage.z1
    public final boolean b(u2 u2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(u2Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u2Var) == obj);
        return false;
    }

    @Override // defpackage.z1
    public final boolean c(u2 u2Var, s2 s2Var, s2 s2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(u2Var, s2Var, s2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u2Var) == s2Var);
        return false;
    }

    @Override // defpackage.z1
    public final g2 d(u2 u2Var) {
        return (g2) this.d.getAndSet(u2Var, g2.d);
    }

    @Override // defpackage.z1
    public final s2 e(u2 u2Var) {
        return (s2) this.c.getAndSet(u2Var, s2.c);
    }

    @Override // defpackage.z1
    public final void f(s2 s2Var, s2 s2Var2) {
        this.b.lazySet(s2Var, s2Var2);
    }

    @Override // defpackage.z1
    public final void g(s2 s2Var, Thread thread) {
        this.a.lazySet(s2Var, thread);
    }
}
