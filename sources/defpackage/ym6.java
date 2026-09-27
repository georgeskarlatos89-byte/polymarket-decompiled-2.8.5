package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ym6 implements eb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eb8 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ym6(eb8 eb8Var, Function1 function1, int i) {
        this.a = i;
        this.b = eb8Var;
        this.c = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        xm6 xm6Var;
        int i;
        xwh xwhVar;
        int i2;
        int i3 = this.a;
        Function1 function1 = this.c;
        eb8 eb8Var = this.b;
        switch (i3) {
            case 0:
                if (continuation instanceof xm6) {
                    xm6Var = (xm6) continuation;
                    int i4 = xm6Var.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        xm6Var.l = i4 - Integer.MIN_VALUE;
                        Object obj2 = xm6Var.k;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = xm6Var.l;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.a(obj2);
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ResultKt.a(obj2);
                            Object invoke = function1.invoke(obj);
                            xm6Var.l = 1;
                            if (eb8Var.emit(invoke, xm6Var) == u85Var) {
                                return u85Var;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                xm6Var = new xm6(this, continuation);
                Object obj22 = xm6Var.k;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                i = xm6Var.l;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            default:
                if (continuation instanceof xwh) {
                    xwhVar = (xwh) continuation;
                    int i5 = xwhVar.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        xwhVar.l = i5 - Integer.MIN_VALUE;
                        Object obj3 = xwhVar.k;
                        u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                        i2 = xwhVar.l;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                ResultKt.a(obj3);
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ResultKt.a(obj3);
                            Object invoke2 = function1.invoke(obj);
                            xwhVar.l = 1;
                            if (eb8Var.emit(invoke2, xwhVar) == u85Var3) {
                                return u85Var3;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                xwhVar = new xwh(this, continuation);
                Object obj32 = xwhVar.k;
                u85 u85Var32 = u85.COROUTINE_SUSPENDED;
                i2 = xwhVar.l;
                if (i2 == 0) {
                }
                return Unit.INSTANCE;
        }
    }
}
