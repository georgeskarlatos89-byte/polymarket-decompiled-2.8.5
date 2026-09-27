package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class gnn {
    public static xl3 a() {
        if (xl3.L != null) {
            return b();
        }
        dmk.n("ChatClient should be initialized first!");
        return null;
    }

    public static xl3 b() {
        xl3 xl3Var = xl3.L;
        if (xl3Var != null) {
            return xl3Var;
        }
        dmk.n("ChatClient.Builder::build() must be called before obtaining ChatClient instance");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[EDGE_INSN: B:30:0x0077->B:23:0x0077 BREAK  A[LOOP:0: B:17:0x0061->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(List list, hi6 hi6Var, boolean z, String str, q55 q55Var) {
        k7e k7eVar;
        int i;
        xfg xfgVar;
        Iterator it;
        j6e j6eVar;
        wfg wfgVar;
        if (q55Var instanceof k7e) {
            k7e k7eVar2 = (k7e) q55Var;
            int i2 = k7eVar2.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k7eVar2.m = i2 - Integer.MIN_VALUE;
                k7eVar = k7eVar2;
                Object obj = k7eVar.l;
                Object obj2 = u85.COROUTINE_SUSPENDED;
                i = k7eVar.m;
                Object obj3 = null;
                if (i == 0) {
                    if (i == 1) {
                        list = k7eVar.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    if (!z) {
                        if (hi6Var != null) {
                            k7eVar.k = list;
                            k7eVar.m = 1;
                            obj = hi6Var.await(k7eVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                        } else {
                            xfgVar = null;
                            if (xfgVar instanceof wfg) {
                                wfgVar = (wfg) xfgVar;
                            } else {
                                wfgVar = null;
                            }
                            if (wfgVar != null) {
                                str = wfgVar.a;
                            } else {
                                str = null;
                            }
                        }
                    }
                    List list2 = list;
                    it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (Intrinsics.areEqual(((j6e) next).a, str)) {
                            obj3 = next;
                            break;
                        }
                    }
                    j6eVar = (j6e) obj3;
                    if (j6eVar != null) {
                        return CollectionsKt.i0(eb4.c(j6eVar), CollectionsKt.e0(list2, j6eVar));
                    }
                    return list;
                }
                xfgVar = (xfg) obj;
                if (xfgVar instanceof wfg) {
                }
                if (wfgVar != null) {
                }
                List list22 = list;
                it = list22.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                j6eVar = (j6e) obj3;
                if (j6eVar != null) {
                }
            }
        }
        k7eVar = new q55(q55Var);
        Object obj4 = k7eVar.l;
        Object obj22 = u85.COROUTINE_SUSPENDED;
        i = k7eVar.m;
        Object obj32 = null;
        if (i == 0) {
        }
        xfgVar = (xfg) obj4;
        if (xfgVar instanceof wfg) {
        }
        if (wfgVar != null) {
        }
        List list222 = list;
        it = list222.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        j6eVar = (j6e) obj32;
        if (j6eVar != null) {
        }
    }
}
