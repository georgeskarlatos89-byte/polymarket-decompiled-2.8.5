package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class r4 extends l3 {
    public abstract r4 a(int i, Object obj);

    public abstract r4 b(Object obj);

    public r4 c(Collection collection) {
        wke d = d();
        d.addAll(collection);
        return d.c();
    }

    @Override // defpackage.o1, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.o1, java.util.Collection
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

    public abstract wke d();

    public abstract r4 f(p4 p4Var);

    public abstract r4 h(int i);

    public abstract r4 i(int i, Object obj);

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
        return new hr9(this, i, i2);
    }
}
