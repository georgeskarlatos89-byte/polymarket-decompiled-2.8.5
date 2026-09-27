package defpackage;

import java.util.List;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e06 {
    public final ss9 a;
    public final l43 b;
    public final ts9 c;
    public final tm6 d;

    public e06(ss9 ss9Var, l43 l43Var, e3g e3gVar, ts9 ts9Var) {
        this.a = ss9Var;
        this.b = l43Var;
        this.c = ts9Var;
        this.d = epl.g((epf) ss9Var.c, l43Var.b(), (epf) e3gVar.b, new on4(25));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        if (r11 != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(k73 k73Var, q55 q55Var) {
        d06 d06Var;
        Object obj;
        int i;
        k73 k73Var2;
        int i2;
        int i3;
        k73 k73Var3;
        List list;
        if (q55Var instanceof d06) {
            d06Var = (d06) q55Var;
            int i4 = d06Var.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                d06Var.o = i4 - Integer.MIN_VALUE;
                obj = d06Var.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = d06Var.o;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    ResultKt.a(obj);
                                    return (List) obj;
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = d06Var.l;
                            k73Var3 = d06Var.k;
                            ResultKt.a(obj);
                            list = (List) obj;
                            if (list != null) {
                                if (list.isEmpty()) {
                                    list = null;
                                }
                                if (list != null) {
                                    return list;
                                }
                            }
                            d06Var.k = null;
                            d06Var.l = i3;
                            d06Var.o = 4;
                            obj = wd6.a(k73Var3);
                        } else {
                            i3 = d06Var.l;
                            k73Var3 = d06Var.k;
                            ResultKt.a(obj);
                            list = (List) obj;
                            if (list != null) {
                            }
                            d06Var.k = null;
                            d06Var.l = i3;
                            d06Var.o = 4;
                            obj = wd6.a(k73Var3);
                        }
                    } else {
                        i2 = d06Var.l;
                        k73Var2 = d06Var.k;
                        ResultKt.a(obj);
                    }
                } else {
                    ResultKt.a(obj);
                    de1 de1Var = k73Var.g;
                    if (de1Var == null) {
                        return null;
                    }
                    d06Var.k = k73Var;
                    d06Var.l = 0;
                    d06Var.o = 1;
                    obj = Boolean.valueOf(this.c.a.containsKey(de1Var));
                    if (obj != u85Var) {
                        k73Var2 = k73Var;
                        i2 = 0;
                    }
                    return u85Var;
                }
                if (!((Boolean) obj).booleanValue()) {
                    d06Var.k = k73Var2;
                    d06Var.l = i2;
                    d06Var.o = 2;
                    obj = this.a.i(k73Var2, d06Var);
                    if (obj != u85Var) {
                        i3 = i2;
                        k73Var3 = k73Var2;
                        list = (List) obj;
                        if (list != null) {
                        }
                        d06Var.k = null;
                        d06Var.l = i3;
                        d06Var.o = 4;
                        obj = wd6.a(k73Var3);
                    }
                } else {
                    d06Var.k = k73Var2;
                    d06Var.l = i2;
                    d06Var.o = 3;
                    obj = this.b.i(k73Var2, d06Var);
                    if (obj != u85Var) {
                        i3 = i2;
                        k73Var3 = k73Var2;
                        list = (List) obj;
                        if (list != null) {
                        }
                        d06Var.k = null;
                        d06Var.l = i3;
                        d06Var.o = 4;
                        obj = wd6.a(k73Var3);
                    }
                }
                return u85Var;
            }
        }
        d06Var = new d06(this, q55Var);
        obj = d06Var.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = d06Var.o;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return u85Var2;
    }
}
