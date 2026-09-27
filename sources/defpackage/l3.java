package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class l3 extends o1 implements List {
    public static final h3 a = new h3(null);

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        a.getClass();
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.areEqual(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        a.getClass();
        int i2 = 1;
        for (Object obj : this) {
            int i3 = i2 * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new i3(this, 0);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.areEqual(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new j3(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i, int i2) {
        return new k3(this, i, i2);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new j3(this, i);
    }
}
