package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xud implements Iterable, xja {
    public static final xud b;
    public final Map a;

    static {
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        b = new xud(zc7Var);
    }

    public xud(Map map) {
        this.a = map;
    }

    public final Object a(String str) {
        vud vudVar = (vud) this.a.get(str);
        if (vudVar != null) {
            return vudVar.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xud) {
            if (Intrinsics.areEqual(this.a, ((xud) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair((String) entry.getKey(), (vud) entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return hdi.s(new StringBuilder("Parameters(entries="), this.a, ')');
    }
}
