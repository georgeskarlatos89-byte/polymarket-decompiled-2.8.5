package defpackage;

import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ip0 {
    public static final List b = eb4.c("payment_method");
    public final i5i a;

    public ip0(i5i i5iVar) {
        this.a = i5iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, q55 q55Var) {
        gp0 gp0Var;
        int i;
        Object m882constructorimpl;
        Object b2;
        try {
            if (q55Var instanceof gp0) {
                gp0Var = (gp0) q55Var;
                int i2 = gp0Var.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gp0Var.m = i2 - Integer.MIN_VALUE;
                    gp0 gp0Var2 = gp0Var;
                    Object obj = gp0Var2.k;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = gp0Var2.m;
                    if (i == 0) {
                        if (i == 1) {
                            ResultKt.a(obj);
                            b2 = ((Result) obj).a;
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ResultKt.a(obj);
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            m882constructorimpl = Result.m882constructorimpl(new d4e(str3));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
                        }
                        if (!(m882constructorimpl instanceof r5g)) {
                            d4e d4eVar = (d4e) m882constructorimpl;
                            i5i i5iVar = this.a;
                            String str5 = d4eVar.a;
                            String str6 = d4eVar.b;
                            yd0 yd0Var = new yd0(str, str4, 4);
                            List list = b;
                            gp0Var2.m = 1;
                            b2 = i5iVar.b(str5, str6, str2, yd0Var, list, gp0Var2);
                            if (b2 == u85Var) {
                                return u85Var;
                            }
                        } else {
                            return Result.m882constructorimpl(m882constructorimpl);
                        }
                    }
                    ResultKt.a(b2);
                    return Result.m882constructorimpl((l4e) b2);
                }
            }
            if (i == 0) {
            }
            ResultKt.a(b2);
            return Result.m882constructorimpl((l4e) b2);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m882constructorimpl(ResultKt.createFailure(th2));
        }
        gp0Var = new gp0(this, q55Var);
        gp0 gp0Var22 = gp0Var;
        Object obj2 = gp0Var22.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = gp0Var22.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, String str4, q55 q55Var) {
        hp0 hp0Var;
        int i;
        Object m882constructorimpl;
        Object c;
        try {
            if (q55Var instanceof hp0) {
                hp0Var = (hp0) q55Var;
                int i2 = hp0Var.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hp0Var.m = i2 - Integer.MIN_VALUE;
                    hp0 hp0Var2 = hp0Var;
                    Object obj = hp0Var2.k;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = hp0Var2.m;
                    if (i == 0) {
                        if (i == 1) {
                            ResultKt.a(obj);
                            c = ((Result) obj).a;
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ResultKt.a(obj);
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            m882constructorimpl = Result.m882constructorimpl(new h0h(str3));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
                        }
                        if (!(m882constructorimpl instanceof r5g)) {
                            h0h h0hVar = (h0h) m882constructorimpl;
                            i5i i5iVar = this.a;
                            String str5 = h0hVar.a;
                            String str6 = h0hVar.b;
                            yd0 yd0Var = new yd0(str, str4, 4);
                            List list = b;
                            hp0Var2.m = 1;
                            c = i5iVar.c(str5, str6, str2, yd0Var, list, hp0Var2);
                            if (c == u85Var) {
                                return u85Var;
                            }
                        } else {
                            return Result.m882constructorimpl(m882constructorimpl);
                        }
                    }
                    ResultKt.a(c);
                    return Result.m882constructorimpl((l0h) c);
                }
            }
            if (i == 0) {
            }
            ResultKt.a(c);
            return Result.m882constructorimpl((l0h) c);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m882constructorimpl(ResultKt.createFailure(th2));
        }
        hp0Var = new hp0(this, q55Var);
        hp0 hp0Var22 = hp0Var;
        Object obj2 = hp0Var22.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = hp0Var22.m;
    }
}
