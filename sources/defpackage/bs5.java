package defpackage;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class bs5 implements dkf {
    public final ejf a;

    public bs5(ejf ejfVar) {
        ejfVar.getClass();
        this.a = ejfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.dkf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(ljf ljfVar, Continuation continuation) {
        as5 as5Var;
        int i;
        hjf hjfVar;
        if (continuation instanceof as5) {
            as5Var = (as5) continuation;
            int i2 = as5Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                as5Var.m = i2 - Integer.MIN_VALUE;
                Object obj = as5Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = as5Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    String b = cun.b(ljfVar);
                    as5Var.m = 1;
                    obj = this.a.select(b, as5Var);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                hjfVar = (hjf) obj;
                if (hjfVar != null) {
                    return null;
                }
                return new gkf(hjfVar.b, hjfVar.c, CollectionsKt.Q0(hjfVar.d), hjfVar.e, hjfVar.f, hjfVar.g, hjfVar.h);
            }
        }
        as5Var = new as5(this, (q55) continuation);
        Object obj2 = as5Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = as5Var.m;
        if (i == 0) {
        }
        hjfVar = (hjf) obj2;
        if (hjfVar != null) {
        }
    }

    @Override // defpackage.dkf
    public final Object S(gkf gkfVar, q55 q55Var) {
        ljf kjfVar;
        String str = gkfVar.d;
        if (str != null) {
            Map map = gkfVar.e;
            Map map2 = null;
            if (map == null || map.isEmpty()) {
                map = null;
            }
            Map map3 = gkfVar.f;
            if (map3 != null && !map3.isEmpty()) {
                map2 = map3;
            }
            kjfVar = new jjf(str, map, map2);
        } else {
            String str2 = gkfVar.g;
            if (str2 != null) {
                kjfVar = new ijf(str2);
            } else {
                kjfVar = new kjf(gkfVar.a, gkfVar.b);
            }
        }
        Object insert = this.a.insert(new hjf(cun.b(kjfVar), gkfVar.a, gkfVar.b, CollectionsKt.M0(gkfVar.c), gkfVar.d, gkfVar.e, gkfVar.f, gkfVar.g), q55Var);
        if (insert == u85.COROUTINE_SUSPENDED) {
            return insert;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.dkf
    public final Object clear(Continuation continuation) {
        Object deleteAll = this.a.deleteAll(continuation);
        if (deleteAll == u85.COROUTINE_SUSPENDED) {
            return deleteAll;
        }
        return Unit.INSTANCE;
    }
}
