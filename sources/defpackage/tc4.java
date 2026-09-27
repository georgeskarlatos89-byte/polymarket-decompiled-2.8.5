package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tc4 implements eb8 {
    public final /* synthetic */ CoroutineContext a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ i7f c;
    public final /* synthetic */ eb8 d;
    public final /* synthetic */ vg1 e;
    public final /* synthetic */ lca f;

    public tc4(CoroutineContext coroutineContext, Object obj, i7f i7fVar, eb8 eb8Var, vg1 vg1Var, lca lcaVar) {
        this.a = coroutineContext;
        this.b = obj;
        this.c = i7fVar;
        this.d = eb8Var;
        this.e = vg1Var;
        this.f = lcaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        sc4 sc4Var;
        int i;
        if (continuation instanceof sc4) {
            sc4Var = (sc4) continuation;
            int i2 = sc4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sc4Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = sc4Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = sc4Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj2);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    Unit unit = Unit.INSTANCE;
                    j80 j80Var = new j80(this.c, this.d, this.e, obj, this.f, (Continuation) null);
                    sc4Var.m = 1;
                    if (smn.b(this.a, unit, this.b, j80Var, sc4Var) == u85Var) {
                        return u85Var;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        sc4Var = new sc4(this, continuation);
        Object obj22 = sc4Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = sc4Var.m;
        if (i == 0) {
        }
        return Unit.INSTANCE;
    }
}
