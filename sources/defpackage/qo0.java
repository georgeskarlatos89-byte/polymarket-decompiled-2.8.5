package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class qo0 extends zei implements Function2 {
    public final /* synthetic */ int k;
    public final /* synthetic */ Function0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qo0(Function0 function0, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.l = function0;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.k) {
            case 0:
                return new qo0(this.l, continuation, 0);
            case 1:
                return new qo0(this.l, continuation, 1);
            case 2:
                return new qo0(this.l, continuation, 2);
            case 3:
                return new qo0(this.l, continuation, 3);
            case 4:
                return new qo0(this.l, continuation, 4);
            default:
                return new qo0(this.l, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t85 t85Var = (t85) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
            case 0:
                return ((qo0) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((qo0) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((qo0) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((qo0) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((qo0) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((qo0) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        int i = this.k;
        Function0 function0 = this.l;
        switch (i) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                function0.invoke();
                return Unit.INSTANCE;
            case 1:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                function0.invoke();
                return Unit.INSTANCE;
            case 2:
                u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                function0.invoke();
                return Unit.INSTANCE;
            case 3:
                u85 u85Var4 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                function0.invoke();
                return Unit.INSTANCE;
            case 4:
                u85 u85Var5 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                function0.invoke();
                return Unit.INSTANCE;
            default:
                u85 u85Var6 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                function0.invoke();
                return Unit.INSTANCE;
        }
    }
}
