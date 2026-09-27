package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class os4 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final Object a(fr0 fr0Var, Function0 function0) {
        fr0Var.getClass();
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(fr0Var);
        if (obj != null) {
            return obj;
        }
        Object invoke = function0.invoke();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(fr0Var, invoke);
        if (putIfAbsent != null) {
            invoke = putIfAbsent;
        }
        invoke.getClass();
        return invoke;
    }

    public final boolean b(fr0 fr0Var) {
        fr0Var.getClass();
        return d().containsKey(fr0Var);
    }

    public final Object c(fr0 fr0Var) {
        fr0Var.getClass();
        Object e = e(fr0Var);
        if (e != null) {
            return e;
        }
        fi9.q(fr0Var, "No instance for key ");
        return null;
    }

    public final Map d() {
        return this.a;
    }

    public final Object e(fr0 fr0Var) {
        fr0Var.getClass();
        return d().get(fr0Var);
    }

    public final void f(fr0 fr0Var, Object obj) {
        fr0Var.getClass();
        obj.getClass();
        d().put(fr0Var, obj);
    }
}
