package defpackage;

import kotlin.ResultKt;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v4g {
    public final f15 a;

    public v4g(f15 f15Var) {
        f15Var.getClass();
        this.a = f15Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, q55 q55Var) {
        u4g u4gVar;
        int i;
        p2g p2gVar;
        if (q55Var instanceof u4g) {
            u4gVar = (u4g) q55Var;
            int i2 = u4gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u4gVar.m = i2 - Integer.MIN_VALUE;
                Object obj = u4gVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = u4gVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    q4g q4gVar = new q4g(str2);
                    u4gVar.m = 1;
                    obj = this.a.c(str, q4gVar, u4gVar);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                p2gVar = (p2g) obj;
                if (!(p2gVar instanceof o2g)) {
                    t4g t4gVar = (t4g) ((o2g) p2gVar).a;
                    String str3 = t4gVar.c;
                    if (str3 != null && !StringsKt.T(str3)) {
                        return new o2g(t4gVar.c);
                    }
                    ua5 ua5Var = t4gVar.a;
                    if (ua5Var.c == ua5Var.d) {
                        return new n2g(new vxf(ji7.OTP_MAX_RETRIES_REACHED));
                    }
                    if (!t4gVar.b) {
                        return new n2g(new vxf(ji7.OTP_INCORRECT_CODE));
                    }
                    String str4 = t4gVar.c;
                    if (str4 != null && !StringsKt.T(str4)) {
                        return new n2g(new vxf(ji7.UNKNOWN));
                    }
                    return new n2g(new vxf(ji7.BLANK_CLIENT_TOKEN));
                }
                if (p2gVar instanceof n2g) {
                    return p2gVar;
                }
                dmk.a();
                return null;
            }
        }
        u4gVar = new u4g(this, q55Var);
        Object obj2 = u4gVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = u4gVar.m;
        if (i == 0) {
        }
        p2gVar = (p2g) obj2;
        if (!(p2gVar instanceof o2g)) {
        }
    }
}
