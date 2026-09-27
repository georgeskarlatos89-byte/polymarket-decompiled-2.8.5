package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dl0 implements Collection {
    public final /* synthetic */ fl0 a;

    public dl0(fl0 fl0Var) {
        this.a = fl0Var;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.a.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new al0(this.a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        fl0 fl0Var = this.a;
        int a = fl0Var.a(obj);
        if (a >= 0) {
            fl0Var.h(a);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        fl0 fl0Var = this.a;
        int i = fl0Var.c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(fl0Var.j(i2))) {
                fl0Var.h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        fl0 fl0Var = this.a;
        int i = fl0Var.c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(fl0Var.j(i2))) {
                fl0Var.h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        fl0 fl0Var = this.a;
        int i = fl0Var.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = fl0Var.j(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        fl0 fl0Var = this.a;
        int i = fl0Var.c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = fl0Var.j(i2);
        }
        return objArr;
    }
}
