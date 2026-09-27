package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class to5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0088 -> B:13:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, qv9 qv9Var, q55 q55Var) {
        so5 so5Var;
        int i;
        List list2;
        Iterator it;
        Ref.ObjectRef objectRef;
        Throwable th;
        if (q55Var instanceof so5) {
            so5Var = (so5) q55Var;
            int i2 = so5Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                so5Var.o = i2 - Integer.MIN_VALUE;
                Object obj = so5Var.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = so5Var.o;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            it = so5Var.l;
                            objectRef = (Ref.ObjectRef) so5Var.k;
                            try {
                                ResultKt.a(obj);
                                objectRef = objectRef;
                            } catch (Throwable th2) {
                                Object obj2 = objectRef.a;
                                if (obj2 == null) {
                                    objectRef.a = th2;
                                    objectRef = objectRef;
                                } else {
                                    gp7.a((Throwable) obj2, th2);
                                    objectRef = objectRef;
                                }
                            }
                            while (it.hasNext()) {
                                Function1 function1 = (Function1) it.next();
                                so5Var.k = objectRef;
                                so5Var.l = it;
                                so5Var.o = 2;
                                if (function1.invoke(so5Var) == u85Var) {
                                    return u85Var;
                                }
                            }
                            th = (Throwable) objectRef.a;
                            if (th == null) {
                                return Unit.INSTANCE;
                            }
                            throw th;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = (List) so5Var.k;
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    ArrayList arrayList = new ArrayList();
                    j80 j80Var = new j80(list, arrayList, null, 2);
                    so5Var.k = arrayList;
                    so5Var.o = 1;
                    if (((op5) qv9Var).a(j80Var, so5Var) != u85Var) {
                        list2 = arrayList;
                    }
                    return u85Var;
                }
                Object obj3 = new Object();
                it = list2.iterator();
                objectRef = obj3;
                while (it.hasNext()) {
                }
                th = (Throwable) objectRef.a;
                if (th == null) {
                }
            }
        }
        so5Var = new so5(this, q55Var);
        Object obj4 = so5Var.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = so5Var.o;
        if (i == 0) {
        }
        Object obj32 = new Object();
        it = list2.iterator();
        objectRef = obj32;
        while (it.hasNext()) {
        }
        th = (Throwable) objectRef.a;
        if (th == null) {
        }
    }
}
