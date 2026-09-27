package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class mw5 extends pme {
    public final List b;
    public final CoroutineContext c;
    public Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw5(Object obj, List list, Object obj2, CoroutineContext coroutineContext) {
        super(obj);
        obj.getClass();
        list.getClass();
        obj2.getClass();
        this.b = list;
        this.c = coroutineContext;
        this.d = obj2;
    }

    @Override // defpackage.pme
    public final Object a(Object obj, q55 q55Var) {
        this.e = 0;
        obj.getClass();
        this.d = obj;
        return c(q55Var);
    }

    @Override // defpackage.pme
    public final Object b() {
        return this.d;
    }

    @Override // defpackage.pme
    public final Object c(Continuation continuation) {
        int i = this.e;
        if (i < 0) {
            return this.d;
        }
        if (i >= this.b.size()) {
            this.e = -1;
            return this.d;
        }
        return e(continuation);
    }

    @Override // defpackage.pme
    public final Object d(Object obj, Continuation continuation) {
        obj.getClass();
        this.d = obj;
        return c(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Continuation continuation) {
        lw5 lw5Var;
        u85 u85Var;
        int i;
        int i2;
        Function3 function3;
        Object obj;
        if (continuation instanceof lw5) {
            lw5Var = (lw5) continuation;
            int i3 = lw5Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lw5Var.m = i3 - Integer.MIN_VALUE;
                Object obj2 = lw5Var.k;
                u85Var = u85.COROUTINE_SUSPENDED;
                i = lw5Var.m;
                if (i == 0 && i != 1) {
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj2);
                do {
                    i2 = this.e;
                    if (i2 == -1) {
                        List list = this.b;
                        if (i2 >= list.size()) {
                            this.e = -1;
                        } else {
                            function3 = (Function3) list.get(i2);
                            this.e = i2 + 1;
                            obj = this.d;
                            lw5Var.m = 1;
                        }
                    }
                    return this.d;
                } while (function3.invoke(this, obj, lw5Var) != u85Var);
                return u85Var;
            }
        }
        lw5Var = new lw5(this, continuation);
        Object obj22 = lw5Var.k;
        u85Var = u85.COROUTINE_SUSPENDED;
        i = lw5Var.m;
        if (i == 0) {
        }
        ResultKt.a(obj22);
        do {
            i2 = this.e;
            if (i2 == -1) {
            }
            return this.d;
        } while (function3.invoke(this, obj, lw5Var) != u85Var);
        return u85Var;
    }

    @Override // defpackage.t85
    public final CoroutineContext getCoroutineContext() {
        return this.c;
    }
}
