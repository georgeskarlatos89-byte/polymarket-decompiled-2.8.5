package defpackage;

import android.os.SystemClock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class vh7 {
    public final long a;
    public final qqc b;
    public final Function0 c;

    public vh7(long j, qqc qqcVar, Function0 function0) {
        qqcVar.getClass();
        function0.getClass();
        this.a = j;
        this.b = qqcVar;
        this.c = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q55 q55Var) {
        th7 th7Var;
        int i;
        if (q55Var instanceof th7) {
            th7Var = (th7) q55Var;
            int i2 = th7Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                th7Var.m = i2 - Integer.MIN_VALUE;
                Object obj = th7Var.k;
                Object obj2 = u85.COROUTINE_SUSPENDED;
                i = th7Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    qqc qqcVar = this.b;
                    if (((ei7) qqcVar.getValue()) instanceof ai7) {
                        return Unit.INSTANCE;
                    }
                    if (((ei7) qqcVar.getValue()) instanceof bi7) {
                        qqcVar.setValue(new di7(SystemClock.elapsedRealtime()));
                    }
                    ei7 ei7Var = (ei7) qqcVar.getValue();
                    if (ei7Var instanceof di7) {
                        th7Var.m = 1;
                        if (b((di7) ei7Var, th7Var) == obj2) {
                            return obj2;
                        }
                    }
                }
                this.c.invoke();
                return Unit.INSTANCE;
            }
        }
        th7Var = new th7(this, q55Var);
        Object obj3 = th7Var.k;
        Object obj22 = u85.COROUTINE_SUSPENDED;
        i = th7Var.m;
        if (i == 0) {
        }
        this.c.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(di7 di7Var, q55 q55Var) {
        uh7 uh7Var;
        int i;
        if (q55Var instanceof uh7) {
            uh7Var = (uh7) q55Var;
            int i2 = uh7Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uh7Var.m = i2 - Integer.MIN_VALUE;
                Object obj = uh7Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = uh7Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    long j = di7Var.a;
                    if (j < 0) {
                        return Unit.INSTANCE;
                    }
                    long e = d47.e(this.a) - (SystemClock.elapsedRealtime() - j);
                    if (e > 0) {
                        long h = h47.h(e, m47.MILLISECONDS);
                        uh7Var.m = 1;
                        if (lvn.c(h, uh7Var) == u85Var) {
                            return u85Var;
                        }
                    }
                }
                this.b.setValue(ai7.a);
                return Unit.INSTANCE;
            }
        }
        uh7Var = new uh7(this, q55Var);
        Object obj2 = uh7Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = uh7Var.m;
        if (i == 0) {
        }
        this.b.setValue(ai7.a);
        return Unit.INSTANCE;
    }
}
