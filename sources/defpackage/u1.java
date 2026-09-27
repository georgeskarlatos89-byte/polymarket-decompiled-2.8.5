package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.b;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class u1 extends tca implements Continuation, t85 {
    public final CoroutineContext d;

    public u1(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            Q((jca) coroutineContext.get(jca.C0));
        }
        this.d = coroutineContext.plus(this);
    }

    @Override // defpackage.tca
    public final void P(vj4 vj4Var) {
        lsn.b(this.d, vj4Var);
    }

    @Override // defpackage.tca
    public final void d0(Object obj) {
        if (obj instanceof uj4) {
            uj4 uj4Var = (uj4) obj;
            Throwable th = uj4Var.a;
            boolean z = true;
            if (oo4.a.getIntVolatile(uj4Var, uj4.b) != 1) {
                z = false;
            }
            p0(th, z);
            return;
        }
        q0(obj);
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.d;
    }

    @Override // defpackage.t85
    public final CoroutineContext getCoroutineContext() {
        return this.d;
    }

    public final void r0(x85 x85Var, u1 u1Var, Function2 function2) {
        Object invoke;
        x85Var.getClass();
        int i = w85.a[x85Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        dmk.a();
                        return;
                    }
                    return;
                }
                try {
                    CoroutineContext coroutineContext = this.d;
                    Object c = b.c(coroutineContext, null);
                    try {
                        if (!(function2 instanceof l81)) {
                            invoke = m7a.c(function2, u1Var, this);
                        } else {
                            hhj.e(2, function2);
                            invoke = function2.invoke(u1Var, this);
                        }
                        b.a(coroutineContext, c);
                        if (invoke != u85.COROUTINE_SUSPENDED) {
                            resumeWith(Result.m882constructorimpl(invoke));
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        b.a(coroutineContext, c);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof av6) {
                        th = ((av6) th).a;
                    }
                    Result.Companion companion = Result.INSTANCE;
                    resumeWith(Result.m882constructorimpl(ResultKt.createFailure(th)));
                    return;
                }
            }
            function2.getClass();
            m7a.b(m7a.a(u1Var, this, function2)).resumeWith(Result.m882constructorimpl(Unit.INSTANCE));
            return;
        }
        n23.c(function2, u1Var, this);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(obj);
        if (m883exceptionOrNullimpl != null) {
            obj = new uj4(m883exceptionOrNullimpl, false);
        }
        Object V = V(obj);
        if (V == j3m.b) {
            return;
        }
        s(V);
    }

    @Override // defpackage.tca
    public final String x() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void q0(Object obj) {
    }

    public void p0(Throwable th, boolean z) {
    }
}
