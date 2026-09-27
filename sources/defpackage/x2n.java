package defpackage;

import com.appsflyer.internal.l;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class x2n extends AbstractMap {
    public static final /* synthetic */ int g = 0;
    public Object[] a;
    public int b;
    public Map c;
    public boolean d;
    public volatile zk0 e;
    public Map f;

    public x2n() {
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    public final Set a() {
        Set entrySet;
        if (this.c.isEmpty()) {
            entrySet = Collections.EMPTY_SET;
        } else {
            entrySet = this.c.entrySet();
        }
        return entrySet;
    }

    public final Object b(Comparable comparable, Object obj) {
        g();
        int d = d(comparable);
        if (d >= 0) {
            return ((d3n) this.a[d]).setValue(obj);
        }
        g();
        Object[] objArr = this.a;
        if (objArr == null) {
            objArr = new Object[16];
            this.a = objArr;
        }
        int i = -(d + 1);
        if (i >= 16) {
            return f().put(comparable, obj);
        }
        if (this.b == 16) {
            d3n d3nVar = (d3n) objArr[15];
            this.b = 15;
            f().put(d3nVar.a, d3nVar.b);
        }
        Object[] objArr2 = this.a;
        int length = objArr2.length;
        System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
        this.a[i] = new d3n(this, comparable, obj);
        this.b++;
        return null;
    }

    public final d3n c(int i) {
        if (i < this.b) {
            return (d3n) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (d(comparable) < 0 && !this.c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final int d(Comparable comparable) {
        int i = this.b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((d3n) this.a[i2]).a);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((d3n) this.a[i4]).a);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 > 0) {
                i3 = i4 + 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public final Object e(int i) {
        g();
        Object[] objArr = this.a;
        Object obj = ((d3n) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new d3n(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new zk0(this, 6);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof x2n)) {
                return super.equals(obj);
            }
            x2n x2nVar = (x2n) obj;
            int size = size();
            if (size == x2nVar.size()) {
                int i = this.b;
                if (i == x2nVar.b) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (c(i2).equals(x2nVar.c(i2))) {
                        }
                    }
                    if (i != size) {
                        return this.c.equals(x2nVar.c);
                    }
                    return true;
                }
                return entrySet().equals(x2nVar.entrySet());
            }
            return false;
        }
        return true;
    }

    public final SortedMap f() {
        g();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    public final void g() {
        if (!this.d) {
            return;
        }
        l.g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d = d(comparable);
        if (d >= 0) {
            return ((d3n) this.a[d]).b;
        }
        return this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.a[i3].hashCode();
        }
        if (this.c.size() > 0) {
            return this.c.hashCode() + i2;
        }
        return i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return b((Comparable) obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int d = d(comparable);
        if (d >= 0) {
            return e(d);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b;
    }
}
