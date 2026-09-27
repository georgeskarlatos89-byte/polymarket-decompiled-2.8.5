package defpackage;

import com.google.android.gms.tasks.Task;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f46 {
    public final die a;

    public f46(die dieVar) {
        this.a = dieVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t8a t8aVar, q55 q55Var) {
        e46 e46Var;
        int i;
        if (q55Var instanceof e46) {
            e46Var = (e46) q55Var;
            int i2 = e46Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e46Var.m = i2 - Integer.MIN_VALUE;
                Object obj = e46Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = e46Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    Task c = this.a.c(t8aVar);
                    c.getClass();
                    e46Var.m = 1;
                    obj = d2m.a(c, null, e46Var);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                obj.getClass();
                return obj;
            }
        }
        e46Var = new e46(this, q55Var);
        Object obj2 = e46Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = e46Var.m;
        if (i == 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
