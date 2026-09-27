package defpackage;

import com.checkout.components.interfaces.model.TokenizationResult;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b95 extends zei implements Function2 {
    public final /* synthetic */ int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Function2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b95(Function2 function2, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.n = function2;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.k;
        Function2 function2 = this.n;
        switch (i) {
            case 0:
                b95 b95Var = new b95(function2, continuation, 0);
                b95Var.m = obj;
                return b95Var;
            case 1:
                b95 b95Var2 = new b95(function2, continuation, 1);
                b95Var2.m = obj;
                return b95Var2;
            case 2:
                b95 b95Var3 = new b95(function2, continuation, 2);
                b95Var3.m = obj;
                return b95Var3;
            case 3:
                b95 b95Var4 = new b95(function2, continuation, 3);
                b95Var4.m = obj;
                return b95Var4;
            case 4:
                b95 b95Var5 = new b95(function2, continuation, 4);
                b95Var5.m = obj;
                return b95Var5;
            case 5:
                b95 b95Var6 = new b95(function2, continuation, 5);
                b95Var6.m = obj;
                return b95Var6;
            default:
                b95 b95Var7 = new b95(function2, continuation, 6);
                b95Var7.m = obj;
                return b95Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.k;
        Function2 function2 = this.n;
        switch (i) {
            case 0:
                return ((b95) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((b95) create((y1f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((b95) create((y1f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((b95) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((b95) create((eb8) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                b95 b95Var = new b95(function2, (Continuation) obj2, 5);
                b95Var.m = (TokenizationResult) obj;
                return b95Var.invokeSuspend(Unit.INSTANCE);
            default:
                b95 b95Var2 = new b95(function2, (Continuation) obj2, 6);
                b95Var2.m = (TokenizationResult) obj;
                return b95Var2.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        int i = this.k;
        Function2 function2 = this.n;
        switch (i) {
            case 0:
                t85 t85Var = (t85) this.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                int i2 = this.l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.a(obj);
                        return obj;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                this.m = null;
                this.l = 1;
                Object invoke = function2.invoke(t85Var, this);
                if (invoke == u85Var) {
                    return u85Var;
                }
                return invoke;
            case 1:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                int i3 = this.l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    y1f y1fVar = (y1f) this.m;
                    this.l = 1;
                    obj = function2.invoke(y1fVar, this);
                    if (obj == u85Var2) {
                        return u85Var2;
                    }
                }
                y1f y1fVar2 = (y1f) obj;
                y1fVar2.getClass();
                ((AtomicBoolean) ((aqc) y1fVar2).b.b).set(true);
                return y1fVar2;
            case 2:
                u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                int i4 = this.l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        aqc aqcVar = (aqc) this.m;
                        ResultKt.a(obj);
                        return aqcVar;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                aqc c = ((y1f) this.m).c();
                this.m = c;
                this.l = 1;
                if (function2.invoke(c, this) == u85Var3) {
                    return u85Var3;
                }
                return c;
            case 3:
                u85 u85Var4 = u85.COROUTINE_SUSPENDED;
                int i5 = this.l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    t85 t85Var2 = (t85) this.m;
                    this.l = 1;
                    if (function2.invoke(t85Var2, this) == u85Var4) {
                        return u85Var4;
                    }
                }
                return Unit.INSTANCE;
            case 4:
                u85 u85Var5 = u85.COROUTINE_SUSPENDED;
                int i6 = this.l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    huc hucVar = new huc((eb8) this.m, function2, null, 15);
                    this.l = 1;
                    if (qsn.f(hucVar, this) == u85Var5) {
                        return u85Var5;
                    }
                }
                return Unit.INSTANCE;
            case 5:
                TokenizationResult tokenizationResult = (TokenizationResult) this.m;
                u85 u85Var6 = u85.COROUTINE_SUSPENDED;
                int i7 = this.l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ResultKt.a(obj);
                        return obj;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                this.m = null;
                this.l = 1;
                Object invoke2 = function2.invoke(tokenizationResult, this);
                if (invoke2 == u85Var6) {
                    return u85Var6;
                }
                return invoke2;
            default:
                TokenizationResult tokenizationResult2 = (TokenizationResult) this.m;
                u85 u85Var7 = u85.COROUTINE_SUSPENDED;
                int i8 = this.l;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ResultKt.a(obj);
                        return obj;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                this.m = null;
                this.l = 1;
                Object invoke3 = function2.invoke(tokenizationResult2, this);
                if (invoke3 == u85Var7) {
                    return u85Var7;
                }
                return invoke3;
        }
    }
}
