package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class y1 implements Flow {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(eb8 eb8Var, Continuation continuation) {
        x1 x1Var;
        int i;
        ncg ncgVar;
        if (continuation instanceof x1) {
            x1Var = (x1) continuation;
            int i2 = x1Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x1Var.n = i2 - Integer.MIN_VALUE;
                Object obj = x1Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = x1Var.n;
                if (i == 0) {
                    if (i == 1) {
                        ncgVar = x1Var.k;
                        try {
                            ResultKt.a(obj);
                        } catch (Throwable th) {
                            th = th;
                            ncgVar.releaseIntercepted();
                            throw th;
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    ncg ncgVar2 = new ncg(eb8Var, x1Var.getContext());
                    try {
                        x1Var.k = ncgVar2;
                        x1Var.n = 1;
                        if (e(ncgVar2, x1Var) == u85Var) {
                            return u85Var;
                        }
                        ncgVar = ncgVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        ncgVar = ncgVar2;
                        ncgVar.releaseIntercepted();
                        throw th;
                    }
                }
                ncgVar.releaseIntercepted();
                return Unit.INSTANCE;
            }
        }
        x1Var = new x1(this, continuation);
        Object obj2 = x1Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = x1Var.n;
        if (i == 0) {
        }
        ncgVar.releaseIntercepted();
        return Unit.INSTANCE;
    }

    public abstract Object e(ncg ncgVar, x1 x1Var);
}
