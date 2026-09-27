package defpackage;

import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class cyn {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ue9 ue9Var, q55 q55Var) {
        geg gegVar;
        int i;
        if (q55Var instanceof geg) {
            geg gegVar2 = (geg) q55Var;
            int i2 = gegVar2.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gegVar2.m = i2 - Integer.MIN_VALUE;
                gegVar = gegVar2;
                Object obj = gegVar.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = gegVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ue9Var = gegVar.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    fv1 c = ue9Var.d().c();
                    gegVar.k = ue9Var;
                    gegVar.m = 1;
                    obj = sv1.i(c, gegVar);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                leh lehVar = (leh) obj;
                lehVar.getClass();
                return new heg(ue9Var.a, ue9Var.c(), ue9Var.d(), rfh.b(lehVar, -1));
            }
        }
        gegVar = new q55(q55Var);
        Object obj2 = gegVar.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = gegVar.m;
        if (i == 0) {
        }
        leh lehVar2 = (leh) obj2;
        lehVar2.getClass();
        return new heg(ue9Var.a, ue9Var.c(), ue9Var.d(), rfh.b(lehVar2, -1));
    }
}
