package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class uzg extends AbstractSet {
    public final /* synthetic */ int a;

    public /* synthetic */ uzg(int i) {
        this.a = i;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                if (collection instanceof koc) {
                    collection = ((koc) collection).m0();
                }
                boolean z = false;
                if ((collection instanceof Set) && collection.size() > size()) {
                    Iterator<E> it = iterator();
                    while (it.hasNext()) {
                        if (collection.contains(it.next())) {
                            it.remove();
                            z = true;
                        }
                    }
                } else {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        z |= remove(it2.next());
                    }
                }
                return z;
            case 1:
                return qen.c(this, collection);
            case 2:
                return ven.r(this, collection);
            default:
                return lfn.f(this, collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                return super.retainAll(collection);
            case 1:
                collection.getClass();
                return super.retainAll(collection);
            case 2:
                collection.getClass();
                return super.retainAll(collection);
            default:
                collection.getClass();
                return super.retainAll(collection);
        }
    }
}
