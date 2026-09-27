package defpackage;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.b;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g7g implements ListIterator, xja {
    public final /* synthetic */ int a = 0;
    public final ListIterator b;
    public final /* synthetic */ Object c;

    public g7g(r3c r3cVar, int i) {
        this.c = r3cVar;
        this.b = ((List) r3cVar.c).listIterator(b.l(i, r3cVar));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                ListIterator listIterator = this.b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasPrevious();
            default:
                return this.b.hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.previous();
            default:
                return this.b.previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int previousIndex;
        int size;
        int i = this.a;
        ListIterator listIterator = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                previousIndex = listIterator.previousIndex();
                size = ((h7g) obj).size();
                break;
            default:
                previousIndex = listIterator.previousIndex();
                size = ((r3c) obj).size();
                break;
        }
        return (size - 1) - previousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return this.b.next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int nextIndex;
        int size;
        int i = this.a;
        ListIterator listIterator = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                nextIndex = listIterator.nextIndex();
                size = ((h7g) obj).size();
                break;
            default:
                nextIndex = listIterator.nextIndex();
                size = ((r3c) obj).size();
                break;
        }
        return (size - 1) - nextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                this.b.set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g7g(h7g h7gVar, int i) {
        this.c = h7gVar;
        this.b = h7gVar.a.listIterator(b.l(i, h7gVar));
    }
}
