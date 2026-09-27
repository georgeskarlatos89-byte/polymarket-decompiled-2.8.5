package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class npn {
    public static final Object a(eb8 eb8Var, Continuation continuation, Function0 function0, Function3 function3, Flow[] flowArr) {
        pc4 pc4Var = new pc4(eb8Var, null, function0, function3, flowArr);
        gjg gjgVar = new gjg(continuation, continuation.getContext());
        Object h = izm.h(gjgVar, true, gjgVar, pc4Var);
        if (h == u85.COROUTINE_SUSPENDED) {
            return h;
        }
        return Unit.INSTANCE;
    }

    public static String b(String str) {
        if (c(str)) {
            return null;
        }
        return str;
    }

    public static boolean c(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }
}
