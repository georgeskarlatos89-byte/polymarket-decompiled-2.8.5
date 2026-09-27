package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ow4 extends zei implements Function2 {
    public int k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ Ref.ObjectRef m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow4(Function2 function2, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.l = function2;
        this.m = objectRef;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new ow4(this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ow4) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                ResultKt.a(obj);
                return obj;
            }
            dmk.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.a(obj);
        Object obj2 = this.m.a;
        this.k = 1;
        Object invoke = this.l.invoke(obj2, this);
        if (invoke == u85Var) {
            return u85Var;
        }
        return invoke;
    }
}
