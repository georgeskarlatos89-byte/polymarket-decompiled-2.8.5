package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fu2 extends zei implements Function3 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu2(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.k) {
            case 0:
                return new fu2(3, 0, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
            case 1:
                long j = ((ogd) obj2).a;
                return new fu2(3, 1, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
            case 2:
                ((Number) obj2).floatValue();
                return new fu2(3, 2, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
            case 3:
                ((Number) obj).intValue();
                new fu2(3, 3, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
                return Boolean.FALSE;
            default:
                long j2 = ((ogd) obj2).a;
                return new fu2(3, 4, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        switch (this.k) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Unit.INSTANCE;
            case 1:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Unit.INSTANCE;
            case 2:
                u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Unit.INSTANCE;
            case 3:
                u85 u85Var4 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Boolean.FALSE;
            default:
                u85 u85Var5 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Unit.INSTANCE;
        }
    }
}
