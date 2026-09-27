package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class a85 extends zei implements Function2 {
    public final /* synthetic */ int k;
    public final /* synthetic */ zu2 l;
    public final /* synthetic */ w5g m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a85(zu2 zu2Var, w5g w5gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.l = zu2Var;
        this.m = w5gVar;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.k;
        w5g w5gVar = this.m;
        zu2 zu2Var = this.l;
        switch (i) {
            case 0:
                return new a85(zu2Var, w5gVar, continuation, 0);
            case 1:
                return new a85(zu2Var, w5gVar, continuation, 1);
            case 2:
                return new a85(zu2Var, w5gVar, continuation, 2);
            case 3:
                return new a85(zu2Var, w5gVar, continuation, 3);
            case 4:
                return new a85(zu2Var, w5gVar, continuation, 4);
            case 5:
                return new a85(zu2Var, w5gVar, continuation, 5);
            default:
                return new a85(zu2Var, w5gVar, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t85 t85Var = (t85) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
            case 0:
                return ((a85) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((a85) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((a85) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((a85) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((a85) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((a85) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((a85) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        int i = this.k;
        w5g w5gVar = this.m;
        zu2 zu2Var = this.l;
        switch (i) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                zu2Var.l(w5gVar);
                return Unit.INSTANCE;
            case 1:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                zu2Var.l(w5gVar);
                return Unit.INSTANCE;
            case 2:
                u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                zu2Var.l(w5gVar);
                return Unit.INSTANCE;
            case 3:
                u85 u85Var4 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                zu2Var.l(w5gVar);
                return Unit.INSTANCE;
            case 4:
                u85 u85Var5 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                zu2Var.l(w5gVar);
                return Unit.INSTANCE;
            case 5:
                u85 u85Var6 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                zu2Var.l(w5gVar);
                return Unit.INSTANCE;
            default:
                u85 u85Var7 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                zu2Var.l(w5gVar);
                return Unit.INSTANCE;
        }
    }
}
