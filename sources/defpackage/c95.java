package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class c95 extends zei implements Function2 {
    public final /* synthetic */ int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ Function1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c95(Function2 function2, Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.n = function2;
        this.o = function1;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.k;
        Function1 function1 = this.o;
        Function2 function2 = this.n;
        switch (i) {
            case 0:
                c95 c95Var = new c95(function2, function1, continuation, 0);
                c95Var.m = obj;
                return c95Var;
            default:
                c95 c95Var2 = new c95(function2, function1, continuation, 1);
                c95Var2.m = obj;
                return c95Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.k) {
            case 0:
                return ((c95) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((c95) create((JSONObject) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        Object m882constructorimpl;
        int i = this.k;
        Function1 function1 = this.o;
        Function2 function2 = this.n;
        switch (i) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                int i2 = this.l;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.a(obj);
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ResultKt.a(obj);
                        Result.Companion companion = Result.INSTANCE;
                        b95 b95Var = new b95(function2, null, 0);
                        this.m = null;
                        this.l = 1;
                        obj = qsn.f(b95Var, this);
                        if (obj == u85Var) {
                            return u85Var;
                        }
                    }
                    m882constructorimpl = Result.m882constructorimpl(obj);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(m882constructorimpl);
                if (m883exceptionOrNullimpl != null && function1 != null) {
                    function1.invoke(m883exceptionOrNullimpl);
                }
                return new Result(m882constructorimpl);
            default:
                JSONObject jSONObject = (JSONObject) this.m;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                int i3 = this.l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ResultKt.a(obj);
                        return obj;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                Object invoke = function1.invoke(jSONObject.optJSONObject(ApiConstant.KEY_DATA));
                this.m = null;
                this.l = 1;
                Object invoke2 = function2.invoke(invoke, this);
                if (invoke2 == u85Var2) {
                    return u85Var2;
                }
                return invoke2;
        }
    }
}
