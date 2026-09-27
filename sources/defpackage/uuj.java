package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class uuj implements ListIterator {
    public final /* synthetic */ int a;
    public ListIterator b;

    public /* synthetic */ uuj(int i) {
        this.a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                return this.b.hasPrevious();
            default:
                return this.b.hasPrevious();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return (String) this.b.next();
            default:
                return (String) this.b.next();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.b.nextIndex();
            default:
                return this.b.nextIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
            case 0:
                return (String) this.b.previous();
            default:
                return (String) this.b.previous();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.a) {
            case 0:
                return this.b.previousIndex();
            default:
                return this.b.previousIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
