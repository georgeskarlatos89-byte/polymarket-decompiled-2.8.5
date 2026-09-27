package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class wk3 extends zei implements Function2 {
    public final /* synthetic */ int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk3(String str, int i, Continuation continuation) {
        super(2, continuation);
        this.k = i;
        this.n = str;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.k;
        String str = this.n;
        switch (i) {
            case 0:
                wk3 wk3Var = new wk3(str, 0, continuation);
                wk3Var.m = obj;
                return wk3Var;
            default:
                wk3 wk3Var2 = new wk3(str, 1, continuation);
                wk3Var2.m = obj;
                return wk3Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        xre xreVar = (xre) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
            case 0:
                return ((wk3) create(xreVar, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((wk3) create(xreVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        int i = this.k;
        String str = this.n;
        switch (i) {
            case 0:
                xre xreVar = (xre) this.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                int i2 = this.l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.a(obj);
                        return obj;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                this.m = null;
                this.l = 1;
                Object v = xreVar.v(str, this);
                if (v == u85Var) {
                    return u85Var;
                }
                return v;
            default:
                xre xreVar2 = (xre) this.m;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                int i3 = this.l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ResultKt.a(obj);
                        return obj;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                this.m = null;
                this.l = 1;
                Object z = xreVar2.z(str, this);
                if (z == u85Var2) {
                    return u85Var2;
                }
                return z;
        }
    }
}
