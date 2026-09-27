package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class lld implements ws4 {
    public static final tp b;
    public static final lld c;
    public final TreeMap a;

    static {
        tp tpVar = new tp(18);
        b = tpVar;
        c = new lld(new TreeMap(tpVar));
    }

    public lld(TreeMap treeMap) {
        this.a = treeMap;
    }

    public static lld g(ws4 ws4Var) {
        if (lld.class.equals(ws4Var.getClass())) {
            return (lld) ws4Var;
        }
        TreeMap treeMap = new TreeMap(b);
        for (ow0 ow0Var : ws4Var.b()) {
            Set<vs4> c2 = ws4Var.c(ow0Var);
            ArrayMap arrayMap = new ArrayMap();
            for (vs4 vs4Var : c2) {
                arrayMap.put(vs4Var, ws4Var.i(ow0Var, vs4Var));
            }
            treeMap.put(ow0Var, arrayMap);
        }
        return new lld(treeMap);
    }

    @Override // defpackage.ws4
    public final Object a(ow0 ow0Var, Object obj) {
        Map map = (Map) this.a.get(ow0Var);
        if (map == null) {
            return obj;
        }
        return map.get((vs4) Collections.min(map.keySet()));
    }

    @Override // defpackage.ws4
    public final Set b() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // defpackage.ws4
    public final Set c(ow0 ow0Var) {
        Map map = (Map) this.a.get(ow0Var);
        if (map == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.ws4
    public final void d(vt0 vt0Var) {
        for (Map.Entry entry : this.a.tailMap(new ow0("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (((ow0) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                ow0 ow0Var = (ow0) entry.getKey();
                l33 l33Var = (l33) vt0Var.b;
                ws4 ws4Var = (ws4) vt0Var.c;
                l33Var.b.t(ow0Var, ws4Var.f(ow0Var), ws4Var.h(ow0Var));
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ws4
    public final boolean e(ow0 ow0Var) {
        return this.a.containsKey(ow0Var);
    }

    @Override // defpackage.ws4
    public final vs4 f(ow0 ow0Var) {
        Map map = (Map) this.a.get(ow0Var);
        if (map != null) {
            return (vs4) Collections.min(map.keySet());
        }
        qp7.k(ow0Var, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.ws4
    public final Object h(ow0 ow0Var) {
        Map map = (Map) this.a.get(ow0Var);
        if (map != null) {
            return map.get((vs4) Collections.min(map.keySet()));
        }
        qp7.k(ow0Var, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.ws4
    public final Object i(ow0 ow0Var, vs4 vs4Var) {
        Map map = (Map) this.a.get(ow0Var);
        if (map != null) {
            if (map.containsKey(vs4Var)) {
                return map.get(vs4Var);
            }
            ahh.j("Option does not exist: ", ow0Var, " with priority=", vs4Var);
            return null;
        }
        qp7.k(ow0Var, "Option does not exist: ");
        return null;
    }
}
