package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eai implements List, zja {
    public final ddh a;
    public final int b;
    public int c;
    public int d;

    public eai(ddh ddhVar, int i, int i2) {
        this.a = ddhVar;
        this.b = i;
        this.c = edh.c(ddhVar);
        this.d = i2 - i;
    }

    public final void a() {
        if (edh.c(this.a) == this.c) {
            return;
        }
        f27.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.b + this.d;
        ddh ddhVar = this.a;
        ddhVar.add(i, obj);
        this.d++;
        this.c = edh.c(ddhVar);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.b;
        ddh ddhVar = this.a;
        boolean addAll = ddhVar.addAll(i2, collection);
        if (addAll) {
            this.d = collection.size() + this.d;
            this.c = edh.c(ddhVar);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.d > 0) {
            a();
            int i = this.d;
            int i2 = this.b;
            ddh ddhVar = this.a;
            ddhVar.K0(i2, i + i2);
            this.d = 0;
            this.c = edh.c(ddhVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        edh.e(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.d;
        int i2 = this.b;
        Iterator it = lnf.k(i2, i + i2).iterator();
        while (((g1a) it).c) {
            int nextInt = ((y0a) it).nextInt();
            if (Intrinsics.areEqual(obj, this.a.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.d;
        int i2 = this.b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (Intrinsics.areEqual(obj, this.a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$b] */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        ?? obj = new Object();
        obj.a = i - 1;
        return new dai(obj, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.b + i;
        ddh ddhVar = this.a;
        Object remove = ddhVar.remove(i2);
        this.d--;
        this.c = edh.c(ddhVar);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        r4 r4Var;
        kch h;
        boolean a;
        a();
        ddh ddhVar = this.a;
        int i2 = this.b;
        int i3 = this.d + i2;
        int size = ddhVar.size();
        do {
            synchronized (edh.a) {
                dxh dxhVar = ddhVar.a;
                dxhVar.getClass();
                dxh dxhVar2 = (dxh) qch.f(dxhVar);
                i = dxhVar2.d;
                r4Var = dxhVar2.c;
            }
            r4Var.getClass();
            wke d = r4Var.d();
            d.subList(i2, i3).retainAll(collection);
            r4 c = d.c();
            if (Intrinsics.areEqual(c, r4Var)) {
                break;
            }
            dxh dxhVar3 = ddhVar.a;
            dxhVar3.getClass();
            synchronized (qch.c) {
                h = qch.h();
                a = edh.a((dxh) qch.w(dxhVar3, ddhVar, h), i, c, true);
            }
            qch.l(h, ddhVar);
        } while (!a);
        int size2 = size - ddhVar.size();
        if (size2 > 0) {
            this.c = edh.c(this.a);
            this.d -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        edh.e(i, this.d);
        a();
        int i2 = i + this.b;
        ddh ddhVar = this.a;
        Object obj2 = ddhVar.set(i2, obj);
        this.c = edh.c(ddhVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.d) {
            f1f.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.b;
        return new eai(this.a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pel.f(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pel.g(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.b + i;
        ddh ddhVar = this.a;
        ddhVar.add(i2, obj);
        this.d++;
        this.c = edh.c(ddhVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.d, collection);
    }
}
