package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dp4 extends zei implements Function3 {
    public final /* synthetic */ Ref.a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp4(Ref.a aVar, Continuation continuation) {
        super(3, continuation);
        this.k = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new dp4(this.k, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        this.k.a = true;
        return Unit.INSTANCE;
    }
}
