package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class q4 extends l3 implements ir9 {
    @Override // defpackage.o1, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.o1, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
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

    @Override // defpackage.l3, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.l3, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.l3, java.util.List
    public final List subList(int i, int i2) {
        return new gr9(this, i, i2);
    }
}
