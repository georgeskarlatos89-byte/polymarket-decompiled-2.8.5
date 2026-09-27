package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qg7 implements Set, xja {
    public final /* synthetic */ int a;
    public final dig b;

    public /* synthetic */ qg7(dig digVar, int i) {
        this.a = i;
        this.b = digVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        dig digVar = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return Intrinsics.areEqual(digVar.d(entry.getKey()), entry.getValue());
            default:
                return digVar.b(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.a;
        dig digVar = this.b;
        collection.getClass();
        switch (i) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                if (!collection2.isEmpty()) {
                    for (Map.Entry entry : collection2) {
                        if (!Intrinsics.areEqual(digVar.d(entry.getKey()), entry.getValue())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection collection3 = collection;
                if (!collection3.isEmpty()) {
                    Iterator it = collection3.iterator();
                    while (it.hasNext()) {
                        if (!digVar.b(it.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i = this.a;
        dig digVar = this.b;
        switch (i) {
            case 0:
                return digVar.e();
            default:
                return digVar.e();
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return iwg.a(new pg7(this, null, 0));
            default:
                return iwg.a(new pg7(this, null, 1));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i = this.a;
        dig digVar = this.b;
        switch (i) {
            case 0:
                return digVar.e;
            default:
                return digVar.e;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                objArr.getClass();
                return pel.g(this, objArr);
            default:
                objArr.getClass();
                return pel.g(this, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                return pel.f(this);
            default:
                return pel.f(this);
        }
    }
}
