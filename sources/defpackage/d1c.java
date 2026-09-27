package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class d1c extends c1c {
    public static Object c(Map map, Object obj) {
        map.getClass();
        if (map instanceof w0c) {
            return ((w0c) map).T();
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            ahh.i(woa.o("Key ", obj, " is missing in the map."));
            return null;
        }
        return obj2;
    }

    public static HashMap d(Pair... pairArr) {
        HashMap hashMap = new HashMap(c1c.a(pairArr.length));
        m(hashMap, pairArr);
        return hashMap;
    }

    public static Map e(Pair... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(c1c.a(pairArr.length));
            m(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        return zc7Var;
    }

    public static Map f(String str, Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(str);
        return i(linkedHashMap);
    }

    public static Map g(Map map, Iterable iterable) {
        map.getClass();
        iterable.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        CollectionsKt.m0(linkedHashMap.keySet(), iterable);
        return i(linkedHashMap);
    }

    public static LinkedHashMap h(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(c1c.a(pairArr.length));
        m(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final Map i(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            if (size != 1) {
                return linkedHashMap;
            }
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            singletonMap.getClass();
            return singletonMap;
        }
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        return zc7Var;
    }

    public static LinkedHashMap j(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map k(Map map, Pair pair) {
        map.getClass();
        if (map.isEmpty()) {
            return c1c.b(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    public static final void l(LinkedHashMap linkedHashMap, Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.first, pair.second);
        }
    }

    public static void m(Map map, Pair[] pairArr) {
        map.getClass();
        for (Pair pair : pairArr) {
            map.put(pair.first, pair.second);
        }
    }

    public static Map n(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c1c.a(collection.size()));
                    l(linkedHashMap, iterable);
                    return linkedHashMap;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return c1c.b((Pair) next);
            }
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            return zc7Var;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        l(linkedHashMap2, iterable);
        return i(linkedHashMap2);
    }

    public static Map o(Map map) {
        map.getClass();
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return new LinkedHashMap(map);
            }
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            singletonMap.getClass();
            return singletonMap;
        }
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        return zc7Var;
    }

    public static LinkedHashMap p(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
