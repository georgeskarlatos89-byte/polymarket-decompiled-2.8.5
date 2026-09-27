package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class v4d extends zei implements Function2 {
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ List l;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4d(Function1 function1, List list, float f, float f2, Continuation continuation) {
        super(2, continuation);
        this.k = function1;
        this.l = list;
        this.m = f;
        this.n = f2;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new v4d(this.k, this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v4d) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        this.k.invoke(new cc(this.l, this.m, this.n));
        return Unit.INSTANCE;
    }
}
