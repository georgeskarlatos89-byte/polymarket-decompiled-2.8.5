package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class u3 extends AbstractMap {
    public final /* synthetic */ int a;
    public final transient Map b;
    public transient AbstractSet c;
    public transient AbstractCollection d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ u3(Serializable serializable, Map map, int i) {
        this.a = i;
        this.e = serializable;
        this.b = map;
    }

    public zq9 a(Map.Entry entry) {
        c4 c4Var;
        Object key = entry.getKey();
        aoc aocVar = (aoc) this.e;
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            c4Var = new c4(aocVar, key, list, (c4) null);
        } else {
            c4Var = new c4(aocVar, key, list, (c4) null);
        }
        return new zq9(key, c4Var);
    }

    public c4 b(Object obj) {
        Object obj2;
        try {
            obj2 = ((gi4) this.b).get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        zhl zhlVar = (zhl) this.e;
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new c4(zhlVar, obj, list, (c4) null);
        }
        return new c4(zhlVar, obj, list, (c4) null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        int i = this.a;
        Map map = this.b;
        Serializable serializable = this.e;
        switch (i) {
            case 0:
                aoc aocVar = (aoc) serializable;
                if (map == aocVar.d) {
                    aocVar.b();
                    return;
                }
                t3 t3Var = new t3(this);
                while (t3Var.hasNext()) {
                    t3Var.next();
                    t3Var.remove();
                }
                return;
            case 1:
                gi4 gi4Var = ((qdl) serializable).c;
                if (map == gi4Var) {
                    Iterator it = gi4Var.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    gi4Var.clear();
                    return;
                }
                t3 t3Var2 = new t3(this, (byte) 0);
                while (t3Var2.hasNext()) {
                    t3Var2.next();
                    t3Var2.remove();
                }
                return;
            case 2:
                eel eelVar = (eel) serializable;
                gi4 gi4Var2 = eelVar.c;
                if (map == gi4Var2) {
                    Iterator it2 = gi4Var2.values().iterator();
                    while (it2.hasNext()) {
                        ((Collection) it2.next()).clear();
                    }
                    gi4Var2.clear();
                    eelVar.d = 0;
                    return;
                }
                t3 t3Var3 = new t3(this, (char) 0);
                while (t3Var3.hasNext()) {
                    t3Var3.next();
                    t3Var3.remove();
                }
                return;
            default:
                zhl zhlVar = (zhl) serializable;
                if (((gi4) map) == zhlVar.d) {
                    zhlVar.c();
                    return;
                }
                t3 t3Var4 = new t3(this, 0);
                while (t3Var4.hasNext()) {
                    t3Var4.next();
                    t3Var4.remove();
                }
                return;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        int i = this.a;
        Map map = this.b;
        switch (i) {
            case 0:
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            case 2:
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    return false;
                }
            default:
                try {
                    return ((gi4) map).containsKey(obj);
                } catch (ClassCastException | NullPointerException unused4) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                s3 s3Var = (s3) this.c;
                if (s3Var == null) {
                    s3 s3Var2 = new s3(this);
                    this.c = s3Var2;
                    return s3Var2;
                }
                return s3Var;
            case 1:
                d6l d6lVar = (d6l) this.c;
                if (d6lVar == null) {
                    d6l d6lVar2 = new d6l(this);
                    this.c = d6lVar2;
                    return d6lVar2;
                }
                return d6lVar;
            case 2:
                d9l d9lVar = (d9l) this.c;
                if (d9lVar == null) {
                    d9l d9lVar2 = new d9l(this);
                    this.c = d9lVar2;
                    return d9lVar2;
                }
                return d9lVar;
            default:
                egl eglVar = (egl) this.c;
                if (eglVar == null) {
                    egl eglVar2 = new egl(this);
                    this.c = eglVar2;
                    return eglVar2;
                }
                return eglVar;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        int i = this.a;
        Map map = this.b;
        switch (i) {
            case 0:
                if (this == obj || map.equals(obj)) {
                    return true;
                }
                return false;
            case 1:
                if (this == obj || map.equals(obj)) {
                    return true;
                }
                return false;
            case 2:
                if (this == obj || map.equals(obj)) {
                    return true;
                }
                return false;
            default:
                if (this == obj || ((gi4) map).equals(obj)) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        c4 c4Var;
        Object obj3;
        c4 c4Var2;
        Object obj4;
        c4 c4Var3;
        int i = this.a;
        Serializable serializable = this.e;
        Map map = this.b;
        switch (i) {
            case 0:
                map.getClass();
                try {
                    obj2 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                aoc aocVar = (aoc) serializable;
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    c4Var = new c4(aocVar, obj, list, (c4) null);
                } else {
                    c4Var = new c4(aocVar, obj, list, (c4) null);
                }
                return c4Var;
            case 1:
                map.getClass();
                try {
                    obj3 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                qdl qdlVar = (qdl) serializable;
                List list2 = (List) collection2;
                if (list2 instanceof RandomAccess) {
                    c4Var2 = new c4(qdlVar, obj, list2, (c4) null);
                } else {
                    c4Var2 = new c4(qdlVar, obj, list2, (c4) null);
                }
                return c4Var2;
            case 2:
                map.getClass();
                try {
                    obj4 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    obj4 = null;
                }
                Collection collection3 = (Collection) obj4;
                if (collection3 == null) {
                    return null;
                }
                eel eelVar = (eel) serializable;
                List list3 = (List) collection3;
                if (list3 instanceof RandomAccess) {
                    c4Var3 = new c4(eelVar, obj, list3, (c4) null);
                } else {
                    c4Var3 = new c4(eelVar, obj, list3, (c4) null);
                }
                return c4Var3;
            default:
                return b(obj);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.a;
        Map map = this.b;
        switch (i) {
            case 0:
                return map.hashCode();
            case 1:
                return map.hashCode();
            case 2:
                return map.hashCode();
            default:
                return ((gi4) map).hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set v3Var;
        int i = this.a;
        Serializable serializable = this.e;
        switch (i) {
            case 0:
                aoc aocVar = (aoc) serializable;
                Set set = aocVar.a;
                if (set == null) {
                    Map map = aocVar.d;
                    if (map instanceof NavigableMap) {
                        v3Var = new x3(aocVar, (NavigableMap) map);
                    } else if (map instanceof SortedMap) {
                        v3Var = new a4(aocVar, (SortedMap) map);
                    } else {
                        v3Var = new v3(aocVar, map);
                    }
                    set = v3Var;
                    aocVar.a = set;
                }
                return set;
            case 1:
                qdl qdlVar = (qdl) serializable;
                d6l d6lVar = qdlVar.a;
                if (d6lVar == null) {
                    d6l d6lVar2 = new d6l(qdlVar, qdlVar.c);
                    qdlVar.a = d6lVar2;
                    return d6lVar2;
                }
                return d6lVar;
            case 2:
                eel eelVar = (eel) serializable;
                jcl jclVar = eelVar.a;
                if (jclVar == null) {
                    jcl jclVar2 = new jcl(eelVar, eelVar.c);
                    eelVar.a = jclVar2;
                    return jclVar2;
                }
                return jclVar;
            default:
                return ((zhl) serializable).b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int i = this.a;
        Serializable serializable = this.e;
        Map map = this.b;
        switch (i) {
            case 0:
                aoc aocVar = (aoc) serializable;
                Collection collection = (Collection) map.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection c = aocVar.c();
                c.addAll(collection);
                aocVar.e -= collection.size();
                collection.clear();
                return c;
            case 1:
                Collection collection2 = (Collection) map.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList;
            case 2:
                eel eelVar = (eel) serializable;
                Collection collection3 = (Collection) map.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection3);
                eelVar.d -= collection3.size();
                collection3.clear();
                return arrayList2;
            default:
                zhl zhlVar = (zhl) serializable;
                Collection collection4 = (Collection) ((gi4) map).remove(obj);
                if (collection4 == null) {
                    return null;
                }
                ArrayList arrayList3 = new ArrayList(3);
                arrayList3.addAll(collection4);
                zhlVar.e -= collection4.size();
                collection4.clear();
                return arrayList3;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        int i = this.a;
        Map map = this.b;
        switch (i) {
            case 0:
                return map.size();
            case 1:
                return map.size();
            case 2:
                return map.size();
            default:
                return ((gi4) map).size();
        }
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        int i = this.a;
        Map map = this.b;
        switch (i) {
            case 0:
                return map.toString();
            case 1:
                return map.toString();
            case 2:
                return map.toString();
            default:
                return ((gi4) map).toString();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.d;
                if (j4Var == null) {
                    j4 j4Var2 = new j4((AbstractMap) this, 2);
                    this.d = j4Var2;
                    return j4Var2;
                }
                return j4Var;
            case 1:
                j4 j4Var3 = (j4) this.d;
                if (j4Var3 == null) {
                    j4 j4Var4 = new j4((AbstractMap) this, 7);
                    this.d = j4Var4;
                    return j4Var4;
                }
                return j4Var3;
            case 2:
                j4 j4Var5 = (j4) this.d;
                if (j4Var5 == null) {
                    j4 j4Var6 = new j4((AbstractMap) this, 6);
                    this.d = j4Var6;
                    return j4Var6;
                }
                return j4Var5;
            default:
                j4 j4Var7 = (j4) this.d;
                if (j4Var7 == null) {
                    j4 j4Var8 = new j4((AbstractMap) this, 9);
                    this.d = j4Var8;
                    return j4Var8;
                }
                return j4Var7;
        }
    }
}
