package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class krc {
    public final AtomicReference a = new AtomicReference(null);
    public final orc b = new orc();

    public final Object a(drc drcVar, Function1 function1, q55 q55Var) {
        return qsn.f(new uc4(drcVar, this, function1, (Continuation) null, 9), q55Var);
    }

    public final void b(hrc hrcVar) {
        while (true) {
            AtomicReference atomicReference = this.a;
            hrc hrcVar2 = (hrc) atomicReference.get();
            if (hrcVar2 != null && hrcVar.a.compareTo(hrcVar2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(hrcVar2, hrcVar)) {
                if (atomicReference.get() != hrcVar2) {
                    break;
                }
            }
            if (hrcVar2 != null) {
                hrcVar2.b.e(new CancellationException("Mutation interrupted"));
                return;
            }
            return;
        }
    }
}
