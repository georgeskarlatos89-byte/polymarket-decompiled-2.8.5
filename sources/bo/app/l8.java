package bo.app;

import defpackage.bj9;
import defpackage.u85;
import defpackage.zei;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l8 extends zei implements Function2 {
    public final /* synthetic */ bj9 a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(bj9 bj9Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.a = bj9Var;
        this.b = obj;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new l8(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new l8(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        this.a.a(this.b);
        return Unit.INSTANCE;
    }
}
