package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ud8 implements eb8 {
    public final /* synthetic */ eb8 a;

    public ud8(eb8 eb8Var) {
        this.a = eb8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        td8 td8Var;
        int i;
        if (continuation instanceof td8) {
            td8Var = (td8) continuation;
            int i2 = td8Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                td8Var.l = i2 - Integer.MIN_VALUE;
                Object obj2 = td8Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = td8Var.l;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj2);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    if (obj != null) {
                        td8Var.l = 1;
                        if (this.a.emit(obj, td8Var) == u85Var) {
                            return u85Var;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        td8Var = new td8(this, continuation);
        Object obj22 = td8Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = td8Var.l;
        if (i == 0) {
        }
        return Unit.INSTANCE;
    }
}
