package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class c4 extends AbstractCollection implements List {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Serializable g;

    public c4(qdl qdlVar, Object obj, List list, c4 c4Var) {
        Collection collection;
        this.g = qdlVar;
        this.f = qdlVar;
        this.b = obj;
        this.c = list;
        this.e = c4Var;
        if (c4Var == null) {
            collection = null;
        } else {
            collection = c4Var.c;
        }
        this.d = collection;
    }

    public void a() {
        c4 c4Var = (c4) this.e;
        if (c4Var != null) {
            c4Var.a();
        } else {
            ((aoc) this.f).d.put(this.b, this.c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                b();
                boolean isEmpty = this.c.isEmpty();
                boolean add = this.c.add(obj);
                if (add) {
                    ((aoc) serializable).e++;
                    if (isEmpty) {
                        a();
                    }
                }
                return add;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                boolean add2 = this.c.add(obj);
                if (add2 && isEmpty2) {
                    d();
                    return true;
                }
                return add2;
            case 2:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                boolean add3 = this.c.add(obj);
                if (add3) {
                    ((eel) serializable).d++;
                    if (isEmpty3) {
                        d();
                        return true;
                    }
                }
                return add3;
            default:
                zzb();
                boolean isEmpty4 = this.c.isEmpty();
                boolean add4 = this.c.add(obj);
                if (add4) {
                    ((zhl) serializable).e++;
                    if (isEmpty4) {
                        d();
                        return true;
                    }
                }
                return add4;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.a;
        Serializable serializable = this.g;
        boolean z = false;
        switch (i2) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = ((List) this.c).addAll(i, collection);
                    if (z) {
                        ((aoc) serializable).e += this.c.size() - size;
                        if (size == 0) {
                            a();
                        }
                    }
                }
                return z;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll = ((List) this.c).addAll(i, collection);
                if (addAll) {
                    this.c.size();
                    if (size2 == 0) {
                        d();
                        return true;
                    }
                }
                return addAll;
            case 2:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = ((List) this.c).addAll(i, collection);
                if (addAll2) {
                    ((eel) serializable).d += this.c.size() - size3;
                    if (size3 == 0) {
                        d();
                        return true;
                    }
                }
                return addAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean addAll3 = ((List) this.c).addAll(i, collection);
                if (addAll3) {
                    ((zhl) serializable).e += this.c.size() - size4;
                    if (size4 == 0) {
                        d();
                        return true;
                    }
                }
                return addAll3;
        }
    }

    public void b() {
        Collection collection;
        c4 c4Var = (c4) this.e;
        if (c4Var != null) {
            c4Var.b();
            if (c4Var.c != this.d) {
                f27.g();
                return;
            }
            return;
        }
        if (this.c.isEmpty() && (collection = (Collection) ((aoc) this.f).d.get(this.b)) != null) {
            this.c = collection;
        }
    }

    public void c() {
        c4 c4Var = (c4) this.e;
        if (c4Var != null) {
            c4Var.c();
        } else if (this.c.isEmpty()) {
            ((aoc) this.f).d.remove(this.b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.c.clear();
                    ((aoc) serializable).e -= size;
                    c();
                    return;
                }
                return;
            case 1:
                if (size() != 0) {
                    this.c.clear();
                    f();
                    return;
                }
                return;
            case 2:
                int size2 = size();
                if (size2 != 0) {
                    this.c.clear();
                    ((eel) serializable).d -= size2;
                    f();
                    return;
                }
                return;
            default:
                int size3 = size();
                if (size3 != 0) {
                    this.c.clear();
                    ((zhl) serializable).e -= size3;
                    f();
                    return;
                }
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                b();
                return this.c.contains(obj);
            case 1:
                zzb();
                return this.c.contains(obj);
            case 2:
                zzb();
                return this.c.contains(obj);
            default:
                zzb();
                return this.c.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                b();
                return this.c.containsAll(collection);
            case 1:
                zzb();
                return this.c.containsAll(collection);
            case 2:
                zzb();
                return this.c.containsAll(collection);
            default:
                zzb();
                return this.c.containsAll(collection);
        }
    }

    public void d() {
        int i = this.a;
        Object obj = this.b;
        Serializable serializable = this.f;
        AbstractCollection abstractCollection = this.e;
        switch (i) {
            case 1:
                c4 c4Var = (c4) abstractCollection;
                if (c4Var != null) {
                    c4Var.d();
                    return;
                } else {
                    ((qdl) serializable).c.put(obj, this.c);
                    return;
                }
            case 2:
                c4 c4Var2 = (c4) abstractCollection;
                if (c4Var2 != null) {
                    c4Var2.d();
                    return;
                } else {
                    ((eel) serializable).c.put(obj, this.c);
                    return;
                }
            default:
                c4 c4Var3 = (c4) abstractCollection;
                if (c4Var3 != null) {
                    c4Var3.d();
                    return;
                } else {
                    ((zhl) serializable).d.put(obj, this.c);
                    return;
                }
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                b();
                return this.c.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.c.equals(obj);
            case 2:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.c.equals(obj);
        }
    }

    public void f() {
        int i = this.a;
        Object obj = this.b;
        Serializable serializable = this.f;
        AbstractCollection abstractCollection = this.e;
        switch (i) {
            case 1:
                c4 c4Var = (c4) abstractCollection;
                if (c4Var != null) {
                    c4Var.f();
                    return;
                } else {
                    if (this.c.isEmpty()) {
                        ((qdl) serializable).c.remove(obj);
                        return;
                    }
                    return;
                }
            case 2:
                c4 c4Var2 = (c4) abstractCollection;
                if (c4Var2 != null) {
                    c4Var2.f();
                    return;
                } else {
                    if (this.c.isEmpty()) {
                        ((eel) serializable).c.remove(obj);
                        return;
                    }
                    return;
                }
            default:
                c4 c4Var3 = (c4) abstractCollection;
                if (c4Var3 != null) {
                    c4Var3.f();
                    return;
                } else {
                    if (this.c.isEmpty()) {
                        ((zhl) serializable).d.remove(obj);
                        return;
                    }
                    return;
                }
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                b();
                return ((List) this.c).get(i);
            case 1:
                zzb();
                return ((List) this.c).get(i);
            case 2:
                zzb();
                return ((List) this.c).get(i);
            default:
                zzb();
                return ((List) this.c).get(i);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.a) {
            case 0:
                b();
                return this.c.hashCode();
            case 1:
                zzb();
                return this.c.hashCode();
            case 2:
                zzb();
                return this.c.hashCode();
            default:
                zzb();
                return this.c.hashCode();
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                b();
                return ((List) this.c).indexOf(obj);
            case 1:
                zzb();
                return ((List) this.c).indexOf(obj);
            case 2:
                zzb();
                return ((List) this.c).indexOf(obj);
            default:
                zzb();
                return ((List) this.c).indexOf(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                b();
                return new t3(this);
            case 1:
                zzb();
                return new t3(this, (byte) 0);
            case 2:
                zzb();
                return new t3(this, (char) 0);
            default:
                zzb();
                return new t3(this, 0);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                b();
                return ((List) this.c).lastIndexOf(obj);
            case 1:
                zzb();
                return ((List) this.c).lastIndexOf(obj);
            case 2:
                zzb();
                return ((List) this.c).lastIndexOf(obj);
            default:
                zzb();
                return ((List) this.c).lastIndexOf(obj);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                b();
                return new b4(this);
            case 1:
                zzb();
                return new lcl(this);
            case 2:
                zzb();
                return new kdl(this);
            default:
                zzb();
                return new jhl(this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.a;
        Serializable serializable = this.g;
        switch (i2) {
            case 0:
                b();
                Object remove = ((List) this.c).remove(i);
                aoc aocVar = (aoc) serializable;
                aocVar.e--;
                c();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.c).remove(i);
                f();
                return remove2;
            case 2:
                zzb();
                Object remove3 = ((List) this.c).remove(i);
                eel eelVar = (eel) serializable;
                eelVar.d--;
                f();
                return remove3;
            default:
                zzb();
                Object remove4 = ((List) this.c).remove(i);
                zhl zhlVar = (zhl) serializable;
                zhlVar.e--;
                f();
                return remove4;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i = this.a;
        Serializable serializable = this.f;
        boolean z = false;
        switch (i) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        ((aoc) serializable).e += this.c.size() - size;
                        c();
                    }
                }
                return z;
            case 1:
                if (!collection.isEmpty()) {
                    size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        this.c.size();
                        f();
                    }
                }
                return z;
            case 2:
                if (!collection.isEmpty()) {
                    int size2 = size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        ((eel) serializable).d += this.c.size() - size2;
                        f();
                    }
                }
                return z;
            default:
                if (!collection.isEmpty()) {
                    int size3 = size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        ((zhl) serializable).e += this.c.size() - size3;
                        f();
                    }
                }
                return z;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.c.retainAll(collection);
                if (retainAll) {
                    ((aoc) serializable).e += this.c.size() - size;
                    c();
                }
                return retainAll;
            case 1:
                collection.getClass();
                size();
                boolean retainAll2 = this.c.retainAll(collection);
                if (retainAll2) {
                    this.c.size();
                    f();
                }
                return retainAll2;
            case 2:
                collection.getClass();
                int size2 = size();
                boolean retainAll3 = this.c.retainAll(collection);
                if (retainAll3) {
                    ((eel) serializable).d += this.c.size() - size2;
                    f();
                }
                return retainAll3;
            default:
                collection.getClass();
                int size3 = size();
                boolean retainAll4 = this.c.retainAll(collection);
                if (retainAll4) {
                    ((zhl) serializable).e += this.c.size() - size3;
                    f();
                }
                return retainAll4;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.a) {
            case 0:
                b();
                return ((List) this.c).set(i, obj);
            case 1:
                zzb();
                return ((List) this.c).set(i, obj);
            case 2:
                zzb();
                return ((List) this.c).set(i, obj);
            default:
                zzb();
                return ((List) this.c).set(i, obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case 0:
                b();
                return this.c.size();
            case 1:
                zzb();
                return this.c.size();
            case 2:
                zzb();
                return this.c.size();
            default:
                zzb();
                return this.c.size();
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.a;
        Serializable serializable = this.g;
        Object obj = this.b;
        AbstractCollection abstractCollection = this.e;
        switch (i3) {
            case 0:
                b();
                aoc aocVar = (aoc) serializable;
                List subList = ((List) this.c).subList(i, i2);
                c4 c4Var = (c4) abstractCollection;
                if (c4Var != null) {
                    this = c4Var;
                }
                if (subList instanceof RandomAccess) {
                    return new c4(aocVar, obj, subList, this);
                }
                return new c4(aocVar, obj, subList, this);
            case 1:
                zzb();
                List subList2 = ((List) this.c).subList(i, i2);
                c4 c4Var2 = (c4) abstractCollection;
                if (c4Var2 != null) {
                    this = c4Var2;
                }
                qdl qdlVar = (qdl) serializable;
                if (subList2 instanceof RandomAccess) {
                    return new c4(qdlVar, obj, subList2, this);
                }
                return new c4(qdlVar, obj, subList2, this);
            case 2:
                zzb();
                eel eelVar = (eel) serializable;
                List subList3 = ((List) this.c).subList(i, i2);
                c4 c4Var3 = (c4) abstractCollection;
                if (c4Var3 != null) {
                    this = c4Var3;
                }
                if (subList3 instanceof RandomAccess) {
                    return new c4(eelVar, obj, subList3, this);
                }
                return new c4(eelVar, obj, subList3, this);
            default:
                zzb();
                List subList4 = ((List) this.c).subList(i, i2);
                c4 c4Var4 = (c4) abstractCollection;
                if (c4Var4 != null) {
                    this = c4Var4;
                }
                zhl zhlVar = (zhl) serializable;
                if (subList4 instanceof RandomAccess) {
                    return new c4(zhlVar, obj, subList4, this);
                }
                return new c4(zhlVar, obj, subList4, this);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.a) {
            case 0:
                b();
                return this.c.toString();
            case 1:
                zzb();
                return this.c.toString();
            case 2:
                zzb();
                return this.c.toString();
            default:
                zzb();
                return this.c.toString();
        }
    }

    public void zzb() {
        Collection collection;
        Collection collection2;
        Collection collection3;
        int i = this.a;
        Object obj = this.b;
        Serializable serializable = this.f;
        Collection collection4 = this.d;
        AbstractCollection abstractCollection = this.e;
        switch (i) {
            case 1:
                c4 c4Var = (c4) abstractCollection;
                if (c4Var != null) {
                    c4Var.zzb();
                    if (c4Var.c != collection4) {
                        f27.g();
                        return;
                    }
                    return;
                }
                if (this.c.isEmpty() && (collection = (Collection) ((qdl) serializable).c.get(obj)) != null) {
                    this.c = collection;
                    return;
                }
                return;
            case 2:
                c4 c4Var2 = (c4) abstractCollection;
                if (c4Var2 != null) {
                    c4Var2.zzb();
                    if (c4Var2.c != collection4) {
                        f27.g();
                        return;
                    }
                    return;
                }
                if (this.c.isEmpty() && (collection2 = (Collection) ((eel) serializable).c.get(obj)) != null) {
                    this.c = collection2;
                    return;
                }
                return;
            default:
                c4 c4Var3 = (c4) abstractCollection;
                if (c4Var3 != null) {
                    c4Var3.zzb();
                    if (c4Var3.c != collection4) {
                        f27.g();
                        return;
                    }
                    return;
                }
                if (this.c.isEmpty() && (collection3 = (Collection) ((zhl) serializable).d.get(obj)) != null) {
                    this.c = collection3;
                    return;
                }
                return;
        }
    }

    public c4(eel eelVar, Object obj, List list, c4 c4Var) {
        this.g = eelVar;
        this.f = eelVar;
        this.b = obj;
        this.c = list;
        this.e = c4Var;
        this.d = c4Var == null ? null : c4Var.c;
    }

    public c4(zhl zhlVar, Object obj, List list, c4 c4Var) {
        this.g = zhlVar;
        this.f = zhlVar;
        this.b = obj;
        this.c = list;
        this.e = c4Var;
        this.d = c4Var == null ? null : c4Var.c;
    }

    public c4(aoc aocVar, Object obj, List list, c4 c4Var) {
        this.g = aocVar;
        this.f = aocVar;
        this.b = obj;
        this.c = list;
        this.e = c4Var;
        this.d = c4Var == null ? null : c4Var.c;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                b();
                return new b4(this, i);
            case 1:
                zzb();
                return new lcl(this, i);
            case 2:
                zzb();
                return new kdl(this, i);
            default:
                zzb();
                return new jhl(this, i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                b();
                boolean remove = this.c.remove(obj);
                if (remove) {
                    aoc aocVar = (aoc) serializable;
                    aocVar.e--;
                    c();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.c.remove(obj);
                if (remove2) {
                    f();
                }
                return remove2;
            case 2:
                zzb();
                boolean remove3 = this.c.remove(obj);
                if (remove3) {
                    eel eelVar = (eel) serializable;
                    eelVar.d--;
                    f();
                }
                return remove3;
            default:
                zzb();
                boolean remove4 = this.c.remove(obj);
                if (remove4) {
                    zhl zhlVar = (zhl) serializable;
                    zhlVar.e--;
                    f();
                }
                return remove4;
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.a;
        Serializable serializable = this.g;
        switch (i2) {
            case 0:
                b();
                boolean isEmpty = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((aoc) serializable).e++;
                if (isEmpty) {
                    a();
                    return;
                }
                return;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                if (isEmpty2) {
                    d();
                    return;
                }
                return;
            case 2:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((eel) serializable).d++;
                if (isEmpty3) {
                    d();
                    return;
                }
                return;
            default:
                zzb();
                boolean isEmpty4 = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((zhl) serializable).e++;
                if (isEmpty4) {
                    d();
                    return;
                }
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        int i = this.a;
        Serializable serializable = this.f;
        boolean z = false;
        switch (i) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = this.c.addAll(collection);
                    if (z) {
                        ((aoc) serializable).e += this.c.size() - size;
                        if (size == 0) {
                            a();
                        }
                    }
                }
                return z;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll = this.c.addAll(collection);
                if (addAll) {
                    this.c.size();
                    if (size2 == 0) {
                        d();
                        return true;
                    }
                }
                return addAll;
            case 2:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = this.c.addAll(collection);
                if (addAll2) {
                    ((eel) serializable).d += this.c.size() - size3;
                    if (size3 == 0) {
                        d();
                        return true;
                    }
                }
                return addAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean addAll3 = this.c.addAll(collection);
                if (addAll3) {
                    ((zhl) serializable).e += this.c.size() - size4;
                    if (size4 == 0) {
                        d();
                        return true;
                    }
                }
                return addAll3;
        }
    }
}
