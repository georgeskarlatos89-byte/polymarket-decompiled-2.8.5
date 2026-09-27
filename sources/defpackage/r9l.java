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
public final class r9l extends AbstractMap {
    public Object[] a;
    public int b;
    public Map c;
    public boolean d;
    public volatile zk0 e;
    public Map f;

    public r9l() {
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    public final s9l a(int i) {
        if (i < this.b) {
            return (s9l) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        Set entrySet;
        if (this.c.isEmpty()) {
            entrySet = Collections.EMPTY_SET;
        } else {
            entrySet = this.c.entrySet();
        }
        return entrySet;
    }

    public final Object c(Comparable comparable, Object obj) {
        f();
        int e = e(comparable);
        if (e >= 0) {
            return ((s9l) this.a[e]).setValue(obj);
        }
        f();
        Object[] objArr = this.a;
        if (objArr == null) {
            objArr = new Object[16];
            this.a = objArr;
        }
        int i = -(e + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.b == 16) {
            s9l s9lVar = (s9l) objArr[15];
            this.b = 15;
            g().put(s9lVar.a, s9lVar.b);
        }
        Object[] objArr2 = this.a;
        int length = objArr2.length;
        System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
        this.a[i] = new s9l(this, comparable, obj);
        this.b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
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
        if (e(comparable) < 0 && !this.c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Object d(int i) {
        f();
        Object[] objArr = this.a;
        Object obj = ((s9l) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new s9l(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i = this.b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((s9l) this.a[i2]).a);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((s9l) this.a[i4]).a);
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

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new zk0(this, 4);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof r9l)) {
                return super.equals(obj);
            }
            r9l r9lVar = (r9l) obj;
            int size = size();
            if (size == r9lVar.size()) {
                int i = this.b;
                if (i == r9lVar.b) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (a(i2).equals(r9lVar.a(i2))) {
                        }
                    }
                    if (i != size) {
                        return this.c.equals(r9lVar.c);
                    }
                    return true;
                }
                return entrySet().equals(r9lVar.entrySet());
            }
            return false;
        }
        return true;
    }

    public final void f() {
        if (!this.d) {
            return;
        }
        l.g();
    }

    public final SortedMap g() {
        f();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        if (e >= 0) {
            return ((s9l) this.a[e]).b;
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
        return c((Comparable) obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        if (e >= 0) {
            return d(e);
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
