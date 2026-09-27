package defpackage;

import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xz4 implements o9h, wwa {
    public long a;
    public ArrayList b;

    @Override // defpackage.wwa
    public final w5c c(x5c x5cVar, o5c o5cVar, long j) {
        h(j);
        cne T = o5cVar.T(j);
        return x5c.r0(x5cVar, T.a, T.b, new t1(T, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    @Override // defpackage.o9h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Continuation continuation) {
        wz4 wz4Var;
        int i;
        Ref.ObjectRef objectRef;
        Throwable th;
        int i2;
        et6 et6Var;
        int h;
        if (continuation instanceof wz4) {
            wz4Var = (wz4) continuation;
            int i3 = wz4Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wz4Var.n = i3 - Integer.MIN_VALUE;
                Object obj = wz4Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = wz4Var.n;
                if (i == 0) {
                    if (i == 1) {
                        objectRef = wz4Var.k;
                        try {
                            ResultKt.a(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            ArrayList arrayList = this.b;
                            Object obj2 = objectRef.a;
                            hhj.a(arrayList);
                            arrayList.remove(obj2);
                            throw th;
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    if (rz4.l(this.a)) {
                        ?? obj3 = new Object();
                        try {
                            wz4Var.k = obj3;
                            wz4Var.n = 1;
                            m23 m23Var = new m23(1, m7a.b(wz4Var));
                            m23Var.t();
                            obj3.a = m23Var;
                            this.b.add(m23Var);
                            if (m23Var.r() == u85Var) {
                                return u85Var;
                            }
                            objectRef = obj3;
                        } catch (Throwable th3) {
                            objectRef = obj3;
                            th = th3;
                            ArrayList arrayList2 = this.b;
                            Object obj22 = objectRef.a;
                            hhj.a(arrayList2);
                            arrayList2.remove(obj22);
                            throw th;
                        }
                    }
                    long j = this.a;
                    i2 = rz4.i(j);
                    et6 et6Var2 = ct6.a;
                    if (i2 != Integer.MAX_VALUE) {
                        at6.a(i2);
                        et6Var = new at6(i2);
                    } else {
                        et6Var = et6Var2;
                    }
                    h = rz4.h(j);
                    if (h != Integer.MAX_VALUE) {
                        at6.a(h);
                        et6Var2 = new at6(h);
                    }
                    return new c9h(et6Var, et6Var2);
                }
                ArrayList arrayList3 = this.b;
                Object obj4 = objectRef.a;
                hhj.a(arrayList3);
                arrayList3.remove(obj4);
                long j2 = this.a;
                i2 = rz4.i(j2);
                et6 et6Var22 = ct6.a;
                if (i2 != Integer.MAX_VALUE) {
                }
                h = rz4.h(j2);
                if (h != Integer.MAX_VALUE) {
                }
                return new c9h(et6Var, et6Var22);
            }
        }
        wz4Var = new wz4(this, (q55) continuation);
        Object obj5 = wz4Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = wz4Var.n;
        if (i == 0) {
        }
        ArrayList arrayList32 = this.b;
        Object obj42 = objectRef.a;
        hhj.a(arrayList32);
        arrayList32.remove(obj42);
        long j22 = this.a;
        i2 = rz4.i(j22);
        et6 et6Var222 = ct6.a;
        if (i2 != Integer.MAX_VALUE) {
        }
        h = rz4.h(j22);
        if (h != Integer.MAX_VALUE) {
        }
        return new c9h(et6Var, et6Var222);
    }

    public final void h(long j) {
        this.a = j;
        if (!rz4.l(j)) {
            ArrayList<Continuation> arrayList = this.b;
            if (!arrayList.isEmpty()) {
                this.b = new ArrayList();
                for (Continuation continuation : arrayList) {
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m882constructorimpl(Unit.INSTANCE));
                }
            }
        }
    }
}
