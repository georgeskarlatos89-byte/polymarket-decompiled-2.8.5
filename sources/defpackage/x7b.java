package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class x7b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(p6b p6bVar, q55 q55Var) {
        w7b w7bVar;
        int i;
        p6b p6bVar2;
        Ref.ObjectRef objectRef;
        Throwable th;
        l7b l7bVar;
        l7b l7bVar2;
        if (q55Var instanceof w7b) {
            w7b w7bVar2 = (w7b) q55Var;
            int i2 = w7bVar2.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w7bVar2.n = i2 - Integer.MIN_VALUE;
                w7bVar = w7bVar2;
                Object obj = w7bVar.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = w7bVar.n;
                if (i == 0) {
                    if (i == 1) {
                        objectRef = w7bVar.l;
                        p6bVar2 = w7bVar.k;
                        try {
                            ResultKt.a(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            l7bVar = (l7b) objectRef.a;
                            if (l7bVar != null) {
                                p6bVar2.c(l7bVar);
                            }
                            throw th;
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    if (p6bVar.b().a(n6b.STARTED)) {
                        return Unit.INSTANCE;
                    }
                    ?? obj2 = new Object();
                    try {
                        w7bVar.k = p6bVar;
                        w7bVar.l = obj2;
                        w7bVar.n = 1;
                        m23 m23Var = new m23(1, m7a.b(w7bVar));
                        m23Var.t();
                        k kVar = new k(m23Var, 1);
                        obj2.a = kVar;
                        p6bVar.a(kVar);
                        if (m23Var.r() == u85Var) {
                            return u85Var;
                        }
                        p6bVar2 = p6bVar;
                        objectRef = obj2;
                    } catch (Throwable th3) {
                        p6bVar2 = p6bVar;
                        objectRef = obj2;
                        th = th3;
                        l7bVar = (l7b) objectRef.a;
                        if (l7bVar != null) {
                        }
                        throw th;
                    }
                }
                l7bVar2 = (l7b) objectRef.a;
                if (l7bVar2 != null) {
                    p6bVar2.c(l7bVar2);
                }
                return Unit.INSTANCE;
            }
        }
        w7bVar = new q55(q55Var);
        Object obj3 = w7bVar.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = w7bVar.n;
        if (i == 0) {
        }
        l7bVar2 = (l7b) objectRef.a;
        if (l7bVar2 != null) {
        }
        return Unit.INSTANCE;
    }
}
