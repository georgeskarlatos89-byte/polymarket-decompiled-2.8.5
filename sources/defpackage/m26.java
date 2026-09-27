package defpackage;

import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class m26 implements j47 {
    public static final m26 e = new m26();
    public final Function0 a;
    public final trb b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;

    public m26() {
        ow5 ow5Var = new ow5(6);
        trb trbVar = azk.l;
        this.a = ow5Var;
        this.b = trbVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public final d47 b(i47 i47Var) {
        i47Var.getClass();
        Long l = (Long) this.c.get(i47Var);
        if (l != null) {
            long longValue = l.longValue();
            c47 c47Var = d47.b;
            return new d47(h47.h(((Number) this.a.invoke()).longValue() - longValue, m47.MILLISECONDS));
        }
        return null;
    }

    public final d47 c(i47 i47Var) {
        i47Var.getClass();
        Long l = (Long) this.c.remove(i47Var);
        if (l != null) {
            long longValue = l.longValue();
            long longValue2 = ((Number) this.a.invoke()).longValue();
            this.b.a("DURATION_ENDED: " + i47Var.name() + ": " + longValue2);
            c47 c47Var = d47.b;
            long h = h47.h(longValue2 - longValue, m47.MILLISECONDS);
            this.d.put(i47Var, new d47(h));
            return new d47(h);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(i47 i47Var, Function1 function1, Continuation continuation) {
        l26 l26Var;
        int i;
        try {
            if (continuation instanceof l26) {
                l26Var = (l26) continuation;
                int i2 = l26Var.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    l26Var.n = i2 - Integer.MIN_VALUE;
                    Object obj = l26Var.l;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = l26Var.n;
                    if (i == 0) {
                        if (i == 1) {
                            i47Var = l26Var.k;
                            ResultKt.a(obj);
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ResultKt.a(obj);
                        e(i47Var);
                        l26Var.k = i47Var;
                        l26Var.n = 1;
                        obj = function1.invoke(l26Var);
                        if (obj == u85Var) {
                            return u85Var;
                        }
                    }
                    return obj;
                }
            }
            if (i == 0) {
            }
            return obj;
        } finally {
            c(i47Var);
        }
        l26Var = new l26(this, continuation);
        Object obj2 = l26Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = l26Var.n;
    }

    public final void e(i47 i47Var) {
        i47Var.getClass();
        this.d.remove(i47Var);
        long longValue = ((Number) this.a.invoke()).longValue();
        this.c.put(i47Var, Long.valueOf(longValue));
        this.b.a("DURATION_STARTED: " + i47Var.name() + ": " + longValue);
    }
}
