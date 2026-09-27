package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class njl extends otk implements List, RandomAccess {
    public static final iil g = new iil(cml.j, 0);

    public static cml t(int i, Object[] objArr) {
        if (i == 0) {
            return cml.j;
        }
        return new cml(objArr, i);
    }

    public static cml u(Object[] objArr) {
        if (objArr.length == 0) {
            return cml.j;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i = 0; i < length; i++) {
            if (objArr2[i] == null) {
                dmk.s(ace.f(i, "at index "));
                return null;
            }
        }
        return t(length, objArr2);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i = 0; i < size; i++) {
                            if (qdn.d(get(i), list.get(i))) {
                            }
                        }
                        return true;
                    }
                    iil v = v(0);
                    Iterator it = list.iterator();
                    while (true) {
                        if (v.hasNext()) {
                            if (!it.hasNext() || !qdn.d(v.next(), it.next())) {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.otk
    public int f(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return v(0);
    }

    @Override // defpackage.otk
    public final tuj l() {
        return v(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return v(0);
    }

    public njl r() {
        if (size() <= 1) {
            return this;
        }
        return new fjl(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public njl s(int i, int i2) {
        udn.c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return cml.j;
        }
        return new ijl(this, i, i3);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return s(i, i2);
    }

    public final iil v(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            if (isEmpty()) {
                return g;
            }
            return new iil(this, i);
        }
        f27.m(udn.d(i, size, "index"));
        return null;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return v(i);
    }
}
