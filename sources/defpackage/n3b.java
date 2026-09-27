package defpackage;

import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class n3b implements vne {
    public final Lazy a;

    public n3b(y35 y35Var) {
        this.a = LazyKt.lazy(y35Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, int i, q55 q55Var) {
        m3b m3bVar;
        int i2;
        if (q55Var instanceof m3b) {
            m3bVar = (m3b) q55Var;
            int i3 = m3bVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m3bVar.m = i3 - Integer.MIN_VALUE;
                Object obj = m3bVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i2 = m3bVar.m;
                if (i2 == 0) {
                    if (i2 == 1) {
                        ResultKt.a(obj);
                        return ((Result) obj).a;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                vne vneVar = (vne) this.a.getValue();
                m3bVar.m = 1;
                Object a = vneVar.a(str, str2, i, m3bVar);
                if (a == u85Var) {
                    return u85Var;
                }
                return a;
            }
        }
        m3bVar = new m3b(this, q55Var);
        Object obj2 = m3bVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i2 = m3bVar.m;
        if (i2 == 0) {
        }
    }

    @Override // defpackage.vne
    public final void b() {
        ((vne) this.a.getValue()).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Locale locale, q55 q55Var) {
        l3b l3bVar;
        int i;
        if (q55Var instanceof l3b) {
            l3bVar = (l3b) q55Var;
            int i2 = l3bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l3bVar.m = i2 - Integer.MIN_VALUE;
                Object obj = l3bVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = l3bVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                        return ((Result) obj).a;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                vne vneVar = (vne) this.a.getValue();
                l3bVar.m = 1;
                Object c = vneVar.c(str, locale, l3bVar);
                if (c == u85Var) {
                    return u85Var;
                }
                return c;
            }
        }
        l3bVar = new l3b(this, q55Var);
        Object obj2 = l3bVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = l3bVar.m;
        if (i == 0) {
        }
    }
}
