package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tyd implements ekc {
    public final ekc a;
    public final af9 b = new af9(17);

    public tyd(ekc ekcVar) {
        this.a = ekcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ekc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(Function1 function1, Continuation continuation) {
        syd sydVar;
        u85 u85Var;
        int i;
        boolean z;
        Object r;
        Object D;
        if (continuation instanceof syd) {
            sydVar = (syd) continuation;
            int i2 = sydVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sydVar.n = i2 - Integer.MIN_VALUE;
                Object obj = sydVar.l;
                u85Var = u85.COROUTINE_SUSPENDED;
                i = sydVar.n;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj);
                            return obj;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = sydVar.k;
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    af9 af9Var = this.b;
                    sydVar.k = function1;
                    sydVar.n = 1;
                    synchronized (af9Var.c) {
                        z = af9Var.b;
                    }
                    if (z) {
                        r = Unit.INSTANCE;
                    } else {
                        m23 m23Var = new m23(1, m7a.b(sydVar));
                        m23Var.t();
                        synchronized (af9Var.c) {
                            ((ArrayList) af9Var.d).add(m23Var);
                        }
                        m23Var.v(new l5(23, af9Var, m23Var));
                        r = m23Var.r();
                        if (r != u85Var) {
                            r = Unit.INSTANCE;
                        }
                    }
                }
                ekc ekcVar = this.a;
                sydVar.k = null;
                sydVar.n = 2;
                D = ekcVar.D(function1, sydVar);
                if (D != u85Var) {
                    return u85Var;
                }
                return D;
            }
        }
        sydVar = new syd(this, continuation);
        Object obj2 = sydVar.l;
        u85Var = u85.COROUTINE_SUSPENDED;
        i = sydVar.n;
        if (i == 0) {
        }
        ekc ekcVar2 = this.a;
        sydVar.k = null;
        sydVar.n = 2;
        D = ekcVar2.D(function1, sydVar);
        if (D != u85Var) {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }
}
