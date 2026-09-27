package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bl0 implements Set {
    public final /* synthetic */ fl0 a;

    public bl0(fl0 fl0Var) {
        this.a = fl0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.a.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        fl0 fl0Var = this.a;
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (fl0Var.c == set.size()) {
                        if (fl0Var.k(set)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        fl0 fl0Var = this.a;
        int i = 0;
        for (int i2 = fl0Var.c - 1; i2 >= 0; i2--) {
            Object f = fl0Var.f(i2);
            if (f == null) {
                hashCode = 0;
            } else {
                hashCode = f.hashCode();
            }
            i += hashCode;
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new al0(this.a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        fl0 fl0Var = this.a;
        int d = fl0Var.d(obj);
        if (d >= 0) {
            fl0Var.h(d);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.a.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.a.m(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        fl0 fl0Var = this.a;
        int i = fl0Var.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = fl0Var.f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        fl0 fl0Var = this.a;
        int i = fl0Var.c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = fl0Var.f(i2);
        }
        return objArr;
    }
}
