package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class aoc extends k4 implements Serializable {
    public final transient Map d;
    public transient int e;
    public transient znc f;

    public aoc(Map map) {
        brn.h(map.isEmpty());
        this.d = map;
    }

    @Override // defpackage.k4
    public final Map a() {
        Map u3Var;
        Map map = this.c;
        if (map == null) {
            Map map2 = this.d;
            if (map2 instanceof NavigableMap) {
                u3Var = new w3(this, (NavigableMap) map2);
            } else if (map2 instanceof SortedMap) {
                u3Var = new z3(this, (SortedMap) map2);
            } else {
                u3Var = new u3(this, map2, 0);
            }
            this.c = u3Var;
            return u3Var;
        }
        return map;
    }

    public final void b() {
        Map map = this.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.e = 0;
    }

    public final Collection c() {
        return (List) this.f.get();
    }
}
