package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ik5 extends zei implements Function2 {
    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new zei(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ik5) create((j6e) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        Result.Companion companion = Result.INSTANCE;
        return new Result(Result.m882constructorimpl(ResultKt.createFailure(new IllegalStateException("Unexpected attempt to update default from CustomerSheet."))));
    }
}
