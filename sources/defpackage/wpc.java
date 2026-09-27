package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wpc extends lld {
    public static final vs4 d = vs4.OPTIONAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [lld, wpc] */
    public static wpc p() {
        return new lld(new TreeMap(lld.b));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [lld, wpc] */
    public static wpc s(ws4 ws4Var) {
        TreeMap treeMap = new TreeMap(lld.b);
        for (ow0 ow0Var : ws4Var.b()) {
            Set<vs4> c = ws4Var.c(ow0Var);
            ArrayMap arrayMap = new ArrayMap();
            for (vs4 vs4Var : c) {
                arrayMap.put(vs4Var, ws4Var.i(ow0Var, vs4Var));
            }
            treeMap.put(ow0Var, arrayMap);
        }
        return new lld(treeMap);
    }

    public final void t(ow0 ow0Var, vs4 vs4Var, Object obj) {
        vs4 vs4Var2;
        TreeMap treeMap = this.a;
        Map map = (Map) treeMap.get(ow0Var);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(ow0Var, arrayMap);
            arrayMap.put(vs4Var, obj);
            return;
        }
        vs4 vs4Var3 = (vs4) Collections.min(map.keySet());
        if (!Objects.equals(map.get(vs4Var3), obj) && vs4Var3 == (vs4Var2 = vs4.REQUIRED) && vs4Var == vs4Var2) {
            StringBuilder sb = new StringBuilder("Option values conflicts: ");
            sb.append(ow0Var.a);
            sb.append(", existing value (");
            sb.append(vs4Var3);
            Object obj2 = map.get(vs4Var3);
            sb.append(")=");
            sb.append(obj2);
            sb.append(", conflicting (");
            sb.append(vs4Var);
            sb.append(")=");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
        map.put(vs4Var, obj);
    }

    public final void u(ow0 ow0Var, Object obj) {
        t(ow0Var, d, obj);
    }
}
