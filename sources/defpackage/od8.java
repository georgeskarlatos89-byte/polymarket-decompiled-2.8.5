package defpackage;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class od8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Flow flow, Continuation continuation) {
        jd8 jd8Var;
        int i;
        uk ukVar;
        Ref.ObjectRef objectRef;
        i0 e;
        gd8 gd8Var;
        Object obj;
        if (continuation instanceof jd8) {
            jd8 jd8Var2 = (jd8) continuation;
            int i2 = jd8Var2.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jd8Var2.n = i2 - Integer.MIN_VALUE;
                jd8Var = jd8Var2;
                Object obj2 = jd8Var.m;
                Object obj3 = u85.COROUTINE_SUSPENDED;
                i = jd8Var.n;
                ukVar = xmm.a;
                if (i == 0) {
                    if (i == 1) {
                        gd8Var = jd8Var.l;
                        objectRef = jd8Var.k;
                        try {
                            ResultKt.a(obj2);
                        } catch (i0 e2) {
                            e = e2;
                            if (e.a != gd8Var) {
                            }
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    ?? obj4 = new Object();
                    obj4.a = ukVar;
                    gd8 gd8Var2 = new gd8(obj4, 0);
                    try {
                        jd8Var.k = obj4;
                        jd8Var.l = gd8Var2;
                        jd8Var.n = 1;
                        if (flow.collect(gd8Var2, jd8Var) == obj3) {
                            return obj3;
                        }
                        objectRef = obj4;
                    } catch (i0 e3) {
                        objectRef = obj4;
                        e = e3;
                        gd8Var = gd8Var2;
                        if (e.a != gd8Var) {
                            xym.g(jd8Var.getContext());
                            obj = objectRef.a;
                            if (obj != ukVar) {
                            }
                        } else {
                            throw e;
                        }
                    }
                }
                obj = objectRef.a;
                if (obj != ukVar) {
                    return obj;
                }
                ahh.i("Expected at least one element");
                return null;
            }
        }
        jd8Var = new q55(continuation);
        Object obj22 = jd8Var.m;
        Object obj32 = u85.COROUTINE_SUSPENDED;
        i = jd8Var.n;
        ukVar = xmm.a;
        if (i == 0) {
        }
        obj = objectRef.a;
        if (obj != ukVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(Flow flow, Function2 function2, Continuation continuation) {
        kd8 kd8Var;
        int i;
        uk ukVar;
        Ref.ObjectRef objectRef;
        i0 e;
        id8 id8Var;
        Object obj;
        if (continuation instanceof kd8) {
            kd8 kd8Var2 = (kd8) continuation;
            int i2 = kd8Var2.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kd8Var2.n = i2 - Integer.MIN_VALUE;
                kd8Var = kd8Var2;
                Object obj2 = kd8Var.m;
                Object obj3 = u85.COROUTINE_SUSPENDED;
                i = kd8Var.n;
                ukVar = xmm.a;
                if (i == 0) {
                    if (i == 1) {
                        id8Var = kd8Var.l;
                        objectRef = kd8Var.k;
                        try {
                            ResultKt.a(obj2);
                        } catch (i0 e2) {
                            e = e2;
                            if (e.a != id8Var) {
                            }
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    ?? obj4 = new Object();
                    obj4.a = ukVar;
                    id8 id8Var2 = new id8(function2, obj4, 0);
                    try {
                        kd8Var.k = obj4;
                        kd8Var.l = id8Var2;
                        kd8Var.n = 1;
                        if (flow.collect(id8Var2, kd8Var) == obj3) {
                            return obj3;
                        }
                        objectRef = obj4;
                    } catch (i0 e3) {
                        objectRef = obj4;
                        e = e3;
                        id8Var = id8Var2;
                        if (e.a != id8Var) {
                            xym.g(kd8Var.getContext());
                            obj = objectRef.a;
                            if (obj != ukVar) {
                            }
                        } else {
                            throw e;
                        }
                    }
                }
                obj = objectRef.a;
                if (obj != ukVar) {
                    return obj;
                }
                ahh.i("Expected at least one element matching the predicate");
                return null;
            }
        }
        kd8Var = new q55(continuation);
        Object obj22 = kd8Var.m;
        Object obj32 = u85.COROUTINE_SUSPENDED;
        i = kd8Var.n;
        ukVar = xmm.a;
        if (i == 0) {
        }
        obj = objectRef.a;
        if (obj != ukVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(Flow flow, q55 q55Var) {
        md8 md8Var;
        int i;
        Ref.ObjectRef objectRef;
        i0 e;
        gd8 gd8Var;
        if (q55Var instanceof md8) {
            md8 md8Var2 = (md8) q55Var;
            int i2 = md8Var2.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                md8Var2.n = i2 - Integer.MIN_VALUE;
                md8Var = md8Var2;
                Object obj = md8Var.m;
                Object obj2 = u85.COROUTINE_SUSPENDED;
                i = md8Var.n;
                if (i == 0) {
                    if (i == 1) {
                        gd8Var = md8Var.l;
                        objectRef = md8Var.k;
                        try {
                            ResultKt.a(obj);
                        } catch (i0 e2) {
                            e = e2;
                            if (e.a != gd8Var) {
                                xym.g(md8Var.getContext());
                                return objectRef.a;
                            }
                            throw e;
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    ?? obj3 = new Object();
                    gd8 gd8Var2 = new gd8(obj3, 1);
                    try {
                        md8Var.k = obj3;
                        md8Var.l = gd8Var2;
                        md8Var.n = 1;
                        if (flow.collect(gd8Var2, md8Var) == obj2) {
                            return obj2;
                        }
                        objectRef = obj3;
                    } catch (i0 e3) {
                        objectRef = obj3;
                        e = e3;
                        gd8Var = gd8Var2;
                        if (e.a != gd8Var) {
                        }
                    }
                }
                return objectRef.a;
            }
        }
        md8Var = new q55(q55Var);
        Object obj4 = md8Var.m;
        Object obj22 = u85.COROUTINE_SUSPENDED;
        i = md8Var.n;
        if (i == 0) {
        }
        return objectRef.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(Flow flow, Function2 function2, q55 q55Var) {
        nd8 nd8Var;
        int i;
        Ref.ObjectRef objectRef;
        i0 e;
        id8 id8Var;
        if (q55Var instanceof nd8) {
            nd8 nd8Var2 = (nd8) q55Var;
            int i2 = nd8Var2.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nd8Var2.n = i2 - Integer.MIN_VALUE;
                nd8Var = nd8Var2;
                Object obj = nd8Var.m;
                Object obj2 = u85.COROUTINE_SUSPENDED;
                i = nd8Var.n;
                if (i == 0) {
                    if (i == 1) {
                        id8Var = nd8Var.l;
                        objectRef = nd8Var.k;
                        try {
                            ResultKt.a(obj);
                        } catch (i0 e2) {
                            e = e2;
                            if (e.a != id8Var) {
                                xym.g(nd8Var.getContext());
                                return objectRef.a;
                            }
                            throw e;
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    ?? obj3 = new Object();
                    id8 id8Var2 = new id8(function2, obj3, 1);
                    try {
                        nd8Var.k = obj3;
                        nd8Var.l = id8Var2;
                        nd8Var.n = 1;
                        if (flow.collect(id8Var2, nd8Var) == obj2) {
                            return obj2;
                        }
                        objectRef = obj3;
                    } catch (i0 e3) {
                        objectRef = obj3;
                        e = e3;
                        id8Var = id8Var2;
                        if (e.a != id8Var) {
                        }
                    }
                }
                return objectRef.a;
            }
        }
        nd8Var = new q55(q55Var);
        Object obj4 = nd8Var.m;
        Object obj22 = u85.COROUTINE_SUSPENDED;
        i = nd8Var.n;
        if (i == 0) {
        }
        return objectRef.a;
    }
}
