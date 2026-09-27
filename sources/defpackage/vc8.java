package defpackage;

import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class vc8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(Flow flow, eb8 eb8Var, q55 q55Var) {
        sc8 sc8Var;
        int i;
        Ref.ObjectRef objectRef;
        Throwable th;
        jca jcaVar;
        CancellationException z;
        if (q55Var instanceof sc8) {
            sc8 sc8Var2 = (sc8) q55Var;
            int i2 = sc8Var2.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sc8Var2.m = i2 - Integer.MIN_VALUE;
                sc8Var = sc8Var2;
                Object obj = sc8Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = sc8Var.m;
                if (i == 0) {
                    if (i == 1) {
                        objectRef = sc8Var.k;
                        try {
                            ResultKt.a(obj);
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    ?? obj2 = new Object();
                    try {
                        eb8 uc8Var = new uc8(eb8Var, obj2);
                        sc8Var.k = obj2;
                        sc8Var.m = 1;
                        if (flow.collect(uc8Var, sc8Var) != u85Var) {
                            return null;
                        }
                        return u85Var;
                    } catch (Throwable th3) {
                        th = th3;
                        objectRef = obj2;
                    }
                }
                th = (Throwable) objectRef.a;
                if ((th == null && Intrinsics.areEqual(th, th)) || ((jcaVar = (jca) sc8Var.getContext().get(jca.C0)) != null && jcaVar.isCancelled() && (z = jcaVar.z()) != null && Intrinsics.areEqual(z, th))) {
                    throw th;
                }
                if (th != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    gp7.a(th, th);
                    throw th;
                }
                gp7.a(th, th);
                throw th;
            }
        }
        sc8Var = new q55(q55Var);
        Object obj3 = sc8Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = sc8Var.m;
        if (i == 0) {
        }
        th = (Throwable) objectRef.a;
        if (th == null) {
        }
        if (th != null) {
        }
    }
}
