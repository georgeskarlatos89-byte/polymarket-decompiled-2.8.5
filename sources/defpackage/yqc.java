package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yqc implements ListIterator, xja {
    public final List a;
    public int b;

    public yqc(List list, int i) {
        this.a = list;
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.a.add(this.b, obj);
        this.b++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.a.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.b;
        this.b = i + 1;
        return this.a.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.b - 1;
        this.b = i;
        return this.a.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.b - 1;
        this.b = i;
        this.a.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.a.set(this.b, obj);
    }
}
