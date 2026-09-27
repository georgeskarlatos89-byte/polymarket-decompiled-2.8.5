package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jga extends o5g implements Function3 {
    public int l;
    public /* synthetic */ hy5 m;
    public final /* synthetic */ j0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jga(j0 j0Var, Continuation continuation) {
        super(3, continuation);
        this.n = j0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jga jgaVar = new jga(this.n, (Continuation) obj3);
        jgaVar.m = (hy5) obj;
        return jgaVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        j0 j0Var = this.n;
        c3 c3Var = (c3) j0Var.c;
        hy5 hy5Var = this.m;
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        int i = this.l;
        if (i != 0) {
            if (i == 1) {
                ResultKt.a(obj);
            } else {
                dmk.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            ResultKt.a(obj);
            byte w = c3Var.w();
            if (w == 1) {
                return j0Var.g(true);
            }
            if (w == 0) {
                return j0Var.g(false);
            }
            if (w == 6) {
                this.m = null;
                this.l = 1;
                obj = j0Var.f(hy5Var, this);
                if (obj == u85Var) {
                    return u85Var;
                }
            } else {
                if (w == 8) {
                    return j0Var.e();
                }
                c3.q(c3Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return (bea) obj;
    }
}
