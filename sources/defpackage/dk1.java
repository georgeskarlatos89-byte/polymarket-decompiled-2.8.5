package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class dk1 {
    public static ek1 a(String str, a36 a36Var) {
        Object obj;
        Object m882constructorimpl;
        str.getClass();
        Iterator<E> it = ek1.c().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (e.o(((ek1) obj).a(), StringsKt.s0(str).toString(), true)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ek1 ek1Var = (ek1) obj;
        if (ek1Var != null) {
            m882constructorimpl = Result.m882constructorimpl(ek1Var);
        } else {
            ug7 c = ek1.c();
            ArrayList arrayList = new ArrayList(CollectionsKt.w(c));
            Iterator<E> it2 = c.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ek1) it2.next()).a());
            }
            Result.Companion companion = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(new RuntimeException("Directory server name '" + str + "' is not supported. Must be one of " + arrayList + ".", null)));
        }
        Throwable m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(m882constructorimpl);
        if (m883exceptionOrNullimpl != null) {
            a36Var.b(m883exceptionOrNullimpl);
        }
        ek1 ek1Var2 = ek1.Unknown;
        if (m882constructorimpl instanceof r5g) {
            m882constructorimpl = ek1Var2;
        }
        return (ek1) m882constructorimpl;
    }
}
