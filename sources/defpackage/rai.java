package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rai implements Collection, xja {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public rai() {
        int i = qmd.a;
        this.b = new xpc(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                return ((xpc) this.b).b(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((xpc) this.b).c();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((xpc) obj2).a(obj);
            default:
                return ((dig) obj2).c(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((xpc) obj).a(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((dig) obj).c(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (((xpc) obj).g == 0) {
                    return true;
                }
                return false;
            default:
                return ((dig) obj).e();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ws8(new zpc((xpc) this.b));
            default:
                return iwg.a(new pg7(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                return ((xpc) this.b).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                return ((xpc) this.b).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                return ((xpc) this.b).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((xpc) obj).g;
            default:
                return ((dig) obj).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                return pel.g(this, objArr);
            default:
                objArr.getClass();
                return pel.g(this, objArr);
        }
    }

    public rai(dig digVar) {
        this.b = digVar;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                return pel.f(this);
            default:
                return pel.f(this);
        }
    }
}
