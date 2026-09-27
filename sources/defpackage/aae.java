package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class aae implements ma {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (d(r7, r8, r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (defpackage.wnn.d(r10, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(n9 n9Var, Object obj, yd0 yd0Var, q55 q55Var) {
        z9e z9eVar;
        int i;
        if (q55Var instanceof z9e) {
            z9eVar = (z9e) q55Var;
            int i2 = z9eVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z9eVar.p = i2 - Integer.MIN_VALUE;
                Object obj2 = z9eVar.n;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = z9eVar.p;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj2);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yd0Var = z9eVar.m;
                    obj = z9eVar.l;
                    n9Var = z9eVar.k;
                    ResultKt.a(obj2);
                } else {
                    ResultKt.a(obj2);
                    pk4 pk4Var = n9Var.c;
                    z9eVar.k = n9Var;
                    z9eVar.l = obj;
                    z9eVar.m = yd0Var;
                    z9eVar.p = 1;
                }
                z9eVar.k = null;
                z9eVar.l = null;
                z9eVar.m = null;
                z9eVar.p = 2;
            }
        }
        z9eVar = new z9e(this, q55Var);
        Object obj22 = z9eVar.n;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = z9eVar.p;
        if (i == 0) {
        }
        z9eVar.k = null;
        z9eVar.l = null;
        z9eVar.m = null;
        z9eVar.p = 2;
    }

    public abstract Object d(n9 n9Var, Object obj, yd0 yd0Var, z9e z9eVar);
}
