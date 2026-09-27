package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class q5i {
    public final nic a;
    public final j5i b;
    public m5i c;

    public q5i(nic nicVar, j5i j5iVar) {
        nicVar.getClass();
        j5iVar.getClass();
        this.a = nicVar;
        this.b = j5iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(q55 q55Var) {
        n5i n5iVar;
        int i;
        m5i m5iVar;
        if (q55Var instanceof n5i) {
            n5iVar = (n5i) q55Var;
            int i2 = n5iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n5iVar.m = i2 - Integer.MIN_VALUE;
                Object obj = n5iVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = n5iVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    scg d = fkl.d(new l5i(this, 0));
                    rc3 rc3Var = new rc3(2, 9, null);
                    n5iVar.m = 1;
                    if (od8.b(d, rc3Var, n5iVar) == u85Var) {
                        return u85Var;
                    }
                }
                m5iVar = this.c;
                if (m5iVar != null) {
                    return m5i.SwipedDownByUser;
                }
                return m5iVar;
            }
        }
        n5iVar = new n5i(this, q55Var);
        Object obj2 = n5iVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = n5iVar.m;
        if (i == 0) {
        }
        m5iVar = this.c;
        if (m5iVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        if (defpackage.yrl.c(10, r8, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q55 q55Var) {
        o5i o5iVar;
        int i;
        Object obj;
        if (q55Var instanceof o5i) {
            o5iVar = (o5i) q55Var;
            int i2 = o5iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o5iVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = o5iVar.k;
                Object obj3 = u85.COROUTINE_SUSPENDED;
                i = o5iVar.m;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj2);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.a(obj2);
                } else {
                    ResultKt.a(obj2);
                    this.c = m5i.Programmatically;
                    o5iVar.m = 1;
                    j5i j5iVar = this.b;
                    if (((Boolean) j5iVar.b.getValue()).booleanValue()) {
                        xdh xdhVar = j5iVar.a;
                        if (xdhVar != null) {
                            ((hk6) xdhVar).a();
                        }
                        obj = od8.b(fkl.d(new lih(j5iVar, 12)), new rc3(2, 8, null), o5iVar);
                        if (obj != obj3) {
                            obj = Unit.INSTANCE;
                        }
                        if (obj != obj3) {
                            obj = Unit.INSTANCE;
                        }
                    } else {
                        obj = Unit.INSTANCE;
                    }
                }
                if (!this.a.c()) {
                    mp8 mp8Var = new mp8(this, null, 1);
                    o5iVar.m = 2;
                } else {
                    return Unit.INSTANCE;
                }
            }
        }
        o5iVar = new o5i(this, q55Var);
        Object obj22 = o5iVar.k;
        Object obj32 = u85.COROUTINE_SUSPENDED;
        i = o5iVar.m;
        if (i == 0) {
        }
        if (!this.a.c()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (defpackage.od8.b(r7, r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (defpackage.yrl.c(10, r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(q55 q55Var) {
        p5i p5iVar;
        int i;
        if (q55Var instanceof p5i) {
            p5iVar = (p5i) q55Var;
            int i2 = p5iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p5iVar.m = i2 - Integer.MIN_VALUE;
                Object obj = p5iVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = p5iVar.m;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    mp8 mp8Var = new mp8(this, null, 2);
                    p5iVar.m = 1;
                }
                scg d = fkl.d(new l5i(this, 1));
                rc3 rc3Var = new rc3(2, 10, null);
                p5iVar.m = 2;
            }
        }
        p5iVar = new p5i(this, q55Var);
        Object obj2 = p5iVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = p5iVar.m;
        if (i == 0) {
        }
        scg d2 = fkl.d(new l5i(this, 1));
        rc3 rc3Var2 = new rc3(2, 10, null);
        p5iVar.m = 2;
    }
}
