package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rrl extends ofn {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public rrl(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.ofn
    public final qrl n(wrl wrlVar) {
        return (qrl) this.d.getAndSet(wrlVar, qrl.d);
    }

    @Override // defpackage.ofn
    public final vrl o(wrl wrlVar) {
        return (vrl) this.c.getAndSet(wrlVar, vrl.c);
    }

    @Override // defpackage.ofn
    public final void p(vrl vrlVar, vrl vrlVar2) {
        this.b.lazySet(vrlVar, vrlVar2);
    }

    @Override // defpackage.ofn
    public final void q(vrl vrlVar, Thread thread) {
        this.a.lazySet(vrlVar, thread);
    }

    @Override // defpackage.ofn
    public final boolean r(wrl wrlVar, qrl qrlVar, qrl qrlVar2) {
        return pfn.j(this.d, wrlVar, qrlVar, qrlVar2);
    }

    @Override // defpackage.ofn
    public final boolean s(wrl wrlVar, Object obj, Object obj2) {
        return pfn.j(this.e, wrlVar, obj, obj2);
    }

    @Override // defpackage.ofn
    public final boolean t(wrl wrlVar, vrl vrlVar, vrl vrlVar2) {
        return pfn.j(this.c, wrlVar, vrlVar, vrlVar2);
    }
}
