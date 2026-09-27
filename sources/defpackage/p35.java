package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class p35 extends zei implements Function2 {
    public final /* synthetic */ int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ fv1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p35(fv1 fv1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.m = fv1Var;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.k) {
            case 0:
                p35 p35Var = new p35(this.m, continuation, 0);
                p35Var.l = obj;
                return p35Var;
            default:
                p35 p35Var2 = new p35(this.m, continuation, 1);
                p35Var2.l = obj;
                return p35Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
            case 0:
                return ((p35) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((p35) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        int i = this.k;
        boolean z = true;
        fv1 fv1Var = this.m;
        switch (i) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                if (this.l == null && !fv1Var.e()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                if (this.l == null && !fv1Var.e()) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
