package skip.lib;

import defpackage.dmk;
import defpackage.eb8;
import defpackage.kw5;
import defpackage.u85;
import defpackage.zei;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Element", "Leb8;", "", "<anonymous>", "(Leb8;)V"}, k = 3, mv = {2, 2, 0})
@kw5(c = "skip.lib.AsyncThrowingStream$kotlin$2", f = "AsyncStream.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AsyncThrowingStream$kotlin$2 extends zei implements Function2<eb8, Continuation<? super Unit>, Object> {
    int label;

    public AsyncThrowingStream$kotlin$2(Continuation<? super AsyncThrowingStream$kotlin$2> continuation) {
        super(2, continuation);
    }

    @Override // defpackage.l81
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AsyncThrowingStream$kotlin$2(continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(eb8 eb8Var, Continuation<? super Unit> continuation) {
        return ((AsyncThrowingStream$kotlin$2) create(eb8Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.ResultKt.a(obj);
            return Unit.INSTANCE;
        }
        dmk.n("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(eb8 eb8Var, Continuation<? super Unit> continuation) {
        return invoke2(eb8Var, continuation);
    }
}
