package defpackage;

import com.appsflyer.internal.l;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class oah extends AbstractMap {
    public static final /* synthetic */ int f = 0;
    public final int a;
    public List b = Collections.EMPTY_LIST;
    public Map c = Collections.EMPTY_MAP;
    public boolean d;
    public volatile zk0 e;

    public oah(int i) {
        this.a = i;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((rah) this.b.get(i2)).a);
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
            int compareTo2 = comparable.compareTo(((rah) this.b.get(i4)).a);
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
        if (!this.d) {
            return;
        }
        l.g();
    }

    public final Iterable c() {
        if (this.c.isEmpty()) {
            return vzm.b;
        }
        return this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final SortedMap d() {
        b();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            this.c = new TreeMap();
        }
        return (SortedMap) this.c;
    }

    public final Object e(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((rah) this.b.get(a)).setValue(obj);
        }
        b();
        boolean isEmpty = this.b.isEmpty();
        int i = this.a;
        if (isEmpty && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(i);
        }
        int i2 = -(a + 1);
        if (i2 >= i) {
            return d().put(comparable, obj);
        }
        if (this.b.size() == i) {
            rah rahVar = (rah) this.b.remove(i - 1);
            d().put(rahVar.a, rahVar.b);
        }
        this.b.add(i2, new rah(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new zk0(this, 2);
        }
        return this.e;
    }

    public final Object f(int i) {
        b();
        Object obj = ((rah) this.b.remove(i)).b;
        if (!this.c.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new rah(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((rah) this.b.get(a)).b;
        }
        return this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return e((ns8) obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return f(a);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b.size();
    }
}
