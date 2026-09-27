package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jc8 implements eb8 {
    public final /* synthetic */ j7f a;

    public jc8(j7f j7fVar) {
        this.a = j7fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        ic8 ic8Var;
        int i;
        if (continuation instanceof ic8) {
            ic8Var = (ic8) continuation;
            int i2 = ic8Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ic8Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = ic8Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ic8Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj2);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    if (obj == null) {
                        obj = xmm.a;
                    }
                    ic8Var.m = 1;
                    if (((i7f) this.a).e.n(obj, ic8Var) == u85Var) {
                        return u85Var;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        ic8Var = new ic8(this, continuation);
        Object obj22 = ic8Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ic8Var.m;
        if (i == 0) {
        }
        return Unit.INSTANCE;
    }
}
