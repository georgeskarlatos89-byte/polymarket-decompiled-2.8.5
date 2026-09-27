package defpackage;

import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fc6 {
    public final ei5 a;
    public final j47 b;

    public fc6(ei5 ei5Var, j47 j47Var) {
        ei5Var.getClass();
        j47Var.getClass();
        this.a = ei5Var;
        this.b = j47Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, q55 q55Var) {
        ec6 ec6Var;
        int i;
        kh5 kh5Var;
        if (q55Var instanceof ec6) {
            ec6Var = (ec6) q55Var;
            int i2 = ec6Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ec6Var.m = i2 - Integer.MIN_VALUE;
                Object obj = ec6Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ec6Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    ec6Var.m = 1;
                    obj = ((sh5) this.a).d(str, str2, ec6Var);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                kh5Var = (kh5) obj;
                if (kh5Var != null) {
                    return null;
                }
                return kh5Var.i;
            }
        }
        ec6Var = new ec6(this, q55Var);
        Object obj2 = ec6Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ec6Var.m;
        if (i == 0) {
        }
        kh5Var = (kh5) obj2;
        if (kh5Var != null) {
        }
    }
}
