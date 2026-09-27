package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class re8 extends zei implements Function1 {
    public final /* synthetic */ int k;
    public final /* synthetic */ Function0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re8(Function0 function0, Continuation continuation, int i) {
        super(1, continuation);
        this.k = i;
        this.l = function0;
    }

    @Override // defpackage.l81
    public final Continuation create(Continuation continuation) {
        int i = this.k;
        Function0 function0 = this.l;
        switch (i) {
            case 0:
                return new re8(function0, continuation, 0);
            default:
                return new re8(function0, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.k) {
            case 0:
                return ((re8) create(continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((re8) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            default:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return function0.invoke();
        }
    }
}
