package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class is5 implements lhi {
    public final ihi a;

    public is5(ihi ihiVar) {
        ihiVar.getClass();
        this.a = ihiVar;
    }

    @Override // defpackage.lhi
    public final Object clear(Continuation continuation) {
        Object deleteAll = this.a.deleteAll(continuation);
        if (deleteAll == u85.COROUTINE_SUSPENDED) {
            return deleteAll;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.lhi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, q55 q55Var) {
        hs5 hs5Var;
        int i;
        khi khiVar;
        if (q55Var instanceof hs5) {
            hs5Var = (hs5) q55Var;
            int i2 = hs5Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hs5Var.m = i2 - Integer.MIN_VALUE;
                Object obj = hs5Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = hs5Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    hs5Var.m = 1;
                    obj = this.a.select(str, hs5Var);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                khiVar = (khi) obj;
                if (khiVar != null) {
                    return null;
                }
                return new hhi(khiVar.a, khiVar.b, khiVar.c, khiVar.d, khiVar.e);
            }
        }
        hs5Var = new hs5(this, q55Var);
        Object obj2 = hs5Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = hs5Var.m;
        if (i == 0) {
        }
        khiVar = (khi) obj2;
        if (khiVar != null) {
        }
    }

    @Override // defpackage.lhi
    public final Object z(hhi hhiVar, q55 q55Var) {
        Object insert = this.a.insert(new khi(hhiVar.a, hhiVar.b, hhiVar.c, hhiVar.d, hhiVar.e), q55Var);
        if (insert == u85.COROUTINE_SUSPENDED) {
            return insert;
        }
        return Unit.INSTANCE;
    }
}
