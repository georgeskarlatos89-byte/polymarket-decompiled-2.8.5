package defpackage;

import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p1d {
    public t1d a;
    public t1d b;
    public Function0 c = new n10(this, 18);
    public t85 d;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, q55 q55Var) {
        n1d n1dVar;
        int i;
        t1d t1dVar;
        long j3;
        if (q55Var instanceof n1d) {
            n1dVar = (n1d) q55Var;
            int i2 = n1dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n1dVar.m = i2 - Integer.MIN_VALUE;
                n1d n1dVar2 = n1dVar;
                Object obj = n1dVar2.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = n1dVar2.m;
                t1d t1dVar2 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj);
                            j3 = ((j5k) obj).a;
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ResultKt.a(obj);
                        j3 = ((j5k) obj).a;
                    }
                } else {
                    ResultKt.a(obj);
                    t1d t1dVar3 = this.a;
                    if (t1dVar3 != null) {
                        t1dVar = t1dVar3.d1();
                    } else {
                        t1dVar = null;
                    }
                    j3 = 0;
                    if (t1dVar == null) {
                        t1d t1dVar4 = this.b;
                        if (t1dVar4 != null) {
                            n1dVar2.m = 1;
                            obj = t1dVar4.j(j, j2, n1dVar2);
                        }
                    } else {
                        t1d t1dVar5 = this.a;
                        if (t1dVar5 != null) {
                            t1dVar2 = t1dVar5.d1();
                        }
                        t1d t1dVar6 = t1dVar2;
                        if (t1dVar6 != null) {
                            n1dVar2.m = 2;
                            obj = t1dVar6.j(j, j2, n1dVar2);
                        }
                    }
                }
                return new j5k(j3);
            }
        }
        n1dVar = new n1d(this, q55Var);
        n1d n1dVar22 = n1dVar;
        Object obj2 = n1dVar22.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = n1dVar22.m;
        t1d t1dVar22 = null;
        if (i == 0) {
        }
        return new j5k(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, q55 q55Var) {
        o1d o1dVar;
        int i;
        long j2;
        if (q55Var instanceof o1d) {
            o1dVar = (o1d) q55Var;
            int i2 = o1dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o1dVar.m = i2 - Integer.MIN_VALUE;
                Object obj = o1dVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = o1dVar.m;
                t1d t1dVar = null;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    t1d t1dVar2 = this.a;
                    if (t1dVar2 != null) {
                        t1dVar = t1dVar2.d1();
                    }
                    if (t1dVar != null) {
                        o1dVar.m = 1;
                        obj = t1dVar.z0(j, o1dVar);
                        if (obj == u85Var) {
                            return u85Var;
                        }
                    } else {
                        j2 = 0;
                        return new j5k(j2);
                    }
                }
                j2 = ((j5k) obj).a;
                return new j5k(j2);
            }
        }
        o1dVar = new o1d(this, q55Var);
        Object obj2 = o1dVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = o1dVar.m;
        t1d t1dVar3 = null;
        if (i == 0) {
        }
        j2 = ((j5k) obj2).a;
        return new j5k(j2);
    }

    public final t85 c() {
        t85 t85Var = (t85) this.c.invoke();
        if (t85Var != null) {
            return t85Var;
        }
        dmk.n("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
