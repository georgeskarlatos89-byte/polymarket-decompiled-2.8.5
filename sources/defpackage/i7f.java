package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class i7f extends u1 implements j7f, te3 {
    public final eq1 e;

    public i7f(CoroutineContext coroutineContext, eq1 eq1Var, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.e = eq1Var;
    }

    @Override // defpackage.jrf
    public final Object b(q55 q55Var) {
        eq1 eq1Var = this.e;
        eq1Var.getClass();
        Object H = eq1.H(eq1Var, q55Var);
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        return H;
    }

    @Override // defpackage.bvg
    public final void d(Function1 function1) {
        this.e.d(function1);
    }

    @Override // defpackage.tca, defpackage.jca
    public final void e(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new kca(x(), null, this);
        }
        v(cancellationException);
    }

    @Override // defpackage.bvg
    public Object f(Object obj) {
        return this.e.f(obj);
    }

    @Override // defpackage.jrf
    public final mog h() {
        return this.e.h();
    }

    @Override // defpackage.jrf
    public final mog i() {
        return this.e.i();
    }

    @Override // defpackage.jrf
    public final xp1 iterator() {
        eq1 eq1Var = this.e;
        eq1Var.getClass();
        return new xp1(eq1Var);
    }

    @Override // defpackage.jrf
    public final Object j() {
        return this.e.j();
    }

    @Override // defpackage.jrf
    public final Object k(Continuation continuation) {
        return this.e.k(continuation);
    }

    @Override // defpackage.bvg
    public boolean l(Throwable th) {
        return this.e.c(th, false);
    }

    @Override // defpackage.bvg
    public Object n(Object obj, Continuation continuation) {
        return this.e.n(obj, continuation);
    }

    @Override // defpackage.u1
    public final void p0(Throwable th, boolean z) {
        if (!this.e.c(th, false) && !z) {
            lsn.b(this.d, th);
        }
    }

    @Override // defpackage.u1
    public final void q0(Object obj) {
        this.e.l(null);
    }

    @Override // defpackage.tca
    public final void v(CancellationException cancellationException) {
        this.e.c(cancellationException, true);
        u(cancellationException);
    }
}
