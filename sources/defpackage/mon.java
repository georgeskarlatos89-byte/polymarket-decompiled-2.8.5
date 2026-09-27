package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class mon {
    public static eq9 a;

    public static final String a(Throwable th) {
        th.getClass();
        String message = th.getMessage();
        if (message == null) {
            return th.toString();
        }
        return message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(Function1 function1, Function1 function12, Continuation continuation) {
        d64 d64Var;
        int i;
        try {
            if (continuation instanceof d64) {
                d64 d64Var2 = (d64) continuation;
                int i2 = d64Var2.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    d64Var2.m = i2 - Integer.MIN_VALUE;
                    d64Var = d64Var2;
                    Object obj = d64Var.l;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = d64Var.m;
                    if (i == 0) {
                        if (i == 1) {
                            Function1 function13 = d64Var.k;
                            ResultKt.a(obj);
                            return obj;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.a(obj);
                    d64Var.k = function1;
                    d64Var.m = 1;
                    Object invoke = function12.invoke(d64Var);
                    if (invoke == u85Var) {
                        return u85Var;
                    }
                    return invoke;
                }
            }
            if (i == 0) {
            }
        } catch (Error e) {
            throw e;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            if (th instanceof SwiftProjecting) {
                throw th;
            }
            throw new c64((SwiftProjecting) function1.invoke(th), a(th), th);
        }
        d64Var = new q55(continuation);
        Object obj2 = d64Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = d64Var.m;
    }
}
