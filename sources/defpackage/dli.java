package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dli extends zei implements Function2 {
    public final /* synthetic */ int k;
    public final /* synthetic */ z2f l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dli(z2f z2fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.l = z2fVar;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.k;
        z2f z2fVar = this.l;
        switch (i) {
            case 0:
                return new dli(z2fVar, continuation, 0);
            case 1:
                return new dli(z2fVar, continuation, 1);
            case 2:
                return new dli(z2fVar, continuation, 2);
            case 3:
                return new dli(z2fVar, continuation, 3);
            case 4:
                return new dli(z2fVar, continuation, 4);
            case 5:
                return new dli(z2fVar, continuation, 5);
            case 6:
                return new dli(z2fVar, continuation, 6);
            default:
                return new dli(z2fVar, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t85 t85Var = (t85) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
            case 0:
                return ((dli) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((dli) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((dli) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((dli) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((dli) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((dli) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((dli) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((dli) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        int i = this.k;
        z2f z2fVar = this.l;
        switch (i) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                z2fVar.a();
                return Unit.INSTANCE;
            case 1:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                z2fVar.b();
                return Unit.INSTANCE;
            case 2:
                u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                z2fVar.b();
                return Unit.INSTANCE;
            case 3:
                u85 u85Var4 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                z2fVar.a();
                return Unit.INSTANCE;
            case 4:
                u85 u85Var5 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                z2fVar.b();
                return Unit.INSTANCE;
            case 5:
                u85 u85Var6 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                z2fVar.b();
                return Unit.INSTANCE;
            case 6:
                u85 u85Var7 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                z2fVar.a();
                return Unit.INSTANCE;
            default:
                u85 u85Var8 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                z2fVar.b();
                return Unit.INSTANCE;
        }
    }
}
