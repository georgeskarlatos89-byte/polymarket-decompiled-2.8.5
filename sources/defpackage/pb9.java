package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class pb9 extends zei implements Function2 {
    public final /* synthetic */ int k;
    public final /* synthetic */ jf2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb9(jf2 jf2Var, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.l = jf2Var;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.k;
        jf2 jf2Var = this.l;
        switch (i) {
            case 0:
                return new pb9(jf2Var, continuation, 0);
            default:
                return new pb9(jf2Var, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t85 t85Var = (t85) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
            case 0:
                return ((pb9) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((pb9) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        int i = this.k;
        jf2 jf2Var = this.l;
        switch (i) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                jf2Var.c();
                return Unit.INSTANCE;
            default:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                jf2Var.c();
                return Unit.INSTANCE;
        }
    }
}
