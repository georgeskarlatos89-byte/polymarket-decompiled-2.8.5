package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class ikl {
    public static final vl4 a = new vl4(new lm4(29), false, 1890101041);

    public static final ve3 a(te3 te3Var) {
        return new ve3(te3Var, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0054, B:20:0x0069, B:22:0x0071, B:32:0x0045, B:35:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(eb8 eb8Var, jrf jrfVar, boolean z, Continuation continuation) {
        zb8 zb8Var;
        int i;
        xp1 xp1Var;
        eb8 eb8Var2;
        xp1 xp1Var2;
        Object a2;
        try {
            if (continuation instanceof zb8) {
                zb8 zb8Var2 = (zb8) continuation;
                int i2 = zb8Var2.p;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zb8Var2.p = i2 - Integer.MIN_VALUE;
                    zb8Var = zb8Var2;
                    Object obj = zb8Var.o;
                    Object obj2 = u85.COROUTINE_SUSPENDED;
                    i = zb8Var.p;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                z = zb8Var.n;
                                xp1Var = zb8Var.m;
                                jrfVar = zb8Var.l;
                                eb8 eb8Var3 = zb8Var.k;
                                ResultKt.a(obj);
                                eb8 eb8Var4 = eb8Var3;
                                xp1Var2 = xp1Var;
                                eb8Var = eb8Var4;
                                zb8Var.k = eb8Var;
                                zb8Var.l = jrfVar;
                                zb8Var.m = xp1Var2;
                                zb8Var.n = z;
                                zb8Var.p = 1;
                                a2 = xp1Var2.a(zb8Var);
                                if (a2 == obj2) {
                                    eb8Var2 = eb8Var;
                                    xp1Var = xp1Var2;
                                    obj = a2;
                                    if (!((Boolean) obj).booleanValue()) {
                                        Object c = xp1Var.c();
                                        zb8Var.k = eb8Var2;
                                        zb8Var.l = jrfVar;
                                        zb8Var.m = xp1Var;
                                        zb8Var.n = z;
                                        zb8Var.p = 2;
                                        Object emit = eb8Var2.emit(c, zb8Var);
                                        eb8Var4 = eb8Var2;
                                    } else {
                                        if (z) {
                                            jrfVar.e(null);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    return obj2;
                                }
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            z = zb8Var.n;
                            xp1Var = zb8Var.m;
                            jrfVar = zb8Var.l;
                            eb8 eb8Var5 = zb8Var.k;
                            ResultKt.a(obj);
                            eb8Var2 = eb8Var5;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        ResultKt.a(obj);
                        if (!(eb8Var instanceof o0j)) {
                            xp1Var2 = jrfVar.iterator();
                            zb8Var.k = eb8Var;
                            zb8Var.l = jrfVar;
                            zb8Var.m = xp1Var2;
                            zb8Var.n = z;
                            zb8Var.p = 1;
                            a2 = xp1Var2.a(zb8Var);
                            if (a2 == obj2) {
                            }
                        } else {
                            throw ((o0j) eb8Var).a;
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    bnn.a(jrfVar, th);
                }
                throw th2;
            }
        }
        zb8Var = new q55(continuation);
        Object obj3 = zb8Var.o;
        Object obj22 = u85.COROUTINE_SUSPENDED;
        i = zb8Var.p;
    }

    public static kvd c(Object obj) {
        return new kvd(obj, vwb.q);
    }

    public static final ve3 d(eq1 eq1Var) {
        return new ve3(eq1Var, false);
    }

    public static final qqc e(Object obj, pq4 pq4Var) {
        sr8 sr8Var = (sr8) pq4Var;
        Object Q = sr8Var.Q();
        if (Q == oq4.a) {
            Q = c(obj);
            sr8Var.o0(Q);
        }
        qqc qqcVar = (qqc) Q;
        qqcVar.setValue(obj);
        return qqcVar;
    }
}
