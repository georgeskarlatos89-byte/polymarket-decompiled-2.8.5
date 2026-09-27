package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class hh6 {
    public final r6i a;
    public final gd3 b;
    public final long c;
    public final uwh d;
    public final uwh e;

    public hh6(int i, r6i r6iVar, gd3 gd3Var) {
        r6iVar.getClass();
        gd3Var.getClass();
        this.a = r6iVar;
        this.b = gd3Var;
        this.c = TimeUnit.MINUTES.toMillis(i);
        uwh a = n0n.a(Boolean.FALSE);
        this.d = a;
        this.e = a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q55 q55Var) {
        gh6 gh6Var;
        int i;
        if (q55Var instanceof gh6) {
            gh6Var = (gh6) q55Var;
            int i2 = gh6Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gh6Var.m = i2 - Integer.MIN_VALUE;
                Object obj = gh6Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = gh6Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    gh6Var.m = 1;
                    if (lvn.b(this.c, gh6Var) == u85Var) {
                        return u85Var;
                    }
                }
                gd3 gd3Var = this.b;
                String str = gd3Var.b;
                String str2 = gd3Var.c;
                fgf fgfVar = fgf.TransactionTimedout;
                this.a.a(new oi7(str, str2, String.valueOf(fgfVar.a()), ni7.ThreeDsSdk, fgfVar.b(), "Timeout expiry reached for the transaction", (String) null, gd3Var.a, gd3Var.d, 132));
                this.d.m(null, Boolean.TRUE);
                return Unit.INSTANCE;
            }
        }
        gh6Var = new gh6(this, q55Var);
        Object obj2 = gh6Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = gh6Var.m;
        if (i == 0) {
        }
        gd3 gd3Var2 = this.b;
        String str3 = gd3Var2.b;
        String str22 = gd3Var2.c;
        fgf fgfVar2 = fgf.TransactionTimedout;
        this.a.a(new oi7(str3, str22, String.valueOf(fgfVar2.a()), ni7.ThreeDsSdk, fgfVar2.b(), "Timeout expiry reached for the transaction", (String) null, gd3Var2.a, gd3Var2.d, 132));
        this.d.m(null, Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
