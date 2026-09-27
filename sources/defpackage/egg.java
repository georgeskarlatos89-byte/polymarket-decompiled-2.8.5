package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class egg {
    public final LinkedHashMap a = new LinkedHashMap();
    public final wtc b;

    public egg() {
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        this.b = new wtc(zc7Var);
    }

    public final Object a(String str) {
        Object value;
        wtc wtcVar = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) wtcVar.b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) wtcVar.e;
        try {
            sqc sqcVar = (sqc) linkedHashMap2.get(str);
            if (sqcVar != null && (value = ((uwh) sqcVar).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) wtcVar.d).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final epf b(Object obj, String str) {
        wtc wtcVar = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) wtcVar.e;
        boolean containsKey = linkedHashMap.containsKey(str);
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) wtcVar.b;
        if (containsKey) {
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                if (!linkedHashMap2.containsKey(str)) {
                    linkedHashMap2.put(str, obj);
                }
                obj2 = n0n.a(linkedHashMap2.get(str));
                linkedHashMap.put(str, obj2);
            }
            return tkl.b((sqc) obj2);
        }
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) wtcVar.d;
        Object obj3 = linkedHashMap3.get(str);
        if (obj3 == null) {
            if (!linkedHashMap2.containsKey(str)) {
                linkedHashMap2.put(str, obj);
            }
            obj3 = n0n.a(linkedHashMap2.get(str));
            linkedHashMap3.put(str, obj3);
        }
        return tkl.b((sqc) obj3);
    }

    public final void c(String str) {
        wtc wtcVar = this.b;
        ((LinkedHashMap) wtcVar.b).remove(str);
        ((LinkedHashMap) wtcVar.d).remove(str);
        ((LinkedHashMap) wtcVar.e).remove(str);
        if (this.a.remove(str) == null) {
            return;
        }
        dmk.p();
    }

    public final void d(Object obj, String str) {
        gpc gpcVar;
        if (obj != null) {
            List list = ggg.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(obj)) {
                    }
                }
            }
            omf.r(obj.getClass(), " into saved state", "Can't put value with type ");
            return;
        }
        List list2 = ggg.a;
        Object obj2 = this.a.get(str);
        if (obj2 instanceof gpc) {
            gpcVar = (gpc) obj2;
        } else {
            gpcVar = null;
        }
        if (gpcVar != null) {
            gpcVar.l(obj);
        }
        this.b.s(obj, str);
    }

    public egg(xzb xzbVar) {
        this.b = new wtc(xzbVar);
    }
}
