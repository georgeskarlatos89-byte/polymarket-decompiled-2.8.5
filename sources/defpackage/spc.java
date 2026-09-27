package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class spc implements ListIterator, xja {
    private final List<Object> a;
    public int b;

    public spc(List list, int i) {
        this.a = list;
        this.b = i - 1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        List<Object> list = this.a;
        int i = this.b + 1;
        this.b = i;
        list.add(i, obj);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.a.size() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        List<Object> list = this.a;
        int i = this.b + 1;
        this.b = i;
        return list.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        List<Object> list = this.a;
        int i = this.b;
        this.b = i - 1;
        return list.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.a.remove(this.b);
        this.b--;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.a.set(this.b, obj);
    }
}
