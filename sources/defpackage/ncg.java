package defpackage;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ncg extends q55 implements eb8 {
    public final eb8 k;
    public final CoroutineContext l;
    public final int m;
    public CoroutineContext n;
    public Continuation o;

    public ncg(eb8 eb8Var, CoroutineContext coroutineContext) {
        super(a8d.a, g.a);
        this.k = eb8Var;
        this.l = coroutineContext;
        this.m = ((Number) coroutineContext.fold(0, new bod(23))).intValue();
    }

    public final Object d(Continuation continuation, Object obj) {
        CoroutineContext context = continuation.getContext();
        xym.g(context);
        CoroutineContext coroutineContext = this.n;
        if (coroutineContext != context) {
            if (!(coroutineContext instanceof gy6)) {
                if (((Number) context.fold(0, new ehe(this, 26))).intValue() == this.m) {
                    this.n = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.l + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(c.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((gy6) coroutineContext).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.o = continuation;
        Function3 function3 = pcg.a;
        eb8 eb8Var = this.k;
        eb8Var.getClass();
        Object invoke = function3.invoke(eb8Var, obj, this);
        if (!Intrinsics.areEqual(invoke, u85.COROUTINE_SUSPENDED)) {
            this.o = null;
        }
        return invoke;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        try {
            Object d = d(continuation, obj);
            if (d == u85.COROUTINE_SUSPENDED) {
                return d;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.n = new gy6(continuation.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.l81, defpackage.v85
    public final v85 getCallerFrame() {
        Continuation continuation = this.o;
        if (continuation instanceof v85) {
            return (v85) continuation;
        }
        return null;
    }

    @Override // defpackage.q55, kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.n;
        if (coroutineContext == null) {
            return g.a;
        }
        return coroutineContext;
    }

    @Override // defpackage.l81
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        Throwable m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(obj);
        if (m883exceptionOrNullimpl != null) {
            this.n = new gy6(getContext(), m883exceptionOrNullimpl);
        }
        Continuation continuation = this.o;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return u85.COROUTINE_SUSPENDED;
    }
}
