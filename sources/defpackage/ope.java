package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ope extends zei implements Function2 {
    public int k;
    public /* synthetic */ int l;
    public final /* synthetic */ Ref.b m;
    public final /* synthetic */ Function1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ope(Ref.b bVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.m = bVar;
        this.n = function1;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        ope opeVar = new ope(this.m, this.n, continuation);
        opeVar.l = ((Number) obj).intValue();
        return opeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ope) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        int i = this.l;
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        int i2 = this.k;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.a(obj);
                return obj;
            }
            dmk.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.a(obj);
        this.m.a = i;
        this.l = i;
        this.k = 1;
        Object invoke = this.n.invoke(this);
        if (invoke == u85Var) {
            return u85Var;
        }
        return invoke;
    }
}
