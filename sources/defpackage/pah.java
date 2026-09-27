package defpackage;

import com.appsflyer.internal.l;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pah extends AbstractMap {
    public static final /* synthetic */ int f = 0;
    public List a;
    public Map b;
    public boolean c;
    public volatile zk0 d;
    public Map e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, pah] */
    public static pah f() {
        ?? abstractMap = new AbstractMap();
        abstractMap.a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        abstractMap.b = map;
        abstractMap.e = map;
        return abstractMap;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.a.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((sah) this.a.get(i2)).a);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((sah) this.a.get(i4)).a);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 > 0) {
                i3 = i4 + 1;
            } else {
                return i4;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void b() {
        if (!this.c) {
            return;
        }
        l.g();
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.a.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.b.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Set d() {
        Set entrySet;
        if (this.b.isEmpty()) {
            entrySet = Collections.EMPTY_SET;
        } else {
            entrySet = this.b.entrySet();
        }
        return entrySet;
    }

    public final SortedMap e() {
        b();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.e = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.d == null) {
            this.d = new zk0(this, 3);
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof pah)) {
                return super.equals(obj);
            }
            pah pahVar = (pah) obj;
            int size = size();
            if (size == pahVar.size()) {
                int size2 = this.a.size();
                if (size2 != pahVar.a.size()) {
                    return ((AbstractSet) entrySet()).equals(pahVar.entrySet());
                }
                for (int i = 0; i < size2; i++) {
                    if (c(i).equals(pahVar.c(i))) {
                    }
                }
                if (size2 != size) {
                    return this.b.equals(pahVar.b);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final Object g(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((sah) this.a.get(a)).setValue(obj);
        }
        b();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(16);
        }
        int i = -(a + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.a.size() == 16) {
            sah sahVar = (sah) this.a.remove(15);
            e().put(sahVar.a, sahVar.b);
        }
        this.a.add(i, new sah(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((sah) this.a.get(a)).b;
        }
        return this.b.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((sah) this.a.remove(i)).b;
        if (!this.b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new sah(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((sah) this.a.get(i2)).hashCode();
        }
        if (this.b.size() > 0) {
            return this.b.hashCode() + i;
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return g((Comparable) obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return h(a);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b.size() + this.a.size();
    }
}
