package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dfb extends zei implements Function2 {
    public final /* synthetic */ int k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ qqc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dfb(Function1 function1, qqc qqcVar, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.l = function1;
        this.m = qqcVar;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.k;
        qqc qqcVar = this.m;
        Function1 function1 = this.l;
        switch (i) {
            case 0:
                return new dfb(function1, qqcVar, continuation, 0);
            default:
                return new dfb(function1, qqcVar, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t85 t85Var = (t85) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
            case 0:
                return ((dfb) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((dfb) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        int i = this.k;
        qqc qqcVar = this.m;
        Function1 function1 = this.l;
        switch (i) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                function1.invoke((fx9) qqcVar.getValue());
                return Unit.INSTANCE;
            default:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                function1.invoke((fx9) qqcVar.getValue());
                return Unit.INSTANCE;
        }
    }
}
