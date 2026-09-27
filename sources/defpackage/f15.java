package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f15 {
    public final l2d a;
    public final String b;

    public f15(l2d l2dVar, uxf uxfVar) {
        String str;
        l2dVar.getClass();
        uxfVar.getClass();
        this.a = l2dVar;
        uxfVar.getClass();
        int i = vt7.a[uxfVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "devices.api.checkout.com";
            } else {
                dmk.a();
                throw null;
            }
        } else {
            str = "devices.api.sandbox.checkout.com";
        }
        this.b = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(1:(2:11|(2:13|14)(2:16|17))(2:18|19))(2:20|21))(6:30|31|32|(4:34|35|36|37)(4:44|45|46|47)|38|(2:40|27)(1:41))|22|23|24|25))|7|(0)(0)|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f4, code lost:
    
        if (r13 != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ra5 ra5Var, q55 q55Var) {
        c15 c15Var;
        int i;
        wka wkaVar;
        int i2;
        wka wkaVar2;
        try {
            if (q55Var instanceof c15) {
                c15Var = (c15) q55Var;
                int i3 = c15Var.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c15Var.n = i3 - Integer.MIN_VALUE;
                    Object obj = c15Var.l;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = c15Var.n;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                ResultKt.a(obj);
                                if (obj != null) {
                                    return new o2g((ua5) obj);
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse");
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = c15Var.k;
                        ResultKt.a(obj);
                    } else {
                        ResultKt.a(obj);
                        l2d l2dVar = this.a;
                        String str = this.b;
                        jg9 jg9Var = jg9.c;
                        se9 se9Var = (se9) l2dVar.c.getValue();
                        ah9 ah9Var = new ah9();
                        jg9Var.getClass();
                        ah9Var.b = jg9Var;
                        r59 r59Var = ah9Var.c;
                        r59Var.w0("Cko-Service-Name", l2dVar.a);
                        r59Var.w0("Cko-Service-Version", l2dVar.b);
                        qkj qkjVar = ah9Var.a;
                        ykj ykjVar = ykj.d;
                        ykjVar.getClass();
                        qkjVar.d = ykjVar;
                        qkjVar.a = str;
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(r84.f(3, new String[]{"authentication/challenges"}[0]));
                        qkjVar.h = arrayList;
                        t1m.d(ah9Var, u45.a);
                        if (ra5Var == null) {
                            ah9Var.d = ocd.a;
                            KClass orCreateKotlinClass = lvf.a.getOrCreateKotlinClass(ra5.class);
                            try {
                                wkaVar2 = lvf.a(ra5.class);
                            } catch (Throwable unused) {
                                wkaVar2 = null;
                            }
                            ah9Var.a(new zgj(orCreateKotlinClass, wkaVar2));
                        } else {
                            ah9Var.d = ra5Var;
                            KClass orCreateKotlinClass2 = lvf.a.getOrCreateKotlinClass(ra5.class);
                            try {
                                wkaVar = lvf.a(ra5.class);
                            } catch (Throwable unused2) {
                                wkaVar = null;
                            }
                            ah9Var.a(new zgj(orCreateKotlinClass2, wkaVar));
                        }
                        a35 a35Var = new a35(ah9Var, se9Var);
                        c15Var.k = 0;
                        c15Var.n = 1;
                        obj = a35Var.d(c15Var);
                        if (obj != u85Var) {
                            i2 = 0;
                        } else {
                            return u85Var;
                        }
                    }
                    ue9 b = ((gh9) obj).b();
                    KClass orCreateKotlinClass3 = lvf.a.getOrCreateKotlinClass(ua5.class);
                    wka wkaVar3 = lvf.a(ua5.class);
                    zgj zgjVar = new zgj(orCreateKotlinClass3, wkaVar3);
                    c15Var.k = i2;
                    c15Var.n = 2;
                    obj = b.a(zgjVar, c15Var);
                }
            }
            if (i == 0) {
            }
            ue9 b2 = ((gh9) obj).b();
            KClass orCreateKotlinClass32 = lvf.a.getOrCreateKotlinClass(ua5.class);
            wka wkaVar32 = lvf.a(ua5.class);
            zgj zgjVar2 = new zgj(orCreateKotlinClass32, wkaVar32);
            c15Var.k = i2;
            c15Var.n = 2;
            obj = b2.a(zgjVar2, c15Var);
        } catch (c5g e) {
            return new n2g(e.a.f(), e);
        } catch (Exception e2) {
            return new n2g(null, e2);
        }
        c15Var = new c15(this, q55Var);
        Object obj2 = c15Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = c15Var.n;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(1:(2:11|(2:13|14)(2:16|17))(2:18|19))(2:20|21))(6:30|31|32|33|34|(2:36|27)(1:37))|22|23|24|25))|7|(0)(0)|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
    
        if (r13 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d0, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, q55 q55Var) {
        d15 d15Var;
        int i;
        wka wkaVar;
        int i2;
        try {
            if (q55Var instanceof d15) {
                d15Var = (d15) q55Var;
                int i3 = d15Var.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    d15Var.n = i3 - Integer.MIN_VALUE;
                    Object obj = d15Var.l;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = d15Var.n;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                ResultKt.a(obj);
                                if (obj != null) {
                                    return new o2g((kc5) obj);
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.checkout.components.kmp.rememberme.data.model.CreateHintResponse");
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = d15Var.k;
                        ResultKt.a(obj);
                    } else {
                        ResultKt.a(obj);
                        l2d l2dVar = this.a;
                        String str2 = this.b;
                        jg9 jg9Var = jg9.c;
                        hc5 hc5Var = new hc5(str);
                        se9 se9Var = (se9) l2dVar.c.getValue();
                        ah9 ah9Var = new ah9();
                        jg9Var.getClass();
                        ah9Var.b = jg9Var;
                        r59 r59Var = ah9Var.c;
                        r59Var.w0("Cko-Service-Name", l2dVar.a);
                        r59Var.w0("Cko-Service-Version", l2dVar.b);
                        qkj qkjVar = ah9Var.a;
                        ykj ykjVar = ykj.d;
                        ykjVar.getClass();
                        qkjVar.d = ykjVar;
                        qkjVar.a = str2;
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(r84.f(3, new String[]{"authentication/hints"}[0]));
                        qkjVar.h = arrayList;
                        t1m.d(ah9Var, u45.a);
                        ah9Var.d = hc5Var;
                        KClass orCreateKotlinClass = lvf.a.getOrCreateKotlinClass(hc5.class);
                        try {
                            wkaVar = lvf.a(hc5.class);
                        } catch (Throwable unused) {
                            wkaVar = null;
                        }
                        ah9Var.a(new zgj(orCreateKotlinClass, wkaVar));
                        a35 a35Var = new a35(ah9Var, se9Var);
                        d15Var.k = 0;
                        d15Var.n = 1;
                        obj = a35Var.d(d15Var);
                        if (obj != u85Var) {
                            i2 = 0;
                        } else {
                            return u85Var;
                        }
                    }
                    ue9 b = ((gh9) obj).b();
                    KClass orCreateKotlinClass2 = lvf.a.getOrCreateKotlinClass(kc5.class);
                    wka wkaVar2 = lvf.a(kc5.class);
                    zgj zgjVar = new zgj(orCreateKotlinClass2, wkaVar2);
                    d15Var.k = i2;
                    d15Var.n = 2;
                    obj = b.a(zgjVar, d15Var);
                }
            }
            if (i == 0) {
            }
            ue9 b2 = ((gh9) obj).b();
            KClass orCreateKotlinClass22 = lvf.a.getOrCreateKotlinClass(kc5.class);
            wka wkaVar22 = lvf.a(kc5.class);
            zgj zgjVar2 = new zgj(orCreateKotlinClass22, wkaVar22);
            d15Var.k = i2;
            d15Var.n = 2;
            obj = b2.a(zgjVar2, d15Var);
        } catch (c5g e) {
            return new n2g(e.a.f(), e);
        } catch (Exception e2) {
            return new n2g(null, e2);
        }
        d15Var = new d15(this, q55Var);
        Object obj2 = d15Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = d15Var.n;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(1:(2:11|(2:13|14)(2:16|17))(2:18|19))(2:20|21))(6:30|31|32|(4:34|35|36|37)(4:44|45|46|47)|38|(2:40|27)(1:41))|22|23|24|25))|7|(0)(0)|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0108, code lost:
    
        if (r13 != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fa, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, q4g q4gVar, q55 q55Var) {
        e15 e15Var;
        int i;
        wka wkaVar;
        int i2;
        wka wkaVar2;
        try {
            if (q55Var instanceof e15) {
                e15Var = (e15) q55Var;
                int i3 = e15Var.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    e15Var.n = i3 - Integer.MIN_VALUE;
                    Object obj = e15Var.l;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = e15Var.n;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                ResultKt.a(obj);
                                if (obj != null) {
                                    return new o2g((t4g) obj);
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.checkout.components.kmp.rememberme.data.model.RespondChallengeResponse");
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = e15Var.k;
                        ResultKt.a(obj);
                    } else {
                        ResultKt.a(obj);
                        l2d l2dVar = this.a;
                        String str2 = this.b;
                        str.getClass();
                        String str3 = "authentication/challenges/" + str + "/respond";
                        jg9 jg9Var = jg9.c;
                        se9 se9Var = (se9) l2dVar.c.getValue();
                        ah9 ah9Var = new ah9();
                        jg9Var.getClass();
                        ah9Var.b = jg9Var;
                        r59 r59Var = ah9Var.c;
                        r59Var.w0("Cko-Service-Name", l2dVar.a);
                        r59Var.w0("Cko-Service-Version", l2dVar.b);
                        qkj qkjVar = ah9Var.a;
                        ykj ykjVar = ykj.d;
                        ykjVar.getClass();
                        qkjVar.d = ykjVar;
                        qkjVar.a = str2;
                        String[] strArr = {str3};
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(r84.f(3, strArr[0]));
                        qkjVar.h = arrayList;
                        t1m.d(ah9Var, u45.a);
                        if (q4gVar == null) {
                            ah9Var.d = ocd.a;
                            KClass orCreateKotlinClass = lvf.a.getOrCreateKotlinClass(q4g.class);
                            try {
                                wkaVar2 = lvf.a(q4g.class);
                            } catch (Throwable unused) {
                                wkaVar2 = null;
                            }
                            ah9Var.a(new zgj(orCreateKotlinClass, wkaVar2));
                        } else {
                            ah9Var.d = q4gVar;
                            KClass orCreateKotlinClass2 = lvf.a.getOrCreateKotlinClass(q4g.class);
                            try {
                                wkaVar = lvf.a(q4g.class);
                            } catch (Throwable unused2) {
                                wkaVar = null;
                            }
                            ah9Var.a(new zgj(orCreateKotlinClass2, wkaVar));
                        }
                        a35 a35Var = new a35(ah9Var, se9Var);
                        e15Var.k = 0;
                        e15Var.n = 1;
                        obj = a35Var.d(e15Var);
                        if (obj != u85Var) {
                            i2 = 0;
                        } else {
                            return u85Var;
                        }
                    }
                    ue9 b = ((gh9) obj).b();
                    KClass orCreateKotlinClass3 = lvf.a.getOrCreateKotlinClass(t4g.class);
                    wka wkaVar3 = lvf.a(t4g.class);
                    zgj zgjVar = new zgj(orCreateKotlinClass3, wkaVar3);
                    e15Var.k = i2;
                    e15Var.n = 2;
                    obj = b.a(zgjVar, e15Var);
                }
            }
            if (i == 0) {
            }
            ue9 b2 = ((gh9) obj).b();
            KClass orCreateKotlinClass32 = lvf.a.getOrCreateKotlinClass(t4g.class);
            wka wkaVar32 = lvf.a(t4g.class);
            zgj zgjVar2 = new zgj(orCreateKotlinClass32, wkaVar32);
            e15Var.k = i2;
            e15Var.n = 2;
            obj = b2.a(zgjVar2, e15Var);
        } catch (c5g e) {
            return new n2g(e.a.f(), e);
        } catch (Exception e2) {
            return new n2g(null, e2);
        }
        e15Var = new e15(this, q55Var);
        Object obj2 = e15Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = e15Var.n;
    }
}
