package defpackage;

import kotlin.ResultKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class g3j {
    public static final Object a(d3j d3jVar, Function2 function2) {
        xym.j(d3jVar, true, new mw6(lvn.d(d3jVar.e.getContext()).N(d3jVar.f, d3jVar, d3jVar.d)));
        return izm.h(d3jVar, false, d3jVar, function2);
    }

    public static final Object b(long j, Function2 function2, q55 q55Var) {
        if (j > 0) {
            Object a = a(new d3j(j, q55Var), function2);
            u85 u85Var = u85.COROUTINE_SUSPENDED;
            return a;
        }
        throw new c3j(null, "Timed out immediately");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(long j, Function2 function2, q55 q55Var) {
        f3j f3jVar;
        int i;
        Ref.ObjectRef objectRef;
        if (q55Var instanceof f3j) {
            f3j f3jVar2 = (f3j) q55Var;
            int i2 = f3jVar2.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f3jVar2.m = i2 - Integer.MIN_VALUE;
                f3jVar = f3jVar2;
                Object obj = f3jVar.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = f3jVar.m;
                if (i == 0) {
                    if (i == 1) {
                        objectRef = f3jVar.k;
                        try {
                            ResultKt.a(obj);
                            return obj;
                        } catch (c3j e) {
                            e = e;
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    if (j > 0) {
                        ?? obj2 = new Object();
                        try {
                            f3jVar.k = obj2;
                            f3jVar.m = 1;
                            d3j d3jVar = new d3j(j, f3jVar);
                            obj2.a = d3jVar;
                            Object a = a(d3jVar, function2);
                            if (a == u85Var) {
                                return u85Var;
                            }
                            return a;
                        } catch (c3j e2) {
                            e = e2;
                            objectRef = obj2;
                        }
                    }
                    return null;
                }
                if (e.a != objectRef.a) {
                    throw e;
                }
                return null;
            }
        }
        f3jVar = new q55(q55Var);
        Object obj3 = f3jVar.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = f3jVar.m;
        if (i == 0) {
        }
        if (e.a != objectRef.a) {
        }
        return null;
    }

    public static final Object d(long j, Function2 function2, q55 q55Var) {
        return c(lvn.h(j), function2, q55Var);
    }
}
