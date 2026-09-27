package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wc4 implements eb8 {
    public final /* synthetic */ j7f a;

    public wc4(j7f j7fVar) {
        this.a = j7fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        vc4 vc4Var;
        int i;
        if (continuation instanceof vc4) {
            vc4Var = (vc4) continuation;
            int i2 = vc4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vc4Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = vc4Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = vc4Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj2);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    i7f i7fVar = (i7f) this.a;
                    i7fVar.getClass();
                    if (obj == null) {
                        obj = xmm.a;
                    }
                    vc4Var.m = 1;
                    if (i7fVar.e.n(obj, vc4Var) == u85Var) {
                        return u85Var;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        vc4Var = new vc4(this, continuation);
        Object obj22 = vc4Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = vc4Var.m;
        if (i == 0) {
        }
        return Unit.INSTANCE;
    }
}
