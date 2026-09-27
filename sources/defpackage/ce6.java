package defpackage;

import com.socure.docv.capturesdk.api.Keys;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ce6 {
    public final le6 a;
    public final m64 b;
    public final Function0 c;
    public final ma5 d = new ma5(27);

    public ce6(le6 le6Var, m64 m64Var, Function0 function0) {
        this.a = le6Var;
        this.b = m64Var;
        this.c = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, q55 q55Var) {
        ae6 ae6Var;
        int i;
        if (q55Var instanceof ae6) {
            ae6Var = (ae6) q55Var;
            int i2 = ae6Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ae6Var.m = i2 - Integer.MIN_VALUE;
                Object obj = ae6Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ae6Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                        return ((Result) obj).a;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                xzb xzbVar = new xzb();
                xzbVar.put("place_id", str);
                xzbVar.put(Keys.KEY_SESSION_TOKEN, str2);
                xzbVar.put("client_type", "mobile");
                xzbVar.put("source", "google");
                if (str3 != null) {
                    xzbVar.put("locale", str3);
                }
                xzb b = xzbVar.b();
                zd0 t = m64.t(this.b, "https://api.stripe.com/v1/elements/address/details", new yd0((String) this.c.invoke(), (String) null, 6), b, 8);
                azk azkVar = azk.o;
                ae6Var.m = 1;
                Object e = z1g.e(this.a, this.d, t, azkVar, ae6Var);
                if (e == u85Var) {
                    return u85Var;
                }
                return e;
            }
        }
        ae6Var = new ae6(this, q55Var);
        Object obj2 = ae6Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ae6Var.m;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, String str4, q55 q55Var) {
        be6 be6Var;
        int i;
        if (q55Var instanceof be6) {
            be6Var = (be6) q55Var;
            int i2 = be6Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                be6Var.m = i2 - Integer.MIN_VALUE;
                Object obj = be6Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = be6Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                        return ((Result) obj).a;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                xzb xzbVar = new xzb();
                xzbVar.put("search_text", str);
                xzbVar.put(Keys.KEY_SESSION_TOKEN, str3);
                xzbVar.put("client_type", "mobile");
                xzbVar.put("country_codes", eb4.c(str2));
                if (str4 != null) {
                    xzbVar.put("locale", str4);
                }
                xzb b = xzbVar.b();
                zd0 t = m64.t(this.b, "https://api.stripe.com/v1/elements/address/autocomplete", new yd0((String) this.c.invoke(), (String) null, 6), b, 8);
                f0o f0oVar = f0o.c;
                be6Var.m = 1;
                Object e = z1g.e(this.a, this.d, t, f0oVar, be6Var);
                if (e == u85Var) {
                    return u85Var;
                }
                return e;
            }
        }
        be6Var = new be6(this, q55Var);
        Object obj2 = be6Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = be6Var.m;
        if (i == 0) {
        }
    }
}
