package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bm8 extends ka {
    public final /* synthetic */ AtomicReference a;

    public bm8(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.ka
    public final void a(Object obj, r9 r9Var) {
        ka kaVar = (ka) this.a.get();
        if (kaVar != null) {
            kaVar.a(obj, r9Var);
        } else {
            dmk.n("Operation cannot be started before fragment is in created state");
        }
    }

    @Override // defpackage.ka
    public final void b() {
        ka kaVar = (ka) this.a.getAndSet(null);
        if (kaVar != null) {
            kaVar.b();
        }
    }
}
