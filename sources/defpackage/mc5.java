package defpackage;

import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mc5 {
    public final f15 a;
    public final ed3 b;
    public final au0 c;

    public mc5(f15 f15Var, ed3 ed3Var, au0 au0Var) {
        f15Var.getClass();
        ed3Var.getClass();
        au0Var.getClass();
        this.a = f15Var;
        this.b = ed3Var;
        this.c = au0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, q55 q55Var) {
        lc5 lc5Var;
        int i;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        p2g p2gVar;
        Object value6;
        Object value7;
        Object value8;
        if (q55Var instanceof lc5) {
            lc5Var = (lc5) q55Var;
            int i2 = lc5Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lc5Var.n = i2 - Integer.MIN_VALUE;
                Object obj = lc5Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = lc5Var.n;
                au0 au0Var = this.c;
                if (i == 0) {
                    if (i == 1) {
                        str = lc5Var.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    str.getClass();
                    if (!new Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$").d(str)) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m882constructorimpl(ResultKt.createFailure(new Throwable("Invalid email format")));
                    }
                    uwh uwhVar = au0Var.a;
                    do {
                        value = uwhVar.getValue();
                    } while (!uwhVar.k(value, ""));
                    uwh uwhVar2 = au0Var.c;
                    do {
                        value2 = uwhVar2.getValue();
                    } while (!uwhVar2.k(value2, ""));
                    uwh uwhVar3 = au0Var.e;
                    do {
                        value3 = uwhVar3.getValue();
                    } while (!uwhVar3.k(value3, CollectionsKt.emptyList()));
                    ed3 ed3Var = this.b;
                    uwh uwhVar4 = ed3Var.a;
                    do {
                        value4 = uwhVar4.getValue();
                    } while (!uwhVar4.k(value4, null));
                    uwh uwhVar5 = ed3Var.c;
                    do {
                        value5 = uwhVar5.getValue();
                    } while (!uwhVar5.k(value5, null));
                    lc5Var.k = str;
                    lc5Var.n = 1;
                    obj = this.a.b(str, lc5Var);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                p2gVar = (p2g) obj;
                if (!(p2gVar instanceof o2g)) {
                    au0Var.getClass();
                    str.getClass();
                    uwh uwhVar6 = au0Var.a;
                    do {
                        value6 = uwhVar6.getValue();
                    } while (!uwhVar6.k(value6, str));
                    kc5 kc5Var = (kc5) ((o2g) p2gVar).a;
                    String str2 = kc5Var.a;
                    str2.getClass();
                    uwh uwhVar7 = au0Var.c;
                    do {
                        value7 = uwhVar7.getValue();
                    } while (!uwhVar7.k(value7, str2));
                    List list = kc5Var.b;
                    list.getClass();
                    uwh uwhVar8 = au0Var.e;
                    do {
                        value8 = uwhVar8.getValue();
                    } while (!uwhVar8.k(value8, list));
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m882constructorimpl(Boolean.TRUE);
                }
                if (p2gVar instanceof n2g) {
                    n2g n2gVar = (n2g) p2gVar;
                    wh9 wh9Var = n2gVar.a;
                    if (wh9Var != null && wh9Var.a == wh9.h.a) {
                        Result.Companion companion3 = Result.INSTANCE;
                        return Result.m882constructorimpl(Boolean.FALSE);
                    }
                    Result.Companion companion4 = Result.INSTANCE;
                    return Result.m882constructorimpl(ResultKt.createFailure(n2gVar.b));
                }
                dmk.a();
                return null;
            }
        }
        lc5Var = new lc5(this, q55Var);
        Object obj2 = lc5Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = lc5Var.n;
        au0 au0Var2 = this.c;
        if (i == 0) {
        }
        p2gVar = (p2g) obj2;
        if (!(p2gVar instanceof o2g)) {
        }
    }
}
