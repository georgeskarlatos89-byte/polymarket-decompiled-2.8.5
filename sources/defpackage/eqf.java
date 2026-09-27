package defpackage;

import android.os.Parcelable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class eqf {
    public final pn5 a;
    public final uwh b;
    public final tm6 c;
    public final tm6 d;

    public eqf(pn5 pn5Var) {
        pn5Var.getClass();
        this.a = pn5Var;
        uwh a = n0n.a(null);
        this.b = a;
        tm6 i = epl.i(a, new zhf(9));
        this.c = i;
        this.d = epl.j(i, new zhf(10));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bdb bdbVar, String str, j6e j6eVar, q55 q55Var) {
        aqf aqfVar;
        int i;
        if (q55Var instanceof aqf) {
            aqfVar = (aqf) q55Var;
            int i2 = aqfVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aqfVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aqfVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = aqfVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                        return ((Result) obj).a;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                j9b a = c(bdbVar).a();
                aqfVar.m = 1;
                Object e = ((s76) a).e(str, j6eVar, aqfVar);
                if (e == u85Var) {
                    return u85Var;
                }
                return e;
            }
        }
        aqfVar = new aqf(this, q55Var);
        Object obj2 = aqfVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = aqfVar.m;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[Catch: all -> 0x0081, TRY_ENTER, TryCatch #0 {all -> 0x0081, blocks: (B:11:0x0027, B:12:0x0076, B:13:0x007c, B:22:0x0061, B:24:0x0067), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(bdb bdbVar, c7e c7eVar, q55 q55Var) {
        bqf bqfVar;
        int i;
        Object c;
        Object obj;
        Object s;
        Parcelable parcelable;
        try {
            if (q55Var instanceof bqf) {
                bqfVar = (bqf) q55Var;
                int i2 = bqfVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bqfVar.o = i2 - Integer.MIN_VALUE;
                    Object obj2 = bqfVar.m;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = bqfVar.o;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                ResultKt.a(obj2);
                                s = ((Result) obj2).a;
                                ResultKt.a(s);
                                parcelable = (hgb) s;
                                return Result.m882constructorimpl(parcelable);
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj3 = bqfVar.l;
                        bdbVar = bqfVar.k;
                        ResultKt.a(obj2);
                        c = ((Result) obj2).a;
                        obj = obj3;
                    } else {
                        ResultKt.a(obj2);
                        j9b a = c(bdbVar).a();
                        bqfVar.k = bdbVar;
                        bqfVar.l = a;
                        bqfVar.o = 1;
                        s76 s76Var = (s76) a;
                        c = s76Var.c(c7eVar, bqfVar);
                        obj = s76Var;
                    }
                    Result.Companion companion = Result.INSTANCE;
                    if (c instanceof r5g) {
                        dgb dgbVar = (dgb) c;
                        parcelable = dgbVar;
                        if (bdbVar.h) {
                            bqfVar.k = null;
                            bqfVar.l = null;
                            bqfVar.o = 2;
                            s = ((s76) obj).s(dgbVar, bqfVar);
                        }
                        return Result.m882constructorimpl(parcelable);
                    }
                    return Result.m882constructorimpl(c);
                }
            }
            if (i == 0) {
            }
            Result.Companion companion2 = Result.INSTANCE;
            if (c instanceof r5g) {
            }
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        bqfVar = new bqf(this, q55Var);
        Object obj22 = bqfVar.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = bqfVar.o;
    }

    public final qn5 c(bdb bdbVar) {
        qn5 qn5Var;
        bdb bdbVar2;
        uwh uwhVar = this.b;
        qn5 qn5Var2 = (qn5) uwhVar.getValue();
        if (qn5Var2 != null) {
            switch (qn5Var2.a) {
                case 0:
                    bdbVar2 = qn5Var2.b;
                    break;
                case 1:
                    bdbVar2 = qn5Var2.b;
                    break;
                case 2:
                    bdbVar2 = qn5Var2.b;
                    break;
                default:
                    bdbVar2 = qn5Var2.b;
                    break;
            }
            if (!Intrinsics.areEqual(bdbVar2, bdbVar)) {
                qn5Var2 = null;
            }
            if (qn5Var2 != null) {
                return qn5Var2;
            }
        }
        pn5 pn5Var = this.a;
        switch (pn5Var.a) {
            case 0:
                bdbVar.getClass();
                qn5Var = new qn5((mn5) pn5Var.b, bdbVar);
                break;
            case 1:
                bdbVar.getClass();
                qn5Var = new qn5((tn5) pn5Var.b, bdbVar);
                break;
            case 2:
                bdbVar.getClass();
                qn5Var = new qn5((vn5) pn5Var.b, bdbVar);
                break;
            default:
                bdbVar.getClass();
                qn5Var = new qn5((xn5) pn5Var.b, bdbVar);
                break;
        }
        uwhVar.m(null, qn5Var);
        return qn5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(bdb bdbVar, q55 q55Var) {
        cqf cqfVar;
        int i;
        if (q55Var instanceof cqf) {
            cqfVar = (cqf) q55Var;
            int i2 = cqfVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cqfVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cqfVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = cqfVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                        return ((Result) obj).a;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                j9b a = c(bdbVar).a();
                cqfVar.m = 1;
                Object j = ((s76) a).j(cqfVar);
                if (j == u85Var) {
                    return u85Var;
                }
                return j;
            }
        }
        cqfVar = new cqf(this, q55Var);
        Object obj2 = cqfVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = cqfVar.m;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(bdb bdbVar, mzj mzjVar, q55 q55Var) {
        dqf dqfVar;
        int i;
        Object u;
        if (q55Var instanceof dqf) {
            dqfVar = (dqf) q55Var;
            int i2 = dqfVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dqfVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dqfVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = dqfVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                        u = ((Result) obj).a;
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    j9b a = c(bdbVar).a();
                    dqfVar.m = 1;
                    u = ((s76) a).u(mzjVar, dqfVar);
                    if (u == u85Var) {
                        return u85Var;
                    }
                }
                Result.Companion companion = Result.INSTANCE;
                if (u instanceof r5g) {
                    return Result.m882constructorimpl(Boolean.TRUE);
                }
                return Result.m882constructorimpl(u);
            }
        }
        dqfVar = new dqf(this, q55Var);
        Object obj2 = dqfVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = dqfVar.m;
        if (i == 0) {
        }
        Result.Companion companion2 = Result.INSTANCE;
        if (u instanceof r5g) {
        }
    }
}
