package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sw6 implements eb8 {
    public final /* synthetic */ tw6 a;
    public final /* synthetic */ Ref.ObjectRef b;
    public final /* synthetic */ eb8 c;

    public sw6(tw6 tw6Var, Ref.ObjectRef objectRef, eb8 eb8Var) {
        this.a = tw6Var;
        this.b = objectRef;
        this.c = eb8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        rw6 rw6Var;
        int i;
        if (continuation instanceof rw6) {
            rw6Var = (rw6) continuation;
            int i2 = rw6Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rw6Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = rw6Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = rw6Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj2);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    tw6 tw6Var = this.a;
                    Object invoke = tw6Var.b.invoke(obj);
                    Ref.ObjectRef objectRef = this.b;
                    Object obj3 = objectRef.a;
                    if (obj3 != xmm.a && ((Boolean) tw6Var.c.invoke(obj3, invoke)).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    objectRef.a = invoke;
                    rw6Var.m = 1;
                    if (this.c.emit(obj, rw6Var) == u85Var) {
                        return u85Var;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        rw6Var = new rw6(this, continuation);
        Object obj22 = rw6Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = rw6Var.m;
        if (i == 0) {
        }
        return Unit.INSTANCE;
    }
}
