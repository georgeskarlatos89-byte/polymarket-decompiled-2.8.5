package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class qc8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o0j o0jVar, Function3 function3, Throwable th, q55 q55Var) {
        lc8 lc8Var;
        int i;
        try {
            if (q55Var instanceof lc8) {
                lc8 lc8Var2 = (lc8) q55Var;
                int i2 = lc8Var2.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lc8Var2.m = i2 - Integer.MIN_VALUE;
                    lc8Var = lc8Var2;
                    Object obj = lc8Var.l;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = lc8Var.m;
                    if (i == 0) {
                        if (i == 1) {
                            th = lc8Var.k;
                            ResultKt.a(obj);
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ResultKt.a(obj);
                        lc8Var.k = th;
                        lc8Var.m = 1;
                        if (function3.invoke(o0jVar, th, lc8Var) == u85Var) {
                            return u85Var;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i == 0) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                gp7.a(th2, th);
            }
            throw th2;
        }
        lc8Var = new q55(q55Var);
        Object obj2 = lc8Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = lc8Var.m;
    }
}
