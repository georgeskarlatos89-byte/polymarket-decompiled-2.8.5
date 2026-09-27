package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c5 extends m7n {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public c5(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.m7n
    public final boolean a(f5 f5Var, b5 b5Var, b5 b5Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(f5Var, b5Var, b5Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(f5Var) == b5Var);
        return false;
    }

    @Override // defpackage.m7n
    public final boolean b(f5 f5Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(f5Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(f5Var) == obj);
        return false;
    }

    @Override // defpackage.m7n
    public final boolean c(f5 f5Var, e5 e5Var, e5 e5Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(f5Var, e5Var, e5Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(f5Var) == e5Var);
        return false;
    }

    @Override // defpackage.m7n
    public final void f(e5 e5Var, e5 e5Var2) {
        this.b.lazySet(e5Var, e5Var2);
    }

    @Override // defpackage.m7n
    public final void g(e5 e5Var, Thread thread) {
        this.a.lazySet(e5Var, thread);
    }
}
